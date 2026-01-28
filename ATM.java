import java.util.Scanner;

public class ATM {
    static String pin = "1234";
    static double balance = 5000.0;
    static int attempts = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PIN Verification
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            String inputPin = sc.nextLine();

            if (pin.equals(inputPin)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN! Attempts left: " + (3 - attempts));
            }
        }

        if (attempts == 3) {
            System.out.println("Account Locked!");
            return;
        }

        // ATM Menu
        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    balance += dep;
                    System.out.println("Amount Deposited!");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double with = sc.nextDouble();

                    if (with > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= with;
                        System.out.println("Collect your cash.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
