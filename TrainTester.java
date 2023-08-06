package com.xworkz.trainapp.pass;

public class TrainTester {

    public static void main(String[] args) {
        Train tr=new Train();
        tr.trainPath="Bangalore To Mysore";
        Passengers ps=new Passengers();
        ps.noOfPassengers=22;
        System.out.println("The path of the train is:" +tr.trainPath);
        System.out.println("The number of passengers in the train are:" +ps.noOfPassengers);
    }
}
