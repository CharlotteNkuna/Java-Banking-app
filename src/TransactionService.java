public class TransactionService {

    public static void deposit(Account account, int amount) {

        if (amount < 10 || amount % 10 != 0) {
            System.out.println("Invalid amount ATM notes only!");
            return;
        }

        account.deposit(amount);

        System.out.println("Deposit successful");
        System.out.println("New Balance: R" + account.getBalance());
    }

    public static void withdraw(Account account, int amount) {

        if (amount < 10 || amount % 10 != 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient funds");
            return;
        }

        account.withdraw(amount);

        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance: R" + account.getBalance());
    }
}