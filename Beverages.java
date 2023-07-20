class  Beverages{

public Beverages(String beverageName, String color, boolean isMoreAlcoholic, double price){
	this.beverageName=beverageName;
	this.color=color;
	this.isMoreAlcoholic=isMoreAlcoholic;
	this.price=price;
	System.out.println("Beverages Constructor is invovked");
}
String beverageName;
String color;
boolean isMoreAlcoholic;
double price;

public void toRefresh(){
System.out.println("The Beverages are good");
}

}