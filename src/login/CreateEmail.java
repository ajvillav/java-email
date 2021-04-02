package login;

import java.util.Scanner;

public class CreateEmail {
    String email;
    String pass;

  
    public CreateEmail() {
    }

    
    public void test() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Choose your extention:\n1. @hotmail.com\n2. @gmail.com");
        String extention = consola.nextLine();

        System.out.println("Create your username:");
        String username = consola.nextLine();

        if (extention.equals("1") || extention.equals("@hotmail.com")) {
            this.email = username + "@hotmail.com";
        } else if ("2".equals(extention) || "@gmail.com".equals(extention)) {
            this.email = username + "@gmail.com";
        }

        System.out.println("email = " + this.email);

        System.out.println("Create your password:");
        this.pass = consola.nextLine();

        System.out.println("Email has been correctly created");
    }
}
