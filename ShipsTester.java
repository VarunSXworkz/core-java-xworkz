class ShipsTester{


public static void main(String args[]){


Ships sh=new Ships("Emma Maersk", "ConatinerShips", false, 40000.21);
System.out.println("The first Ships is:");
System.out.println(sh.shipName +" "+sh.type +" "+sh.isHybrid +" "+sh.price);

Ships sh1=new Ships("Berge Stahl", "BulkCarrier", true, 200000.00);
System.out.println("The second Ships is:");
System.out.println(sh1.shipName +" "+sh1.type +" "+sh1.isHybrid +" "+sh1.price);

Ships sh2=new Ships("TI Oceania", "Tanker", true, 21000.50);
System.out.println("The third Ships is:");
System.out.println(sh2.shipName +" "+sh2.type +" "+sh2.isHybrid +" "+sh2.price);

Ships sh3=new Ships("Courageous Ace", "Roll-off", true, 4400000.22);
System.out.println("The fourth Ships is:");
System.out.println(sh3.shipName +" "+sh3.type +" "+sh3.isHybrid +" "+sh3.price);

Ships sh4=new Ships("Queen Mary 2", "PassengerShip", false, 500000.90);
System.out.println("The fifth Ships is:");
System.out.println(sh4.shipName +" "+sh4.type +" "+sh4.isHybrid +" "+sh4.price);

Ships sh5=new Ships("MSC Daniela", "Cargo", false, 1300000.75);
System.out.println("The sixth Ships is:");
System.out.println(sh5.shipName +" "+sh5.type +" "+sh5.isHybrid +" "+sh5.price);

Ships sh6=new Ships("FV Saga", "FishingVessel", false, 4100000.45);
System.out.println("The seventh Ships is:");
System.out.println(sh6.shipName +" "+sh6.type +" "+sh6.isHybrid +" "+sh6.price);

Ships sh7=new Ships("Mont", "OilTanker", true, 700000.99);
System.out.println("The eighth Ships is:");
System.out.println(sh7.shipName +" "+sh7.type +" "+sh7.isHybrid +" "+sh7.price);

Ships sh8=new Ships("Green Reefer", "RefferShip", true, 5900000.20);
System.out.println("The ninth Ships is:");
System.out.println(sh8.shipName +" "+sh8.type +" "+sh8.isHybrid +" "+sh8.price);

Ships sh9=new Ships("BW Tulip", "GasCarrier", false, 1200000.40);
System.out.println("The tenth Ships is:");
System.out.println(sh9.shipName +" "+sh9.type +" "+sh9.isHybrid +" "+sh9.price);
}
}