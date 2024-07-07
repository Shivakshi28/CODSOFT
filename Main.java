import java.util.Scanner;
class ATM{
    private BankAccount account;
    private Scanner sc;
    public ATM(BankAccount account){
        this.account=account;
        this.sc=new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("\nWelcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. EXIT");
    }
    public void checkBalance(){
        double balance=account.checkBalance();
        System.out.println("\nYour current Balance is: "+balance);
    }
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        if (account.deposit(amount)) {
            System.out.printf("\nSuccessfully deposited "+amount+"\n");
        } else {
            System.out.println("Failed to deposit. Please enter a valid amount.");
        }
    }
    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (account.withdraw(amount)) {
            System.out.printf("\nSuccessfully withdrew "+amount+"\n");
        } else {
            System.out.println("Failed to withdraw. Please enter a valid amount or check your balance.");
        }
    }
    public void run() {
        while(true) {
            displayMenu();
            System.out.print("Please choose an option (1-4): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial balance for the account: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(initialBalance);
        ATM a = new ATM(account);
        a.run();
    }
}
