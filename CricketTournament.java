class CricketTournament{

static String top10Batsmans[]={"Virat Kohli", "Steve Smith", "Kane Williamson", "Joe Root", "Babar Azam", "David Warner", "Rohit Sharma", "Kumar Sangakkara", "AB de Villiers", "Ross Taylor"};
static String top10TeamNames[]={"India", "Australia", "England", "New Zealand", "Pakistan", "South Africa", "West Indies", "Sri Lanka", "Bangladesh", "Afghanistan"};
static String iplTeamNames[]={"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore", "Kolkata Knight Riders", "Delhi Capitals", "Punjab Kings", "Rajasthan Royals", "Sunrisers Hyderabad", "Gujarat Titans", "Lucknow Super Gaints"};		
public static void main(String ct[]){
System.out.println("Main started");

System.out.println("List of top10Batsman are:");
getTop10Batsmans();

System.out.println("List of top10TeamNames are:");
getTop10TeamNames();

System.out.println("List of iplTeamNames are:");
getIplTeamNames();
System.out.println("Main Ended");

	}
	public static void getTop10Batsmans(){
		System.out.println("Inside getTop10Batsmans");
		for(String top10Batsman :top10Batsmans){
	System.out.println(top10Batsman);
}
		
	}
	public static void getTop10TeamNames(){
		System.out.println("Inside getTop10TeamNames");
		for(String top10TeamName :top10TeamNames){
	System.out.println(top10TeamName);
	
}
	}
	public static void getIplTeamNames(){
		System.out.println("Inside IplTeamNames");
		for(String iplTeamName :iplTeamNames){
	System.out.println(iplTeamName);
		}
	}
}