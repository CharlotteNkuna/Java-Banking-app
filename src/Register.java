import java.util.Scanner;

public class Register {


    public static User createUser(Scanner input) {


        String username;


        while (true) {

            System.out.print("Create Username (letters only, min 3 chars): ");

            username = input.nextLine();


            if (username.matches("[a-zA-Z]{3,}")) {

                break;

            } else {

                System.out.println("Invalid username!");
            }
        }



        int pin;


        while (true) {


            System.out.print("Create PIN (4-6 digits): ");


            if (!input.hasNextInt()) {

                System.out.println("Numbers only!");
                input.next();
                continue;
            }


            pin = input.nextInt();


            if (pin >= 1000 && pin <= 999999) {

                break;

            } else {

                System.out.println("PIN must be 4-6 digits");
            }

        }


        input.nextLine();


        System.out.println("Registration Successful");


        return new User(username, pin);

    }

}