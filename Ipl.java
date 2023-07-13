class Ipl{
static String mostSixes[]={"Virat kohli:25", "Glenn Maxwell:23", "Jos buttler:17", "MS Dhoni:10", "Shubman gill:5"};
static String mostRuns[]={"Faf du plesis:4500", "Camron Green:3800", "Sanju samson:3210", "Ravi jadeja:2347", "Hardik pandya:1035"};
static String mostWickets[]={"Yuzi chahal:23", "Josh Hazelwood:22", "Mohameed siraj:21", "Rashid khan:15" ,"Harshal patel:13"};
static String longestSixes[]={"Gleen maxwell:125", "David miller:109", "Faf du plesis:105"};
static String currentStandings[]={"RCB", "GT", "LSG", "PBKS", "CSK" ,"MI"};
static int positions[]={1,3,2,5,4,6};

public static void main(String sa[]) {

System.out.println("The list of players with More Sixes are:");
for(String mostSix :mostSixes){
	System.out.println(mostSix);
}

System.out.println("The list of Run Scorers are:");
for(String mostRun :mostRuns){
	System.out.println(mostRun);
}

System.out.println("The list of Wicket Takers are:");
for(String mostWicket :mostWickets){
	System.out.println(mostWicket);
}

System.out.println("The list of players with Longest Six are:");
for(String longestSix :longestSixes){
	System.out.println(longestSix);
}

System.out.println("The Current Standings Of The Teams Are:");
for(String currentStanding :currentStandings) {
	System.out.println(currentStanding);
}

System.out.println("The Positions Of The Teams Are:");
for(int position :positions) {
	System.out.println(position);
}

}
}