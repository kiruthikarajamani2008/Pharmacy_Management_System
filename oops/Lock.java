class Lock extends Thread {

    static Object medicine = new Object();
    static Object bill = new Object();

    int choice;

    Lock(int choice) {
        this.choice = choice;
    }

    public void run() {

        if (choice == 1) {

            synchronized (medicine) {
                System.out.println("Staff 1: Medicine locked");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (bill) {
                    System.out.println("Staff 1: Bill locked");
                }
            }

        } else {

            synchronized (bill) {
                System.out.println("Staff 2: Bill locked");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (medicine) {
                    System.out.println("Staff 2: Medicine locked");
                }
            }
        }
    }

    public static void main(String[] args) {

        Lock staff1 = new Lock(1);
        Lock staff2 = new Lock(2);

        staff1.start();
        staff2.start();

        System.out.println("Pharmacy Management Started");
    }
}