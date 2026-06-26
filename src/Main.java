import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // ================= REGISTER =================

        System.out.println("===== REGISTER =====");

        User user = Register.createUser(input);



        // ================= LOGIN =================

        System.out.println("\n===== LOGIN =====");


        System.out.print("Enter Username: ");
        String username = input.nextLine();


        System.out.print("Enter PIN: ");
        int pin = input.nextInt();



        if (username.equals(user.getUsername())
                && pin == user.getPin()) {


            System.out.println("Login Successful!");
            System.out.println("Welcome " + user.getUsername());


        } else {

            System.out.println("Invalid username or PIN");
            input.close();
            return;
        }


        Menu.display();   // shows account type

        int accountType = input.nextInt();

        while (accountType != 1 && accountType != 2) {
            System.out.println("Invalid option! Please choose 1 or 2 only.");

            Menu.display();
            accountType = input.nextInt();
        }

        if (accountType == 1) {
            System.out.println("Savings Account Selected");
        } else {
            System.out.println("Current Account Selected");
        }

        // ================= ATM =================

        Account account = new Account();

        int choice;


        do {

            Menu.atmMenu();   // shows ATM menu


            choice = input.nextInt();

            switch (choice) {


                case 1:

                    System.out.println("Balance: R"
                            + account.getBalance());

                    break;



                case 2:

                    System.out.print("Deposit: ");

                    double dep = input.nextDouble();

                    TransactionService.deposit(account, dep);

                    break;



                case 3:

                    System.out.print("Withdraw: ");

                    double wd = input.nextDouble();

                    TransactionService.withdraw(account, wd);

                    break;



                case 4:

                    System.out.println("Thank you for using Sharp ATM");

                    break;



                default:

                    System.out.println("Invalid option");

            }



        } while (choice != 4);



        input.close();

    }

}