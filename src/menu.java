import java.util.Scanner;

public class menu {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ================= ATM ACCOUNT TYPE =================
        System.out.println("===== ATM ACCOUNT TYPE =====");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        System.out.print("Choose account type: ");
        int accountType = input.nextInt();

        if (accountType == 1) {
            System.out.println("Savings Account Selected");
        } else if (accountType == 2) {
            System.out.println("Current Account Selected");
        } else {
            System.out.println("Invalid Account Type");
        }

// ================= ATM MENU =================
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

    }
}
