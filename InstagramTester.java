package com.xworkz.scapp.insta;

public class InstagramTester {

    public static void main(String[] args) {
        Instagram ins=new Instagram();
        Influencers in=new Influencers();
        in.noOfInfluencers=1000;
        System.out.println("The number of influencers in instagram are:" +in.noOfInfluencers);
    }
}
