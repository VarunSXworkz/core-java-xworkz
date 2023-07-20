class  SuitCase{

public SuitCase(String brandName, String color, String type, double price){
	this.brandName=brandName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("SuitCase Constructor is invovked");
}
String brandName;
String color;
String type;
double price;

public void toPack(){
System.out.println("The SuitCase is available");
}

}