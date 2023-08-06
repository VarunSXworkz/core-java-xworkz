package com.xworkz.desk.lap;

public class LaptopsTester {

    public static void main(String[] args) {
        Laptops ls=new Laptops();
        HardDisk hd=new HardDisk();
        hd.hardDiskSpace="512GB";
        System.out.println("The space of the hard disk is:" +hd.hardDiskSpace);
    }
}
