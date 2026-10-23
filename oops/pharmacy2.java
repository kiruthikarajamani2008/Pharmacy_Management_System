class pharmacy2 extends Thread {

    String medicineName;
    int quantity;

    pharmacy2(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    public void run() {

        
            System.out.println("Medicine Name : " + medicineName);
            System.out.println("Quantity      : " + quantity);

            if (quantity < 5) {
                System.out.println("Status        : Low Stock");
            } else {
                System.out.println("Status        : Available");
            }

            System.out.println();
        
    }

    public static void main(String[] args) {

        pharmacy2 medicine1 = new pharmacy2("Paracetamol", 10);
        pharmacy2 medicine2 = new pharmacy2("citrus", 3);

        medicine1.start();
        medicine2.start();
    }
}