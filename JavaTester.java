package com.xworkz.java.java;

public class JavaTester {

    public static void main(String[] args) {
        Java ja=new Java();
        ja.javaComponents="JDK, JRE, JVM";
        Jdk  jd=new Jdk();
        jd.jdkFunction="The JDK consists of JRE+Set Of Libraries+developement kit+Tools(compiler debugger and java docs).";
        System.out.println("The components of java are:" +ja.javaComponents);
        System.out.println("The function of Jdk is:" +jd.jdkFunction);
    }
}
