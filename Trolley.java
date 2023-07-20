class  Trolley{

public Trolley(String trolleyName, String type, double price){
	this.trolleyName=trolleyName;
	this.type=type;
	this.price=price;
	System.out.println("Trolley Constructor is invovked");
}
String trolleyName;
String type;
double price;

public void toAddItems(){
System.out.println("The Trolley is provided");
}

}