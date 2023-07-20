class RadioTester{

public static void main(String args[]){

Radio rad=new Radio("BBC radio1", "Black", "AM", 45.60);
System.out.println("The first radio name is:");
System.out.println(rad.radioName +" "+rad.color +" "+rad.type +" "+rad.price);

Radio rad1=new Radio("Ishq radio", "White", "FM", 50.60);
System.out.println("The second radio name is:");
System.out.println(rad1.radioName +" "+rad1.color +" "+rad1.type +" "+rad1.price);

Radio rad2=new Radio("Indigo 91.9", "Blue", "FM", 145.20);
System.out.println("The third radio name is:");
System.out.println(rad2.radioName +" "+rad2.color +" "+rad2.type +" "+rad2.price);

Radio rad3=new Radio("Radio City", "Red", "AM", 75.59);
System.out.println("The fourth radio name is:");
System.out.println(rad3.radioName +" "+rad3.color +" "+rad3.type +" "+rad3.price);

Radio rad4=new Radio("Air FM Gold", "Gold", "FM", 175.35);
System.out.println("The fifth radio name is:");
System.out.println(rad4.radioName +" "+rad4.color +" "+rad4.type +" "+rad4.price);

Radio rad5=new Radio("BBC Radio Xtra", "Black", "FM", 75.14);
System.out.println("The sixth radio name is:");
System.out.println(rad5.radioName +" "+rad5.color +" "+rad5.type +" "+rad5.price);

Radio rad6=new Radio("All india radio", "Purple", "AM", 115.30);
System.out.println("The seventh radio name is:");
System.out.println(rad6.radioName +" "+rad6.color +" "+rad6.type +" "+rad6.price);

Radio rad7=new Radio("Air Fm Radio", "White", "FM", 25.89);
System.out.println("The eigth radio name is:");
System.out.println(rad7.radioName +" "+rad7.color +" "+rad7.type +" "+rad7.price);

Radio rad8=new Radio("KEXP", "Violet", "AM", 125.12);
System.out.println("The ninth radio name is:");
System.out.println(rad8.radioName +" "+rad8.color +" "+rad8.type +" "+rad8.price);

Radio rad9=new Radio("Mirchi radio", "Red", "FM", 145.00);
System.out.println("The tenth radio name is:");
System.out.println(rad9.radioName +" "+rad9.color +" "+rad9.type +" "+rad9.price);
}
}