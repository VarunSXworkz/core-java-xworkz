class PharmacyTester {
public static void main(String names[]) {
System.out.println("Main started");
Pharmacy.getMedicineNames("Ebast DC");
Pharmacy.getMedicineNames("Febrex Plus");
Pharmacy.getMedicineNames("Ziffi");
Pharmacy.getMedicineNames("Vernace");
Pharmacy.getMedicineNames("Xofex");
Pharmacy.getMedicineNames("Fepanil");
Pharmacy.getMedicineNames("Dolo");
Pharmacy.getMedicineNames("Saridon");
Pharmacy.getMedicineNames("Cataspa");
Pharmacy.getAllMedicineNames();
System.out.println("Update the medicine name");
Pharmacy.updateMedicineName("Cataspa", "Ibugesic");
Pharmacy.getAllMedicineNames();
Pharmacy.deleteMedicineName("Ziffi");
Pharmacy.getAllMedicineNamesPostDeletion();
System.out.println("Main ended");

}
}