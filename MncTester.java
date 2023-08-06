package com.xworkz.comanyapp.mnc;

public class MncTester {

    public static void main(String[] args) {
        Mnc mn=new Mnc();
        SubCompanies sc=new SubCompanies();
        sc.subCompanyName="Microsoft";
        System.out.println("The name of mnc sub company is:" +sc.subCompanyName);
    }
}

