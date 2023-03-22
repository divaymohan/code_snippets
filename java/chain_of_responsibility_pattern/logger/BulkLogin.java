package logger;

/*
    Concrete Login class.
*/


public class BulkLogin extends Login {
    public BulkLogin(Login nextLogin) {
        super(nextLogin);
    }

    public void loginIn(String message, int choice){
        if(choice==BULK){
            System.out.println("BULK LOGGED IN: " + message);

        }
        super.loginIn(message, choice);
    }
}
