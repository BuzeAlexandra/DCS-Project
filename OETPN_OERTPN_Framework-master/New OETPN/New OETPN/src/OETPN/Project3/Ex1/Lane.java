package OETPN.Project3.Ex1;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Lane {
	public static void main(String[] args) {
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main";
		pn.NetworkPort = 1080;
		
		DataTransfer OP = new DataTransfer();
		OP.SetName("OP");
		OP.Value = new TransferOperation("localhost","1081","in");
		pn.PlaceList.add(OP);
		
		DataCar p_a = new DataCar();
		p_a.SetName("p_a");
		pn.PlaceList.add(p_a);
		
		DataCar p_b = new DataCar();
		p_b.SetName("p_b");
		pn.PlaceList.add(p_b);
		
		DataCarQueue p_x = new DataCarQueue();
		p_x.Value.Size=3;
		p_x.SetName("p_x");
		pn.PlaceList.add(p_x);
		
		DataString p_tl = new DataString();
		p_tl.SetName("p_tl");
		pn.PlaceList.add(p_tl);
		
		//DaataString with value "full"
		
		DataString full = new DataString();
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);
		
		//green
		
		DataString green = new DataString();
		green.SetName("green");
		green.SetValue("green");
		green.Printable = false;
		pn.ConstantPlaceList.add(green);
		
		
		//T_U
		
		PetriTransition t_u = new PetriTransition(pn);
		t_u.TransitionName = "t_u";
		t_u.InputPlaceName.add("p_a");
		t_u.InputPlaceName.add("p_x");
		
		Condition T1Ct1 = new Condition(t_u, "p_a", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t_u, "p_x", TransitionCondition.CanAddCars);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);
		
		Condition T1Ct3 = new Condition(t_u, "p_a", TransitionCondition.NotNull);
        Condition T1Ct4 = new Condition(t_u, "p_x", TransitionCondition.CanNotAddCars);
        T1Ct3.SetNextCondition(LogicConnector.AND, T1Ct4);
        
        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition= T1Ct1;
        grdT1.Activations.add(new Activation(t_u, "p_a", TransitionOperation.AddElement, "p_x"));
        t_u.GuardMappingList.add(grdT1);
        
        GuardMapping grd2T1 = new GuardMapping();
        grd2T1.condition= T1Ct3;
        grd2T1.Activations.add(new Activation(t_u, "full", TransitionOperation.SendOverNetwork, "OP"));
        grd2T1.Activations.add(new Activation(t_u, "p_a", TransitionOperation.Move, "p_a"));
        t_u.GuardMappingList.add(grd2T1);
        
        t_u.Delay = 0;
        pn.Transitions.add(t_u);
        
        //T_E
        
        PetriTransition t_e = new PetriTransition(pn);
        t_e.TransitionName = "t_e";
        t_e.InputPlaceName.add("p_x");
        t_e.InputPlaceName.add("p_tl");
       
        
        Condition T2Ct1 = new Condition(t_e, "p_tl", TransitionCondition.Equal,"green");
        Condition T2Ct2 = new Condition(t_e, "t_x", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);
        
        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(t_e, "p_x", TransitionOperation.PopElementWithoutTarget, "p_b"));
        grdT2.Activations.add(new Activation(t_e, "p_tl", TransitionOperation.Move, "p_tl"));
        t_e.GuardMappingList.add(grdT2);
        
        t_e.Delay = 0;
        pn.Transitions.add(t_e);
        
        System.out.println("Start");
        pn.Delay = 2000;
        

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
        
        
        
        
		
				
		
		
	}

}
