class  WaterHeater{

public WaterHeater(String heaterName, String color, boolean isWiFi, double price){
	this.heaterName=heaterName;
	this.color=color;
	this.isWiFi=isWiFi;
	this.price=price;
	System.out.println("WaterHeater Constructor is invovked");
}
String heaterName;
String color;
boolean isWiFi;
double price;

public void toHeat(){
System.out.println("The Water Heater is placed");
}

}