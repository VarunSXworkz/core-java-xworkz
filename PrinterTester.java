class PrinterTester{

public static void main(String args[]){

Printer print=new Printer();
print.brandName="Hp";
print.color="Black";
print.hasWiFi=true;
print.price=25000.00;
System.out.println("The first type of printer is:");
System.out.println(print.brandName +" "+print.color +" "+print.hasWiFi +" "+print.price);

Printer print1=new Printer();
print1.brandName="Canon";
print1.color="White";
print1.hasWiFi=true;
print1.price=30000.00;
System.out.println("The second type of printer is:");
System.out.println(print1.brandName +" "+print1.color +" "+print1.hasWiFi +" "+print1.price);

Printer print2=new Printer();
print2.brandName="Xerox";
print2.color="Cream";
print2.hasWiFi=false;
print2.price=12000.99;
System.out.println("The third type of printer is:");
System.out.println(print2.brandName +" "+print2.color +" "+print2.hasWiFi +" "+print2.price);

Printer print3=new Printer();
print3.brandName="Epson";
print3.color="Blue";
print3.hasWiFi=true;
print3.price=78000.10;
System.out.println("The fourth type of printer is:");
System.out.println(print3.brandName +" "+print3.color +" "+print3.hasWiFi +" "+print3.price);

Printer print4=new Printer();
print4.brandName="Brother";
print4.color="Black";
print4.hasWiFi=false;
print4.price=76000.00;
System.out.println("The fifth type of printer is:");
System.out.println(print4.brandName +" "+print4.color +" "+print4.hasWiFi +" "+print4.price);

Printer print5=new Printer();
print5.brandName="Pantum";
print5.color="White";
print5.hasWiFi=true;
print5.price=60000.25;
System.out.println("The sixth type of printer is:");
System.out.println(print5.brandName +" "+print5.color +" "+print5.hasWiFi +" "+print5.price);

Printer print6=new Printer();
print6.brandName="Ricoh";
print6.color="Red";
print6.hasWiFi=true;
print6.price=55000.00;
System.out.println("The seventh type of printer is:");
System.out.println(print6.brandName +" "+print6.color +" "+print6.hasWiFi +" "+print6.price);

Printer print7=new Printer();
print7.brandName="OKI";
print7.color="Multi";
print7.hasWiFi=false;
print7.price=20000.75;
System.out.println("The eight type of printer is:");
System.out.println(print7.brandName +" "+print7.color +" "+print7.hasWiFi +" "+print7.price);

Printer print8=new Printer();
print8.brandName="Lexmark";
print8.color="Multi";
print8.hasWiFi=true;
print8.price=54000.00;
System.out.println("The ninth type of printer is:");
System.out.println(print8.brandName +" "+print8.color +" "+print8.hasWiFi +" "+print8.price);

Printer print9=new Printer();
print9.brandName="Lenovo";
print9.color="Black";
print9.hasWiFi=true;
print9.price=70000.25;
System.out.println("The tenth type of printer is:");
System.out.println(print9.brandName +" "+print9.color +" "+print9.hasWiFi +" "+print9.price);
}
}