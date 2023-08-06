package com.xworkz.thapp.multiplex;

public class TheaterTester {

    public static void main(String[] args) {
        Theater th=new Theater();
        th.theaterName="PVR";
        Screen sc=new Screen();
        sc.screenNumber=4;
        System.out.println("The name of the theater is:" +th.theaterName);
        System.out.println("The screen number is:" +sc.screenNumber);
    }
}
