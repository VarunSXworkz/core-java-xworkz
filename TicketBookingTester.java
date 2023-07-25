class TicketBookingTester{

public static void main(String args[]){


TicketBooking tb=new TicketBooking();
tb.setBookingId(100);
tb.setNoofSeats(78);
tb.setSource("Bangalore");
tb.setDestination("Kerala");
tb.setDate("11 December 2023");
tb.setTiming(12);
tb.setPnr("Good");
tb.setPrice(450.00);
tb.setType("Slepper Coach");
tb.setBookingType("Online");
tb.setTransportName("SUV");
System.out.println(tb.getBookingId() +" "+ tb.getNoofSeats() + " "+ tb.getSource() + " "+ tb.getDestination() + " "+ tb.getDate() +" "+tb.getTiming()
+ " "+ tb.getPnr() +" "+ tb.getPrice() + " "+ tb.getType() +" "+ tb.getBookingType() +" "+ tb.getTransportName());


}

}