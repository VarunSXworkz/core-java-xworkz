class Girias{
static String electronicDevices[]={"Refrigerator", "Television" ,"Washingmachine", "Air conditioning", "Microwen", "LED", "Waterheater"};
static double priceOfelectronicDevices[]={60000.89, 45000.70, 89000.10, 45000.90, 10000.45, 14000.89, 75000.00};

public static void main(String in[]) {
System.out.println("Main Started");
System.out.println("The Electronic devices present are:");
for(String electronicDevice :electronicDevices){
System.out.println(electronicDevice);
}
for(double priceOfelectronicDevice :priceOfelectronicDevices) {
	System.out.println(priceOfelectronicDevice);
}
System.out.println("Main ended");
}
}