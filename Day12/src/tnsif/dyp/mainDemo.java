package tnsif.dyp;

public class mainDemo {
    public static void main(String[] args) {
        Account acc = new Account(101, "Rutuja", 10000);

        acc.display();
        System.out.println();

        try {
            acc.deposit(20000); // valid
            acc.deposit(30000); // exceeds limit
        } catch (DepositLimitException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        }

        System.out.println();

        try {
            acc.withdraw(4000); // valid
            acc.withdraw(7000); //  insufficient balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdraw Error: " + e.getMessage());
        }

        System.out.println();
        acc.display();
    }
}
