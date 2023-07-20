class  Projector{
	
	public Projector(String brandName, String hasWiFi, String uses, double price){
		this.brandName=brandName;
		this.hasWiFi=hasWiFi;
		this.uses=uses;
		this.price=price;
	System.out.println("Projector Constructor is invovked");
}

String brandName;
String hasWiFi ;
String uses;
double price;

public void toDisplay(){
System.out.println("The projector is displayed");
}

}