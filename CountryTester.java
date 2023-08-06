package com.xworkz.medicineapp.country;

public class CountryTester {

    public static void main(String[] args) {
        Country coun=new Country();
        coun.countryName="India";
        Pharmacy phar=new Pharmacy();
        phar.pharmacyName="MedPlus Pharmacy";
        System.out.println("The name of the country is:" +coun.countryName);
        System.out.println("The name of the pharmacy is:" +phar.pharmacyName);
    }
}
