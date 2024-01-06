package OETPN.Project1;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataFloat;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Client {
	
	public static void main(String[] args) {
		PetriNet ptn = new PetriNet();
		ptn.PetriNetName = "Client";
		ptn.NetworkPort = 1080;
		
		DataFloat constantValue1 = new DataFloat();
		constantValue1.SetName("constantValue1");
		constantValue1.SetValue(1.0f);
		ptn.ConstantPlaceList.add(constantValue1);
		
		
		DataFloat p0 =new DataFloat();
		p0.SetName("p0");
		p0.SetValue(1.0f);
		ptn.PlaceList.add(p0);
		
		DataFloat p1 = new DataFloat();
		p1.SetName("p1");
		ptn.PlaceList.add(p1);
		
		DataFloat p4 = new DataFloat();
		p4.SetName("p4");
		ptn.PlaceList.add(p4);
		
		DataTransfer p3 = new DataTransfer();
		p3.SetName("p3");
		p3.Value = new TransferOperation("localhost","1081","p1");
		ptn.PlaceList.add(p3);
		
		DataFloat p5 = new DataFloat();
		p5.SetName("p5");
		ptn.PlaceList.add(p5);
		
		DataFloat p6 = new DataFloat();
		p6.SetName("p6");
		ptn.PlaceList.add(p6);
		
		//T1
		
		
		PetriTransition t1 = new PetriTransition(ptn);
		t1.TransitionName="t1";
		t1.InputPlaceName.add("p0");
		t1.InputPlaceName.add("p1");
		
		Condition T1Ct1 = new Condition(t1,"p0",TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1,"p1",TransitionCondition.NotNull);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);
		
		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition = T1Ct1;
		grdT1.Activations.add(new Activation(t1,"p0",TransitionOperation.Move,"p4"));
		grdT1.Activations.add(new Activation(t1,"p1",TransitionOperation.SendOverNetwork,"p3"));
		
		
		t1.GuardMappingList.add(grdT1);
		
		t1.Delay=0;
		ptn.Transitions.add(t1);
		
		
		//T2
		
		PetriTransition t2 = new PetriTransition(ptn);
		t2.TransitionName="t2";
		t2.InputPlaceName.add("p4");
		t2.InputPlaceName.add("p5");
		
		Condition T2Ct1 = new Condition(t2,"p4",TransitionCondition.NotNull);
		Condition T2Ct2 = new Condition(t2,"p5",TransitionCondition.NotNull);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);
		
		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;
		grdT2.Activations.add(new Activation(t2, "p5", TransitionOperation.Move, "p6"));
		grdT2.Activations.add(new Activation(t2, "p5", TransitionOperation.Move, "p0"));
		
		t2.GuardMappingList.add(grdT2);
		t2.Delay = 0;
		ptn.Transitions.add(t2);
		
		System.out.println("Client started");
		ptn.Delay=300;
		
		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = ptn;
		frame.setVisible(true);
		
		
	}

}
