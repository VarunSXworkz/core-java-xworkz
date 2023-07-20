class MusicalInstruments{
	
	public MusicalInstruments(String instrumentName, String type, String color, double price){
		this.instrumentName=instrumentName;
		this.type=type;
		this.color=color;
		this.price=price;
	System.out.println("MusicalInstruments Constructor is invovked");
}

String instrumentName;
String type;
String color;
double price;

public void toListenMusic(){
System.out.println("The Music Instruments are:");
}
}