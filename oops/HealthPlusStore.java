class HealthPlus
{
    String pharmacyName = "Health Plus Pharmacy";

    void displayPharmacy()
    {
        System.out.println("Pharmacy Name : " + pharmacyName);
    }
}

class Medicine extends HealthPlus
{
    String medicineName = "Paracetamol";
    double price = 15.0;

    void displayMedicine()
    {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price         : Rs." + price);
    }
}

class Customer extends HealthPlus
{
    String customerName = "Rahul";
    int quantity = 5;
    double price = 15.0;

    void displayCustomer()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
    }

    void calculateBill()
    {
        double total = quantity * price;
        System.out.println("Total Amount  : Rs." + total);
    }
}

public class HealthPlusStore
{
    public static void main(String[] args)
    {
        Medicine m = new Medicine();
        Customer c = new Customer();

        m.displayPharmacy();
        m.displayMedicine();

        System.out.println();

        c.displayPharmacy();
        c.displayCustomer();
        c.calculateBill();
    }
}