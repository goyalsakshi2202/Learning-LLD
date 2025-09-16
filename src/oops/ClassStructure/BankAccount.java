
public class  BankAccount {
	private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(){
        this.accountNumber = "000000000";
        this.holderName = "Unknown";
        this.balance = 0.0;
    }
    public BankAccount(String accountNumber, String holderName, double balance) {
        if(accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        }else{this.accountNumber = "000000000";}

        if(holderName != null && !holderName.trim().isEmpty()) {
            this.holderName = holderName;
        }else {this.holderName = "Unknown";}

        if(balance >= 0){this.balance = balance;}
        else{this.balance = 0.0;}
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive!");
            return;
        }
        balance+=amount;
        System.out.println("Successfully deposited $" + amount);
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient Balance");
            return;
        }
        else{
            balance -= amount;
        }
        return;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
    @Override
    public String toString() {
        return String.format("BankAccount{accNo='%s', holder='%s', balance=$%.2f}",
                accountNumber, holderName, balance);
    }

    public static void main(String[] args) {
        // Create account with correct data types
        BankAccount account1 = new BankAccount("12345678", "Sakshi Goyal", 10000.0);
        System.out.println("Created account: " + account1);

        // Test deposit
        account1.deposit(1000);
        System.out.println("Balance after deposit: $" + account1.getBalance());

        // Test withdrawal
        account1.withdraw(500);
        System.out.println("Balance after withdrawal: $" + account1.getBalance());

        // Display full account info
        account1.displayAccountInfo();

        // Test error cases
        System.out.println("\n=== Testing Error Cases ===");
        account1.deposit(-100);    // Should show error
        account1.withdraw(-50);    // Should show error
        account1.withdraw(20000);  // Should show insufficient balance

        // Test default constructor
        System.out.println("\n=== Testing Default Constructor ===");
        BankAccount account2 = new BankAccount();
        System.out.println("Default account: " + account2);
        account2.displayAccountInfo();
    }

}




