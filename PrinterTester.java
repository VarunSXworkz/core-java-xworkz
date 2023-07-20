class PrinterTester{

public static void main(String args[]){

Printer print=new Printer("Hp", "Black", true, 25000.00);
System.out.println("The first type of printer is:");
System.out.println(print.brandName +" "+print.color +" "+print.hasWiFi +" "+print.price);

Printer print1=new Printer("Canon", "White", true, 30000.00);
System.out.println("The second type of printer is:");
System.out.println(print1.brandName +" "+print1.color +" "+print1.hasWiFi +" "+print1.price);

Printer print2=new Printer("Xerox", "Cream", false, 12000.99);
System.out.println("The third type of printer is:");
System.out.println(print2.brandName +" "+print2.color +" "+print2.hasWiFi +" "+print2.price);

Printer print3=new Printer("Epson", "Blue", true, 78000.10);
System.out.println("The fourth type of printer is:");
System.out.println(print3.brandName +" "+print3.color +" "+print3.hasWiFi +" "+print3.price);

Printer print4=new Printer("Brother", "Black", false, 76000.00);
System.out.println("The fifth type of printer is:");
System.out.println(print4.brandName +" "+print4.color +" "+print4.hasWiFi +" "+print4.price);

Printer print5=new Printer("Pantum", "White", true, 60000.25);
System.out.println("The sixth type of printer is:");
System.out.println(print5.brandName +" "+print5.color +" "+print5.hasWiFi +" "+print5.price);

Printer print6=new Printer("Ricoh", "Red", true, 55000.00);
System.out.println("The seventh type of printer is:");
System.out.println(print6.brandName +" "+print6.color +" "+print6.hasWiFi +" "+print6.price);

Printer print7=new Printer("OKI", "Multi", false, 20000.7);
System.out.println("The eight type of printer is:");
System.out.println(print7.brandName +" "+print7.color +" "+print7.hasWiFi +" "+print7.price);

Printer print8=new Printer("Lexmark", "Multi", true, 54000.00);
System.out.println("The ninth type of printer is:");
System.out.println(print8.brandName +" "+print8.color +" "+print8.hasWiFi +" "+print8.price);

Printer print9=new Printer("Lenovo", "Black", true, 70000.25);
System.out.println("The tenth type of printer is:");
System.out.println(print9.brandName +" "+print9.color +" "+print9.hasWiFi +" "+print9.price);
}
}