class  Light{


public Light(String lightName, String color, String type, double price){
	    this.lightName=lightName;
		this.color=color;
		this.type=type;
		this.price=price;
	System.out.println("Light Constructor is invovked");
}
String lightName;
String color;
String type;
double price;

public void toGiveBrightnees(){
System.out.println("The Light is provided");
}

}