class SatelliteTester{


public static void main(String args[]){


Satellite sat=new Satellite("RISAT2", "RadarSatellite", false, 400000.0);
System.out.println("The first Satellite is:");
System.out.println(sat.satelliteName +" "+sat.type +" "+sat.isSolarPanels +" "+sat.price);

Satellite sat1=new Satellite("RISAT1", "RemoteSensing", true, 200000.0);
System.out.println("The second Satellite is:");
System.out.println(sat1.satelliteName +" "+sat1.type +" "+sat1.isSolarPanels +" "+sat1.price);

Satellite sat2=new Satellite("IRNSS-1D", "NavigationSystem", false, 15000000.0);
System.out.println("The third Satellite is:");
System.out.println(sat2.satelliteName +" "+sat2.type +" "+sat2.isSolarPanels +" "+sat2.price);

Satellite sat3=new Satellite("SARAL", "CommunicationSystem", true, 3500000.0);
System.out.println("The fourth Satellite is:");
System.out.println(sat3.satelliteName +" "+sat3.type +" "+sat3.isSolarPanels +" "+sat3.price);

Satellite sat4=new Satellite("GSAT-4", "ObservationSystem", false, 700000.0);
System.out.println("The fifth Satellite is:");
System.out.println(sat4.satelliteName +" "+sat4.type +" "+sat4.isSolarPanels +" "+sat4.price);

Satellite sat5=new Satellite("INSAT-4CR", "HighTransponderSystem", true, 1100000.0);
System.out.println("The sixth Satellite is:");
System.out.println(sat5.satelliteName +" "+sat5.type +" "+sat5.isSolarPanels +" "+sat5.price);

Satellite sat6=new Satellite("CARTOSAT-2", "SunSyncronousSystem", false, 2200000.0);
System.out.println("The seventh Satellite is:");
System.out.println(sat6.satelliteName +" "+sat6.type +" "+sat6.isSolarPanels +" "+sat6.price);

Satellite sat7=new Satellite("GSAT-14", "In-OrbitCapacity", true, 100000.0);
System.out.println("The eighth Satellite is:");
System.out.println(sat7.satelliteName +" "+sat7.type +" "+sat7.isSolarPanels +" "+sat7.price);

Satellite sat8=new Satellite("IRNSS-1E", "ReginolNavigationalSystem", true, 8800000.0);
System.out.println("The ninth Satellite is:");
System.out.println(sat8.satelliteName +" "+sat8.type +" "+sat8.isSolarPanels +" "+sat8.price);

Satellite sat9=new Satellite("GSAT-16", "SignalSystem", true, 9900000.0);
System.out.println("The tenth Satellite is:");
System.out.println(sat9.satelliteName +" "+sat9.type +" "+sat9.isSolarPanels +" "+sat9.price);
}
}