import java.util.Scanner;
abstract class Pharmacy {
    String pharmacyName;
    Pharmacy(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    abstract void displayDetails();
}
class Medicine extends Pharmacy {
    String medicineName;
    int quantity;
    double price;
    Medicine(String pharmacyName, String medicineName, int quantity, double price) {
        super(pharmacyName);
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("\n--- MEDICINE DETAILS ---");
        System.out.println("Pharmacy Name : " + pharmacyName);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Rs." + price);
        if (quantity < 5) {
            System.out.println("Stock Status  : Low Stock");
        } else {
            System.out.println("Stock Status  : Available");
        }
    }
}
public class PharmacyManagement1 {
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
        Pharmacy p = new Medicine(
            pharmacyName,
            medicineName,
            quantity,
            price
        );
        p.displayDetails();
        sc.close();
    }
}