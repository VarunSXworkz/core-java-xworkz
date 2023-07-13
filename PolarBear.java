class PolarBear{
static int index;
static String iceCreamFlavours[]={null, null, null, null, null, null};

public static boolean getIceCream(String flavour) {
boolean isAdded=false;
if(flavour!=null){
iceCreamFlavours[index]=flavour;
index++;
isAdded=true;

}else{
System.out.println("The flavour has been addded");
}
return isAdded;
}

public static void getAllIceCreamFlavours() {
System.out.println("Invoking the ice cream flavours");

for(int flavour=0; flavour<iceCreamFlavours.length; flavour++) {
String reference=iceCreamFlavours[flavour];
System.out.println(reference);

}
System.out.println("So the flavour is perfect");
}

public static boolean updateIceCreamFlavour(String existingIceCreamFlavour, String updatedIceCreamFlavour) {
	boolean isUpdated=false;
	for(int flavourIndex=0; flavourIndex<iceCreamFlavours.length; flavourIndex++){
		if(iceCreamFlavours[flavourIndex].equals(existingIceCreamFlavour)) {
			iceCreamFlavours[flavourIndex]= updatedIceCreamFlavour;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteIceCreamFlavour(String IceCreamFlavour) {
	boolean isDeleted=false;
	int flavourIndex;
	int noOfElements=index;
	for(flavourIndex=0; flavourIndex<index; flavourIndex++){
		if(iceCreamFlavours[flavourIndex].equals(deletedIceCreamFlavour)) {
	
			break;
		}
	
	}
	if(flavourIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newflavourIndex= flavourIndex; flavourIndex<noOfElements; newflavourIndex++){
		//logic to remove deleted data from the array
		iceCreamFlavours[newflavourIndex]= iceCreamFlavours[newflavourIndex+1];
		}
	}
		
	index--;
	return isDeleted;

}

public static void getAllIceCreamFlavoursPostDeletion(){
	for(int flavourIndex=0; flavourIndex<index; flavourIndex++) {
		System.out.println(iceCreamFlavours[flavourIndex]);
	}
}



}