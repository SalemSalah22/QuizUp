package Controls;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class SignUpControl {
    public boolean validateName(String username) {
        String usernameRegex = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z_-]{3,15}$";
        return username.matches(usernameRegex);
    }

    public boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public static boolean validatePassword(String password) {

        if (password.length() < 8) {
            return false;
        }
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*$])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }

    public boolean emailAlreadyExists(String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Users.txt"))) {
            String line;
            while ((line = reader.readLine())!= null) {
                String[] parts = line.split(" ", 5); // split into 5 parts: username, email, password, fname, lname
                if (parts.length == 5) {
                    if (parts[1].equals(email)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean usernameAlreadyExists(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Users.txt"))) {
            String line;
            while ((line = reader.readLine())!= null) {
                String[] parts = line.split(" ", 5); // split into 5 parts: username, email, password, fname, lname
                if (parts.length == 5) {
                    if (parts[0].equals(name)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void saveNewAccount(String name,String email,String password,String fname,String lname){
        try {
            FileWriter writer = new FileWriter("Users.txt", true);
            writer.write(name + " " + email + " " + password + " "+fname+" "+lname);
            writer.write(System.getProperty("line.separator"));
            writer.close();

        } catch (Exception _) {
        }
    }
}
