import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully!");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash!");
            System.out.println(amount + " withdrawn successfully!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class ATM {

    private BankAccount account;

    ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n======== ATM MENU ========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        account.deposit(depositAmount);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount!!");
                    } else {
                        account.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again!");
            }
        }

        scanner.close();
    }
}
public class ATMInterface {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(20000);
        ATM atm = new ATM(account);

        atm.start();
    }
}
