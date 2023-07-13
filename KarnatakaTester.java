class KarnatakaTester{

public static void main(String city[]) {


Karnataka.addCity("Hassan");
Karnataka.addCity("Mangaluru");
Karnataka.addCity("Mysore");
Karnataka.addCity("Hubbli");
Karnataka.addCity("Bangalore");
Karnataka.addCity("Shivmogha");
Karnataka.getAllCityNames();
System.out.println("Update the city name");
Karnataka.updateCityName("Bangalore", "Bengaluru");
Karnataka.getAllCityNames();
Karnataka.deleteCityName("Mysore");
Karnataka.getAllCityNamesPostDeletion();





}
}