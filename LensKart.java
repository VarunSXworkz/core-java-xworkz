class LensKart{

String brandName;
String type;
double price;


public LensKart(){
System.out.println("The lens type is invovked");
}

public LensKart(String brandName, String type){
this(700.99);
this.brandName=brandName;
this.type=type;
System.out.println("The lens type is invovked");
}

public LensKart(double price){
//this("Titan+", "Elastic");
this.price=price;
}
}