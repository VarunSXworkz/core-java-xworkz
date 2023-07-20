class Books{

public Books(String bookName, String type, String author, double price){
	this.bookName=bookName;
	this.type=type;
	this.author=author;
	this.price=price;
	System.out.println("Books Constructor is invovked");
}
String bookName;
String type;
String author;
double price;

public void toGainKnowledge(){
System.out.println("The Books determined");
}
}