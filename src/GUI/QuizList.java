package GUI;
import Utils.RoundedBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class QuizList extends JFrame {

    //Declaration of all the components
    JFrame frame = new JFrame("QUIZ LIST");
    JPanel panel = new JPanel();
    JLabel logo = new JLabel();
    ImageIcon Logo = new ImageIcon("src/Images/logo2.png");
    JLabel titel = new JLabel("Quiz Up");
    JLabel welc = new JLabel("WELCOME ,");
    JLabel Username = new JLabel();
    JButton logout = new JButton("Log Out");
    JButton Profile = new JButton("Profile");
    JSeparator line = new JSeparator();
    JLabel GK = new JLabel("general knowledge :");
    JButton Quiz1 = new JButton("QUIZ UP");
    JLabel Science = new JLabel("science :");
    JButton Quiz2 = new JButton("QUIZ UP");
    JLabel history = new JLabel("history :");
    JButton Quiz3 = new JButton("QUIZ UP");
    JLabel h1 = new JLabel("About general knowledge quiz :");
    JLabel h10 = new JLabel("Embark on a journey of discovery with our captivating quiz.  ");
    JLabel h11 = new JLabel("Challenge your intellect across diverse topics.");
    JLabel h2 = new JLabel("intellect across diverse topics.");
    JLabel h20 = new JLabel("Explore wonders with our quiz! Test knowledge in fields, from bio to physics, ");
    JLabel h21 = new JLabel("challenging your science smarts.");
    JLabel h3 = new JLabel("About history quiz :");
    JLabel h30 = new JLabel("Test your past knowledge with our history quiz! From ancient to modern, ");
    JLabel h31 = new JLabel("we challenge your historical understanding.");

    JLabel themecng = new JLabel();
    ImageIcon darkIcon = new ImageIcon("src/Images/dark.png");
    ImageIcon lightIcon = new ImageIcon("src/Images/light.png");

    private String username;
    private String storedPassword;
    private String storedEmail;
    private String fname;
    private String lname;
    private boolean Dark;

    public QuizList(String username, String storedPassword, String storedEmail, String fname, String lname, boolean dark) {
        this.username = username;
        this.Dark = dark;
        Username.setText(username);
        this.storedPassword = storedPassword;
        this.storedEmail = storedEmail;
        this.fname = fname;
        this.lname = lname;
        frame.setSize(720, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(720, 450);
        panel.setLayout(null);

        logo.setBounds(575, 0, 100, 100);
        logo.setIcon(Logo);

        titel.setBounds(560, 80, 150, 35);
        titel.setFont(new Font("Segoe UI", Font.BOLD, 24));

        welc.setBounds(30, 20, 150, 40);
        welc.setFont(new Font("Segoe UI", Font.BOLD, 24));

        Username.setBounds(170, 20, 150, 40);
        Username.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        logout.setBorder(new RoundedBorder());
        logout.setBounds(30, 80, 100, 30);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Profile.setBorder(new RoundedBorder());
        Profile.setBounds(140, 80, 100, 30);
        Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        line.setBounds(30, 120, 640, 1);

        GK.setBounds(30, 130, 200, 30);
        GK.setFont(new Font("segoe UI", Font.PLAIN, 14));

        Quiz1.setFont(new Font("segoe UI", Font.BOLD, 14));
        Quiz1.setBorder(new RoundedBorder());
        Quiz1.setBounds(30, 165, 200, 35);
        Quiz1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Science.setBounds(30, 215, 200, 30);
        Science.setFont(new Font("segoe UI", Font.PLAIN, 14));

        Quiz2.setFont(new Font("segoe UI", Font.BOLD, 14));
        Quiz2.setBorder(new RoundedBorder());
        Quiz2.setBounds(30, 250, 200, 35);
        Quiz2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        history.setBounds(30, 300, 200, 30);
        history.setFont(new Font("segoe UI", Font.PLAIN, 14));

        Quiz3.setFont(new Font("segoe UI", Font.BOLD, 14));
        Quiz3.setBorder(new RoundedBorder());
        Quiz3.setBounds(30, 335, 200, 35);
        Quiz3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        h1.setBounds(250, 130, 300, 35);
        h1.setFont(new Font("segoe UI", Font.PLAIN, 14));

        h10.setBounds(250, 150, 400, 35);
        h10.setFont(new Font("segoe UI", Font.PLAIN, 12));

        h11.setBounds(250, 165, 300, 35);
        h11.setFont(new Font("segoe UI", Font.PLAIN, 12));

        h2.setBounds(250, 215, 300, 35);
        h2.setFont(new Font("segoe UI", Font.PLAIN, 14));

        h20.setBounds(250, 235, 450, 35);
        h20.setFont(new Font("segoe UI", Font.PLAIN, 12));

        h21.setBounds(250, 250, 300, 35);
        h21.setFont(new Font("segoe UI", Font.PLAIN, 12));

        h3.setBounds(250, 300, 300, 35);
        h3.setFont(new Font("segoe UI", Font.PLAIN, 14));

        h30.setBounds(250, 320, 400, 35);
        h30.setFont(new Font("segoe UI", Font.PLAIN, 12));

        h31.setBounds(250, 335, 300, 35);
        h31.setFont(new Font("segoe UI", Font.PLAIN, 12));

        themecng.setIcon(darkIcon);
        themecng.setBounds(655, 360, 40, 35);
        themecng.setCursor(new Cursor(Cursor.HAND_CURSOR));


        if (Dark) {
            setDark();
        } else {
            setLight();
        }

        frame.add(panel);
        panel.add(logo);
        panel.add(titel);
        panel.add(welc);
        panel.add(Username);
        panel.add(logout);
        panel.add(Profile);
        panel.add(line);
        panel.add(GK);
        panel.add(Quiz1);
        panel.add(Science);
        panel.add(Quiz2);
        panel.add(history);
        panel.add(Quiz3);
        panel.add(h1);
        panel.add(h10);
        panel.add(h11);
        panel.add(h2);
        panel.add(h20);
        panel.add(h21);
        panel.add(h3);
        panel.add(h30);
        panel.add(h31);
        panel.add(themecng);


        logout.addActionListener(e -> {
            File sessionFile = new File("Session.txt");
            if (sessionFile.exists()) {
                sessionFile.delete();
                System.out.println();
                System.out.println("Session Finished !");
                System.out.println();
                this.dispose();
            }
            Login loginFrame = new Login(Dark);
            loginFrame.pack();
            frame.dispose();
        });

        Profile.addActionListener(e -> {
            frame.dispose();
            Profile profile = new Profile(username, storedPassword, storedEmail, fname, lname, Dark);
        });

        themecng.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Dark) {
                    setLight();
                    Dark = false;
                } else {
                    setDark();
                    Dark = true;
                }
            }
        });


        Quiz3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuizFormH history = new QuizFormH(Dark);
            }
        });

        Quiz1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuizFormK knowledge = new QuizFormK(Dark);
            }
        });

        Quiz2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuizFormS history = new QuizFormS(Dark);
            }
        });

    }

    public void setDark() {
        panel.setBackground(new Color(43, 45, 49));
        titel.setForeground(new Color(255, 255, 255));
        welc.setForeground(new Color(255, 255, 255));
        Username.setForeground(new Color(128, 128, 128));
        logout.setBackground(new Color(255, 102, 102));
        logout.setForeground(Color.WHITE);
        logout.setBorder(BorderFactory.createEmptyBorder());
        Profile.setForeground(new Color(255, 255, 255));
        Profile.setBackground(new Color(51, 53, 56));
        Profile.setBorder(BorderFactory.createEmptyBorder());
        line.setForeground(new Color(50, 50, 50));
        line.setBackground(new Color(43, 45, 49));
        GK.setForeground(new Color(102, 102, 102));
        Quiz1.setForeground(new Color(255, 255, 255));
        Quiz1.setBackground(new Color(51, 53, 56));
        Quiz1.setBorder(BorderFactory.createEmptyBorder());
        Science.setForeground(new Color(102, 102, 102));
        Quiz2.setForeground(new Color(255, 255, 255));
        Quiz2.setBackground(new Color(51, 53, 56));
        Quiz2.setBorder(BorderFactory.createEmptyBorder());
        history.setForeground(new Color(102, 102, 102));
        Quiz3.setForeground(new Color(255, 255, 255));
        Quiz3.setBackground(new Color(51, 53, 56));
        Quiz3.setBorder(BorderFactory.createEmptyBorder());
        h1.setForeground(new Color(255, 255, 255));
        h10.setForeground(new Color(160, 160, 160));
        h11.setForeground(new Color(160, 160, 160));
        h2.setForeground(new Color(255, 255, 255));
        h20.setForeground(new Color(160, 160, 160));
        h21.setForeground(new Color(160, 160, 160));
        h3.setForeground(new Color(255, 255, 255));
        h30.setForeground(new Color(160, 160, 160));
        h31.setForeground(new Color(160, 160, 160));
        themecng.setIcon(lightIcon);
    }

    public void setLight() {
        panel.setBackground(new Color(251, 251, 251));
        titel.setForeground(new Color(0, 168, 97));
        welc.setForeground(new Color(0, 168, 97));
        Username.setForeground(new Color(22, 22, 22));
        logout.setForeground(new Color(255, 102, 102));
        logout.setBackground(Color.WHITE);
        logout.setBorder(new Utils.RoundedBorder());
        Profile.setForeground(new Color(102, 102, 102));
        Profile.setBackground(Color.WHITE);
        Profile.setBorder(new Utils.RoundedBorder());
        line.setForeground(new Color(202, 202, 202));
        line.setBackground(new Color(242, 242, 242));
        GK.setForeground(new Color(102, 102, 102));
        Quiz1.setForeground(new Color(0, 168, 97));
        Quiz1.setBackground(Color.WHITE);
        Quiz1.setBorder(new Utils.RoundedBorder());
        Science.setForeground(new Color(102, 102, 102));
        Quiz2.setForeground(new Color(0, 168, 97));
        Quiz2.setBackground(Color.WHITE);
        Quiz2.setBorder(new Utils.RoundedBorder());
        history.setForeground(new Color(102, 102, 102));
        Quiz3.setForeground(new Color(0, 168, 97));
        Quiz3.setBackground(Color.WHITE);
        Quiz3.setBorder(new Utils.RoundedBorder());
        h1.setForeground(new Color(102, 102, 102));
        h10.setForeground(new Color(0, 0, 0));
        h11.setForeground(new Color(0, 0, 0));
        h2.setForeground(new Color(102, 102, 102));
        h20.setForeground(new Color(0, 0, 0));
        h21.setForeground(new Color(0, 0, 0));
        h3.setForeground(new Color(102, 102, 102));
        h30.setForeground(new Color(0, 0, 0));
        h31.setForeground(new Color(0, 0, 0));
        themecng.setIcon(darkIcon);
    }
}
