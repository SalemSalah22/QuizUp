package GUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public class Login extends JFrame {
    //Declaration of all the components
    JFrame frame = new JFrame("Login Page");
    JPanel panel = new JPanel();
    JLabel loginLable = new JLabel("Login");
    JLabel userLable = new JLabel("Email or Username");
    JLabel ThemeCng = new JLabel();
    JLabel RegLbl = new JLabel("Need an account ? Register.");
    JLabel LoginMessage = new JLabel();
    ImageIcon darkIcon = new ImageIcon("src/Images/dark.png");
    ImageIcon lightIcon = new ImageIcon("src/Images/light.png");
    JTextField usernameField = new JTextField();
    JLabel password = new JLabel("Password");
    JPasswordField PasswordField = new JPasswordField();
    JLabel showPass = new JLabel("show password?");
    JCheckBox saveBox = new JCheckBox("remember me ?");
    JButton LoginButton = new JButton("Login");
    JButton RegisterButton = new JButton("Register");
    private boolean Dark;

    //Start of the constructor
    public Login(boolean dark) {
        this.Dark=dark;
        frame.setSize(405, 530);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(405, 520);
        panel.setBackground(Color.white);
        panel.setLayout(null);

        // Non-colorful properties
        loginLable.setFont(new Font("Poppins", Font.BOLD, 40));
        loginLable.setBounds(40, 20, 200, 50);

        userLable.setFont(new Font("Arial", Font.PLAIN, 15));
        userLable.setBounds(40, 100, 200, 30);

        usernameField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        usernameField.setBounds(40, 130, 310, 35);
        usernameField.setBorder(new RoundedBorder());

        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setBounds(40, 185, 100, 30);

        PasswordField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        PasswordField.setBounds(40, 220, 310, 35);
        PasswordField.setBorder(new RoundedBorder());

        showPass.setFont(new Font("Arial", Font.PLAIN, 12));
        showPass.setBounds(40, 250, 150, 35);
        showPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        saveBox.setFont(new Font("Open Sans", Font.PLAIN, 15));
        saveBox.setBounds(40, 305, 150, 20);

        LoginButton.setFont(new Font("Open Sans", Font.BOLD, 16));
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setBounds(40, 340, 310, 35);
        LoginButton.setBorder(BorderFactory.createEmptyBorder());

        LoginMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginMessage.setFont(new Font("Open Sans", Font.PLAIN, 12));
        LoginMessage.setBounds(40, 460, 310, 20);

        RegLbl.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        RegLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegLbl.setBounds(40, 385, 310, 20);

        RegisterButton.setFont(new Font("Open Sans", Font.BOLD, 16));
        RegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterButton.setBounds(40, 415, 310, 35);
        RegisterButton.setBorder(BorderFactory.createEmptyBorder());

        ThemeCng.setIcon(darkIcon);

        if(Dark){
            // Colorful properties
            panel.setBackground(new Color(43, 45, 49, 255));
            loginLable.setForeground(new Color(255, 255, 255));
            userLable.setForeground(new Color(128, 132, 142));
            usernameField.setForeground(new Color(255, 255, 255));
            usernameField.setBackground(new Color(51, 53, 56));
            password.setForeground(new Color(128, 132, 142));
            PasswordField.setForeground(new Color(255, 255, 255));
            PasswordField.setBackground(new Color(51, 53, 56));
            showPass.setForeground(new Color(128, 132, 142));
            LoginButton.setBackground(new Color(255, 255, 255));
            LoginButton.setForeground(new Color(30, 31, 34));
            RegLbl.setForeground(new Color(204, 204, 204));
            RegisterButton.setBackground(new Color(166, 166, 166));
            RegisterButton.setForeground(new Color(255, 255, 255));
            saveBox.setBackground(new Color(43, 45, 49, 255));
            saveBox.setForeground(new Color(128, 132, 142));
            ThemeCng.setIcon(lightIcon);
        }else{
            panel.setBackground(new Color(255, 255, 255));
            loginLable.setForeground(new Color(0, 168, 97));
            userLable.setForeground(new Color(102, 102, 102));
            usernameField.setForeground(new Color(102, 102, 102));
            usernameField.setBackground(new Color(255, 255, 255));
            password.setForeground(new Color(102, 102, 102));
            PasswordField.setForeground(new Color(102, 102, 102));
            PasswordField.setBackground(new Color(255, 255, 255));
            showPass.setForeground(new Color(102, 102, 102));
            LoginButton.setBackground(new Color(0, 168, 97));
            LoginButton.setForeground(new Color(255, 255, 255));
            RegisterButton.setBackground(new Color(204, 204, 204));
            RegisterButton.setForeground(Color.WHITE);
            saveBox.setBackground(Color.white);
            saveBox.setForeground(new Color(102, 102, 102));
            ThemeCng.setIcon(darkIcon
            );
        }
        RegisterButton.setFont(new Font("Open Sans", Font.BOLD, 16));
        RegisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RegisterButton.setBorder(BorderFactory.createEmptyBorder());
        ThemeCng.setBounds(325, 30, 40, 35);
        ThemeCng.setCursor(new Cursor(Cursor.HAND_CURSOR));


        //adding the components to the frame <3
        frame.add(panel);
        panel.add(loginLable);
        panel.add(userLable);
        panel.add(usernameField);
        panel.add(password);
        panel.add(password);
        panel.add(PasswordField);
        panel.add(showPass);
        panel.add(saveBox);
        panel.add(LoginButton);
        panel.add(LoginMessage);
        panel.add(ThemeCng);
        panel.add(RegLbl);
        panel.add(RegisterButton);
        ThemeCng.setIcon(darkIcon);


        showPass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (PasswordField.echoCharIsSet()) {
                    PasswordField.setEchoChar((char) 0); // show password
                } else {
                    PasswordField.setEchoChar('•'); // hide password
                }
            }
        });

        // MouseListener for switching from Light to Dark mood
        ThemeCng.addMouseListener(new MouseAdapter() {


            @Override
            public void mouseClicked(MouseEvent e) {
                if (Dark) {
                    //light mood colors
                    panel.setBackground(new Color(255, 255, 255));
                    loginLable.setForeground(new Color(0, 168, 97));
                    userLable.setForeground(new Color(102, 102, 102));
                    usernameField.setForeground(new Color(102, 102, 102));
                    usernameField.setBackground(new Color(255, 255, 255));
                    password.setForeground(new Color(102, 102, 102));
                    PasswordField.setForeground(new Color(102, 102, 102));
                    PasswordField.setBackground(new Color(255, 255, 255));
                    showPass.setForeground(new Color(102, 102, 102));
                    LoginButton.setBackground(new Color(0, 168, 97));
                    LoginButton.setForeground(new Color(255, 255, 255));
                    RegLbl.setForeground(Color.WHITE);
                    saveBox.setBackground(Color.white);
                    saveBox.setForeground(new Color(102, 102, 102));
                    ThemeCng.setIcon(darkIcon);
                    Dark = false;
                } else {
                    //dark mood colors
                    panel.setBackground(new Color(43, 45, 49, 255));
                    loginLable.setForeground(new Color(255, 255, 255));
                    userLable.setForeground(new Color(128, 132, 142));
                    usernameField.setForeground(new Color(255, 255, 255));
                    usernameField.setBackground(new Color(51, 53, 56));
                    password.setForeground(new Color(128, 132, 142));
                    PasswordField.setForeground(new Color(255, 255, 255));
                    PasswordField.setBackground(new Color(51, 53, 56));
                    showPass.setForeground(new Color(128, 132, 142));
                    LoginButton.setBackground(new Color(255, 255, 255));
                    LoginButton.setForeground(new Color(30, 31, 34));
                    LoginButton.setBorder(BorderFactory.createEmptyBorder());
                    RegLbl.setForeground(new Color(204, 204, 204));
                    RegisterButton.setBackground(new Color(166, 166, 166));
                    RegisterButton.setForeground(new Color(255, 255, 255));
                    RegisterButton.setBorder(BorderFactory.createEmptyBorder());
                    saveBox.setBackground(new Color(43, 45, 49, 255));
                    saveBox.setForeground(new Color(128, 132, 142));
                    ThemeCng.setIcon(lightIcon);
                    Dark = true;
                }

            }
        });


        LoginButton.addActionListener(e -> {

            LoginMessage.setVisible(false);
            // Get user input (assuming EmailField and PassField are your UI elements)
            String email = usernameField.getText();
            String password = new String(PasswordField.getPassword());

            // Check for empty fields
            if (email.isEmpty() || password.isEmpty()) {
                LoginMessage.setVisible(true);
                LoginMessage.setForeground(Color.red);
                LoginMessage.setText("Please enter both email and password.");
                return; // Exit if any field is empty
            }


            try (BufferedReader br = new BufferedReader(new FileReader("Users.txt"))) {
                String line;
                while ((line = br.readLine())!= null) {
                    // Assuming the format in Users.txt is: username email password
                    String[] parts = line.split("\s+"); // Split by one or more spaces
                    if (parts.length >= 5) {
                        String username = parts[0].trim(); // Store the username to pass it into the quiz list label
                        String storedEmail = parts[1].trim();
                        String storedPassword = parts[2].trim();
                        String Fname = parts[3].trim();
                        String Lname = parts[4].trim();
                        // Check for matching credentials
                        if ((email.equals(storedEmail) || email.equals(username)) && password.equals(storedPassword)) {
                            LoginMessage.setVisible(true);
                            LoginMessage.setForeground(new Color(30, 125, 66));
                            LoginMessage.setText("Login Successful!");
                            System.out.println("Logged in with : ");
                            System.out.println("Email : " + storedEmail);
                            System.out.println("Password : " + storedPassword);
                            System.out.println();
                            if(saveBox.isSelected()){
                                File sessionFile = new File("Session.txt");
                                try {
                                    FileWriter writer = new FileWriter("Session.txt", true);
                                    writer.write(username + " " + storedEmail + " " + storedPassword+" "+Fname+" "+Lname);
                                    writer.write(System.getProperty("line.separator"));
                                    writer.close();
                                    System.out.println("A Session Has Been Created With :");
                                    System.out.println("Email: "+storedEmail);
                                    System.out.println("Password :"+storedPassword);
                                    System.out.println();
                                } catch (Exception ex) {
                                }
                            }
                            // Create and display the QuizListFrame
                            QuizList quizListFrame = new QuizList(username, storedPassword, storedEmail, Fname, Lname,Dark); // Pass the username
                            frame.dispose(); // Close the current frame
                            return; // Exit the loop if login is successful

                        }
                    }
                }
                LoginMessage.setVisible(true);
                LoginMessage.setForeground(Color.red);
                LoginMessage.setText("Invalid email or password.");
            } catch (IOException ex) {
            }


        });

        RegisterButton.addActionListener(e -> {
                Register SignUpFrame = new Register(Dark);
                SignUpFrame.pack();
                frame.dispose();
        });
    }
    //end of the constructor
    class RoundedBorder extends AbstractBorder {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.drawRoundRect(x, y, width - 1, height - 1, 10, 10);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(5, 5, 5, 5);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.set(5, 5, 5, 5);
            return insets;
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }
}

