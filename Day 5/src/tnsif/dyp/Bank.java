package tnsif.dyp;

public class Bank extends EmPerson {
    private String bankName;
    private String accountType;

    // Default Constructor
    public Bank() {
        super();
        this.bankName = "";
        this.accountType = "";
    }

    // Parameterized Constructor
    public Bank(String name, int age, String address, String bankName, String accountType) {
        super(name, age, address);
        this.bankName = bankName;
        this.accountType = accountType;
    }

    // Getters and Setters
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Bank [BankName=" + bankName + ", AccountType=" + accountType + "]";
    }
}
