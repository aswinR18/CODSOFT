import java.util.Scanner;

class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            return "Deposited: " + amount + ". Current Balance: " + balance;
        }
        else
        {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount)
    {
        if (amount > balance)
        {
            return "Insufficient funds.";
        }
        else if (amount <= 0)
        {
            return "Invalid withdrawal amount.";
        }
        else
        {
            balance -= amount;
            return "Withdrawn: " + amount + ". Current Balance: " + balance;
        }
    }

    public String checkBalance()
    {
        return "Your current balance is: " + balance;
    }
}

class ATMSystem
{
    private BankAccount bankAccount;

    public ATMSystem(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    public void showMenu()
    {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void handleUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            showMenu();
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    handleWithdraw(scanner);
                    break;
                case 2:
                    handleDeposit(scanner);
                    break;
                case 3:
                    handleCheckBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void handleWithdraw(Scanner scanner)
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        System.out.println(bankAccount.withdraw(amount));
    }

    private void handleDeposit(Scanner scanner)
    {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        System.out.println(bankAccount.deposit(amount));
    }

    private void handleCheckBalance()
    {
        System.out.println(bankAccount.checkBalance());
    }
}

public class ATM
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);
        ATMSystem atmSystem = new ATMSystem(account);
        atmSystem.handleUserInput();
    }
}
