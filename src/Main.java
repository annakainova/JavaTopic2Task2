public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1100;
        int bonus = 0;

        if (deposit > 1000) {
            bonus = deposit / 100;
        }

        balance += deposit + bonus;
        System.out.println("Balance: " + balance);
        System.out.println("Bonus: " + bonus);
    }
}