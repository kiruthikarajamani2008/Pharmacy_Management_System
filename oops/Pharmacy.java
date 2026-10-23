class Pharmacy {

    boolean medicineReady = false;
    synchronized void updateMedicine() {
        System.out.println("Pharmacy Management: Medicine stock updated");
        medicineReady = true;
        notify();
        notifyAll();
    }
    synchronized void checkMedicine() {

        while (!medicineReady) {
            try {
                System.out.println("Pharmacy Monitoring: Waiting for medicine...");
                wait();
            } 
            catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println("Pharmacy Monitoring: Medicine is available");
    }
    public static void main(String[] args) {

        System.out.println("Pharmacy Management System");
        Pharmacy pharmacy = new Pharmacy();

        MedicineMonitor t1 = new MedicineMonitor(pharmacy);
        MedicineUpdate t2 = new MedicineUpdate(pharmacy);

        t1.start();
        t2.start();
    }
}
class MedicineMonitor extends Thread {

    Pharmacy pharmacy;
    MedicineMonitor(Pharmacy pharmacy) {

        this.pharmacy = pharmacy;
    }
    public void run() {
        pharmacy.checkMedicine();
    }
}
class MedicineUpdate extends Thread {

    Pharmacy pharmacy;
    MedicineUpdate(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;   }

    public void run() {
        pharmacy.updateMedicine();
    }
}
