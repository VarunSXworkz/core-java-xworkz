class Metro{

static int index;
static String stationNames[]={null, null, null, null, null, null, null};

public static boolean getStationNames(String station) {
boolean isAdded=false;
if(station!=null){
stationNames[index]=station;
index++;
isAdded=true;

}else{
System.out.println("The station is present");
}
return isAdded;
}

public static void getAllMetroStationNames() {
System.out.println("Invoking the metro station");

for(int station=0; station<stationNames.length; station++) {
String reference=stationNames[station];
System.out.println(reference);

}
System.out.println("So the station is set up");
}

public static boolean updateStationName(String existingStationName, String updatedStationName) {
	boolean isUpdated=false;
	for(int stationIndex=0; stationIndex<stationNames.length; stationIndex++){
		if(stationNames[stationIndex].equals(existingStationName)) {
			stationNames[stationIndex]= updatedStationName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteStationName(String deleteStationName) {
	boolean isDeleted=false;
	int stationIndex;
	int noOfElements=index;
	for(stationIndex=0; stationIndex<index; stationIndex++){
		if(stationNames[stationIndex].equals(deleteStationName)) {
	
			break;
		}
	
	}
	if(stationIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newstationIndex= stationIndex; stationIndex<noOfElements; newstationIndex++){
		//logic to remove deleted data from the array
		stationNames[newstationIndex]= stationNames[newstationIndex+1];
		}
	}
		
	index--;
        return isDeleted;

}

public static void getAllMetroStationNamesPostDeletion(){
	for(int stationIndex=0; stationIndex<index; stationIndex++) {
		System.out.println(stationNames[stationIndex]);
	}

}

public static String searchStationNameByName(String stationName){
	System.out.println("Invoking getStationNameByName");
	System.out.println("No of parameter:1, type String");
	String sName=null;
	for(String station : stationNames) {
		if(station.equals(stationName)) {
			sName=station;
			System.out.println("Station name found");
		}
	}
	return sName;
}

}