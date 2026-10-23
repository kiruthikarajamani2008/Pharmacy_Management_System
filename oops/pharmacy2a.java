class pharmacy2a implements Runnable {

    String medicineName;
    int quantity;

    pharmacy2a(String medicineName, int quantity) {
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

        pharmacy2a medicine1 = new pharmacy2a("Paracetamol", 10);
        pharmacy2a medicine2 = new pharmacy2a("Citrus", 3);

        Thread t1 = new Thread(medicine1);
        Thread t2 = new Thread(medicine2);

        t1.start();
        t2.start();
    }
}