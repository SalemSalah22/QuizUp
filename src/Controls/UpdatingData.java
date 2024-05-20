package Controls;

import javax.swing.*;
import java.io.*;

public class UpdatingData {
    public void ChangePass(String Emaill,String Password,String Npassword){
        try (BufferedReader br = new BufferedReader(new FileReader("Users.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("Users.tmp"))) {
            String line;
            while ((line = br.readLine())!= null) {
                // Assuming the format in Users.txt is: username email password
                String[] parts = line.split("\\s+"); // Split by one or more spaces
                if (parts.length >=5) {
                    String username = parts[0].trim(); // Store the username to pass it into the quiz list label
                    String storedEmail = parts[1].trim();
                    String storedPassword = parts[2].trim();
                    // Check for matching credentials
                    if(storedEmail.equals(Emaill) && storedPassword.equals(Password)){
                        parts[2]=Npassword;
                        System.out.println("Your Password has been changes -->");
                        System.out.println("old pass "+Password+ " is changed to "+parts[2]);
                        JOptionPane.showMessageDialog(null,"password Changed successfully");
                        // assuming your main class is named Main
                        System.out.println();
                        System.out.println("Restart your Program please !");
                        System.exit(0);
                    }
                    bw.write(String.join(" ", parts));
                    bw.newLine(); // Write a newline character
                }
            }
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + exception.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Replace the original file with the temporary file
        File originalFile = new File("Users.txt");
        File tempFile = new File("Users.tmp");
        originalFile.delete();
        tempFile.renameTo(originalFile);
    }

    public void ChangeName(String username,String Newname,String Emaill){
        try (BufferedReader br = new BufferedReader(new FileReader("Users.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("Users.tmp"))) {
            String line;
            while ((line = br.readLine())!= null) {
                // Assuming the format in Users.txt is: username email password
                String[] parts = line.split("\\s+"); // Split by one or more spaces
                if (parts.length >= 3) {
                    String Username = parts[0].trim(); // Store the username to pass it into the quiz list label
                    String storedEmail = parts[1].trim();
                    // Check for matching credentials
                    if(storedEmail.equals(Emaill) && Username.equals(username)){
                        parts[0]= Newname;
                        System.out.println("Your Name has been changes -->");
                        System.out.println("old Name : "+Username);
                        System.out.println("Changed to : "+parts[0]);
                    }
                    bw.write(String.join(" ", parts));
                    bw.newLine(); // Write a newline character
                }
            }
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + exception.getMessage());
        }

        // Replace the original file with the temporary file
        File originalFile = new File("Users.txt");
        File tempFile = new File("Users.tmp");
        originalFile.delete();
        tempFile.renameTo(originalFile);
    }

}
