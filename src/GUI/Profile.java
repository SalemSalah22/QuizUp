package GUI;

import Utils.RoundedBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class Profile extends JFrame {
    // components of the Profile page
    JFrame frame =new JFrame("Profile");
    JPanel panel =new JPanel();

    JPanel topPanel=new JPanel();
    JLabel Name =new JLabel();       //<-------- try to set the Minimum size for this sorry
    JLabel accLbl =new JLabel("'s Account");

    JLabel AccDetails =new JLabel("Account Details");
    JLabel userLbl =new JLabel("Username");
    JPanel usernamePanel =new JPanel();
    JLabel UserInfo=new JLabel("User here");
    JLabel cngname=new JLabel("Change username");

    JLabel passLbl =new JLabel("Password");
    JPanel passPanel =new JPanel();
    JLabel PassInfo =new JLabel();
    JLabel cngpass=new JLabel("Change password");
    JLabel showpass=new JLabel("Show password");

    JLabel Emaillbl=new JLabel("Email address");
    JPanel emailPanel =new JPanel();
    JLabel EmailInfo =new JLabel();

    JLabel PersonalDetails= new JLabel("Personal Details");

    JLabel Fnamelbl=new JLabel("First name");
    JPanel FnamePanel =new JPanel();
    JLabel FirstInfo =new JLabel();

    JLabel Lnamelbl=new JLabel("Last name");
    JPanel LnamePanel =new JPanel();
    JLabel LastInfo=new JLabel();

    JLabel datelbl=new JLabel("Date of birth");
    JPanel DatePanel =new JPanel();
    JLabel DateInfo =new JLabel("DD / MM / YYYY");

    JLabel DelHead=new JLabel("Delete Account");
    JLabel delDiscribtion1=new JLabel("Warning: Deleting your account will result in the loss of all associated data and cannot be ");
    JLabel delDiscribtion2=new JLabel("recovered. Proceed with caution.");
    JButton Del=new JButton("Delete Account");

    JButton cancel=new JButton("Back");


    // variables declaration
    private String Username;
    private String showedpassword;
    private String Email;
    private String fname;
    private String lname;
    boolean dark;
    String maskedPassword="";
    public Profile(String name,String Password,String email,String fname,String lname,boolean Dark){
        this.Email=email;
        this.Username=name;
        for (int i = 0; i < Password.length(); i++) {
            maskedPassword += "•";
        }
        this.showedpassword=Password;
        this.fname=fname;
        this.lname=lname;
        this.dark=Dark;
        FirstInfo.setText(fname);
        LastInfo.setText(lname);
        UserInfo.setText(Username);
        EmailInfo.setText(Email);
        PassInfo.setText(maskedPassword);


        //non-Colorful properties
        Name.setText(Username);
        frame.setSize(690,910);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(650,910);
        panel.setLayout(null);

        topPanel.setBounds(40,0,690,90);
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));


        Name.setFont(new Font("Segoe UI", Font.BOLD, 40));
        Name.setForeground(new Color(0,168,97));
        Name.setBounds(40, 30,200,35);



        accLbl.setFont(new Font("Segoe UI", Font.BOLD, 40));
        accLbl.setBounds(150,30,210,35);

        AccDetails.setFont(new Font("Segoe UI", Font.BOLD, 24));
        AccDetails.setBounds(40,115,190,35);

        userLbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        userLbl.setBounds(40,170,190,35);


        usernamePanel.setBounds(40,210,285,42);
        usernamePanel.setBorder(new RoundedBorder());
        usernamePanel.setLayout(null);


        UserInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        UserInfo.setBounds(7,0,285,42);

        cngname.setBounds(40,255,150,20);
        cngname.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        cngname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        passLbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        passLbl.setBounds(340,170,190,35);


        passPanel.setBounds(340,210,285,42);
        passPanel.setBorder(new RoundedBorder());
        passPanel.setLayout(null);


        PassInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        PassInfo.setBounds(7,0,285,42);

        cngpass.setBounds(340,255,150,20);
        cngpass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        cngpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        showpass.setBounds(530,255,150,20);
        showpass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        showpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Emaillbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Emaillbl.setBounds(40,290,190,35);


        emailPanel.setBounds(40,330,585,42);
        emailPanel.setBorder(new RoundedBorder());
        emailPanel.setLayout(null);


        EmailInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        EmailInfo.setBounds(7,0,585,42);


        PersonalDetails.setFont(new Font("Segoe UI", Font.BOLD, 24));
        PersonalDetails.setBounds(40,430,190,35);




        Fnamelbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Fnamelbl.setBounds(40,485,190,35);


        FnamePanel.setBounds(40,525,285,42);
        FnamePanel.setBorder(new RoundedBorder());
        FnamePanel.setLayout(null);


        FirstInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        FirstInfo.setBounds(7,0,310,42);

        Lnamelbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Lnamelbl.setBounds(340,485,190,35);

        LnamePanel.setBounds(340,525,285,42);
        LnamePanel.setBorder(new RoundedBorder());
        LnamePanel.setLayout(null);

        LastInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        LastInfo.setBounds(7,0,285,42);

        datelbl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        datelbl.setBounds(40,605,190,35);

        DatePanel.setBounds(40,645,585,42);
        DatePanel.setBorder(new RoundedBorder());
        DatePanel.setLayout(null);

        DateInfo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        DateInfo.setBounds(7,0,285,42);

        DelHead.setBounds(40,700,200,40);
        DelHead.setFont(new Font("Segoe UI", Font.BOLD, 24));

        delDiscribtion1.setBounds(40,740,400,25);
        delDiscribtion1.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        delDiscribtion2.setBounds(40,755,400,25);
        delDiscribtion2.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        Del.setBounds(40,790,140,35);
        Del.setBorder(new RoundedBorder());
        Del.setFont(new Font("Segoe UI", Font.BOLD, 14));

        cancel.setBounds(200,790,85,35);
        cancel.setBorder(new RoundedBorder());
        cancel.setFont(new Font("Segoe UI", Font.BOLD, 14));


        //applying the Color theme depending on the last window was
        if(dark){
            panel.setBackground(new Color(43, 45, 49));
            topPanel.setBackground(new Color(43, 45, 49));
            accLbl.setForeground(new Color(255, 255, 255, 255));
            AccDetails.setForeground(new Color(255, 255, 255, 203));
            userLbl.setForeground(new Color(128, 132, 142));
            usernamePanel.setBackground(new Color(51, 53, 56));
            UserInfo.setForeground(new Color(159, 161, 164));
            cngname.setForeground(new Color(102,102,102));
            passLbl.setForeground(new Color(128, 132, 142));
            passPanel.setBackground(new Color(51, 53, 56));
            PassInfo.setForeground(new Color(255, 255, 255));
            cngpass.setForeground(new Color(102,102,102));
            showpass.setForeground(new Color(102,102,102));
            Emaillbl.setForeground(new Color(128, 132, 142));
            emailPanel.setBackground(new Color(51, 53, 56));
            EmailInfo.setForeground(new Color(159, 161, 164));
            PersonalDetails.setForeground(new Color(255, 255, 255, 203));
            Fnamelbl.setForeground(new Color(128, 132, 142));
            FnamePanel.setBackground(new Color(51, 53, 56));
            FirstInfo.setForeground(new Color(159, 161, 164));
            Lnamelbl.setForeground(new Color(128, 132, 142));
            LnamePanel.setBackground(new Color(51, 53, 56));
            LastInfo.setForeground(new Color(159, 161, 164));
            datelbl.setForeground(new Color(128, 132, 142));
            DatePanel.setBackground(new Color(51, 53, 56));
            DateInfo.setForeground(new Color(159, 161, 164));
            Del.setBackground(new Color(43, 45, 49));
            Del.setForeground(new Color(255,102,102));
            cancel.setBackground(new Color(60, 61, 63));
            cancel.setForeground(Color.WHITE);
        }else if(!dark){
            panel.setBackground(new Color(251,251,251));
            topPanel.setBackground(new Color(251,251,251));
            accLbl.setForeground(new Color(32, 32, 32));
            AccDetails.setForeground(new Color(70, 70, 70));
            userLbl.setForeground(new Color(102,102,102));
            usernamePanel.setBackground(Color.WHITE);
            UserInfo.setForeground(new Color(0,168,97));
            cngname.setForeground(new Color(102,102,102));
            passLbl.setForeground(new Color(102,102,102));
            passPanel.setBackground(Color.WHITE);
            PassInfo.setForeground(new Color(0, 168, 97));
            cngpass.setForeground(new Color(102,102,102));
            showpass.setForeground(new Color(102,102,102));
            Emaillbl.setForeground(new Color(102,102,102));
            emailPanel.setBackground(Color.WHITE);
            EmailInfo.setForeground(new Color(0,168,97));
            PersonalDetails.setForeground(new Color(70, 70, 70));
            Fnamelbl.setForeground(new Color(102,102,102));
            FnamePanel.setBackground(Color.WHITE);
            FirstInfo.setForeground(new Color(0,168,97));
            Lnamelbl.setForeground(new Color(102,102,102));
            LnamePanel.setBackground(Color.WHITE);
            LastInfo.setForeground(new Color(0,168,97));
            datelbl.setForeground(new Color(102,102,102));
            DatePanel.setBackground(Color.WHITE);
            DateInfo.setForeground(new Color(0,168,97));
            Del.setBackground(Color.WHITE);
            Del.setForeground(new Color(255,102,102));
            cancel.setBackground(new Color(255, 255, 255));
            cancel.setForeground(Color.GRAY);
        }

        DelHead.setForeground(new Color(255,102,102));
        delDiscribtion1.setForeground(new Color(255,102,102));
        delDiscribtion2.setForeground(new Color(255,102,102));



        frame.add(panel);
        panel.add(topPanel);
        topPanel.add(Name);
        topPanel.add(accLbl);
        panel.add(AccDetails);
        panel.add(userLbl);
        panel.add(usernamePanel);
        usernamePanel.add(UserInfo);
        panel.add(cngname);
        panel.add(passLbl);
        panel.add(passPanel);
        passPanel.add(PassInfo);
        panel.add(cngpass);
        panel.add(Emaillbl);
        panel.add(emailPanel);
        emailPanel.add(EmailInfo);
        panel.add(showpass);
        panel.add(PersonalDetails);
        panel.add(Fnamelbl);
        panel.add(FnamePanel);
        FnamePanel.add(FirstInfo);
        panel.add(Lnamelbl);
        panel.add(LnamePanel);
        LnamePanel.add(LastInfo);
        panel.add(datelbl);
        panel.add(DatePanel);
        DatePanel.add(DateInfo);
        panel.add(DelHead);
        panel.add(DelHead);
        panel.add(delDiscribtion1);
        panel.add(delDiscribtion2);
        panel.add(Del);
        panel.add(cancel);


        final boolean[] PassLook = {false};
        showpass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!PassLook[0]) {
                    PassLook[0] = true;
                    PassInfo.setText(showedpassword); // show password
                } else {
                    PassLook[0] = false;
                    PassInfo.setText(maskedPassword); // hide password
                }
            }
        });

        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new QuizList(Username, showedpassword, Email, fname, lname,dark);
            }
        });

        Del.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try (BufferedReader br = new BufferedReader(new FileReader("Users.txt"));
                     FileWriter fw = new FileWriter("temp.txt")) {
                    String line;
                    while ((line = br.readLine())!= null) {
                        String[] parts = line.split("\\s+");
                        if (parts.length >= 5) {
                            String username = parts[0].trim();
                            String storedEmail = parts[1].trim();
                            if (!(Email.equals(storedEmail) && Username.equals(username))) {
                                fw.write(line);
                                fw.write(System.lineSeparator());
                            }
                        }
                    }
                    // Close the streams
                    br.close();
                    fw.close();

                    // Delete the original file
                    File originalFile = new File("Users.txt");
                    originalFile.delete();

                    // Rename the temp file to the original file
                    File tempFile = new File("temp.txt");
                    tempFile.renameTo(originalFile);

                    File sessionFile = new File("Session.txt");
                    if (sessionFile.exists()) {
                        sessionFile.delete();
                        System.out.println();
                        System.out.println("Your Account has been Deleted successfully!");
                        System.out.println("Session Deleted!");
                        System.out.println();
                    }
                    // Create and display the Login after the deleting completed
                    frame.dispose(); // Close the current frame
                    Login loginFrame = new Login(dark);
                    loginFrame.pack();
                } catch (IOException ex) {
                    System.err.println("Failed to read from or write to the file.");
                }
                }
        });

        cngpass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ResetPass(showedpassword,Email,dark);
            }
        });

        cngname.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ResetName(Username,showedpassword,Email,dark);
            }
        });



    }

}


