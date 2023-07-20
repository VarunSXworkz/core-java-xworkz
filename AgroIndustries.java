class  AgroIndustries{

public AgroIndustries(String industryName, String type, boolean isWellMaintained, boolean isLatestTechnology){
	this.industryName=industryName;
	this.type=type;
	this.isWellMaintained=isWellMaintained;
	this.isLatestTechnology=isLatestTechnology;
	System.out.println("AgroIndustries Constructor is invovked");
}
String industryName;
String type;
boolean isWellMaintained;
boolean isLatestTechnology;

public void toProvideFood(){
System.out.println("The Agro Industries is good");
}

}