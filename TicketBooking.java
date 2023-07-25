class TicketBooking{

private int bookingId;
private int noOfSeats;
private String source;
private String destination;
private String date;
private int timing;
private String pnr;
private double price;
private String type;
private String bookingType;
private String transportName;

public void setBookingId(int bookingId){
this.bookingId=bookingId;
}
public int getBookingId(){
return bookingId;
}

public void setNoofSeats(int noOfSeats){
this.noOfSeats=noOfSeats;
}
public int getNoofSeats(){
return noOfSeats;
}

public void setSource(String source){
this.source=source;
}
public String getSource(){
return source;
}

public void setDestination(String destination){
this.destination=destination;
}
public String getDestination(){
return destination;
}

public void setDate(String date){
this.date=date;
}
public String getDate(){
return date;
}

public void setTiming(int timing){
this.timing=timing;
}
public int getTiming(){
return timing;
}

public void setPnr(String pnr){
this.pnr=pnr;
}
public String getPnr(){
return pnr;
}

public void setPrice(double price){
this.price=price;
}
public double getPrice(){
return price;
}

public void setType(String type){
this.type=type;
}
public String getType(){
return type;
}

public void setBookingType(String bookingType){
this.bookingType=bookingType;
}
public String getBookingType(){
return bookingType;
}

public void setTransportName(String transportName){
this.transportName=transportName;
}
public String getTransportName(){
return transportName;
}


}