class WaterHeaterTester{


public static void main(String args[]){


WaterHeater wh=new WaterHeater("Crompton", "White", false, 8000.0);
System.out.println("The first WaterHeater is:");
System.out.println(wh.heaterName +" "+wh.color +" "+wh.isWiFi +" "+wh.price);

WaterHeater wh1=new WaterHeater("AO Smith", "Black", true, 9000.0);
System.out.println("The second WaterHeater is:");
System.out.println(wh1.heaterName +" "+wh1.color +" "+wh1.isWiFi +" "+wh1.price);

WaterHeater wh2=new WaterHeater("Bajaj", "Brown", true, 9900.0);
System.out.println("The third WaterHeater is:");
System.out.println(wh2.heaterName +" "+wh2.color +" "+wh2.isWiFi +" "+wh2.price);

WaterHeater wh3=new WaterHeater("Havells", "Red", true, 4000.0);
System.out.println("The fourth WaterHeater is:");
System.out.println(wh3.heaterName +" "+wh3.color +" "+wh3.isWiFi +" "+wh3.price);

WaterHeater wh4=new WaterHeater("V-Guard", "Blue", false, 2000.0);
System.out.println("The fifth WaterHeater is:");
System.out.println(wh4.heaterName +" "+wh4.color +" "+wh4.isWiFi +" "+wh4.price);

WaterHeater wh5=new WaterHeater("Orient", "Orange", true, 6000.0);
System.out.println("The sixth WaterHeater is:");
System.out.println(wh5.heaterName +" "+wh5.color +" "+wh5.isWiFi +" "+wh5.price);

WaterHeater wh6=new WaterHeater("Aquatree", "Yellow", true, 5000.0);
System.out.println("The seventh WaterHeater is:");
System.out.println(wh6.heaterName +" "+wh6.color +" "+wh6.isWiFi +" "+wh6.price);

WaterHeater wh7=new WaterHeater("Racold", "Cream", true, 7000.0);
System.out.println("The eighth WaterHeater is:");
System.out.println(wh7.heaterName +" "+wh7.color +" "+wh7.isWiFi +" "+wh7.price);

WaterHeater wh8=new WaterHeater("MinMax", "Peach", true, 4500.0);
System.out.println("The ninth WaterHeater is:");
System.out.println(wh8.heaterName +" "+wh8.color +" "+wh8.isWiFi +" "+wh8.price);

WaterHeater wh9=new WaterHeater("Usha", "White", false, 2400.0);
System.out.println("The tenth WaterHeater is:");
System.out.println(wh9.heaterName +" "+wh9.color +" "+wh9.isWiFi +" "+wh9.price);
}
}