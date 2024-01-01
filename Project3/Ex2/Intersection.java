package OETPN.Project3.Ex2;

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

public class Intersection {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Intersection";
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

        // LANE 1

        DataTransfer OP1 = new DataTransfer();
        OP1.SetName("OP1");
        OP1.Value = new TransferOperation("localhost","1081","in1");
        pn.PlaceList.add(OP1);

        DataCar p_a1 = new DataCar();
        p_a1.SetName("p_a1");
        pn.PlaceList.add(p_a1);

        DataCarQueue p_x1 = new DataCarQueue();
        p_x1.Value.Size =3;
        p_x1.SetName("p_x1");
        pn.PlaceList.add(p_x1);

        DataString p_tl1 = new DataString();
        p_tl1.SetName("p_tl1");
        pn.PlaceList.add(p_tl1);


        DataCar p_b1 = new DataCar();
        p_b1.SetName("p_b1");
        pn.PlaceList.add(p_b1);

        //LANE 2

        DataTransfer OP2 = new DataTransfer();
        OP2.SetName("OP2");
        OP2.Value = new TransferOperation("localhost","1081","in2");
        pn.PlaceList.add(OP2);

        DataCar p_a2 = new DataCar();
        p_a2.SetName("p_a2");
        pn.PlaceList.add(p_a2);

        DataCarQueue p_x2 = new DataCarQueue();
        p_x2.Value.Size =3;
        p_x2.SetName("p_x2");
        pn.PlaceList.add(p_x2);

        DataString p_tl2 = new DataString();
        p_tl2.SetName("p_tl2");
        pn.PlaceList.add(p_tl2);

        DataCar p_b2 = new DataCar();
        p_b2.SetName("p_b2");
        pn.PlaceList.add(p_b2);


        //LANE 3

        DataTransfer OP3 = new DataTransfer();
        OP3.SetName("OP3");
        OP3.Value = new TransferOperation("localhost","1081","in3");
        pn.PlaceList.add(OP3);

        DataCar p_a3 = new DataCar();
        p_a3.SetName("p_a3");
        pn.PlaceList.add(p_a3);

        DataCarQueue p_x3 = new DataCarQueue();
        p_x3.Value.Size =3;
        p_x3.SetName("p_x3");
        pn.PlaceList.add(p_x3);

        DataString p_tl3 = new DataString();
        p_tl3.SetName("p_tl3");
        pn.PlaceList.add(p_tl3);

        DataCar p_b3 = new DataCar();
        p_b3.SetName("p_b3");
        pn.PlaceList.add(p_b3);

        //LANE 4

        DataTransfer OP4 = new DataTransfer();
        OP4.SetName("OP4");
        OP4.Value = new TransferOperation("localhost","1081","in4");
        pn.PlaceList.add(OP4);

        DataCar p_a4 = new DataCar();
        p_a4.SetName("p_a4");
        pn.PlaceList.add(p_a4);

        DataCarQueue p_x4 = new DataCarQueue();
        p_x4.Value.Size =3;
        p_x4.SetName("p_x4");
        pn.PlaceList.add(p_x4);

        DataCar p_b4 = new DataCar();
        p_b4.SetName("p_b4");
        pn.PlaceList.add(p_b4);

        DataString p_tl4 = new DataString();
        p_tl4.SetName("p_tl4");
        pn.PlaceList.add(p_tl4);

        // EXIT LANE 1

        DataCarQueue p_01 = new DataCarQueue();
        p_01.Value.Size = 3;
        p_01.SetName("p_01");
        pn.PlaceList.add(p_01);

        DataCar p_01e = new DataCar();
        p_01e.SetName("p_01e");
        pn.PlaceList.add(p_01e);

        // EXIT LANE 2

        DataCarQueue p_02 = new DataCarQueue();
        p_02.Value.Size = 3;
        p_02.SetName("p_02");
        pn.PlaceList.add(p_02);

        DataCar p_02e = new DataCar();
        p_02e.SetName("p_02e");
        pn.PlaceList.add(p_02e);

        // EXIT LANE 3

        DataCarQueue p_03 = new DataCarQueue();
        p_03.Value.Size = 3;
        p_03.SetName("p_03");
        pn.PlaceList.add(p_03);

        DataCar p_03e = new DataCar();
        p_03e.SetName("p_03e");
        pn.PlaceList.add(p_03e);

        // EXIT LANE 4

        DataCarQueue p_04 = new DataCarQueue();
        p_04.Value.Size = 3;
        p_04.SetName("p_04");
        pn.PlaceList.add(p_04);

        DataCar p_04e = new DataCar();
        p_04e.SetName("p_04e");
        pn.PlaceList.add(p_04e);

        DataTransfer p_04n = new DataTransfer();
        p_04n.SetName("p_04n");
        p_04n.Value = new TransferOperation("localhost","1081", "P5");
        pn.PlaceList.add(p_04n);

        // Intersection Lane

        DataCarQueue p_i = new DataCarQueue();
        p_i.Value.Size = 3;
        p_i.SetName("p_i");
        pn.PlaceList.add(p_i);


        // T1 - TU1

        PetriTransition t_u1 = new PetriTransition(pn);
        t_u1.TransitionName = "t_u1";
        t_u1.InputPlaceName.add("p_a1");
        t_u1.InputPlaceName.add("p_x1");

        Condition T1Ct1 = new Condition(t_u1,"p_a1",TransitionCondition.NotNull);
        Condition T1Ct2 = new Condition(t_u1,"p_x1",TransitionCondition.CanAddCars);
        T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

        Condition T1Ct3 = new Condition(t_u1, "p_a1", TransitionCondition.NotNull);
        Condition T1Ct4 = new Condition(t_u1, "p_x1", TransitionCondition.CanNotAddCars);
        T1Ct3.SetNextCondition(LogicConnector.AND, T1Ct4);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition= T1Ct1;
        grdT1.Activations.add(new Activation(t_u1, "p_a1", TransitionOperation.AddElement, "p_x1"));
        t_u1.GuardMappingList.add(grdT1);

        GuardMapping grd2T1 = new GuardMapping();
        grd2T1.condition= T1Ct3;
        grd2T1.Activations.add(new Activation(t_u1, "full", TransitionOperation.SendOverNetwork, "OP1"));
        grd2T1.Activations.add(new Activation(t_u1, "p_a1", TransitionOperation.Move, "p_a1"));
        t_u1.GuardMappingList.add(grd2T1);

        t_u1.Delay = 0;
        pn.Transitions.add(t_u1);

        // T2 T_E1

        PetriTransition t_e1 = new PetriTransition(pn);
        t_e1.TransitionName = "t_e1";
        t_e1.InputPlaceName.add("p_x1");
        t_e1.InputPlaceName.add("p_tl1");


        Condition T2Ct1 = new Condition(t_e1, "p_tl1", TransitionCondition.Equal,"green");
        Condition T2Ct2 = new Condition(t_e1, "p_x1", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(t_e1, "p_x1", TransitionOperation.PopElementWithoutTarget, "p_b1"));
        grdT2.Activations.add(new Activation(t_e1, "p_tl1", TransitionOperation.Move, "p_tl1"));
        t_e1.GuardMappingList.add(grdT2);

        t_e1.Delay = 0;
        pn.Transitions.add(t_e1);

        // T3 - T_U2

        PetriTransition t_u2 = new PetriTransition(pn);
        t_u2.TransitionName = "t_u2";
        t_u2.InputPlaceName.add("p_a2");
        t_u2.InputPlaceName.add("p_x2");

        Condition T3Ct1 = new Condition(t_u2,"p_a2",TransitionCondition.NotNull);
        Condition T3Ct2 = new Condition(t_u2,"p_x2",TransitionCondition.CanAddCars);
        T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

        Condition T3Ct3 = new Condition(t_u2, "p_a2", TransitionCondition.NotNull);
        Condition T3Ct4 = new Condition(t_u2, "p_x2", TransitionCondition.CanNotAddCars);
        T3Ct3.SetNextCondition(LogicConnector.AND, T3Ct4);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition= T3Ct1;
        grdT3.Activations.add(new Activation(t_u2, "p_a2", TransitionOperation.AddElement, "p_x2"));
        t_u2.GuardMappingList.add(grdT3);

        GuardMapping grd2T3 = new GuardMapping();
        grd2T3.condition= T3Ct3;
        grd2T3.Activations.add(new Activation(t_u2, "full", TransitionOperation.SendOverNetwork, "OP2"));
        grd2T3.Activations.add(new Activation(t_u2, "p_a2", TransitionOperation.Move, "p_a2"));
        t_u2.GuardMappingList.add(grd2T3);

        t_u2.Delay = 0;
        pn.Transitions.add(t_u2);

        // T4 - T_E2

        PetriTransition t_e2 = new PetriTransition(pn);
        t_e2.TransitionName = "t_e2";
        t_e2.InputPlaceName.add("p_x2");
        t_e2.InputPlaceName.add("p_tl2");


        Condition T4Ct1 = new Condition(t_e2, "p_tl2", TransitionCondition.Equal,"green");
        Condition T4Ct2 = new Condition(t_e2, "p_x2", TransitionCondition.HaveCar);
        T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition = T4Ct1;
        grdT4.Activations.add(new Activation(t_e2, "p_x2", TransitionOperation.PopElementWithoutTarget, "p_b2"));
        grdT4.Activations.add(new Activation(t_e2, "p_tl2", TransitionOperation.Move, "p_tl2"));
        t_e2.GuardMappingList.add(grdT4);

        t_e2.Delay = 0;
        pn.Transitions.add(t_e2);

        // T5 - T_U3

        PetriTransition t_u3 = new PetriTransition(pn);
        t_u3.TransitionName = "t_u3";
        t_u3.InputPlaceName.add("p_a3");
        t_u3.InputPlaceName.add("p_x3");

        Condition T5Ct1 = new Condition(t_u3,"p_a3",TransitionCondition.NotNull);
        Condition T5Ct2 = new Condition(t_u3,"p_x3",TransitionCondition.CanAddCars);
        T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

        Condition T5Ct3 = new Condition(t_u3, "p_a3", TransitionCondition.NotNull);
        Condition T5Ct4 = new Condition(t_u3, "p_x3", TransitionCondition.CanNotAddCars);
        T5Ct3.SetNextCondition(LogicConnector.AND, T5Ct4);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition= T5Ct1;
        grdT5.Activations.add(new Activation(t_u3, "p_a3", TransitionOperation.AddElement, "p_x3"));
        t_u3.GuardMappingList.add(grdT5);

        GuardMapping grd2T5 = new GuardMapping();
        grd2T5.condition= T5Ct3;
        grd2T5.Activations.add(new Activation(t_u3, "full", TransitionOperation.SendOverNetwork, "OP3"));
        grd2T5.Activations.add(new Activation(t_u3, "p_a3", TransitionOperation.Move, "p_a3"));
        t_u3.GuardMappingList.add(grd2T5);

        t_u3.Delay = 0;
        pn.Transitions.add(t_u3);


        // T6 - T_E3

        PetriTransition t_e3 = new PetriTransition(pn);
        t_e3.TransitionName = "t_e3";
        t_e3.InputPlaceName.add("p_x3");
        t_e3.InputPlaceName.add("p_tl3");


        Condition T6Ct1 = new Condition(t_e3, "p_tl3", TransitionCondition.Equal,"green");
        Condition T6Ct2 = new Condition(t_e3, "p_x3", TransitionCondition.HaveCar);
        T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6Ct1;
        grdT6.Activations.add(new Activation(t_e3, "p_x3", TransitionOperation.PopElementWithoutTarget, "p_b3"));
        grdT6.Activations.add(new Activation(t_e3, "p_tl3", TransitionOperation.Move, "p_tl3"));
        t_e3.GuardMappingList.add(grdT6);

        t_e3.Delay = 0;
        pn.Transitions.add(t_e3);


        // T7 -T_U4
        PetriTransition t_u4 = new PetriTransition(pn);
        t_u4.TransitionName = "t_u4";
        t_u4.InputPlaceName.add("p_a4");
        t_u4.InputPlaceName.add("p_x4");

        Condition T7Ct1 = new Condition(t_u4,"p_a4",TransitionCondition.NotNull);
        Condition T7Ct2 = new Condition(t_u4,"p_x4",TransitionCondition.CanAddCars);
        T7Ct1.SetNextCondition(LogicConnector.AND, T7Ct2);

        Condition T7Ct3 = new Condition(t_u4, "p_a4", TransitionCondition.NotNull);
        Condition T7Ct4 = new Condition(t_u4, "p_x4", TransitionCondition.CanNotAddCars);
        T7Ct3.SetNextCondition(LogicConnector.AND, T7Ct4);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition= T7Ct1;
        grdT7.Activations.add(new Activation(t_u4, "p_a4", TransitionOperation.AddElement, "p_x4"));
        t_u4.GuardMappingList.add(grdT7);

        GuardMapping grd2T7 = new GuardMapping();
        grd2T7.condition= T7Ct3;
        grd2T7.Activations.add(new Activation(t_u4, "full", TransitionOperation.SendOverNetwork, "OP4"));
        grd2T7.Activations.add(new Activation(t_u4, "p_a4", TransitionOperation.Move, "p_a4"));
        t_u4.GuardMappingList.add(grd2T7);

        t_u4.Delay = 0;
        pn.Transitions.add(t_u4);

        //T8 - T_E4

        PetriTransition t_e4 = new PetriTransition(pn);
        t_e4.TransitionName = "t_e4";
        t_e4.InputPlaceName.add("p_x4");
        t_e4.InputPlaceName.add("p_tl4");


        Condition T8Ct1 = new Condition(t_e4, "p_tl4", TransitionCondition.Equal,"green");
        Condition T8Ct2 = new Condition(t_e4, "p_x4", TransitionCondition.HaveCar);
        T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition = T8Ct1;
        grdT8.Activations.add(new Activation(t_e4, "p_x4", TransitionOperation.PopElementWithoutTarget, "p_b4"));
        grdT8.Activations.add(new Activation(t_e4, "p_tl4", TransitionOperation.Move, "p_tl4"));
        t_e4.GuardMappingList.add(grdT8);

        t_e4.Delay = 0;
        pn.Transitions.add(t_e4);

        //T9 - T_G1E

        PetriTransition t_g1e = new PetriTransition(pn);
        t_g1e.TransitionName = "t_g1e";
        t_g1e.InputPlaceName.add("p_01");

        Condition T9Ct1 = new Condition(t_g1e,"p_01",TransitionCondition.HaveCar);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9Ct1;
        grdT9.Activations.add(new Activation(t_g1e, "p_01", TransitionOperation.PopElementWithoutTarget, "p_01e"));
        t_g1e.GuardMappingList.add(grdT9);

        t_g1e.Delay = 0;
        pn.Transitions.add(t_g1e);

        // T10 - T_G2E

        PetriTransition t_g2e = new PetriTransition(pn);
        t_g2e.TransitionName = "t_g2e";
        t_g2e.InputPlaceName.add("p_02");

        Condition T10Ct1 = new Condition(t_g2e,"p_02",TransitionCondition.HaveCar);

        GuardMapping grdT10 = new GuardMapping();
        grdT10.condition = T10Ct1;
        grdT10.Activations.add(new Activation(t_g2e, "p_02", TransitionOperation.PopElementWithoutTarget, "p_02e"));
        t_g2e.GuardMappingList.add(grdT10);

        t_g2e.Delay = 0;
        pn.Transitions.add(t_g2e);

        //T11 - T_G3E

        PetriTransition t_g3e = new PetriTransition(pn);
        t_g3e.TransitionName = "t_g3e";
        t_g3e.InputPlaceName.add("p_03");

        Condition T11Ct1 = new Condition(t_g3e,"p_03",TransitionCondition.HaveCar);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition = T11Ct1;
        grdT11.Activations.add(new Activation(t_g3e, "p_03", TransitionOperation.PopElementWithoutTarget, "p_03e"));
        t_g3e.GuardMappingList.add(grdT11);

        t_g3e.Delay = 0;
        pn.Transitions.add(t_g3e);

        //T12 - T_G4E
        PetriTransition t_g4e = new PetriTransition(pn);
        t_g4e.TransitionName = "t_g4e";
        t_g4e.InputPlaceName.add("p_04");

        Condition T12Ct1 = new Condition(t_g4e,"p_04",TransitionCondition.HaveCar);

        GuardMapping grdT12 = new GuardMapping();
        grdT12.condition = T12Ct1;
        grdT12.Activations.add(new Activation(t_g4e, "p_04", TransitionOperation.PopElementWithoutTarget, "p_04e"));
        t_g4e.GuardMappingList.add(grdT12);

        t_g4e.Delay = 0;
        pn.Transitions.add(t_g4e);


        // T13 - T_G4N

        PetriTransition t_g4n = new PetriTransition(pn);
        t_g4n.TransitionName = "t_g4n";
        t_g4n.InputPlaceName.add("p_04e");


        Condition T13Ct1 = new Condition(t_g4n,"p_04e",TransitionCondition.NotNull);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition = T13Ct1;
        grdT13.Activations.add(new Activation(t_g4n,"p_04e", TransitionOperation.SendOverNetwork,"p_04n"));
        t_g4n.GuardMappingList.add(grdT13);

        t_g4n.Delay=0;
        pn.Transitions.add(t_g4n);

        // Intersection entrance

        // T14

        PetriTransition t_i1 = new PetriTransition(pn);
        t_i1.TransitionName = "t_i1";
        t_i1.InputPlaceName.add("p_i");
        t_i1.InputPlaceName.add("p_b1");

        Condition T14Ct1 = new Condition(t_i1,"p_b1",TransitionCondition.NotNull);
        Condition T14Ct2 = new Condition(t_i1,"p_i",TransitionCondition.CanAddCars);
        T14Ct1.SetNextCondition(LogicConnector.AND, T14Ct2);

        GuardMapping grdT14 = new GuardMapping();
        grdT14.condition = T14Ct1;
        grdT14.Activations.add(new Activation(t_i1,"p_b1",TransitionOperation.AddElement,"p_i"));
        t_i1.GuardMappingList.add(grdT14);

        t_i1.Delay=0;
        pn.Transitions.add(t_i1);

        //T15

        PetriTransition t_i2 = new PetriTransition(pn);
        t_i2.TransitionName = "t_i2";
        t_i2.InputPlaceName.add("p_i");
        t_i2.InputPlaceName.add("p_b2");

        Condition T15Ct1 = new Condition(t_i2,"p_b2",TransitionCondition.NotNull);
        Condition T15Ct2 = new Condition(t_i2,"p_i",TransitionCondition.CanAddCars);
        T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

        GuardMapping grdT15 = new GuardMapping();
        grdT15.condition = T15Ct1;
        grdT15.Activations.add(new Activation(t_i2,"p_b2",TransitionOperation.AddElement,"p_i"));
        t_i2.GuardMappingList.add(grdT15);

        t_i2.Delay=0;
        pn.Transitions.add(t_i2);


        //T16
        PetriTransition t_i3 = new PetriTransition(pn);
        t_i3.TransitionName = "t_i3";
        t_i3.InputPlaceName.add("p_i");
        t_i3.InputPlaceName.add("p_b3");

        Condition T16Ct1 = new Condition(t_i3,"p_b3",TransitionCondition.NotNull);
        Condition T16Ct2 = new Condition(t_i3,"p_i",TransitionCondition.CanAddCars);
        T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

        GuardMapping grdT16 = new GuardMapping();
        grdT16.condition = T16Ct1;
        grdT16.Activations.add(new Activation(t_i3,"p_b3",TransitionOperation.AddElement,"p_i"));
        t_i3.GuardMappingList.add(grdT16);

        t_i3.Delay=0;
        pn.Transitions.add(t_i3);

        //T17

        PetriTransition t_i4 = new PetriTransition(pn);
        t_i4.TransitionName = "t_i4";
        t_i4.InputPlaceName.add("p_i");
        t_i4.InputPlaceName.add("p_b4");

        Condition T17Ct1 = new Condition(t_i4,"p_b4",TransitionCondition.NotNull);
        Condition T17Ct2 = new Condition(t_i4,"p_i",TransitionCondition.CanAddCars);
        T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

        GuardMapping grdT17 = new GuardMapping();
        grdT17.condition = T17Ct1;
        grdT17.Activations.add(new Activation(t_i4,"p_b3",TransitionOperation.AddElement,"p_i"));
        t_i4.GuardMappingList.add(grdT17);

        t_i4.Delay=0;
        pn.Transitions.add(t_i4);

        //T18
        PetriTransition t_g1=new PetriTransition(pn);
        t_g1.TransitionName="t_g1";
        t_g1.InputPlaceName.add("p_01");
        t_g1.InputPlaceName.add("p_i");

        Condition T18Ct1= new Condition(t_g1,"p_01",TransitionCondition.CanAddCars);
        Condition T18Ct2= new Condition(t_g1, "p_i", TransitionCondition.HaveCarForMe);
        T18Ct1.SetNextCondition(LogicConnector.AND,T18Ct2);

        GuardMapping grdT18= new GuardMapping();
        grdT18.condition=T18Ct1;
        grdT18.Activations.add(new Activation(t_g1, "p_i", TransitionOperation.PopElementWithTargetToQueue, "p_01"));
        t_g1.GuardMappingList.add(grdT18);

        t_g1.Delay = 0;
        pn.Transitions.add(t_g1);

        //T19
        PetriTransition t_g2=new PetriTransition(pn);
        t_g2.TransitionName="t_g2";
        t_g2.InputPlaceName.add("p_02");
        t_g2.InputPlaceName.add("p_i");

        Condition T19Ct1= new Condition(t_g2,"p_02",TransitionCondition.CanAddCars);
        Condition T19Ct2= new Condition(t_g2, "p_i", TransitionCondition.HaveCarForMe);
        T19Ct1.SetNextCondition(LogicConnector.AND,T19Ct2);

        GuardMapping grdT19= new GuardMapping();
        grdT19.condition=T19Ct1;
        grdT19.Activations.add(new Activation(t_g2, "p_i", TransitionOperation.PopElementWithTargetToQueue, "p_02"));
        t_g2.GuardMappingList.add(grdT19);

        t_g2.Delay = 0;
        pn.Transitions.add(t_g2);

        //T20

        PetriTransition t_g3=new PetriTransition(pn);
        t_g3.TransitionName="t_g3";
        t_g3.InputPlaceName.add("p_03");
        t_g3.InputPlaceName.add("p_i");

        Condition T20Ct1= new Condition(t_g3,"p_03",TransitionCondition.CanAddCars);
        Condition T20Ct2= new Condition(t_g3, "p_i", TransitionCondition.HaveCarForMe);
        T20Ct1.SetNextCondition(LogicConnector.AND,T20Ct2);

        GuardMapping grdT20= new GuardMapping();
        grdT20.condition=T20Ct1;
        grdT20.Activations.add(new Activation(t_g3, "p_i", TransitionOperation.PopElementWithTargetToQueue, "p_03"));
        t_g3.GuardMappingList.add(grdT20);

        t_g3.Delay = 0;
        pn.Transitions.add(t_g3);

        //T21

        PetriTransition t_g4=new PetriTransition(pn);
        t_g4.TransitionName="t_g4";
        t_g4.InputPlaceName.add("p_04");
        t_g4.InputPlaceName.add("p_i");

        Condition T21Ct1= new Condition(t_g4,"p_04",TransitionCondition.CanAddCars);
        Condition T21Ct2= new Condition(t_g4, "p_i", TransitionCondition.HaveCarForMe);
        T21Ct1.SetNextCondition(LogicConnector.AND,T21Ct2);

        GuardMapping grdT21= new GuardMapping();
        grdT21.condition=T21Ct1;
        grdT21.Activations.add(new Activation(t_g4, "p_i", TransitionOperation.PopElementWithTargetToQueue, "p_04"));
        t_g4.GuardMappingList.add(grdT21);

        t_g4.Delay = 0;
        pn.Transitions.add(t_g4);



        // Petri Start
        System.out.println("Intersection started");
        pn.Delay = 2000;


        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }

}
