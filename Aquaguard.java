class  Aquaguard{
	
	public Aquaguard(String brandName, String color, boolean isCopperProtected, double price){
		this.brandName=brandName;
		this.color=color;
		this.isCopperProtected=isCopperProtected;
		this.price=price;
	System.out.println("Aquaguard Constructor is invovked");
}

String brandName;
String color;
boolean isCopperProtected;
double price;

public void toPurifyWater(){
System.out.println("The Aquaguard is best");
}

}