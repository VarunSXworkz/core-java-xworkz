class Radio{
	
	public Radio(String radioName, String color, String type, double price){
		this.radioName=radioName;
		this.color=color;
		this.type=type;
		this.price=price;
	System.out.println("Radio Constructor is invovked");
}

String radioName;
String color;
String type;
double price;

public void toHear(){
System.out.println("The Radio is assumed");
}

}