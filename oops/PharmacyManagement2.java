import java.util.Scanner;
interface PharmacyDetails {
    void displayPharmacy();
}
interface MedicineDetails {
    void displayMedicine();
}
class Pharmacy implements PharmacyDetails, MedicineDetails {
    String pharmacyName;
    String medicineName;
    int quantity;
    double price;
    Pharmacy(String pharmacyName, String medicineName, int quantity, double price) {
        this.pharmacyName = pharmacyName;
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.price = price;
    }
    public void displayPharmacy() {
        System.out.println("Pharmacy Name : " + pharmacyName);
    }
    public void displayMedicine() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Rs." + price);
    }
}
class Bill {
    void generateBill(Pharmacy p) {
        System.out.println("\n----- Bill Details -----");
        p.displayPharmacy();
        p.displayMedicine();
        double total = p.price * p.quantity;
        System.out.println("Total Amount  : Rs." + total);
    }
}
public class PharmacyManagement2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pharmacy Name : ");
        String pharmacyName = sc.nextLine();
        System.out.print("Enter Medicine Name : ");
        String medicineName = sc.nextLine();
        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        System.out.print("Enter Price : ");
        double price = sc.nextDouble();
        Pharmacy obj = new Pharmacy(
            pharmacyName,
            medicineName,
            quantity,
            price
        );
        Bill b = new Bill();
        b.generateBill(obj);
        sc.close();
    }
}