package login;

import java.util.Scanner;

public class TestLogin {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        CreateEmail validate = new CreateEmail();
        ValidarCorreo validate2 = new ValidarCorreo();

        System.out.println("Now we are going to create and login a mail");
        validate.test();

        while (true) {
            System.out.println("Please type your email:");
            String email = consola.nextLine();

            System.out.println("Please type your password:");
            String pass = consola.nextLine();

            if (validate.email.equals(email)) {
                validate2.email = true;
            } else {
                validate2.email = false;
            }

            if (validate.pass.equals(pass)) {
                validate2.pass = true;
            } else {
                validate2.pass = false;
            }

            if (validate.email.equals(email) && validate.pass.equals(pass)) {
                validate2.validarInfo(validate2.email, validate2.pass);
                break;
            } else {
                System.out.println("email or password wrong, try again.");
            }
        }
    }
}
