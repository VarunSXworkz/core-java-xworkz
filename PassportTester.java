class PassportTester{

public static void main(String args[]){

Passport ps=new Passport();
ps.setPassportId(101);
ps.setPassportUserName("Varun");
ps.setAddress("Chandra Layout");
ps.setFatherName("Dr S S Raju");
ps.setDob("11 August 2001");
ps.setSchoolName("St Anns High School");
ps.setCollegeName("Sri Chaitanya PU College");
ps.setPrice(230.45);
ps.setCity("Bangalore");
ps.setCountry("India");

System.out.println(ps.getPassportId() + " "+ ps.getPassportUserName() + " "+ ps.getAddress() +" "+ ps.getFatherName() +" "+ ps.getDob() + " "+ ps.getSchoolName()
+ " "+ ps.getCollegeName() + " "+ ps.getPrice() +" "+ ps.getCity() +" "+ ps.getCountry());
}
}