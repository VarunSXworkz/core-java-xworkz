class TravelAgency {
static int index;
static String touristPlaces[]={null, null, null, null, null, null, null, null};

public static boolean getTouristPlaces(String places) {
boolean isAdded=false;
if(places!=null){
touristPlaces[index]=places;
index++;
isAdded=true;

}else{
System.out.println("These places selected");
}
return isAdded;
}

public static void getAllTouristPlacesNames() {
System.out.println("Invoking the Tourist Place");

for(int places=0; places<touristPlaces.length; places++) {
String reference=touristPlaces[places];
System.out.println(reference);

}
System.out.println("So the tourist place is confirmed");
}
public static boolean updateTouristPlace(String existingTouristPlace, String updatedTouristPlace) {
	boolean isUpdated=false;
	for(int placesIndex=0; placesIndex<touristPlaces.length; placesIndex++){
		if(touristPlaces[placesIndex].equals(existingTouristPlace)) {
			touristPlaces[placesIndex]= updatedTouristPlace;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteTouristPlaces(String deleteTouristPlaces) {
	boolean isDeleted=false;
	int placesIndex;
	int noOfElements=index;
	for(placesIndex=0; placesIndex<index; placesIndex++){
		if(touristPlaces[placesIndex].equals(deletedTouristPlaces)) {
	
			break;
		}
	
	}
	if(placesIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newplacesIndex= placesIndex; placesIndex<noOfElements; newplacesIndex++){
		//logic to remove deleted data from the array
		touristPlaces[newplacesIndex]= touristPlaces[newplacesIndex+1];
		}
	}
		
	index--;
	return isDeleted;

}

public static void getAllTouristPlacesPostDeletion(index){
	for(int placesIndex=0; placesIndex<index; placesIndex++) {
		System.out.println(touristPlaces[placesIndex]);
	}
}


}