package com.xworkz.hu.human;

public class HumanTester {

    public static void main(String[] args) {
        Human hu=new Human();
        Heart he=new Heart();
        he.heartFunction="Circulation Of Blood";
        System.out.println("The function of the heart is:" +he.heartFunction);
    }
}
