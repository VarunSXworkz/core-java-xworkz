class Passport{

private int passportId;
private String passportUserName;
private String address;
private String fatherName;
private String dob;
private String schoolName;
private String collegeName;
private double price;
private String city;
private String country;

public void setPassportId(int PassportId){
this.passportId=passportId;
}
public int getPassportId(){
return passportId;
}

public void setPassportUserName(String passportUserName){
this.passportUserName=passportUserName;
}
public String getPassportUserName(){
return passportUserName;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}

public void setFatherName(String fatherName){
this.fatherName=fatherName;
}
public String getFatherName(){
return fatherName;
}

public void setDob(String dob){
this.dob=dob;
}
public String getDob(){
return dob;
}

public void setSchoolName(String schoolName){
this.schoolName=schoolName;
}
public String getSchoolName(){
return schoolName;
}

public void setCollegeName(String collegeName){
this.collegeName=collegeName;
}
public String getCollegeName(){
return collegeName;
}

public void setPrice(double price){
this.price=price;
}
public double getPrice(){
return price;
}

public void setCity(String city){
this.city=city;
}
public String getCity(){
return city;
}

public void setCountry(String country){
this.country=country;
}
public String getCountry(){
return country;
}
}