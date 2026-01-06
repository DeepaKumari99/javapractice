class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    
    BankAccount() {
        this.accountNumber = 0;
        this.holderName = "No Name";
        this.balance = 0;
    }

    
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    void deposit(int amount) {
        balance = balance + amount;
    }

    
    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough balance");
        }
    }

    
    void show() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Name       : " + holderName);
        System.out.println("Balance    : " + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        a1.show();

        System.out.println();

        BankAccount a2 = new BankAccount(101, "Deepa", 3000);
        a2.deposit(1000);
        a2.withdraw(500);
        a2.show();
    }
}
