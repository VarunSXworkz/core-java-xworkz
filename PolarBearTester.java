class PolarBearTester{

public static void main(String flavour[]) {
System.out.println("Main started");
PolarBear.getIceCream("Strawberry");
PolarBear.getIceCream("Choclate");
PolarBear.getIceCream("Vanilla");
PolarBear.getIceCream("Mango");
PolarBear.getIceCream("Lichi");
PolarBear.getIceCream("Jackfruit");
PolarBear.getAllIceCreamFlavours();
System.out.println("Update the flavour name");
PolarBear.updateIceCreamFlavour("Mango", "Orange");
PolarBear.getAllIceCreamFlavours();
PolarBear.deleteIceCreamFlavour("Choclate");
PolarBear.getAllIceCreamFlavoursPostDeletion();
System.out.println("Main ended");
}
}