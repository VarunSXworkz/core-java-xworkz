package com.xworkz.tea.myteam;

public class TeamTester {

    public static void main(String[] args) {
        Team te=new Team();
        te.teamName="RCB";
        Players pl=new Players();
        pl.noOfPlayers=11;
        System.out.println("The name of the team is:" +te.teamName);
        System.out.println("The number of players present in the team are:" +pl.noOfPlayers);
    }
}
