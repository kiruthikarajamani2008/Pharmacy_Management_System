class Pharmacy {
    String pharmacyName = "Healthy Life Pharmacy";

    void displayPharmacy() {
        System.out.println("Pharmacy Name : " + pharmacyName);
    }
}

class Medicine extends Pharmacy {
    String medicineName = "Paracetamol";
    int quantity = 5;
    double price = 15.0;

    void displayMedicine() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Rs." + price);
    }
}

class Bill extends Medicine {
    void displayBill() {
        double total = quantity * price;
        System.out.println("Total Amount : Rs." + total);
    }
}

public class PharmacyManagement {
    public static void main(String[] args) {
        Bill s = new Bill();

        s.displayPharmacy();
        s.displayMedicine();
        s.displayBill();
    }
}