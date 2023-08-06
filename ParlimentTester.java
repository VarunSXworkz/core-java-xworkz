package com.xworkz.parapp.parli;

public class ParlimentTester {

    public static void main(String[] args) {
        Parliment pr=new Parliment();
        pr.parlimentDestination="Delhi";
        Ministers min=new Ministers();
        System.out.println("The parliment is present in:" +pr.parlimentDestination);
    }
}
