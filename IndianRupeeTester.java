class IndianRupeeTester{


public static void main(String args[]){

IndianRupee ir=new IndianRupee();
ir.setRupeeId(1001);
ir.setRupeeName("Rupaye");
ir.setPrintDate("15 July 2010");
ir.setColor("Brown");
ir.setSerialNumber(10);
ir.setNoofLanguages(15);
ir.setSize(144);
ir.setBackSidePlace("Rani Ki Vav");
ir.setLocation("Gujurat");
System.out.println(ir.getRupeeId() +" "+ ir.getRupeeName() +" "+ ir.getPrintDate() +" "+ ir.getColor() +" "+ ir.getSerialNumber() +" "+ ir.getNoofLanguages()
+ " "+ ir.getSize() +" "+ ir.getBackSidePlace() +" "+ ir.getLocation());
}
}