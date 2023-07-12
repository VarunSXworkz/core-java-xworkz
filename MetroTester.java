class MetroTester {
public static void main(String station[]) {
System.out.println("Main started");
Metro.getStationNames("Kengeri");
Metro.getStationNames("Attigupe");
Metro.getStationNames("Vijaynagar");
Metro.getStationNames("Hosahali");
Metro.getStationNames("Magadi road");
Metro.getStationNames("Pennya");
Metro.getStationNames("Dasarhalli");
Metro.getAllMetroStationNames();
String stationNames=Metro.searchStationNameByName("Hosahali");
System.out.println("station name found");
System.out.println("Update the station name");
Metro.updateStationName("Pennya", "Jalahalli");
Metro.getAllMetroStationNames();
 Metro.deleteStationName("Dasarhalli");
Metro.getAllMetroStationNamesPostDeletion();
System.out.println("Main ended");
}
}