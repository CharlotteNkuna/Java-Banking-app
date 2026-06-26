import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account();

        // Deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        TransactionService.deposit(acc, depositAmount);

        System.out.println("Current balance: " + acc.getBalance());

        // Withdrawal
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        TransactionService.withdraw(acc, withdrawalAmount);

        System.out.println("Final balance: " + acc.getBalance());

        scanner.close();
    }
}