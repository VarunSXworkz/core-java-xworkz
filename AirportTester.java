package com.xworkz.airapp.airport;

import com.xworkz.airapp.airport.Airport;
import com.xworkz.airapp.airport.Terminal;

public class AirportTester {

    public static void main(String[] args) {
        Terminal term=new Terminal();
        term.terminalNumber=101;
        Airport port=new Airport();
        port.terminal=term;
        System.out.println("The airport terminal number is:" +term.terminalNumber);
    }
}
