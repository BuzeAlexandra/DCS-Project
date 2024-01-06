package OETPN.FinalProject;

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

public class Left_Intersection {
	public void main(String[] args) {
		PetriNet pn = new PetriNet();
        pn.PetriNetName = "Left Intersection";
        pn.NetworkPort = 1080;
        
        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString full = new DataString();
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);
        
        // LANE1
        
        DataCar P_a5 = new DataCar();
        P_a5.SetName("P_a5");
        pn.PlaceList.add(P_a5);
        
        DataTransfer OP5 = new DataTransfer();
        OP5.SetName("OP5");
        OP5.Value = new TransferOperation("localhost","1081","in5");
        pn.PlaceList.add(OP5);
        
        DataCarQueue P_x5 = new DataCarQueue();
        P_x5.Value.Size =3;  //nu sunt sigura ca e corect
        P_x5.SetName("P_x5");
        pn.PlaceList.add(P_x5);
        
        DataString P_tl5 = new DataString();
        P_tl5.SetName("P_tl5");
        pn.PlaceList.add(P_tl5);
        
        DataCar P_b5 = new DataCar();
        P_b5.SetName("P_b5");
        pn.PlaceList.add(P_b5);
        
        //LANE2
        
        DataCar P_a6 = new DataCar();
        P_a6.SetName("P_a6");
        pn.PlaceList.add(P_a6);
        
        DataTransfer OP6 = new DataTransfer();
        OP6.SetName("OP6");
        OP6.Value = new TransferOperation("localhost","1081","in6");
        pn.PlaceList.add(OP6);
        
        DataCarQueue P_x6 = new DataCarQueue();
        P_x6.Value.Size =3;  //nu sunt sigura ca e corect
        P_x6.SetName("P_x6");
        pn.PlaceList.add(P_x6);
        
        DataString P_tl6 = new DataString();
        P_tl6.SetName("P_tl6");
        pn.PlaceList.add(P_tl6);
        
        DataCar P_b6 = new DataCar();
        P_b6.SetName("P_b6");
        pn.PlaceList.add(P_b6);
        
        
        //LANE3
        
        DataCar P_a7 = new DataCar();
        P_a7.SetName("P_a7");
        pn.PlaceList.add(P_a7);
        
        DataTransfer OP7 = new DataTransfer();
        OP7.SetName("OP7");
        OP7.Value = new TransferOperation("localhost","1081","in7");
        pn.PlaceList.add(OP7);
        
        DataCarQueue P_x7 = new DataCarQueue();
        P_x7.Value.Size =3;  //nu sunt sigura ca e corect
        P_x7.SetName("P_x7");
        pn.PlaceList.add(P_x7);
        
        DataString P_tl7 = new DataString();
        P_tl7.SetName("P_tl7");
        pn.PlaceList.add(P_tl7);
        
        DataCar P_b7 = new DataCar();
        P_b7.SetName("P_b7");
        pn.PlaceList.add(P_b7);
        
        
        //LANE 4
        
        DataCar P_a8 = new DataCar();
        P_a8.SetName("P_a8");
        pn.PlaceList.add(P_a8);
        
        DataTransfer OP8 = new DataTransfer();
        OP8.SetName("OP8");
        OP8.Value = new TransferOperation("localhost","1081","in8");
        pn.PlaceList.add(OP8);
        
        DataCarQueue P_x8 = new DataCarQueue();
        P_x8.Value.Size =3;  //nu sunt sigura ca e corect
        P_x8.SetName("P_x8");
        pn.PlaceList.add(P_x8);
        
        DataString P_tl8 = new DataString();
        P_tl8.SetName("P_tl8");
        pn.PlaceList.add(P_tl8);
        
        DataCar P_b8 = new DataCar();
        P_b8.SetName("P_b8");
        pn.PlaceList.add(P_b8);
        
        // EXIT LANE 1
        
        DataCar P_o10 = new DataCar();
        P_o10.SetName("P_o10");
        pn.PlaceList.add(P_o10);
        
        DataCarQueue P_o9 = new DataCarQueue();
        P_o9.Value.Size = 3;  //nu sunt sigura daca e bine
        P_o9.SetName("P_o9");
        pn.PlaceList.add(P_o9);
        
        // EXIT LANE 2
        
        
        DataCar P_o12 = new DataCar();
        P_o12.SetName("P_o12");
        pn.PlaceList.add(P_o12);
        
        DataCarQueue P_o11 = new DataCarQueue();
        P_o11.Value.Size = 3;  //nu sunt sigura daca e bine
        P_o11.SetName("P_o11");
        pn.PlaceList.add(P_o11);
        
        // EXIT LANE 3
        
        DataCar P_o14 = new DataCar();
        P_o14.SetName("P_o14");
        pn.PlaceList.add(P_o14);
        
        
        DataCarQueue P_o13 = new DataCarQueue();
        P_o13.Value.Size = 3;  //nu sunt sigura daca e bine
        P_o13.SetName("P_o13");
        pn.PlaceList.add(P_o13);
        
        //EXIT LANE 4
        
        DataCar P_o16 = new DataCar();
        P_o16.SetName("P_o16");
        pn.PlaceList.add(P_o16);
        
        DataCarQueue P_o15 = new DataCarQueue();
        P_o15.Value.Size = 3;  //nu sunt sigura daca e bine
        P_o15.SetName("P_o15");
        pn.PlaceList.add(P_o15);
        
        // P_street2
        DataCar P_street2 = new DataCar();
        P_street2.SetName("P_street2");
        pn.PlaceList.add(P_street2);
        
        // P_street1
        
        DataCar P_street1 = new DataCar();
        P_street1.SetName("P_street1");
        pn.PlaceList.add(P_street1);
        
        // Intersection Lane

        DataCarQueue P_i2 = new DataCarQueue();
        P_i2.Value.Size = 3;
        P_i2.SetName("P_i2");
        pn.PlaceList.add(P_i2);
        
        // TU9 - t_u9
        
        PetriTransition t_u9 = new PetriTransition(pn);
        t_u9.TransitionName = "t_u9";
        t_u9.InputPlaceName.add("P_a5");
        t_u9.InputPlaceName.add("P_x5");

        Condition T9Ct1 = new Condition(t_u9,"P_a5",TransitionCondition.NotNull);
        Condition T9Ct2 = new Condition(t_u9,"P_x5",TransitionCondition.CanAddCars);
        T9Ct1.SetNextCondition(LogicConnector.AND, T9Ct2);

        Condition T9Ct3 = new Condition(t_u9, "P_a5", TransitionCondition.NotNull);
        Condition T9Ct4 = new Condition(t_u9, "P_x5", TransitionCondition.CanNotAddCars);
        T9Ct3.SetNextCondition(LogicConnector.AND, T9Ct4);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition= T9Ct1;
        grdT9.Activations.add(new Activation(t_u9, "P_a5", TransitionOperation.AddElement, "P_x5")); 
        t_u9.GuardMappingList.add(grdT9);

        GuardMapping grd2T9 = new GuardMapping();
        grd2T9.condition= T9Ct3;
        grd2T9.Activations.add(new Activation(t_u9, "full", TransitionOperation.SendOverNetwork, "OP5"));
        grd2T9.Activations.add(new Activation(t_u9, "P_a5", TransitionOperation.Move, "P_a5"));
        t_u9.GuardMappingList.add(grd2T9);

        t_u9.Delay = 0;
        pn.Transitions.add(t_u9);
        
        
        // TU10 - t_u10
        
        PetriTransition t_u10 = new PetriTransition(pn);
        t_u10.TransitionName = "t_u10";
        t_u10.InputPlaceName.add("P_x5");
        t_u10.InputPlaceName.add("P_tl5");


        Condition T10Ct1 = new Condition(t_u10, "P_tl5", TransitionCondition.Equal,"green");
        Condition T10Ct2 = new Condition(t_u10, "P_x5", TransitionCondition.HaveCar);
        T10Ct1.SetNextCondition(LogicConnector.AND, T10Ct2);

        GuardMapping grdT10 = new GuardMapping();
        grdT10.condition = T10Ct1;
        grdT10.Activations.add(new Activation(t_u10, "P_x5", TransitionOperation.PopElementWithoutTarget, "P_b5"));
        grdT10.Activations.add(new Activation(t_u10, "P_tl5", TransitionOperation.Move, "P_tl5"));
        t_u10.GuardMappingList.add(grdT10);

        t_u10.Delay = 0;
        pn.Transitions.add(t_u10);
        
        
        // TI5 - t_i5 INTERSECTION ENTRANCE
        
        PetriTransition t_i5 = new PetriTransition(pn);
        t_i5.TransitionName = "t_i5";
        t_i5.InputPlaceName.add("P_i2");
        t_i5.InputPlaceName.add("P_b5");

        Condition Ti5Ct1 = new Condition(t_i5,"P_b5",TransitionCondition.NotNull);
        Condition Ti5Ct2 = new Condition(t_i5,"P_i5",TransitionCondition.CanAddCars);
        Ti5Ct1.SetNextCondition(LogicConnector.AND, Ti5Ct2);

        GuardMapping grdTi5 = new GuardMapping();
        grdTi5.condition = Ti5Ct1;
        grdTi5.Activations.add(new Activation(t_i5,"P_b5",TransitionOperation.AddElement,"P_i2"));
        t_i5.GuardMappingList.add(grdTi5);

        t_i5.Delay=0;
        pn.Transitions.add(t_i5);
        
        
        // TU11 - t_u11
        
        
        PetriTransition t_u11 = new PetriTransition(pn);
        t_u11.TransitionName = "t_u11";
        t_u11.InputPlaceName.add("P_a6");
        t_u11.InputPlaceName.add("P_x6");

        Condition T11Ct1 = new Condition(t_u11,"P_a6",TransitionCondition.NotNull);
        Condition T11Ct2 = new Condition(t_u11,"P_x6",TransitionCondition.CanAddCars);
        T11Ct1.SetNextCondition(LogicConnector.AND, T11Ct2);

        Condition T11Ct3 = new Condition(t_u11, "P_a6", TransitionCondition.NotNull);
        Condition T11Ct4 = new Condition(t_u11, "P_x6", TransitionCondition.CanNotAddCars);
        T11Ct3.SetNextCondition(LogicConnector.AND, T11Ct4);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition= T11Ct1;
        grdT11.Activations.add(new Activation(t_u11, "P_a6", TransitionOperation.AddElement, "P_x6")); 
        t_u11.GuardMappingList.add(grdT11);

        GuardMapping grd2T11 = new GuardMapping();
        grd2T11.condition= T11Ct3;
        grd2T11.Activations.add(new Activation(t_u11, "full", TransitionOperation.SendOverNetwork, "OP6"));
        grd2T11.Activations.add(new Activation(t_u11, "P_a6", TransitionOperation.Move, "P_a6"));
        t_u11.GuardMappingList.add(grd2T11);

        t_u11.Delay = 0;
        pn.Transitions.add(t_u11);
        
        // TU12 - t_u12
        
        PetriTransition t_u12 = new PetriTransition(pn);
        t_u12.TransitionName = "t_u12";
        t_u12.InputPlaceName.add("P_x6");
        t_u12.InputPlaceName.add("P_tl6");


        Condition T12Ct1 = new Condition(t_u12, "P_tl6", TransitionCondition.Equal,"green");
        Condition T12Ct2 = new Condition(t_u12, "P_x6", TransitionCondition.HaveCar);
        T12Ct1.SetNextCondition(LogicConnector.AND, T12Ct2);

        GuardMapping grdT12 = new GuardMapping();
        grdT12.condition = T12Ct1;
        grdT12.Activations.add(new Activation(t_u12, "P_x6", TransitionOperation.PopElementWithoutTarget, "P_b6"));
        grdT12.Activations.add(new Activation(t_u12, "P_tl6", TransitionOperation.Move, "P_tl6"));
        t_u12.GuardMappingList.add(grdT12);

        t_u12.Delay = 0;
        pn.Transitions.add(t_u12);
        
        // TI6 - t_i6 INTERSECTION ENTRANCE
        
        PetriTransition t_i6 = new PetriTransition(pn);
        t_i6.TransitionName = "t_i6";
        t_i6.InputPlaceName.add("P_i2");
        t_i6.InputPlaceName.add("P_b6");

        Condition Ti6Ct1 = new Condition(t_i6,"P_b6",TransitionCondition.NotNull);
        Condition Ti6Ct2 = new Condition(t_i6,"P_i6",TransitionCondition.CanAddCars);
        Ti6Ct1.SetNextCondition(LogicConnector.AND, Ti6Ct2);

        GuardMapping grdTi6 = new GuardMapping();
        grdTi6.condition = Ti6Ct1;
        grdTi6.Activations.add(new Activation(t_i6,"P_b6",TransitionOperation.AddElement,"P_i2"));
        t_i6.GuardMappingList.add(grdTi6);

        t_i6.Delay=0;
        pn.Transitions.add(t_i6);
        
        
        // TU13 - t_u13
        
        
        PetriTransition t_u13 = new PetriTransition(pn);
        t_u13.TransitionName = "t_u13";
        t_u13.InputPlaceName.add("P_a7");
        t_u13.InputPlaceName.add("P_x7");

        Condition T13Ct1 = new Condition(t_u13,"P_a7",TransitionCondition.NotNull);
        Condition T13Ct2 = new Condition(t_u13,"P_x7",TransitionCondition.CanAddCars);
        T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

        Condition T13Ct3 = new Condition(t_u13, "P_a7", TransitionCondition.NotNull);
        Condition T13Ct4 = new Condition(t_u13, "P_x7", TransitionCondition.CanNotAddCars);
        T13Ct3.SetNextCondition(LogicConnector.AND, T13Ct4);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition= T13Ct1;
        grdT13.Activations.add(new Activation(t_u13, "P_a7", TransitionOperation.AddElement, "P_x7")); 
        t_u13.GuardMappingList.add(grdT13);

        GuardMapping grd2T13 = new GuardMapping();
        grd2T13.condition= T13Ct3;
        grd2T13.Activations.add(new Activation(t_u13, "full", TransitionOperation.SendOverNetwork, "OP7"));
        grd2T13.Activations.add(new Activation(t_u13, "P_a7", TransitionOperation.Move, "P_a7"));
        t_u13.GuardMappingList.add(grd2T13);

        t_u13.Delay = 0;
        pn.Transitions.add(t_u13);
        
        
        //TU14 - t_u14
        
        
        PetriTransition t_u14 = new PetriTransition(pn);
        t_u14.TransitionName = "t_u14";
        t_u14.InputPlaceName.add("P_x7");
        t_u14.InputPlaceName.add("P_tl7");


        Condition T14Ct1 = new Condition(t_u14, "P_tl7", TransitionCondition.Equal,"green");
        Condition T14Ct2 = new Condition(t_u14, "P_x7", TransitionCondition.HaveCar);
        T14Ct1.SetNextCondition(LogicConnector.AND, T14Ct2);

        GuardMapping grdT14 = new GuardMapping();
        grdT14.condition = T14Ct1;
        grdT14.Activations.add(new Activation(t_u14, "P_x7", TransitionOperation.PopElementWithoutTarget, "P_b7"));
        grdT14.Activations.add(new Activation(t_u14, "P_tl7", TransitionOperation.Move, "P_tl7"));
        t_u14.GuardMappingList.add(grdT14);

        t_u14.Delay = 0;
        pn.Transitions.add(t_u14);
        
        
        // TI7 - t_i7 INTERSECTION ENTRANCE
        
        PetriTransition t_i7 = new PetriTransition(pn);
        t_i7.TransitionName = "t_i7";
        t_i7.InputPlaceName.add("P_i2");
        t_i7.InputPlaceName.add("P_b7");

        Condition Ti7Ct1 = new Condition(t_i7,"P_b7",TransitionCondition.NotNull);
        Condition Ti7Ct2 = new Condition(t_i7,"P_i2",TransitionCondition.CanAddCars);
        Ti7Ct1.SetNextCondition(LogicConnector.AND, Ti7Ct2);

        GuardMapping grdTi7 = new GuardMapping();
        grdTi7.condition = Ti7Ct1;
        grdTi7.Activations.add(new Activation(t_i7,"P_b7",TransitionOperation.AddElement,"P_i2"));
        t_i7.GuardMappingList.add(grdTi7);

        t_i7.Delay=0;
        pn.Transitions.add(t_i7);
        
        // TU15 - t_u15
        
        
        PetriTransition t_u15 = new PetriTransition(pn);
        t_u15.TransitionName = "t_u15";
        t_u15.InputPlaceName.add("P_a8");
        t_u15.InputPlaceName.add("P_x8");

        Condition T15Ct1 = new Condition(t_u15,"P_a8",TransitionCondition.NotNull);
        Condition T15Ct2 = new Condition(t_u15,"P_x8",TransitionCondition.CanAddCars);
        T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

        Condition T15Ct3 = new Condition(t_u15, "P_a8", TransitionCondition.NotNull);
        Condition T15Ct4 = new Condition(t_u15, "P_x8", TransitionCondition.CanNotAddCars);
        T15Ct3.SetNextCondition(LogicConnector.AND, T15Ct4);

        GuardMapping grdT15 = new GuardMapping();
        grdT15.condition= T15Ct1;
        grdT15.Activations.add(new Activation(t_u15, "P_a8", TransitionOperation.AddElement, "P_x8")); 
        t_u15.GuardMappingList.add(grdT15);

        GuardMapping grd2T15 = new GuardMapping();
        grd2T15.condition= T15Ct3;
        grd2T15.Activations.add(new Activation(t_u15, "full", TransitionOperation.SendOverNetwork, "OP8"));
        grd2T15.Activations.add(new Activation(t_u15, "P_a8", TransitionOperation.Move, "P_a8"));
        t_u15.GuardMappingList.add(grd2T15);

        t_u15.Delay = 0;
        pn.Transitions.add(t_u15);
        
        //TU16 - t_u16
        
        
        PetriTransition t_u16 = new PetriTransition(pn);
        t_u16.TransitionName = "t_u16";
        t_u16.InputPlaceName.add("P_x8");
        t_u16.InputPlaceName.add("P_tl8");


        Condition T16Ct1 = new Condition(t_u16, "P_tl8", TransitionCondition.Equal,"green");
        Condition T16Ct2 = new Condition(t_u14, "P_x8", TransitionCondition.HaveCar);
        T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

        GuardMapping grdT16 = new GuardMapping();
        grdT16.condition = T16Ct1;
        grdT16.Activations.add(new Activation(t_u16, "P_x8", TransitionOperation.PopElementWithoutTarget, "P_b8"));
        grdT16.Activations.add(new Activation(t_u16, "P_tl8", TransitionOperation.Move, "P_tl8"));
        t_u16.GuardMappingList.add(grdT16);

        t_u16.Delay = 0;
        pn.Transitions.add(t_u16);
        
        // TI8 - t_i8 INTERSECTION ENTRANCE
        
        PetriTransition t_i8 = new PetriTransition(pn);
        t_i8.TransitionName = "t_i8";
        t_i8.InputPlaceName.add("P_i2");
        t_i8.InputPlaceName.add("P_b8");

        Condition Ti8Ct1 = new Condition(t_i8,"P_b8",TransitionCondition.NotNull);
        Condition Ti8Ct2 = new Condition(t_i8,"P_i2",TransitionCondition.CanAddCars);
        Ti8Ct1.SetNextCondition(LogicConnector.AND, Ti8Ct2);

        GuardMapping grdTi8 = new GuardMapping();
        grdTi8.condition = Ti8Ct1;
        grdTi8.Activations.add(new Activation(t_i8,"P_b8",TransitionOperation.AddElement,"P_i2"));
        t_i8.GuardMappingList.add(grdTi8);

        t_i8.Delay=0;
        pn.Transitions.add(t_i8);
        
        // TE10 - t_e10
        
        PetriTransition t_e10 = new PetriTransition(pn);
        t_e10.TransitionName = "t_e10";
        t_e10.InputPlaceName.add("P_o9");
        
        Condition Te10Ct1 = new Condition(t_e10, "P_o9", TransitionCondition.HaveCar);
        
        GuardMapping grdTe10 = new GuardMapping();
        grdTe10.condition = Te10Ct1;
        grdTe10.Activations.add(new Activation(t_e10, "P_o9", TransitionOperation.PopElementWithoutTarget, "P_o10"));  // ????????????????
        
        t_e10.GuardMappingList.add(grdTe10);

        t_e10.Delay = 0;
        pn.Transitions.add(t_e10);
        
        
        //TE9 - t_e9
        
        PetriTransition t_e9=new PetriTransition(pn);
        t_e9.TransitionName="t_e1";
        t_e9.InputPlaceName.add("P_o9");
        t_e9.InputPlaceName.add("P_i2");

        Condition Te9Ct1= new Condition(t_e9,"P_o9",TransitionCondition.CanAddCars);
        Condition Te9Ct2= new Condition(t_e9, "P_i2", TransitionCondition.HaveCarForMe);
        Te9Ct1.SetNextCondition(LogicConnector.AND,Te9Ct2);

        GuardMapping grdTe9= new GuardMapping();
        grdTe9.condition=Te9Ct1;
        grdTe9.Activations.add(new Activation(t_e9, "P_i2", TransitionOperation.PopElementWithTargetToQueue, "P_o9"));
        t_e9.GuardMappingList.add(grdTe9);

        t_e9.Delay = 0;
        pn.Transitions.add(t_e9);

        //TE12 - t_e12
        
        PetriTransition t_e12 = new PetriTransition(pn);
        t_e12.TransitionName = "t_e12";
        t_e12.InputPlaceName.add("P_o11");
        
        Condition Te12Ct1 = new Condition(t_e12, "P_o11", TransitionCondition.HaveCar);
        
        GuardMapping grdTe12 = new GuardMapping();
        grdTe12.condition = Te12Ct1;
        grdTe12.Activations.add(new Activation(t_e12, "P_o11", TransitionOperation.PopElementWithoutTarget, "P_o12"));  // ????????????????
        
        t_e12.GuardMappingList.add(grdTe12);

        t_e12.Delay = 0;
        pn.Transitions.add(t_e12);
        
        
        // TE11 - t_e11
        
        
        
        PetriTransition t_e11=new PetriTransition(pn);
        t_e11.TransitionName="t_e11";
        t_e11.InputPlaceName.add("P_o11");
        t_e11.InputPlaceName.add("P_i2");

        Condition Te11Ct1= new Condition(t_e11,"P_o11",TransitionCondition.CanAddCars);
        Condition Te11Ct2= new Condition(t_e11, "P_i2", TransitionCondition.HaveCarForMe);
        Te11Ct1.SetNextCondition(LogicConnector.AND,Te11Ct2);

        GuardMapping grdTe11 = new GuardMapping();
        grdTe11.condition=Te11Ct1;
        grdTe11.Activations.add(new Activation(t_e11, "P_i2", TransitionOperation.PopElementWithTargetToQueue, "P_o11"));
        t_e11.GuardMappingList.add(grdTe11);

        t_e11.Delay = 0;
        pn.Transitions.add(t_e11);
        
        
        // TE14 - t_e14
        
        PetriTransition t_e14 = new PetriTransition(pn);
        t_e14.TransitionName = "t_e14";
        t_e14.InputPlaceName.add("P_o13");
        
        Condition Te14Ct1 = new Condition(t_e14, "P_o13", TransitionCondition.HaveCar);
        
        GuardMapping grdTe14 = new GuardMapping();
        grdTe14.condition = Te14Ct1;
        grdTe14.Activations.add(new Activation(t_e14, "P_o13", TransitionOperation.PopElementWithoutTarget, "P_o14"));  // ????????????????
        
        t_e14.GuardMappingList.add(grdTe14);

        t_e14.Delay = 0;
        pn.Transitions.add(t_e14);
        
        
        //TE13 - t_e13
        
        PetriTransition t_e13=new PetriTransition(pn);
        t_e13.TransitionName="t_e13";
        t_e13.InputPlaceName.add("P_o13");
        t_e13.InputPlaceName.add("P_i2");

        Condition Te13Ct1= new Condition(t_e13,"P_o13",TransitionCondition.CanAddCars);
        Condition Te13Ct2= new Condition(t_e13, "P_i2", TransitionCondition.HaveCarForMe);
        Te13Ct1.SetNextCondition(LogicConnector.AND,Te13Ct2);

        GuardMapping grdTe13 = new GuardMapping();
        grdTe13.condition=Te13Ct1;
        grdTe13.Activations.add(new Activation(t_e13, "P_i2", TransitionOperation.PopElementWithTargetToQueue, "P_o13"));
        t_e13.GuardMappingList.add(grdTe13);

        t_e13.Delay = 0;
        pn.Transitions.add(t_e13);
        
        
        // TE15 - t_e16
        
        PetriTransition t_e16 = new PetriTransition(pn);
        t_e16.TransitionName = "t_e16";
        t_e16.InputPlaceName.add("P_o15");
        
        Condition Te16Ct1 = new Condition(t_e16, "P_o15", TransitionCondition.HaveCar);
        
        GuardMapping grdTe16 = new GuardMapping();
        grdTe16.condition = Te16Ct1;
        grdTe16.Activations.add(new Activation(t_e16, "P_o15", TransitionOperation.PopElementWithoutTarget, "P_o16"));  // ????????????????
        
        t_e16.GuardMappingList.add(grdTe16);

        t_e16.Delay = 0;
        pn.Transitions.add(t_e16);
        
        
        //TE15 - t_e15
        
        PetriTransition t_e15=new PetriTransition(pn);
        t_e15.TransitionName="t_e15";
        t_e15.InputPlaceName.add("P_o15");
        t_e15.InputPlaceName.add("P_i2");

        Condition Te15Ct1= new Condition(t_e15,"P_o15",TransitionCondition.CanAddCars);
        Condition Te15Ct2= new Condition(t_e15, "P_i2", TransitionCondition.HaveCarForMe);
        Te15Ct1.SetNextCondition(LogicConnector.AND,Te15Ct2);

        GuardMapping grdTe15 = new GuardMapping();
        grdTe15.condition=Te15Ct1;
        grdTe15.Activations.add(new Activation(t_e15, "P_i2", TransitionOperation.PopElementWithTargetToQueue, "P_o15"));
        t_e15.GuardMappingList.add(grdTe15);

        t_e15.Delay = 0;
        pn.Transitions.add(t_e15);
        
        // TSTREET2 - t_street2
        
        PetriTransition t_street2=new PetriTransition(pn);
        t_street2.TransitionName="t_street2";
        t_street2.InputPlaceName.add("P_street1");
      
        
        Condition Tstreet2Ct1= new Condition(t_street2,"P_street1",TransitionCondition.NotNull);
        
        GuardMapping grdTstreet2= new GuardMapping();
        grdTstreet2.condition=Tstreet2Ct1;
        grdTstreet2.Activations.add(new Activation(t_street2, "P_a8", TransitionOperation.Move, "P_street1"));
        t_street2.GuardMappingList.add(grdTstreet2);

        t_street2.Delay = 0;
        pn.Transitions.add(t_street2);
        
        
        //TSTREET3 - t_street3
        
        PetriTransition t_street3=new PetriTransition(pn);
        t_street3.TransitionName="t_street3";
        t_street3.InputPlaceName.add("P_o16");
      
        
        Condition Tstreet3Ct1= new Condition(t_street3,"P_o16",TransitionCondition.NotNull);
        
        GuardMapping grdTstreet3= new GuardMapping();
        grdTstreet3.condition=Tstreet3Ct1;
        grdTstreet3.Activations.add(new Activation(t_street3, "P_street2", TransitionOperation.Move, "P_o16"));
        t_street3.GuardMappingList.add(grdTstreet3);

        t_street3.Delay = 0;
        pn.Transitions.add(t_street3);
        
        
        // Petri Start
        System.out.println("Intersection started");
        pn.Delay = 2000;


        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
       
        
	}

}
