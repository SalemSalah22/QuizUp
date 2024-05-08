package GUI;
import Controls.SignUpControl;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Register extends JFrame {
    private SignUpControl signupcontrol = new SignUpControl();

    JFrame frame = new JFrame("Register Page");
    JPanel panel = new JPanel();
    JLabel RegisterHeader =new JLabel("Register");
    JLabel fNamelbl =new JLabel("First name");
    JLabel lNamelbl =new JLabel("Last name");
    JLabel UserNamelbl =new JLabel("Username");
    JLabel Emaillbl =new JLabel("Email");
    JLabel passwordlbl =new JLabel("Password");
    JLabel Loginmassage =new JLabel("Already have an account ?");
    JLabel showPass =new JLabel("show password ?");
    JTextField fnameField =new JTextField();
    JTextField lnameField =new JTextField();
    JTextField userNameField=new JTextField();
    JTextField emailField =new JTextField();
    JPasswordField passField =new JPasswordField();
    JButton Registerbtn=new JButton("Register");
    JButton loginBack=new JButton("Login");
    JLabel RegisterMassage=new JLabel();
    JLabel ThemeCng = new JLabel();


    private boolean Dark;
    public Register(boolean dark){
        this.Dark=dark;

        frame.setSize(405, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(405, 650);
        panel.setLayout(null);

        RegisterHeader.setFont(new Font("Poppins", Font.BOLD, 35));
        RegisterHeader.setBounds(40, 20, 200, 50);

        fNamelbl.setFont(new Font("Arial", Font.PLAIN, 15));
        fNamelbl.setBounds(40, 100, 200, 30);

        fnameField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        fnameField.setBounds(40, 130, 145, 35);
        fnameField.setBorder(new Register.RoundedBorder());

        lNamelbl.setFont(new Font("Arial", Font.PLAIN, 15));
        lNamelbl.setBounds(195, 100, 200, 30);

        lnameField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        lnameField.setBounds(195, 130, 155, 35);
        lnameField.setBorder(new Register.RoundedBorder());

        UserNamelbl.setFont(new Font("Arial", Font.PLAIN, 15));
        UserNamelbl.setBounds(40, 175, 200, 30);

        userNameField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        userNameField.setBounds(40, 210, 310, 35);
        userNameField.setBorder(new Register.RoundedBorder());

        Emaillbl.setFont(new Font("Arial", Font.PLAIN, 15));
        Emaillbl.setBounds(40, 255, 200, 30);

        emailField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        emailField.setBounds(40, 290, 310, 35);
        emailField.setBorder(new Register.RoundedBorder());

        passwordlbl.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordlbl.setBounds(40, 335, 200, 30);

        passField.setFont(new Font("Open Sans", Font.PLAIN, 15));
        passField.setBounds(40, 370, 310, 35);
        passField.setBorder(new Register.RoundedBorder());

        showPass.setFont(new Font("Arial", Font.PLAIN, 12));
        showPass.setBounds(40, 400, 150, 35);
        showPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Registerbtn.setFont(new Font("Open Sans", Font.BOLD, 16));
        Registerbtn.setBounds(40,460,310,35);
        Registerbtn.setBorder(BorderFactory.createEmptyBorder());

        Loginmassage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        Loginmassage.setBounds(40, 505, 310, 20);
        Loginmassage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        loginBack.setFont(new Font("Open Sans", Font.BOLD, 16));
        loginBack.setBounds(40,535,310,35);
        loginBack.setBorder(BorderFactory.createEmptyBorder());

        RegisterMassage.setBounds(40,565,310,35);
        RegisterMassage.setForeground(Color.red);
        RegisterMassage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        RegisterMassage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ThemeCng.setBounds(50, 30, 40, 35);
        ThemeCng.setCursor(new Cursor(Cursor.HAND_CURSOR));


        if(Dark){
            panel.setBackground(new Color(43, 45, 49));
            RegisterHeader.setForeground(new Color(0xFFFFFF));
            fNamelbl.setForeground(new Color(128, 132, 142));
            lNamelbl.setForeground(new Color(128, 132, 142));
            UserNamelbl.setForeground(new Color(128, 132, 142));
            Emaillbl.setForeground(new Color(128, 132, 142));
            passwordlbl.setForeground(new Color(128, 132, 142));
            fnameField.setBackground(new Color(51, 53, 56));
            fnameField.setForeground(new Color(255, 255, 255));
            lnameField.setBackground(new Color(51, 53, 56));
            lnameField.setForeground(new Color(255, 255, 255));
            userNameField.setBackground(new Color(51, 53, 56));
            userNameField.setForeground(new Color(255, 255, 255));
            emailField.setBackground(new Color(51, 53, 56));
            emailField.setForeground(new Color(255, 255, 255));
            passField.setBackground(new Color(51, 53, 56));
            passField.setForeground(new Color(255, 255, 255));
            showPass.setForeground(new Color(128, 132, 142));
            Registerbtn.setBackground(Color.WHITE);
            Registerbtn.setForeground(new Color(43, 45, 49));
            loginBack.setForeground(Color.WHITE);
            loginBack.setBackground(new Color(204, 204, 204));
            Loginmassage.setForeground(new Color(204,204,204));
        }else{
            panel.setBackground(new Color(255, 255, 255));
            RegisterHeader.setForeground(new Color(0, 168, 97));
            fNamelbl.setForeground(new Color(102, 102, 102));
            fnameField.setBackground(Color.WHITE);
            fnameField.setForeground(new Color(102, 102, 102));
            lNamelbl.setForeground(new Color(102, 102, 102));
            lnameField.setForeground(new Color(102, 102, 102));
            UserNamelbl.setForeground(new Color(102, 102, 102));
            userNameField.setForeground(new Color(102, 102, 102));
            Emaillbl.setForeground(new Color(102, 102, 102));
            emailField.setForeground(new Color(102, 102, 102));
            passwordlbl.setForeground(new Color(102, 102, 102));
            passField.setForeground(new Color(102, 102, 102));
            showPass.setForeground(new Color(102, 102, 102));
            Registerbtn.setForeground(Color.WHITE);
            Registerbtn.setBackground(new Color(0,168,97));
            Loginmassage.setForeground(new Color(102, 102, 102));
            loginBack.setForeground(Color.WHITE);
            loginBack.setBackground(new Color(204, 204, 204));

        }



        frame.add(panel);
        panel.add(RegisterHeader);
        panel.add(fNamelbl);
        panel.add(fNamelbl);
        panel.add(lNamelbl);
        panel.add(UserNamelbl);
        panel.add(Emaillbl);
        panel.add(passwordlbl);
        panel.add(Loginmassage);
        panel.add(showPass);
        panel.add(fnameField);
        panel.add(lnameField);
        panel.add(userNameField);
        panel.add(emailField);
        panel.add(passField);
        panel.add(Registerbtn);
        panel.add(loginBack);
        panel.add(ThemeCng);
        panel.add(RegisterMassage);

        showPass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (passField.echoCharIsSet()) {
                    passField.setEchoChar((char) 0); // show password
                } else {
                    passField.setEchoChar('•'); // hide password
                }
            }
        });



        loginBack.addActionListener(e -> {
            Login SignUpFrame = new Login(Dark);
            SignUpFrame.pack();
            frame.dispose();
        });





        Registerbtn.addActionListener(e ->{
                    // Get user input
                    String name = userNameField.getText();
                    String fname =fnameField.getText();
                    String lname =lnameField.getText();
                    String email = emailField.getText();
                    String password = new String(passField.getPassword());


                    if (name.isEmpty() || email.isEmpty() || password.isEmpty() ||fname.isEmpty()||lname.isEmpty() ) {
                        RegisterMassage.setText("Empty input found !");
                        RegisterMassage.setVisible(true);
                        return;
                    }else{
                        // Check if email or username already exists
                        boolean emailExists = emailAlreadyExists(email);
                        boolean usernameExists = usernameAlreadyExists(name);
                        if (emailExists || usernameExists) {
                            RegisterMassage.setText("The Email OR username Already Exist, Try Again !");
                            RegisterMassage.setVisible(true);
                            return;

                        }else{
                            boolean IsInvalid=false;
                            if (!signupcontrol.validateName(name) || !signupcontrol.validateEmail(email) || !signupcontrol.validatePassword(password)) {
                                // Handle individual validation failures (optional)
                                IsInvalid=true;
                            }
                            if(IsInvalid){
                                RegisterMassage.setText("Invalid inputs !");
                                RegisterMassage.setVisible(true);
                                RegisterMassage.setForeground(Color.red);
                            }else{
                                try {
                                    FileWriter writer = new FileWriter("Users.txt", true);
                                    writer.write(name + " " + email + " " + password + " "+fname+" "+lname);
                                    writer.write(System.getProperty("line.separator"));
                                    writer.close();
                                    RegisterMassage.setText("Signup successful!");
                                    RegisterMassage.setForeground(new Color(0,102,102));
                                    RegisterMassage.setVisible(true);
                                } catch (Exception exception) {
                                }
                            }
                        }

                    }

                //check if the Email is already used in another account








    });

    }

    private boolean emailAlreadyExists(String email) {
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

    private boolean usernameAlreadyExists(String name) {
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
