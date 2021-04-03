package dominio;

import java.util.Scanner;

public class User {
    private String email;
    private String  pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
   
    public void createEmail() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Choose your extention:\n1. @hotmail.com\n2. @gmail.com");
        String extention = consola.nextLine();

        System.out.println("Create your username:");
        String username = consola.nextLine();

        if (extention.equals("1") || extention.equals("@hotmail.com")) {
            email = username + "@hotmail.com";
        } else if ("2".equals(extention) || "@gmail.com".equals(extention)) {
            email = username + "@gmail.com";
        }

        System.out.println("email = " + email);

        System.out.println("Create your password:");
        pass = consola.nextLine();

        System.out.println("Email has been correctly created");
    }
}
