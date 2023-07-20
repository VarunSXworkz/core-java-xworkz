class  Printer{


public Printer(String brandName, String color, boolean hasWiFi, double price){
	this.brandName=brandName;
	this.color=color;
	this.hasWiFi=hasWiFi;
	this.price=price;
	System.out.println("Printer Constructor is invovked");
}
String brandName;
String color ;
boolean hasWiFi;
double price;

public void toPrint(){
System.out.println("The printer is determined");
}

}