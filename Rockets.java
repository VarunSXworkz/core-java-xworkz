class  Rockets{

public Rockets(String rocketName, String type, boolean isHeavy, double price){
	this.rocketName=rocketName;
	this.type=type;
	this.isHeavy=isHeavy;
	this.price=price;
	System.out.println("Rockets Constructor is invovked");
}
String rocketName;
String type;
boolean isHeavy;
double price;

public void toSendToPlanets(){
System.out.println("The Rockets are fast");
}

}