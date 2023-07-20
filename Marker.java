class Marker{

String brandName;
String color;
double price;

public Marker(){
System.out.println("The marker is invovked");
}

public Marker(String brandName, String color){
//this(20.00);
this.brandName=brandName;
this.color=color;
System.out.println("The marker is invovked");
}

public Marker(double price){
this("Faber Castel", "Black");
this.price=price;
}
}