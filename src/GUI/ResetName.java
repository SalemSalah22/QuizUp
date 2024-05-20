package GUI;

import Controls.SignUpControl;
import Controls.UpdatingData;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResetName extends JFrame {
    private UpdatingData update  = new UpdatingData();
    private SignUpControl signupcontrol = new SignUpControl();
    JFrame frame=new JFrame("Change Name");
    JPanel panel =new JPanel();
    JLabel Logo =new JLabel();
    ImageIcon Light = new ImageIcon("src\\Images\\writeD.png");
     ImageIcon DarkIcon = new ImageIcon("src\\Images\\writeL.png");
    JLabel Header=new JLabel("Change Name");
    JLabel CurrentName=new JLabel("Current Name");
    JTextField currentNameinput =new JTextField();
    JLabel NewName=new JLabel("New Name");
    JTextField NewNameinput =new JTextField();
    JLabel errorMassage =new JLabel();
    JButton Confirm=new JButton("Confirm");
    JButton Cancel=new JButton("Cancel");

    //variables that takes the passed data
    private String Password;
    private String Emaill;
    private String username;
    private boolean Dark;

    //Constructor initialize the GUI and Contain the methods
    public ResetName(String name,String password, String email, boolean Dark){
        //taking the values of the passed data into the vars
        this.Password=password;
        this.username=name;
        this.Emaill=email;
        this.Dark=Dark;

        //Starting the Non-Colored Properties of the GUI
        frame.setSize(405, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(405, 520);
        panel.setLayout(null);



        Logo.setBounds(170,20,405,50);

        Header.setBounds(80,80,405,50);
        Header.setFont(new Font("Segoe UI", Font.BOLD, 36));

        CurrentName.setFont(new Font("Arial", Font.PLAIN, 15));
        CurrentName.setBounds(40, 150, 200, 30);

        currentNameinput.setFont(new Font("Open Sans", Font.PLAIN, 15));
        currentNameinput.setBounds(40, 185, 310, 35);
        currentNameinput.setBorder(new Utils.RoundedBorder());

        NewName.setFont(new Font("Arial", Font.PLAIN, 15));
        NewName.setBounds(40, 230, 200, 30);

        NewNameinput.setFont(new Font("Open Sans", Font.PLAIN, 15));
        NewNameinput.setBounds(40, 265, 310, 35);
        NewNameinput.setBorder(new Utils.RoundedBorder());

        errorMassage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        errorMassage.setBounds(40, 310, 310, 35);
        errorMassage.setHorizontalAlignment(SwingConstants.CENTER);

        Confirm.setBounds(40,350,310,35);
        Confirm.setFont(new Font("Segoe UI", Font.BOLD, 14));
        Confirm.setHorizontalAlignment(SwingConstants.CENTER);
        Confirm.setBorder(BorderFactory.createEmptyBorder());

        Cancel.setBounds(40,395,310,35);
        Cancel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        Cancel.setHorizontalAlignment(SwingConstants.CENTER);
        Cancel.setBorder(BorderFactory.createEmptyBorder());
        //Ending the Non-Colored Properties of the GUI


        //check for the theme of the previous page
        if(Dark){
            //dark theme colors
            setDark();
        }else{
            //Light theme colors
            setLight();
        }

        //Adding the components to the Main Frame
        frame.add(panel);
        panel.add(Logo);
        panel.add(Header);
        panel.add(currentNameinput);
        panel.add(CurrentName);
        panel.add(NewName);
        panel.add(NewNameinput);
        panel.add(errorMassage);
        panel.add(Confirm);
        panel.add(Cancel);


        //Action when Click the Confirm button
        //Check for the cases of the Inputs if (Empty - Invalid - already Exist)
        Confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ex) {
                errorMassage.setVisible(false);
                String CurrentName = currentNameinput.getText();
                String Newname = NewNameinput.getText();


                boolean IsEmpty= CurrentName.isEmpty() || Newname.isEmpty();

                if(IsEmpty){
                    errorMassage.setText("Fields cannot be empty!");
                    errorMassage.setForeground(Color.red);
                    errorMassage.setVisible(true);
                }else{
                    if(!CurrentName.equals(username)){
                        errorMassage.setText("Current Username is Wrong!");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else if(CurrentName.equals(Newname)){
                        errorMassage.setText("New Username must be different!");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else if(signupcontrol.validateName(Newname)){
                        errorMassage.setText("New Username is Invalid !");
                        errorMassage.setForeground(Color.red);
                        errorMassage.setVisible(true);
                    }else{
                        update.ChangeName(username,Newname,Emaill);
                        errorMassage.setText("Username Changed successfully");
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

    public void setDark() {
        panel.setBackground(new Color(43, 45, 49));
        Header.setForeground(new Color(0xFFFFFF));
        CurrentName.setForeground(new Color(128, 132, 142));
        currentNameinput.setBackground(new Color(51, 53, 56));
        currentNameinput.setForeground(new Color(159, 161, 164));
        NewName.setForeground(new Color(128, 132, 142));
        NewNameinput.setBackground(new Color(51, 53, 56));
        NewNameinput.setForeground(new Color(159, 161, 164));
        errorMassage.setForeground(new Color(255,51,51));
        Confirm.setForeground(new Color(0,168,97));
        Confirm.setBorder(new Utils.RoundedBorder());
        Confirm.setBackground(new Color(43, 45, 49));
        Cancel.setForeground(Color.WHITE);
        Cancel.setBackground(new Color(60, 61, 63));
        Cancel.setBorder(new Utils.RoundedBorder());
        Logo.setIcon(DarkIcon);
    }

    public void setLight(){
        panel.setBackground(new Color(251,251,251));
        Header.setForeground(new Color(0,168,97));
        CurrentName.setForeground(new Color(102, 102, 102));
        currentNameinput.setBackground(Color.WHITE);
        currentNameinput.setForeground(new Color(102, 102, 102));
        NewName.setForeground(new Color(102, 102, 102));
        NewNameinput.setBackground(Color.WHITE);
        NewNameinput.setForeground(new Color(102, 102, 102));
        errorMassage.setForeground(new Color(255,51,51));
        Confirm.setForeground(Color.WHITE);
        Confirm.setBackground(new Color(0,168,97));
        Cancel.setForeground(Color.WHITE);
        Cancel.setBackground(new Color(204,204,204));
        Logo.setIcon(Light);
    }
}
