import java.util.Scanner;
public class Register {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

                // ================= REGISTER =================
                System.out.println("===== REGISTER =====");

                String username;

                // Username validation (letters only, min 3 characters)
                while (true) {

                    System.out.print("Create Username (letters only, min 3 chars): ");
                    username = input.nextLine();

                    // letters only check
                    if (username.matches("[a-zA-Z]{3,}")) {
                        break;
                    } else {
                        System.out.println("Invalid Username! Use letters only (no numbers or symbols).");
                    }
                }

                int pin;

                // PIN validation (4 to 6 digits)
                while (true) {

                    System.out.print("Create PIN (4 to 6 digits): ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid PIN! Numbers only .");
                        input.next();
                        continue;
                    }

                    pin = input.nextInt();

                    if (pin >= 1000 && pin <= 999999) {
                        break;
                    } else {
                        System.out.println("PIN must be between 4 and 6 digits.");
                    }
                }

                input.nextLine(); // clear buffer

                System.out.println("Registration Successful!");

                // ================= LOGIN =================
                System.out.println("===== LOGIN =====");

                System.out.print("Enter Username: ");
                String loginUsername = input.nextLine();

                System.out.print("Enter PIN: ");
                int loginPin = input.nextInt();

                // validation
                if (loginUsername.equals(username) && loginPin == pin) {

                    System.out.println("Login Successful!");
                    System.out.println("Welcome, " + username + " 😎");



                } else {

                    System.out.println("Invalid Username or PIN!");

                }


            }
}