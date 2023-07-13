class TravelAgencyTester {
public static void main(String places[]) {
System.out.println("Main started");
TravelAgency.getTouristPlaces("Hampi");
TravelAgency.getTouristPlaces("Bangalore");
TravelAgency.getTouristPlaces("Mysore");
TravelAgency.getTouristPlaces("Udupi");
TravelAgency.getTouristPlaces("Panambur Beach");
TravelAgency.getTouristPlaces("Pattadakal");
TravelAgency.getTouristPlaces("Someshwara Temple");
TravelAgency.getTouristPlaces("Coorg");
TravelAgency.getAllTouristPlacesNames();
System.out.println("Update the place name");
TravelAgency.updateTouristPlace("Coorg", "Virajpet");
TravelAgency.getAllTouristPlacesNames();
TravelAgency.deleteTouristPlaces("Udupi");
TravelAgency.getAllTouristPlacesNamesPostDeletion();
System.out.println("Main ended");
}
}