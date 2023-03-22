package logger;

/*
    Concrete Login class.
*/

public class F_FLogin extends Login {
    public F_FLogin(Login nextLogin) {
        super(nextLogin);
    }

    public void loginIn(String message, int choice){
        if(choice==F_F){
            System.out.println("F_F LOGGED IN: " + message);

        }
        super.loginIn(message, choice);
    }
}
