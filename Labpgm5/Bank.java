import java.util.Scanner;

class Account {
    String customerName;
    int accno;
    String accType;
    double balance;

    Scanner s = new Scanner(System.in);

    void getAccountDetails() {
        System.out.print("Enter customer name: ");
        customerName = s.nextLine();
        System.out.print("Enter account number: ");
        accno = s.nextInt();
        System.out.print("Enter account balance: ");
        balance = s.nextDouble();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = s.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully!");
        System.out.println("Updated balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = s.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Updated balance: " + balance);
        }
    }

    void displayBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Number: " + accno);
        System.out.println("Account Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.05;

    void computeInterest() {
        System.out.print("Enter time period in years: ");
        double time = s.nextDouble();
        double interest = balance * interestRate * time;
        balance += interest;
        System.out.println("Interest added: " + interest);
        System.out.println("Updated Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double minBalance = 1000;
    double penalty = 100;

    void check() {
        if (balance < minBalance) {
            System.out.println("Minimum balance not maintained!");
            balance -= penalty;
            System.out.println("Service charge imposed: " + penalty);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter account type (savings/current): ");
        String type = s.nextLine().toLowerCase();

        if (type.equals("savings")) {
            SavingsAccount sa = new SavingsAccount();
            sa.accType = "Savings";
            sa.getAccountDetails();

            while (true) {
                System.out.println("\n--- Savings Account Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Compute Interest");
                System.out.println("4. Display Balance");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = s.nextInt();

                switch (choice) {
                    case 1 -> sa.deposit();
                    case 2 -> sa.withdraw();
                    case 3 -> sa.computeInterest();
                    case 4 -> sa.displayBalance();
                    case 5 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } else if (type.equals("current")) {
            CurrentAccount ca = new CurrentAccount();
            ca.accType = "Current";
            ca.getAccountDetails();

            while (true) {
                System.out.println("\n--- Current Account Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Minimum Balance");
                System.out.println("4. Display Balance");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = s.nextInt();

                switch (choice) {
                    case 1 -> ca.deposit();
                    case 2 -> ca.withdraw();
                    case 3 -> ca.check();
                    case 4 -> ca.displayBalance();
                    case 5 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Invalid account type entered!");
        }
    }
}
