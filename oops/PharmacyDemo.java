class Pharmacy {
    int medicineId;
    String medicineName;
    double price;

    Pharmacy(int id, String name, double p) {
        medicineId = id;
        medicineName = name;
        price = p;
    }

    void display() {
        System.out.println("Medicine ID : " + medicineId);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price Rs. : " + price);
    }
}

public class PharmacyDemo {
    public static void main(String[] args) {
        Pharmacy m1 = new Pharmacy(101, "Paracetamol", 25.50);

        System.out.println("Medicine 1 Details");
        m1.display();

        System.out.println();
    }
}