package login;

import dominio.User;
import java.util.Scanner;

public class TestLogin {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        User validate = new User();

        System.out.println("Now we are going to create and login a mail:");
        validate.createEmail();

        while (true) {
            System.out.println("Please type your email:");
            String email = consola.nextLine();

            System.out.println("Please type your password:");
            String pass = consola.nextLine();

            if (email.equals(validate.getEmail()) && pass.equals(validate.getPass())) {
                System.out.println("You have logged in correctly");
                break;
            } else {
                System.out.println("email or password wrong, try again.");
            }
        }
    }
}
