 class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public static void main(String[] args) {
        System.out.println("Account :");
        Account account1 = new Account(1000.0);

        account1.displayBalance(); 



        System.out.println("Deposit Amount:");
    
        account1.deposit(500.0);
        account1.displayBalance();


        System.out.println("Withdraw Amount:-200");

        account1.withdraw(200.0);
        account1.displayBalance(); 
        System.out.println("Withdraw Amount:-1000");

        account1.withdraw(1000.0); 
        System.out.println("Balance after withdrawal :");
        account1.displayBalance(); 
    }
}