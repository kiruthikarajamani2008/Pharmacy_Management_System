public class MedicalStore {

    private static int medicineId = 101;
    private static String medicineName = "Paracetamol";
    private static double price = 25.50;

    static int totalMedicines = 1;

    public static void displayMedicine() {
        System.out.println("Medicine ID   : " + medicineId);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price         : " + price);
    }

    public static void displayMedicine(String category) {
        System.out.println("Category      : " + category);
        System.out.println("Medicine ID   : " + medicineId);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price         : " + price);
    }

    public static void showTotalMedicines() {
        System.out.println("Total Medicines : " + totalMedicines);
    }

    public static void main(String[] args) {

        System.out.println("PHARMACY MANAGEMENT SYSTEM");
        System.out.println("--------------------------");

        displayMedicine();

        System.out.println();

        displayMedicine("Tablet");

        System.out.println();

        showTotalMedicines();
    }
}