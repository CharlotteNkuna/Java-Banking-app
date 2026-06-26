public class TransactionService {

    public static void deposit(Account account, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        account.deposit(amount);

        System.out.println("Deposit successful");
        System.out.println("New Balance: R" + account.getBalance());
    }

    public static void withdraw(Account account, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: R" + account.getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
