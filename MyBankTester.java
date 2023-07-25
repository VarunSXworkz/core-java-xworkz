class MyBankTester{

public static void main(String args[]){

MyBank mb=new MyBank();
mb.setBankId(1);
mb.setBankName("SBI");
mb.setBranch("Attigupe");
mb.setBranchCode(40);
mb.setHelplineNumber(1789204361l);
mb.setAddress("B C C Layout");
mb.setBranchManager("Ravi");
mb.setIfscCode(234175);
mb.setMiscCode(123908);
mb.setNoofLockers(5);
mb.setNoofEmployees(10);
mb.setTiming(9);
mb.setWebsiteDetails("Statements and Accounts");
System.out.println(mb.getBankId() +" "+ mb.getBankName() +" "+ mb.getBranch() +" "+ mb.getBranchCode() +" "+ mb.getHelplineNumber() +" "+ mb.getAddress()
+" "+ mb.getBranchManager() +" "+ mb.getIfscCode() +" "+ mb.getMiscCode() +" "+ mb.getNoofLockers() +" "+ mb.getNoofEmployees() +" "+ mb.getTiming()
+" "+ mb.getWebsiteDetails());
}
}