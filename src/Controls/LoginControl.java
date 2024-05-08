package Controls;

public class LoginControl {

    public boolean validateEmail(String email, String password) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public boolean validatePassword(String password) {

        if (password.length() < 8) {
            return false;
        }
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*$])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }


}