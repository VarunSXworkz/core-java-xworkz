package com.xworkz.hospapp.appolohospital;

public class HospitalTester {

    public static void main(String[] args) {
        Patient pat=new Patient();
        pat.patientName="Jack";
        pat.patientAge=22;
        Hospital hos=new Hospital();
        System.out.println("The name of the patient in the hospital is:" +pat.patientName);
        System.out.println("The age of the patient in the hospital is:" +pat.patientAge);
    }
}
