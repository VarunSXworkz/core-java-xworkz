class AgroIndustriesTester{


public static void main(String args[]){


AgroIndustries ai=new AgroIndustries("Aggregate Agro", "AgriculturalImplements", true, false);
System.out.println("The first AgroIndustries is:");
System.out.println(ai.industryName +" "+ai.type +" "+ai.isWellMaintained +" "+ai.isLatestTechnology);

AgroIndustries ai1=new AgroIndustries("Agricultural Gain", "SeedImplements", true, true);
System.out.println("The second AgroIndustries is:");
System.out.println(ai1.industryName +" "+ai1.type +" "+ai1.isWellMaintained +" "+ai1.isLatestTechnology);

AgroIndustries ai2=new AgroIndustries("Agventure", "Pumpsets", false, true);
System.out.println("The third AgroIndustries is:");
System.out.println(ai2.industryName +" "+ai2.type +" "+ai2.isWellMaintained +" "+ai2.isLatestTechnology);

AgroIndustries ai3=new AgroIndustries("Fresh Fields", "Fertilizer", true, false);
System.out.println("The fourth AgroIndustries is:");
System.out.println(ai3.industryName +" "+ai3.type +" "+ai3.isWellMaintained +" "+ai3.isLatestTechnology);

AgroIndustries ai4=new AgroIndustries("Succulent Seeds","Pesticide", false, true);
System.out.println("The fifth AgroIndustries is:");
System.out.println(ai4.industryName +" "+ai4.type +" "+ai4.isWellMaintained +" "+ai4.isLatestTechnology);

AgroIndustries ai5=new AgroIndustries("AgroAcres", "SeedPods", false, false);
System.out.println("The sixth AgroIndustries is:");
System.out.println(ai5.industryName +" "+ai5.type +" "+ai5.isWellMaintained +" "+ai5.isLatestTechnology);

AgroIndustries ai6=new AgroIndustries("Blueswan Poultry", "RootsImplement", false, true);
System.out.println("The seventh AgroIndustries is:");
System.out.println(ai6.industryName +" "+ai6.type +" "+ai6.isWellMaintained +" "+ai6.isLatestTechnology);

AgroIndustries ai7=new AgroIndustries("Blackburrow Ranch", "CornStrover", true, true);
System.out.println("The eighth AgroIndustries is:");
System.out.println(ai7.industryName +" "+ai7.type +" "+ai7.isWellMaintained +" "+ai7.isLatestTechnology);

AgroIndustries ai8=new AgroIndustries("Whitecreek Farms", "RiceStraw", true, false);
System.out.println("The ninth AgroIndustries is:");
System.out.println(ai8.industryName +" "+ai8.type +" "+ai8.isWellMaintained +" "+ai8.isLatestTechnology);

AgroIndustries ai9=new AgroIndustries("Bignest Farms", "OatStraw", false, true);
System.out.println("The tenth AgroIndustries is:");
System.out.println(ai9.industryName +" "+ai9.type +" "+ai9.isWellMaintained +" "+ai9.isLatestTechnology);
}
}