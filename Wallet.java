class  Wallet{

public Wallet(String brandName, String color, String type, double price){
	this.brandName=brandName;
	this.color=color;
	this.type=type;
	this.price=price;
	System.out.println("Wallet Constructor is invovked");
}
String brandName;
String color;
String type;
double price;

public void toKeepMoney(){
System.out.println("The Wallet is given");
}

}