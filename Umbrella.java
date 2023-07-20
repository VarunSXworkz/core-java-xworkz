class  Umbrella{


public Umbrella(String brandName, String color, String type, double price){
	this.brandName=brandName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("Umbrella Constructor is invovked");
}
String brandName;
String color ;
String type;
double price;

public void toBeSafefromrain(){
System.out.println("The umbrella is provided");
}

}