// Payment interface
interface Payment {
    void payInDollars(double amount);
    void payInRupees(double amount);
    void payInPounds(double amount);
}




// BankAccount class implementing Payment interface
public class BankAccount implements Payment {
    private String accountHolder;
    private String bankName;
    private double balance;  // Balance in default currency (e.g., USD)

    public BankAccount(String accountHolder, String bankName, double balance) {
        this.accountHolder = accountHolder;
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public void payInDollars(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " dollars. Remaining balance: " + balance + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void payInRupees(double amount) {
        double amountInDollars = convertRupeesToDollars(amount);
        if (balance >= amountInDollars) {
            balance -= amountInDollars;
            System.out.println("Paid " + amount + " rupees. Remaining balance: " + balance + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void payInPounds(double amount) {
        double amountInDollars = convertPoundsToDollars(amount);
        if (balance >= amountInDollars) {
            balance -= amountInDollars;
            System.out.println("Paid " + amount + " pounds. Remaining balance: " + balance + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private double convertRupeesToDollars(double rupees) {
        // Assume conversion rate of 1 USD = 75 INR
        return rupees / 75;
    }

    private double convertPoundsToDollars(double pounds) {
        // Assume conversion rate of 1 USD = 0.75 GBP
        return pounds / 0.75;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "Example Bank", 1000.0);

        account.payInDollars(100);
        account.payInRupees(7500);
        account.payInPounds(50);
    }
}
