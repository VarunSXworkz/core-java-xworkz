class BeveragesTester{


public static void main(String args[]){


Beverages bg=new Beverages("Water", "White", false, 10.0);
System.out.println("The first Beverages is:");
System.out.println(bg.beverageName +" "+bg.color +" "+bg.isMoreAlcoholic +" "+bg.price);

Beverages bg1=new Beverages("Milk", "White", false, 41.0);
System.out.println("The second Beverages is:");
System.out.println(bg1.beverageName +" "+bg1.color +" "+bg1.isMoreAlcoholic +" "+bg1.price);

Beverages bg2=new Beverages("Coffee", "Brown", false, 27.0);
System.out.println("The third Beverages is:");
System.out.println(bg2.beverageName +" "+bg2.color +" "+bg2.isMoreAlcoholic +" "+bg2.price);

Beverages bg3=new Beverages("Mocktails", "Multi", false, 189.0);
System.out.println("The fourth Beverages is:");
System.out.println(bg3.beverageName +" "+bg3.color +" "+bg3.isMoreAlcoholic +" "+bg3.price);

Beverages bg4=new Beverages("Cocktails", "Cream", true, 214.0);
System.out.println("The fifth Beverages is:");
System.out.println(bg4.beverageName +" "+bg4.color +" "+bg4.isMoreAlcoholic +" "+bg4.price);

Beverages bg5=new Beverages("Beer", "Brown", true, 111.0);
System.out.println("The sixth Beverages is:");
System.out.println(bg5.beverageName +" "+bg5.color +" "+bg5.isMoreAlcoholic +" "+bg5.price);

Beverages bg6=new Beverages("Cider", "Murron", true,  244.0);
System.out.println("The seventh Beverages is:");
System.out.println(bg6.beverageName +" "+bg6.color +" "+bg6.isMoreAlcoholic +" "+bg6.price);

Beverages bg7=new Beverages("Soda", "White", false, 100.0);
System.out.println("The eighth Beverages is:");
System.out.println(bg7.beverageName +" "+bg7.color +" "+bg7.isMoreAlcoholic +" "+bg7.price);

Beverages bg8=new Beverages("MilkShakes", "Pink", false, 150.0);
System.out.println("The ninth Beverages is:");
System.out.println(bg8.beverageName +" "+bg8.color +" "+bg8.isMoreAlcoholic +" "+bg8.price);

Beverages bg9=new Beverages("HardAlcohol", "Red", true, 199.0);
System.out.println("The tenth Beverages is:");
System.out.println(bg9.beverageName +" "+bg9.color +" "+bg9.isMoreAlcoholic +" "+bg9.price);
}
}