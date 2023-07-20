class  Satellite{
	
	public Satellite(String satelliteName, String type, boolean isSolarPanels, double price){
		this.satelliteName=satelliteName;
		this.type=type;
		this.isSolarPanels=isSolarPanels;
		this.price=price;
	System.out.println("Satellite Constructor is invovked");
}

String satelliteName;
String type;
boolean isSolarPanels;
double price;

public void toCommunicate(){
System.out.println("The Satellite are setup");
}

}