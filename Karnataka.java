class Karnataka {

static int index;
static String cityNames[]={null, null, null, null ,null, null};

public static boolean addCity(String city){
 boolean isAdded=false;
 if(city!= null){
 cityNames[index]=city;
 index++;
 isAdded=true;
 
 
 }else{
 System.out.println("So city names added");
 }
 

 return isAdded;
}


public static void getAllCityNames() {
System.out.println("Invoking city names");

for(int city=0; city<cityNames.length; city++){
String reference=cityNames[city];
System.out.println(reference);
}
System.out.println("Invoking ends here");
}

public static boolean updateCityName(String existingCityName, String updatedCityName) {
	boolean isUpdated=false;
	for(int cityIndex=0; cityIndex<cityNames.length; cityIndex++){
		if(cityNames[cityIndex].equals(existingCityName)) {
			cityNames[cityIndex]= updatedCityName;
			isUpdated=true;
		}
	}
	return isUpdated;
	
}
public static boolean deleteCityName(String deleteCityName) {
	boolean isDeleted=false;
	int cityIndex;
	int noOfElements=index;
	for(cityIndex=0; cityIndex<index; cityIndex++){
		if(cityNames[cityIndex].equals(deleteCityName)) {
	
			break;
		}
	
	}
	if(cityIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newcityIndex= cityIndex; cityIndex<noOfElements; newcityIndex++){
		//logic to remove deleted data from the array
		cityNames[newcityIndex]= cityNames[newcityIndex+1];
		}
	}
		
         index--;
	return isDeleted;

}

public static void getAllCityNamesPostDeletion(){
	for(int cityIndex=0; cityIndex<index; cityIndex++) {
		System.out.println(cityNames[cityIndex]);
	}
}


}