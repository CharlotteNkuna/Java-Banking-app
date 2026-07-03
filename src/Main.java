import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("===== REGISTER =====");

        User user = Register.createUser(input);


        System.out.println("\n===== LOGIN =====");

        while (true) {

            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter PIN: ");

            while (!input.hasNextInt()) {
                System.out.println("PIN must be numbers only.");
                input.next();
                System.out.print("Enter PIN: ");
            }

            int pin = input.nextInt();
            input.nextLine();

            if (username.equals(user.getUsername())
                    && pin == user.getPin()) {

                System.out.println("Login Successful!");
                System.out.println("Welcome " + user.getUsername());
                break;

            } else {

                System.out.println("Invalid username or PIN. Please try again.\n");
            }
        }


        Menu.display();

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


        Account account = new Account();

        int choice;


        do {

            Menu.atmMenu();


            choice = input.nextInt();

            switch (choice) {


                case 1:

                    System.out.println("Balance: R"
                            + account.getBalance());

                    break;



                case 2:

                    System.out.print("Deposit: ");

                    int dep = input.nextInt();


                    TransactionService.deposit(account, dep);

                    break;



                case 3:

                    System.out.print("Withdraw: ");

                    int wd = input.nextInt();
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