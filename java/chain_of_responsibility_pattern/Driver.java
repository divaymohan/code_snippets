import logger.BulkLogin;
import logger.F_FLogin;
import logger.GeneralLogin;
import logger.Login;

public class Driver {

    public static void main(String[] args) {
        Login login = new GeneralLogin(new BulkLogin(new F_FLogin(null)));
        login.loginIn("Success", 1);
        login.loginIn("Success", 1);
        login.loginIn("Success ",2);

    }

}
