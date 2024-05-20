package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controls.SignUpControl;
import Controls.UpdatingData;


public class ResetPass extends JFrame {
    private UpdatingData update  = new UpdatingData();
    private SignUpControl signupcontrol = new SignUpControl();
    JFrame frame=new JFrame("ResetPass");
    JPanel panel =new JPanel();
    JLabel resetlogo =new JLabel();
    ImageIcon LLOGO = new ImageIcon("src\\Images\\Secure.png");
    JLabel Header=new JLabel("Reset Password");
    JLabel currentPass=new JLabel("Current Password");
    JPasswordField CurrentPass =new JPasswordField();
    JLabel new1Pass=new JLabel("New Password");
    JPasswordField NewPass =new JPasswordField();
    JLabel new2Pass=new JLabel("Confirm Password");
    JPasswordField NewPass2 =new JPasswordField();
    JLabel errorMassage =new JLabel();
    JButton Confirm=new JButton("Confirm");
    JButton Cancel=new JButton("Cancel");

    private String Password;
    private String Emaill;
    private boolean Dark;
    public ResetPass(String password,String email,boolean Dark){
        this.Password=password;
        this.Emaill=email;
        this.Dark=Dark;

        frame.setSize(405, 590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(405, 590);


        panel.setLayout(null);

        resetlogo.setIcon(LLOGO);
        resetlogo.setBounds(170,20,405,50);


        Header.setBounds(60,80,405,50);
        Header.setFont(new Font("Segoe UI", Font.BOLD, 36));



        currentPass.setFont(new Font("Arial", Font.PLAIN, 15));
        currentPass.setBounds(40, 150, 200, 30);



        CurrentPass.setFont(new Font("Open Sans", Font.PLAIN, 15));
        CurrentPass.setBounds(40, 185, 310, 35);
        CurrentPass.setBorder(new Utils.RoundedBorder());


        new1Pass.setFont(new Font("Arial", Font.PLAIN, 15));
        new1Pass.setBounds(40, 230, 200, 30);

        NewPass.setFont(new Font("Open Sans", Font.PLAIN, 15));
        NewPass.setBounds(40, 265, 310, 35);
        NewPass.setBorder(new Utils.RoundedBorder());


        new2Pass.setFont(new Font("Arial", Font.PLAIN, 15));
        new2Pass.setBounds(40, 310, 200, 30);


        NewPass2.setFont(new Font("Open Sans", Font.PLAIN, 15));
        NewPass2.setBounds(40, 345, 310, 35);
        NewPass2.setBorder(new Utils.RoundedBorder());


        errorMassage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        errorMassage.setBounds(40, 380, 310, 35);

        errorMassage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Confirm.setBounds(40,420,310,35);

        Confirm.setFont(new Font("Segoe UI", Font.BOLD, 14));
        Confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirm.setBorder(BorderFactory.createEmptyBorder());

        Cancel.setBounds(40,465,310,35);

        Cancel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setBorder(BorderFactory.createEmptyBorder());

        if(Dark){
            setDark();
        }else{
            setLight();
        }


        frame.add(panel);
        panel.add(resetlogo);
        panel.add(Header);
        panel.add(CurrentPass);
        panel.add(currentPass);
        panel.add(new1Pass);
        panel.add(NewPass);
        panel.add(new2Pass);
        panel.add(NewPass2);
        panel.add(errorMassage);
        panel.add(Confirm);
        panel.add(Cancel);



        Confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ex) {
                errorMassage.setVisible(false);
                String Cpassword = new String(CurrentPass.getPassword());
                String Npassword = new String(NewPass.getPassword());
                String NNpassword = new String(NewPass2.getPassword());

                boolean IsEmpty=false;
                if(Cpassword.isEmpty() || Npassword.isEmpty() ||  NNpassword.isEmpty()){
                    IsEmpty=true;
                }

                if(IsEmpty){
                    errorMassage.setText("Fields cannot be empty!");
                    errorMassage.setForeground(Color.red);
                    errorMassage.setVisible(true);
                }else{
                    if(!Cpassword.equals(Password)){
                        System.out.println(Password);
                        errorMassage.setText("Current Password is Wrong!");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else if(!Npassword.equals(NNpassword)){
                        errorMassage.setText("New Passwords should be same!");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else if(Cpassword.equals(Npassword)){
                        errorMassage.setText("New password must be different!");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else if(!SignUpControl.validatePassword(Npassword)){
                        errorMassage.setText("New password is Invalid !");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else{
                        update.ChangePass(Emaill,Password,Npassword);
                        errorMassage.setVisible(true);
                        errorMassage.setForeground(Color.green);
                    }
                }
            }
        });

        Cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });

    }
    public void setDark(){
        panel.setBackground(new Color(43, 45, 49));
        Header.setForeground(new Color(0xFFFFFF));
        currentPass.setForeground(new Color(128, 132, 142));
        CurrentPass.setBackground(new Color(51, 53, 56));
        CurrentPass.setForeground(new Color(159, 161, 164));
        new1Pass.setForeground(new Color(128, 132, 142));
        NewPass.setBackground(new Color(51, 53, 56));
        NewPass.setForeground(new Color(159, 161, 164));
        new2Pass.setForeground(new Color(128, 132, 142));
        NewPass2.setBackground(new Color(51, 53, 56));
        NewPass2.setForeground(new Color(159, 161, 164));
        errorMassage.setForeground(new Color(255,51,51));
        Confirm.setForeground(new Color(0,168,97));
        Confirm.setBorder(new Utils.RoundedBorder());
        Confirm.setBackground(new Color(43, 45, 49));
        Cancel.setForeground(Color.WHITE);
        Cancel.setBackground(new Color(60, 61, 63));
        Cancel.setBorder(new Utils.RoundedBorder());
    }

    public void setLight(){
        panel.setBackground(new Color(251,251,251));
        Header.setForeground(new Color(0,168,97));
        currentPass.setForeground(new Color(102, 102, 102));
        CurrentPass.setBackground(Color.WHITE);
        CurrentPass.setForeground(new Color(102, 102, 102));
        new1Pass.setForeground(new Color(102, 102, 102));
        NewPass.setBackground(Color.WHITE);
        NewPass.setForeground(new Color(102, 102, 102));
        new2Pass.setForeground(new Color(102, 102, 102));
        NewPass2.setBackground(Color.WHITE);
        NewPass2.setForeground(new Color(102, 102, 102));
        errorMassage.setForeground(new Color(255,51,51));
        Confirm.setForeground(Color.WHITE);
        Confirm.setBackground(new Color(0,168,97));
        Cancel.setForeground(Color.WHITE);
        Cancel.setBackground(new Color(204,204,204));
    }
}
