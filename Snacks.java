class  Snacks{

public Snacks(String brandName, boolean isSweet, boolean isSpicy, double price){
	this.brandName=brandName;
	this.isSweet=isSweet;
	this.isSpicy=isSpicy;
	this.price=price;
	System.out.println("Snacks Constructor is invovked");
}
String brandName;
boolean isSweet;
boolean isSpicy;
double price;

public void toEnjoy(){
System.out.println("The Snacks is good choice");
}

}