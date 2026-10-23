import java.util.Scanner;

class Pharmacy {
    String pharmacyName;

    Pharmacy(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
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
        System.out.println("Pharmacy Name : " + pharmacyName);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Rs." + price);
    }
}

class Bill extends Medicine {
    Bill(String pharmacyName, String medicineName, int quantity, double price) {
        super(pharmacyName, medicineName, quantity, price);
    }

    void displayDetails() {
        super.displayDetails();
        double total = quantity * price;
        System.out.println("Total Amount  : Rs." + total);
    }
}

public class PharmacyManagement5 {
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

        Bill b = new Bill(pharmacyName, medicineName, quantity, price);

        System.out.println("\n--- BILL DETAILS ---");
        b.displayDetails();

        sc.close();
    }
}