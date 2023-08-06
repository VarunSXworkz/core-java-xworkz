package com.xworkz.fact.factory;

import javax.crypto.Mac;

public class FactoryTester {


    public static void main(String[] args) {
        Machine mac=new Machine();
        Factory fact=new Factory();
        fact.factoryName="Nandini Milk Factory";
        System.out.println("The name of the factory is:" +fact.factoryName);
    }
}
