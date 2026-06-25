import java.util.Scanner;

public class Deposit {
    static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        double balance = 00.00; // Initial balance

        System.out.println("Current Balance: " + balance);

        // Deposit
        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();
        balance += deposit;

        System.out.println("Balance after deposit: " + balance);
        // Withdrawal
        System.out.print("Enter withdrawal amount: ");
        double withdraw = input.nextDouble();
        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }

        input.close();
    }


}
