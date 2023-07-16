class ShipsTester{


public static void main(String args[]){


Ships sh=new Ships();
sh.shipName="Emma Maersk";
sh.type="ConatinerShips";
sh.isHybrid=false;
sh.price=40000.21;
System.out.println("The first Ships is:");
System.out.println(sh.shipName +" "+sh.type +" "+sh.isHybrid +" "+sh.price);

Ships sh1=new Ships();
sh1.shipName="Berge Stahl";
sh1.type="BulkCarrier";
sh1.isHybrid=true;
sh1.price=200000.00;
System.out.println("The second Ships is:");
System.out.println(sh1.shipName +" "+sh1.type +" "+sh1.isHybrid +" "+sh1.price);

Ships sh2=new Ships();
sh2.shipName="TI Oceania";
sh2.type="Tanker";
sh2.isHybrid=true;
sh2.price=21000.50;
System.out.println("The third Ships is:");
System.out.println(sh2.shipName +" "+sh2.type +" "+sh2.isHybrid +" "+sh2.price);

Ships sh3=new Ships();
sh3.shipName="Courageous Ace";
sh3.type="Roll-off";
sh3.isHybrid=true;
sh3.price=4400000.22;
System.out.println("The fourth Ships is:");
System.out.println(sh3.shipName +" "+sh3.type +" "+sh3.isHybrid +" "+sh3.price);

Ships sh4=new Ships();
sh4.shipName="Queen Mary 2";
sh4.type="PassengerShip";
sh4.isHybrid=false;
sh4.price=500000.90;
System.out.println("The fifth Ships is:");
System.out.println(sh4.shipName +" "+sh4.type +" "+sh4.isHybrid +" "+sh4.price);

Ships sh5=new Ships();
sh5.shipName="MSC Daniela";
sh5.type="Cargo";
sh5.isHybrid=false;
sh5.price=1300000.75;
System.out.println("The sixth Ships is:");
System.out.println(sh5.shipName +" "+sh5.type +" "+sh5.isHybrid +" "+sh5.price);

Ships sh6=new Ships();
sh6.shipName="FV Saga";
sh6.type="FishingVessel";
sh6.isHybrid=false;
sh6.price=4100000.45;
System.out.println("The seventh Ships is:");
System.out.println(sh6.shipName +" "+sh6.type +" "+sh6.isHybrid +" "+sh6.price);

Ships sh7=new Ships();
sh7.shipName="Mont";
sh7.type="OilTanker";
sh7.isHybrid=true;
sh7.price=700000.99;
System.out.println("The eighth Ships is:");
System.out.println(sh7.shipName +" "+sh7.type +" "+sh7.isHybrid +" "+sh7.price);

Ships sh8=new Ships();
sh8.shipName="Green Reefer";
sh8.type="RefferShip";
sh8.isHybrid=true;
sh8.price=5900000.20;
System.out.println("The ninth Ships is:");
System.out.println(sh8.shipName +" "+sh8.type +" "+sh8.isHybrid +" "+sh8.price);

Ships sh9=new Ships();
sh9.shipName="BW Tulip";
sh9.type="GasCarrier";
sh9.isHybrid=false;
sh9.price=1200000.40;
System.out.println("The tenth Ships is:");
System.out.println(sh9.shipName +" "+sh9.type +" "+sh9.isHybrid +" "+sh9.price);
}
}