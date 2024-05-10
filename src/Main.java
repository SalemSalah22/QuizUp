import GUI.Login;
import GUI.QuizList;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    private static boolean dark = false;
    public Main(boolean dark){
        this.dark=dark;
    }

    public static void main(String[] args) {
        File sessionFile = new File("Session.txt");
        if (!sessionFile.exists()) {
            try {
                sessionFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        boolean sessionFound = false;
        try (BufferedReader br = new BufferedReader(new FileReader("Session.txt"))) {
            String line;
            while ((line = br.readLine())!= null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 5) {
                    String username = parts[0].trim();
                    String storedEmail = parts[1].trim();
                    String storedPassword = parts[2].trim();
                    String fname=parts[3].trim();
                    String lname=parts[4].trim();
                    System.out.println("A Session is Already Exist :");
                    System.out.println("Email: " + storedEmail);
                    System.out.println("Password :" + storedPassword);
                    QuizList quizListFrame = new QuizList(username, storedPassword, storedEmail,fname,lname,dark);
                    sessionFound = true;
                }
            }
        } catch (Exception e) {
            // Handle exception during file writing
            e.printStackTrace(); // For debugging purposes
            JOptionPane.showMessageDialog(null, "Error while Finding a Session!");
        }
        if (!sessionFound) {
            Login LoginFrame = new Login(dark);
            LoginFrame.pack();
        }
    }

}



