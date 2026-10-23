import java.util.*;

class Medicine
{
    int id, quantity;
    String name, category;
    double price;
}
class InvalidQuantityException extends Exception
{
    InvalidQuantityException(String message)
    {
        super(message);
    }
}
class InvalidPriceException extends Exception
{
    InvalidPriceException(String message)
    {
        super(message);
    }
}
class InvalidMedicineIdException extends Exception
{
    InvalidMedicineIdException(String message)
    {
        super(message);
    }
}
public class Pharmacy1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Medicine med = new Medicine();

        try
        {
            System.out.println("Enter Medicine ID:");
            med.id = sc.nextInt();

            if(med.id <= 0)
            {
                throw new InvalidMedicineIdException(
                    "Invalid Medicine ID: ID must be a positive value");
            }

            sc.nextLine();

            System.out.println("Enter Medicine Name:");
            med.name = sc.nextLine();

            System.out.println("Enter Category:");
            med.category = sc.nextLine();

            System.out.println("Enter Quantity:");
            med.quantity = sc.nextInt();

            if(med.quantity < 0)
            {
                throw new InvalidQuantityException(
                    "Invalid Quantity: Quantity must be a positive value");
            }

            System.out.println("Enter Price:");
            med.price = sc.nextDouble();

            if(med.price <= 0)
            {
                throw new InvalidPriceException(
                    "Invalid Price: Price must be greater than 0");
            }

            System.out.println("\nMedicine Details");
            System.out.println("Medicine ID   : " + med.id);
            System.out.println("Medicine Name : " + med.name);
            System.out.println("Category      : " + med.category);
            System.out.println("Quantity      : " + med.quantity);
            System.out.println("Price         : " + med.price);
            System.out.println("Total Amount  : " + (med.quantity * med.price));
        }

        catch(InvalidMedicineIdException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidQuantityException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidPriceException e)
        {
            System.out.println(e.getMessage());
        }
       sc.close();
    }
}

