package com.xworkz.comapp.company;

public class CompanyTester {

    public static void main(String[] args) {
        Company com=new Company();
        com.companyName="Cognizant";
        Clients cl=new Clients();
        cl.noOfClients=50;
        System.out.println("The name of the company is:" +com.companyName);
        System.out.println("The number of clients present in the company are:" +cl.noOfClients);
    }
}
