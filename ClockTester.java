class ClockTester{

public static void main(String args[]){

Clock clk=new Clock();
clk.clockName="Ajantha";
clk.isConnected=true;
clk.type="Analog";
clk.price=3000.10;
System.out.println("The first type of clock is:");
System.out.println(clk.clockName +" "+clk.isConnected +" "+clk.type +" "+clk.price);

Clock clk1=new Clock();
clk1.clockName="Bonquet";
clk1.isConnected=true;
clk1.type="Analog";
clk1.price=3120.10;
System.out.println("The second type of clock is:");
System.out.println(clk1.clockName +" "+clk1.isConnected +" "+clk1.type +" "+clk1.price);

Clock clk2=new Clock();
clk2.clockName="Casio";
clk2.isConnected=false;
clk2.type="Digital";
clk2.price=5000.00;
System.out.println("The third type of clock is:");
System.out.println(clk2.clockName +" "+clk2.isConnected +" "+clk2.type +" "+clk2.price);

Clock clk3=new Clock();
clk3.clockName="Seiko";
clk3.isConnected=true;
clk3.type="Multi";
clk3.price=7000.25;
System.out.println("The fourth type of clock is:");
System.out.println(clk3.clockName +" "+clk3.isConnected +" "+clk3.type +" "+clk3.price);

Clock clk4=new Clock();
clk4.clockName="B Square";
clk4.isConnected=true;
clk4.type="Analog";
clk4.price=5500.89;
System.out.println("The fifth type of clock is:");
System.out.println(clk4.clockName +" "+clk4.isConnected +" "+clk4.type +" "+clk4.price);

Clock clk5=new Clock();
clk5.clockName="Chumbak";
clk5.isConnected=true;
clk5.type="Analog";
clk5.price=1980.50;
System.out.println("The sixth type of clock is:");
System.out.println(clk5.clockName +" "+clk5.isConnected +" "+clk5.type +" "+clk5.price);

Clock clk6=new Clock();
clk6.clockName="Titan";
clk6.isConnected=false;
clk6.type="Digital";
clk6.price=8000.11;
System.out.println("The seventh type of clock is:");
System.out.println(clk6.clockName +" "+clk6.isConnected +" "+clk6.type +" "+clk6.price);

Clock clk7=new Clock();
clk7.clockName="Bulova";
clk7.isConnected=true;
clk7.type="Multi";
clk7.price=6750.10;
System.out.println("The eighth type of clock is:");
System.out.println(clk7.clockName +" "+clk7.isConnected +" "+clk7.type +" "+clk7.price);

Clock clk8=new Clock();
clk8.clockName="Radoo";
clk8.isConnected=false;
clk8.type="Digital";
clk8.price=6431.10;
System.out.println("The ninth type of clock is:");
System.out.println(clk8.clockName +" "+clk8.isConnected +" "+clk8.type +" "+clk8.price);

Clock clk9=new Clock();
clk9.clockName="Hermel";
clk9.isConnected=true;
clk9.type="Multi";
clk9.price=8000.41;
System.out.println("The tenth type of clock is:");
System.out.println(clk9.clockName +" "+clk9.isConnected +" "+clk9.type +" "+clk9.price);
}
}