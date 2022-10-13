package Verification;

public class Data {
    public static boolean verification(String login, String password, String confirmPassword) {
        try {
            return (loginVerifity(login) && passwordVerifity(password, confirmPassword));
        }catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    static boolean loginVerifity(String login) throws WrongLoginException {
        if (login.matches("[a-zA-Z0-9_]{1,20}")) {
            return true;
        } else {
            throw new WrongLoginException("Wrong login!");
        }
    }
    static boolean passwordVerifity(String password, String confirmPassword) throws WrongPasswordException {
        if (password.matches("[a-zA-Z0-9_]{1,20}") && password.equals(confirmPassword)){
            return true;
        }else {
            throw new WrongPasswordException("Wrong password");
        }
    }

}
