class LightTester{

public static void main(String args[]){

Light lig=new Light("Osram", "White", "Optoelectric", 180.90);
System.out.println("The first light is:");
System.out.println(lig.lightName +" "+lig.color +" "+lig.type +" "+lig.price);

Light lig1=new Light("Philips", "Multi", "LED", 120.11);
System.out.println("The second light is:");
System.out.println(lig1.lightName +" "+lig1.color +" "+lig1.type +" "+lig1.price);

Light lig2=new Light("Creta", "Blue", "Lamp", 200.10);
System.out.println("The third light is:");
System.out.println(lig2.lightName +" "+lig2.color +" "+lig2.type +" "+lig2.price);

Light lig3=new Light("GE", "Purple", "Tube", 200.00);
System.out.println("The fourth light is:");
System.out.println(lig3.lightName +" "+lig3.color +" "+lig3.type +" "+lig3.price);

Light lig4=new Light("The regal", "Multi", "Flouroscent", 150.12);
System.out.println("The fifth light is:");
System.out.println(lig4.lightName +" "+lig4.color +" "+lig4.type +" "+lig4.price);

Light lig5=new Light("California", "Violet", "Bulb", 120.47);
System.out.println("The sixth light is:");
System.out.println(lig5.lightName +" "+lig5.color +" "+lig5.type +" "+lig5.price);

Light lig6=new Light("Syska", "Black", "Globe bulbs", 160.91);
System.out.println("The seventh light is:");
System.out.println(lig6.lightName +" "+lig6.color +" "+lig6.type +" "+lig6.price);

Light lig7=new Light("Lightscape", "Blue", "Powerhouse Bulb", 120.56);
System.out.println("The eighth light is:");
System.out.println(lig7.lightName +" "+lig7.color +" "+lig7.type +" "+lig7.price);

Light lig8=new Light("Bulbtronics", "Multi", "Amplifiers", 300.00);
System.out.println("The ninth light is:");
System.out.println(lig8.lightName +" "+lig8.color +" "+lig8.type +" "+lig8.price);

Light lig9=new Light("Zupper", "Black", "CFL", 210.10);
System.out.println("The tenth light is:");
System.out.println(lig9.lightName +" "+lig9.color +" "+lig9.type +" "+lig9.price);
}
}