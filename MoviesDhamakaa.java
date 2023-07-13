public class MoviesDhamakaa {

    static String[] kannadaMovies = {"KGF Chapter 1", "Dia","Tagaru","Ulidavaru Kandante",
        "Kirik Party", "Gantumoote", "RangiTaranga", "Love Mocktail","Dheera Rana Vikrama","Lucia", "Avane Srimannarayana",
        "Mayabazar 2016","Ondu Motteya Kathe","Bell Bottom", "Sarkari Hi. Pra. Shaale, Kasaragodu",
        "Mugulu Nage","Mungaru Male", "Rajakumara", "Simple Agi Ondh Love Story","Thithi", "Ugramm", "Shivalinga",
        "Kendasampige", "Sakkathagavne","Gosi Gang", "Aa Karaala Ratri","Puta 109", "Rama Rama Re",
        "Kavaludaari", "Gultoo" };

     static String[] hindiMovies = {"Dilwale Dulhania Le Jayenge", "Sholay", "Kabhi Khushi Kabhie Gham",
        "3 Idiots", "Lagaan", "Kuch Kuch Hota Hai", "Kahaani", "Dangal", "Gully Boy", "Queen",
        "Uri: The Surgical Strike", "Andhadhun", "PK", "Dabangg", "Padmaavat",
        "Kesari", "Bajrangi Bhaijaan", "Super 30", "Krrish", "Dil To Pagal Hai",
        "Kal Ho Naa Ho", "Hum Aapke Hain Koun..!", "Dhoom", "Golmaal: Fun Unlimited",
        "Ra.One"};

    static String[] englishMovies = {"The Shawshank Redemption", "The Godfather", "Pulp Fiction",
        "The Dark Knight", "Fight Club", "Inception", "Interstellar", "The Matrix", "Forrest Gump", "Goodfellas",
        "The Lord of the Rings: The Fellowship of the Ring", "The Avengers", "The Lion King", "Jurassic Park",
        "The Terminator", "The Social Network", "Gladiator", "Braveheart", "Titanic", "The Prestige",
        "Casino Royale", "Gravity", "Mad Max: Fury Road", "The Revenant",
        "La La Land"};

   
     static String[] malayalamMovies = {"Drishyam", "Premam", "Kumbalangi Nights", "Bangalore Days",
        "Maheshinte Prathikaaram", "Charlie", "Angamaly Diaries", "Ayyappanum Koshiyum", "Virus", "Jallikattu",
        "Ustad Hotel", "Pathemari", "Moothon", "Njan Prakashan", "Ee. Ma. Yau.",
        "Thondimuthalum Driksakshiyum", "Kali", "Varathan", "Kammara Sambhavam", "Joseph",
        "Take Off", "Amen", "C U Soon", "Lucifer",
        "Vellimoonga"};

    static String[] teluguMovies = {"Baahubali: The Beginning", "Baahubali: The Conclusion", "Arjun Reddy",
        "Jersey", "Rangasthalam", "Ala Vaikunthapurramuloo", "Bahubali", "Sarileru Neekevvaru", "Vakeel Saab", "Nuvvu Naaku Nachav",
        "Athadu", "Pokiri", "Eega", "Magadheera", "Sye",
        "Nannaku Prematho", "F2: Fun and Frustration", "Rang De", "Jathi Ratnalu", "Baadshah",
        "Manam", "Maharshi", "Geetha Govindam", "iSmart Shankar",
        "Evaru"};

    public static void main(String[] args) {

        System.out.println("List of kannada movies : ");
		getKannadaMovies();
        
        System.out.println("List of hindi movies : ");
		getHindiMovies();
        
		System.out.println("List of 25 popular english movies : ");
		getEnglishMovies();
        
       
        System.out.println("List of telugu movies : ");
        getTeluguMovies();

        
        System.out.println("List of 25 malayalm movies : ");
       getMalayalamMovies();
    
    }
	
	public static void getKannadaMovies(){
		System.out.println("Inside getKannadaMovies");
		for(String kannadaMovie :kannadaMovies){
			System.out.println(kannadaMovie);
		}
		
	}
	public static void getHindiMovies(){
		System.out.println("Inside getHindiMovies");
		for(String hindiMovie :hindiMovies){
			System.out.println(hindiMovie);
	
}
	}
	public static void getEnglishMovies(){
		System.out.println("Inside getEnglishMovies");
	    	for(String englishMovie :englishMovies){
			System.out.println(englishMovie);
		}
	}
	public static void getTeluguMovies(){
		System.out.println("Inside getTeluguMovies");
		for(String teluguMovie :teluguMovies){
			System.out.println(teluguMovie);
		}
	}
	public static void getMalayalamMovies(){
		System.out.println("Inside getMalayalamMovies");
		for(String malayalamMovie :malayalamMovies){
			System.out.println(malayalamMovie);
		}
	}
}