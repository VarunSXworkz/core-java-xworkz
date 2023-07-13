class GardenTester{
public static void main(String flower[]) {
System.out.println("Main Started");
Garden.getFlowerNames("Rose");
Garden.getFlowerNames("Lavender");
Garden.getFlowerNames("Sunflower");
Garden.getFlowerNames("Lily");
Garden.getFlowerNames("Iris");
Garden.getAllFlowerNames();
System.out.println("Update the flower name");
Garden.updateFlowerName("Lily", "Lilies");
Garden.getAllFlowerNames();
Garden.deleteFlowerName("Iris");
Garden.getAllFlowerNamesPostDeletion();
System.out.println("Main Ended");

}
}