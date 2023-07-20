class  Ships{
	
	public Ships(String shipName, String type, boolean isHybrid, double price){
		this.shipName=shipName;
		this.type=type;
		this.isHybrid=isHybrid;
		this.price=price;
	System.out.println("Ships Constructor is invovked");
}

String shipName;
String type;
boolean isHybrid;
double price;

public void toExplore(){
System.out.println("The Ships are more");
}

}