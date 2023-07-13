class Pharmacy {
static int index;
static String medicineNames[]={null, null, null, null, null, null, null, null, null};

public static boolean getMedicineNames(String names){
boolean isAdded=false;
if(names!=null){
medicineNames[index]=names;
index++;
isAdded=true;
}else{
System.out.println("The medicine is available");
}
return isAdded;
}

public static void getAllMedicineNames() {
System.out.println("Invoking the medicine names");
for(int names=0; names<medicineNames.length; names++) {
String reference=medicineNames[names];
System.out.println(reference);
}
System.out.println("The medicine can be provided");
}
public static boolean updateMedicineName(String existingMedicineName, String updatedMedicineName) {
	boolean isUpdated=false;
	for(int namesIndex=0; namesIndex<medicineNames.length; namesIndex++){
		if(medicineNames[namesIndex].equals(existingMedicineName)) {
			medicineNames[namesIndex]= updatedMedicineName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteMedicineName(String deleteMedicineName) {
	boolean isDeleted=false;
	int namesIndex;
	int noOfElements=index;
	for(namesIndex=0; namesIndex<index; namesIndex++){
		if(medicineNames[namesIndex].equals(deletedMedicineName)) {
	
			break;
		}
	
	}
	if(namesIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newnamesIndex= namesIndex; namesIndex<noOfElements; newnamesIndex++){
		//logic to remove deleted data from the array
		medicineNames[newnamesIndex]= medicineNames[newnamesIndex+1];
		}
	}
		
	index--;
	return isDeleted;

}

public static void getAllMedicineNamesPostDeletion(index){
	for(int namesIndex=0; namesIndex<index; namesIndex++) {
		System.out.println(medicineNames[namesIndex]);
	}
}


}