class  Jewellery{
	
	public Jewellery(String shopName, String color, String type, double price){
		this.shopName=shopName;
		this.color=color;
		this.type=type;
		this.price=price;
	System.out.println("Jewellery Constructor is invovked");
}

String shopName;
String color;
String type;
double price;

public void toShow(){
System.out.println("The Jewellery as assumed");
}

}