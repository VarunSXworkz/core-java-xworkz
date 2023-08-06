package com.xworkz.highapp.highw;

public class HighwayTester {

    public static void main(String[] args) {
        Highway hw=new Highway();
        Tollgate tg=new Tollgate();
        tg.tollgateNumber=21;
        System.out.println("The tollgate number is:" +tg.tollgateNumber);
    }
}
