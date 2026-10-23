import Kiruthika.College.Pharmacy;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pharmacy p = new Pharmacy();

        // Pharmacy details
        p.pharmacyInput();

        // Medicine details
        p.medicineInput();

        // Calculate bill
        p.calculateBill();

        // Display details
        p.display();
    }
}