package login;

public class ValidarCorreo {

    boolean email;
    boolean pass;

    public void validarInfo(boolean email, boolean pass) {
        this.email = email;
        this.pass = pass;

        if (email == true && pass == true) {
            System.out.println("You have logged in correctly");

        } else {
            System.out.println("Error");
            
        }

    }
}
