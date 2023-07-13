class Garden{

static int index;
static String flowerNames[]={null, null, null, null, null};

public static boolean getFlowerNames(String flower) {
boolean isAdded=false;
if(flower!=null) {
flowerNames[index]=flower;
index++;
isAdded=true;

}else{
System.out.println("The flower names is given");
}

return isAdded;
}

public static void getAllFlowerNames() {
System.out.println("Invoking the flower names");

for(int flower=0; flower<flowerNames.length; flower++) {
String reference=flowerNames[flower];
System.out.println(reference);
}
System.out.println("The flower names have been determined");
}
public static boolean updateFlowerName(String existingFlowerName, String updatedFlowerName) {
	boolean isUpdated=false;
	for(int flowerIndex=0; flowerIndex<flowerNames.length; flowerIndex++){
		if(flowerNames[flowerIndex].equals(existingFlowerName)) {
			flowerNames[flowerIndex]= updatedFlowerName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteFlowerName(String deleteFlowerName) {
	boolean isDeleted=false;
	int flowerIndex;
	int noOfElements=index;
	for(flowerIndex=0; flowerIndex<index; flowerIndex++){
		if(flowerNames[flowerIndex].equals(deletedFlowerName)) {
	
			break;
		}
	
	}
	if(flowerIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newflowerIndex= flowerIndex; flowerIndex<noOfElements; newflowerIndex++){
		//logic to remove deleted data from the array
		flowerNames[newflowerIndex]= flowerNames[newflowerIndex+1];
		}
	}
		
	index--;
	return isDeleted;

}

public static void getAllFlowerNamesPostDeletion(){
	for(int flowerIndex=0; flowerIndex<index; flowerIndex++) {
		System.out.println(flowerNames[flowerIndex]);
	}
}


}