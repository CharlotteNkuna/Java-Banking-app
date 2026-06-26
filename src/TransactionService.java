public class TransactionService {

    public static void deposit(Account acc, double amount) {
        acc.deposit(amount);
        System.out.println("Deposit successful");
    }

    public static void withdraw(Account acc, double amount) {
        if (acc.withdraw(amount)) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
