class ProjectorTester{

public static void main(String args[]){

Projector project=new Projector("BenQ", "yes", "Schools", 45000.00);
System.out.println("The first projector determined is:");
System.out.println(project.brandName +" "+project.hasWiFi +" "+project.uses +" "+project.price);

Projector project1=new Projector("Epson", "yes", "Conferences", 60000.00);
System.out.println("The second projector determined is:");
System.out.println(project1.brandName +" "+project1.hasWiFi +" "+project1.uses +" "+project1.price);

Projector project2=new Projector("JVC", "no", "Colleges", 12000.75);
System.out.println("The third projector determined is:");
System.out.println(project2.brandName +" "+project2.hasWiFi +" "+project2.uses +" "+project2.price);

Projector project3=new Projector("Sony", "yes", "Presentations", 69861.00);
System.out.println("The fourth projector determined is:");
System.out.println(project3.brandName +" "+project3.hasWiFi +" "+project3.uses +" "+project3.price);

Projector project4=new Projector("ViewSonic", "yes", "Homes", 19651.00);
System.out.println("The fifth projector determined is:");
System.out.println(project4.brandName +" "+project4.hasWiFi +" "+project4.uses +" "+project4.price);

Projector project5=new Projector("Samsung", "yes", "Parties", 68000.00);
System.out.println("The sixth projector determined is:");
System.out.println(project5.brandName +" "+project5.hasWiFi +" "+project5.uses +" "+project5.price);

Projector project6=new Projector("Acer", "no", "Threater", 20917.00);
System.out.println("The seventh projector determined is:");
System.out.println(project6.brandName +" "+project6.hasWiFi +" "+project6.uses +" "+project6.price);

Projector project7=new Projector("Panasonic", "yes", "Home Threater", 51000.20);
System.out.println("The eighth projector determined is:");
System.out.println(project7.brandName +" "+project7.hasWiFi +" "+project7.uses +" "+project7.price);

Projector project8=new Projector("InFocus", "no", "Business", 13000.90);
System.out.println("The ninth projector determined is:");
System.out.println(project8.brandName +" "+project8.hasWiFi +" "+project8.uses +" "+project8.price);

Projector project9=new Projector("Vivitek", "yes", "Automobile", 89000.99);
System.out.println("The tenth projector determined is:");
System.out.println(project9.brandName +" "+project9.hasWiFi +" "+project9.uses +" "+project9.price);
}
}