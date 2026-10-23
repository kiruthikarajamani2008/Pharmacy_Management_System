import java.util.Scanner;

public class MedicineStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int medicineId;
        String medicineName;
        double price;
        int quantity;
        int sellQuantity;
        double bill;

        System.out.println("====== PHARMACY MANAGEMENT SYSTEM ======");

        System.out.print("Enter Medicine ID: ");
        medicineId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medicine Name: ");
        medicineName = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.println("\n----- Medicine Details -----");
        System.out.println("Medicine ID   : " + medicineId);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price         : " + price);
        System.out.println("Quantity      : " + quantity);

        System.out.print("\nEnter Quantity to Sell: ");
        sellQuantity = sc.nextInt();

        if (sellQuantity <= quantity) {
            quantity = quantity - sellQuantity;
            bill = sellQuantity * price;

            System.out.println("\nMedicine Sold Successfully!");
            System.out.println("Total Bill     : " + bill);
            System.out.println("Remaining Qty  : " + quantity);

        } else {
            System.out.println("Insufficient Stock!");
        }

        sc.close();
    }
}