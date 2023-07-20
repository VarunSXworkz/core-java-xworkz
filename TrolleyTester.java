class TrolleyTester{

public static void main(String args[]){


Trolley tr=new Trolley("Stainless Steel", "Steel", 3000.90);
System.out.println("The first Trolley is:");
System.out.println(tr.trolleyName +" "+tr.type +" "+tr.price);

Trolley tr1=new Trolley("Sigma", "Iron", 1500.80);
System.out.println("The second Trolley is:");
System.out.println(tr1.trolleyName +" "+tr1.type +" "+tr1.price);

Trolley tr2=new Trolley("Standard", "Plastic", 1342.81);
System.out.println("The third Trolley is:");
System.out.println(tr2.trolleyName +" "+tr2.type +" "+tr2.price);

Trolley tr3=new Trolley("Floding", "Hybrid", 1190.52);
System.out.println("The fourth Trolley is:");
System.out.println(tr3.trolleyName +" "+tr3.type +" "+tr3.price);

Trolley tr4=new Trolley("Insulated", "Smart", 2000.63);
System.out.println("The fifth Trolley is:");
System.out.println(tr4.trolleyName +" "+tr4.type +" "+tr4.price);

Trolley tr5=new Trolley("Mini", "Wire mesh", 1764.79);
System.out.println("The sixth Trolley is:");
System.out.println(tr5.trolleyName +" "+tr5.type +" "+tr5.price);

Trolley tr6=new Trolley("ChildFriendly", "Fabric", 5000.40);
System.out.println("The seventh Trolley is:");
System.out.println(tr6.trolleyName +" "+tr6.type +" "+tr6.price);

Trolley tr7=new Trolley("Whhelchair", "Nylon", 1420.11);
System.out.println("The eighth Trolley is:");
System.out.println(tr7.trolleyName +" "+tr7.type +" "+tr7.price);

Trolley tr8=new Trolley("SuperHauler", "RecycledMetal", 7000.89);
System.out.println("The ninth Trolley is:");
System.out.println(tr8.trolleyName +" "+tr8.type +" "+tr8.price);

Trolley tr9=new Trolley("TurboTote", "HardMetal", 1255.00);
System.out.println("The tenth Trolley is:");
System.out.println(tr9.trolleyName +" "+tr9.type +" "+tr9.price);
}
}