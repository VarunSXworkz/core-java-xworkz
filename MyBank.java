class MyBank{

private int bankId;
private String bankName;
private String branch;
private int branchCode;
private long helplineNumber;
private String address;
private String branchMananger;
private int ifscCode;
private int miscCode;
private int noOfLockers;
private int noOfEmployees;
private int timing;
private String websiteDetails;


public void setBankId(int bankId){
this.bankId=bankId;
}
public int getBankId(){
return bankId;
}

public void setBankName(String bankName){
this.bankName=bankName;
}
public String getBankName(){
return bankName;
}

public void setBranch(String branch){
this.branch=branch;
}
public String getBranch(){
return branch;
}

public void setBranchCode(int branchCode){
this.branchCode=branchCode;
}
public int getBranchCode(){
return branchCode;
}

public void setHelplineNumber(long helplineNumber){
this.helplineNumber=helplineNumber;
}
public long getHelplineNumber(){
return helplineNumber;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}

public void setBranchManager(String branchMananger){
this.branchMananger=branchMananger;
}
public String getBranchManager(){
return branchMananger;
}

public void setIfscCode(int ifscCode){
this.ifscCode=ifscCode;
}
public int getIfscCode(){
return ifscCode;
}

public void setMiscCode(int miscCode){
this.miscCode=miscCode;
}
public int getMiscCode(){
return miscCode;
}

public void setNoofLockers(int noOfLockers){
this.noOfLockers=noOfLockers;
}
public int getNoofLockers(){
return noOfLockers;
}

public void setNoofEmployees(int noOfEmployees){
this.noOfEmployees=noOfEmployees;
}
public int getNoofEmployees(){
return noOfEmployees;
}

public void setTiming(int timing){
this.timing=timing;
}
public int getTiming(){
return timing;
}

public void setWebsiteDetails(String websiteDetails){
this.websiteDetails=websiteDetails;
}
public String getWebsiteDetails(){
return websiteDetails;
}
}