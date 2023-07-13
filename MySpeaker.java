class MySpeaker {
 static String name="JBL22";
 static int minVolume=0;
 static int currentVolume;
 static int maxVolume=30;
 static boolean isConnected;
 
 public static boolean onOrOff(){
    System.out.println("Invoking onOrOff");
	System.out.println("Parameter" +0);
	if(isConnected == false) {
	isConnected = true;
	System.out.println("The speaker is turned on");
	}else if(isConnected == true) {
	isConnected = false;
	System.out.println("Speaker is turned off");
	}
	return isConnected;
 }
 
 
 public static void increaseVolume(){
	 System.out.println("Increasing volume");
	 if(isConnected==true){
	 if(currentVolume<maxVolume) {
		 currentVolume=currentVolume+1;
		 System.out.println("The current volume is" +currentVolume);
 }else{
	 System.out.println("Max Volume Reached");
 }
}else{
	System.out.println("Connect the speaker first");
}
System.out.println("End the increase volume");
 }
 
public static void decreaseVolume(){
	System.out.println("Invoking decreaseVolume()");
	System.out.println("Parameter" +2);
	if(isConnected==true){
		if(currentVolume>minVolume) {
			currentVolume=currentVolume-1;
			System.out.println("The current volume is" +currentVolume);
		}else{
			System.out.println("Min Volume Reached");
		}
	}else{
		System.out.println("Disconnect the speaker first");
	}
	System.out.println("End the decrease volume");
}

}