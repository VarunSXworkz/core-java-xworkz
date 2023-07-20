class  Door{

public Door(String brandName, String color, String type, double price){
	this.brandName=brandName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("Door Constructor is invovked");
}
String brandName;
String color ;
String type;
double price;

public void toOpenandClose(){
System.out.println("The status of door is shown");
}

}