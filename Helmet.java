class  Helmet{

public Helmet(String helmetName, String color, String type, double price){
	this.helmetName=helmetName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("Helmet Constructor is invovked");
}
String helmetName;
String color ;
String type;
double price;

public void toStayProtected(){
System.out.println("The helmet is given");
}

}