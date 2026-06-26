import java.util.Scanner;

public class AuthService {

    public static boolean register(Scanner input) {

        System.out.print("Create Username: ");
        String username = input.nextLine();

        System.out.print("Create PIN: ");
        int pin = input.nextInt();

        input.nextLine();

        System.out.println("Registered!");

        return true;
    }
}
