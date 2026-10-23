package Kiruthika.College;

import java.util.*;

class PharmacyDetails {
    String pharmacyName;
    String location;

    public void pharmacyInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Pharmacy Name:");
        pharmacyName = sc.nextLine();

        System.out.println("Enter Location:");
        location = sc.nextLine();
    }
}

class Medicine extends PharmacyDetails {
    String medicineName;
    int quantity;
    float price;

    public void medicineInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Medicine Name:");
        medicineName = sc.nextLine();

        System.out.println("Enter Quantity:");
        quantity = sc.nextInt();

        System.out.println("Enter Price:");
        price = sc.nextFloat();
    }
}

public class Pharmacy extends Medicine {

    float total;

    public void calculateBill() {
        total = quantity * price;
    }

    public void display() {
        System.out.println("===================================");
        System.out.println("      PHARMACY MANAGEMENT SYSTEM");
        System.out.println("===================================");

        System.out.println("Pharmacy Name : " + pharmacyName);
        System.out.println("Location      : " + location);
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Total Bill    : " + total);
    }
}