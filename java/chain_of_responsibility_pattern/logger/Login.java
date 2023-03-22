package logger;
/*
    Login class
 */
public class Login {
    public static int GENERAL = 1;
    public static int F_F = 2;
    public static int BULK = 3;

    public Login nextLogin;

    public Login(Login nextLogin) {
        this.nextLogin = nextLogin;
    }

    public void loginIn(String message, int choice){
        if(nextLogin !=null) this.nextLogin.loginIn(message, choice);
    }
}
