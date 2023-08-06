package com.xworkz.desktop.laptop;

import com.xworkz.desktop.laptop.Laptop;
import com.xworkz.desktop.laptop.Processor;

public class LaptopTester {

    public static void main(String[] args) {
        Laptop la=new Laptop();
        la.laptopName="Dell";
        Processor pr=new Processor();
        System.out.println("The name of the laptop is:" +la.laptopName);
    }
}
