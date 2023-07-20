class ClockTester{

public static void main(String args[]){

Clock clk=new Clock("Ajantha", true, "Analog", 3000.10);
System.out.println("The first type of clock is:");
System.out.println(clk.clockName +" "+clk.isConnected +" "+clk.type +" "+clk.price);

Clock clk1=new Clock("Bonquet", true, "Analog", 3120.10);
System.out.println("The second type of clock is:");
System.out.println(clk1.clockName +" "+clk1.isConnected +" "+clk1.type +" "+clk1.price);

Clock clk2=new Clock("Casio", false, "Digital", 5000.00);
System.out.println("The third type of clock is:");
System.out.println(clk2.clockName +" "+clk2.isConnected +" "+clk2.type +" "+clk2.price);

Clock clk3=new Clock("Seiko", true, "Multi", 7000.25);
System.out.println("The fourth type of clock is:");
System.out.println(clk3.clockName +" "+clk3.isConnected +" "+clk3.type +" "+clk3.price);

Clock clk4=new Clock("B Square", true, "Analog", 5500.89);
System.out.println("The fifth type of clock is:");
System.out.println(clk4.clockName +" "+clk4.isConnected +" "+clk4.type +" "+clk4.price);

Clock clk5=new Clock("Chumbak", true, "Analog", 1980.50);
System.out.println("The sixth type of clock is:");
System.out.println(clk5.clockName +" "+clk5.isConnected +" "+clk5.type +" "+clk5.price);

Clock clk6=new Clock("Titan", false, "Digital", 8000.11);
System.out.println("The seventh type of clock is:");
System.out.println(clk6.clockName +" "+clk6.isConnected +" "+clk6.type +" "+clk6.price);

Clock clk7=new Clock("Bulova", true, "Multi", 6750.10);
System.out.println("The eighth type of clock is:");
System.out.println(clk7.clockName +" "+clk7.isConnected +" "+clk7.type +" "+clk7.price);

Clock clk8=new Clock("Radoo", false, "Digital", 6431.10);
System.out.println("The ninth type of clock is:");
System.out.println(clk8.clockName +" "+clk8.isConnected +" "+clk8.type +" "+clk8.price);

Clock clk9=new Clock("Hermel", true, "Multi", 8000.41);
System.out.println("The tenth type of clock is:");
System.out.println(clk9.clockName +" "+clk9.isConnected +" "+clk9.type +" "+clk9.price);
}
}