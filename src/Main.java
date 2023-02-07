public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1100;

        if (deposit > 1000) {
            balance += deposit + deposit / 100;
        } else {
            balance += deposit;
        }

        System.out.println("Balance: " + balance);
    }
}