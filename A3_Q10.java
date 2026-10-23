
class BankTransaction extends Thread {
    int amount;

    BankTransaction(String name, int amount, int priority) {
        super(name);
        this.amount = amount;
        setPriority(priority);
    }

    public void run() {
        if (amount >= 50000) {
            System.out.println("High-value transaction processed");
        } else {
            System.out.println("Low-value transaction processed");
        }
    }
}

public class A3_Q10 {
    public static void main(String[] args) {
        BankTransaction t1 = new BankTransaction(
                "Low Value", 5000, Thread.MIN_PRIORITY);

        BankTransaction t2 = new BankTransaction(
                "High Value", 50000, Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
