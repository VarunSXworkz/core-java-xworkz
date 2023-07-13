class SuperMarket{
static String vegetables[]={"Tomato", "Onion", "Potato", "brinjal" ,"carrrot"};

static String biscuits[]={"Parele g", "bourbon", "jim jam", "chaska maska", "oreo" ,"milk biscuit", "Good day", "Crack jack", "marie gold", "hide and seek"};

static String perfumes[]={"Wild stone", "fogg" ,"axe", "the men", "denver", "park avenue", "nivea", "engage", "villian", "shorts"};

static String groceries[]={"Rice", "flour", "atta", "dal", "peanuts", "peas", "wheat", "coffee beans", "cheese", "flax seeds"};

static String alcohols[]={"vodka", "rum", "sccoth", "beer", "whiskey", "tequilla", "gin" ,"coganic", "sherry", "coganc", "boubon", "champange", "margereta", "sake", "vermouth", "port wine", "czech", "hard cider", "mead", "absinthe", "everclear", "fortified wines", "fireball", "old fasioned", "rye", "mezcal", "paloma", "caiprinha", "cocunut", "sidecar"};

public static void main(String in[]) {
	
System.out.println("Main Started");

System.out.println("The list of vegetables are:");
getVegetables();

System.out.println("The list of biscuits are:");
getBiscuits();


System.out.println("The list of perfumes:");
getPerfumes();


System.out.println("The list of groceries are:");
getGroceries();


System.out.println("The list of alcohols are:");
getAlcohols();

System.out.println("Main Ended");
}



public static void getVegetables(){
	System.out.println("Inside getVegetables");
	for(String vegetable :vegetables){
	System.out.println(vegetable);
}
}
public static void getBiscuits(){
	System.out.println("Inside getBiscuits");
	for(String biscuit :biscuits){
	System.out.println(biscuit);
	}
}
public static void getPerfumes(){
	System.out.println("Inside getPerfumes");
	for(String perfume :perfumes) {
	System.out.println(perfume);
}
}
public static void getGroceries(){
	System.out.println("Inside getGroceries");
	for(String grocerie :groceries) {
	System.out.println(grocerie);
}
}

public static void getAlcohols(){
	System.out.println("Inside getAlcohols");
	for(String alcohol :alcohols){
	System.out.println(alcohol);
}
}
	
}