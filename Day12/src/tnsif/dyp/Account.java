package tnsif.dyp;

public class Account implements Demo {
    private int accNo;
    private String name;
    private int balance;

    public Account(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void deposit(int amt) throws DepositLimitException {
        if (amt > DAILY_LIMIT) {
            throw new DepositLimitException("Deposit exceeds daily limit of ₹" + DAILY_LIMIT);
        }
        balance += amt;
        System.out.println("Deposited: ₹" + amt + " | New Balance: ₹" + balance);
    }

    @Override
    public void withdraw(int amt) throws InsufficientBalanceException {
        if (balance - amt < MINBAL) {
            throw new InsufficientBalanceException("Withdrawal denied! Balance cannot go below ₹" + MINBAL);
        }
        balance -= amt;
        System.out.println("Withdrawn: ₹" + amt + " | New Balance: ₹" + balance);
    }

    public void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}
