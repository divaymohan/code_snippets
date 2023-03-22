package logger;

/*
    Concrete Login class.
*/

public class GeneralLogin extends Login {
    public GeneralLogin(Login nextLogin) {
        super(nextLogin);
    }

    public void loginIn(String message, int choice){
        if(choice==GENERAL){
            System.out.println("GENERAL LOGGED IN:: " + message);
        }
        super.loginIn(message, choice);
    }
}
