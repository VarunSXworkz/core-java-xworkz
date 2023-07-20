class AquaguardTester{




public static void main(String args[]){


Aquaguard aqua=new Aquaguard("Hot n Ambient RO+UV", "Black", true, 63000.7);
System.out.println("The first Aquaguard is:");
System.out.println(aqua.brandName +" "+aqua.color +" "+aqua.isCopperProtected +" "+aqua.price);

Aquaguard aqua1=new Aquaguard("Crest UV", "White", false, 11000.3);
System.out.println("The second Aquaguard is:");
System.out.println(aqua1.brandName +" "+aqua1.color +" "+aqua1.isCopperProtected +" "+aqua1.price);

Aquaguard aqua2=new Aquaguard("Rapid RO+UV+MTDS", "Copper", true, 17000.2);
System.out.println("The third Aquaguard is:");
System.out.println(aqua2.brandName +" "+aqua2.color +" "+aqua2.isCopperProtected +" "+aqua2.price);

Aquaguard aqua3=new Aquaguard("Infina RO+UV+TA", "Brown", true, 28000.4);
System.out.println("The fourth Aquaguard is:");
System.out.println(aqua3.brandName +" "+aqua3.color +" "+aqua3.isCopperProtected +" "+aqua3.price);

Aquaguard aqua4=new Aquaguard("Infinia RO+UV+TAUF", "Black", true, 24000.6);
System.out.println("The fifth Aquaguard is:");
System.out.println(aqua4.brandName +" "+aqua4.color +" "+aqua4.isCopperProtected +" "+aqua4.price);

Aquaguard aqua5=new Aquaguard("Mist UV+", "Cream", false, 30000.2);
System.out.println("The sixth Aquaguard is:");
System.out.println(aqua5.brandName +" "+aqua5.color +" "+aqua5.isCopperProtected +" "+aqua5.price);

Aquaguard aqua6=new Aquaguard("Blaze Sim UV+RO+MTDS", "White", false, 45000.1);
System.out.println("The seventh Aquaguard is:");
System.out.println(aqua6.brandName +" "+aqua6.color +" "+aqua6.isCopperProtected +" "+aqua6.price);

Aquaguard aqua7=new Aquaguard("Crest UV+Hot", "Brown", true, 50000.5);
System.out.println("The eighth Aquaguard is:");
System.out.println(aqua7.brandName +" "+aqua7.color +" "+aqua7.isCopperProtected +" "+aqua7.price);

Aquaguard aqua8=new Aquaguard("Nova RO+UV+SS+MTDS", "Black", false, 75000.9);
System.out.println("The ninth Aquaguard is:");
System.out.println(aqua8.brandName +" "+aqua8.color +" "+aqua8.isCopperProtected +" "+aqua8.price);

Aquaguard aqua9=new Aquaguard("UTC UV Booster", "Brown", true, 81000.3);
System.out.println("The tenth Aquaguard is:");
System.out.println(aqua9.brandName +" "+aqua9.color +" "+aqua9.isCopperProtected +" "+aqua9.price);
}
}