class  Clock{


public Clock(String clockName, boolean isConnected, String type, double price){
	this.clockName=clockName;
	this.isConnected=isConnected;
	this.type=type;
	this.price=price;
	System.out.println("Clock Constructor is invovked");
}
String clockName;
boolean isConnected ;
String type;
double price;

public void toShowTime(){
System.out.println("The Time is shown");
}

}