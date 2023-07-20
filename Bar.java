class  Bar{

public Bar(String barName, String color, String type, double price){
	this.barName=barName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("Bar Constructor is invovked");
}
String barName;
String color;
String type;
double price;

public void toDrink(){
System.out.println("The Bar is located");
}

}