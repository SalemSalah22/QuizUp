package GUI;


import Utils.RoundedBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;


public class Results extends JFrame {
    JFrame frame =new JFrame("Result Page");

    JPanel panel=new JPanel();

    JPanel northPanel=new JPanel();

    JLabel revLbl=new JLabel("Review Your Answers");
    JLabel logo=new JLabel();
    ImageIcon Logo = new ImageIcon("src/Images/logo2.png");
    JLabel AppName =new JLabel("Quiz Up");
    JLabel Q =new JLabel("(Question)");
    JLabel A=new JLabel("(Answer)");
    JLabel C=new JLabel("(Correct)");

    JPanel southPanel=new JPanel();

    JPanel pan1=new JPanel();
    JLabel Q1 =new JLabel();
    JLabel U1 =new JLabel();
    JLabel C1 =new JLabel();

    JPanel pan2=new JPanel();
    JLabel Q2 =new JLabel();
    JLabel U2 =new JLabel();
    JLabel C2 =new JLabel();

    JPanel pan3=new JPanel();
    JLabel Q3 =new JLabel();
    JLabel U3 =new JLabel();
    JLabel C3 =new JLabel();

    JPanel pan4=new JPanel();
    JLabel Q4 =new JLabel();
    JLabel U4 =new JLabel();
    JLabel C4 =new JLabel();

    JPanel pan5=new JPanel();
    JLabel Q5 =new JLabel();
    JLabel U5 =new JLabel();
    JLabel C5 =new JLabel();

    JPanel pan6=new JPanel();
    JLabel Q6 =new JLabel();
    JLabel U6 =new JLabel();
    JLabel C6 =new JLabel();

    JPanel pan7=new JPanel();
    JLabel Q7 =new JLabel();
    JLabel U7 =new JLabel();
    JLabel C7 =new JLabel();

    JPanel pan8=new JPanel();
    JLabel Q8 =new JLabel();
    JLabel U8 =new JLabel();
    JLabel C8 =new JLabel();

    JPanel pan9=new JPanel();
    JLabel Q9 =new JLabel();
    JLabel U9 =new JLabel();
    JLabel C9 =new JLabel();

    JPanel pan10=new JPanel();
    JLabel Q10 =new JLabel();
    JLabel U10 =new JLabel();
    JLabel C10 =new JLabel();

    JButton ReQuiz=new JButton("Close Program");
    String [] Qiestion;
    String [][] Options;
    String[] useranswer ;
    String [] right;
    public Results(boolean dark,String [] Qiestions,String [][]options,String [] RightOption,String [] UserAnswer){
        Qiestion=Qiestions;
        Options=options;
        useranswer=UserAnswer;
        right=RightOption;





        frame.setSize(830,920);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setSize(830,920);
        panel.setLayout(null);


        northPanel.setBounds(30,30,750,165);

        northPanel.setBorder(new RoundedBorder());
        northPanel.setLayout(null);

        revLbl.setBounds(30,10,500,50);

        revLbl.setFont(new Font("Segoe UI", Font.BOLD, 32));

        logo.setIcon(Logo);
        logo.setBounds(650,-7,100,100);

        AppName.setFont(new Font("Segoe UI", Font.BOLD, 24));
        AppName.setBounds(635,80,100,30);
        AppName.setForeground(new Color(255, 255, 255));


        Q.setFont(new Font("Segoe UI", Font.BOLD, 22));
        Q.setBounds(30,120,150,30);


        A.setFont(new Font("Segoe UI", Font.BOLD, 22));
        A.setBounds(500,120,150,30);


        C.setFont(new Font("Segoe UI", Font.BOLD, 22));
        C.setBounds(635,120,150,30);

        pan1.setBounds(30,220,750,50);

        pan1.setBorder(new RoundedBorder());
        pan1.setLayout(null);

        Q1.setBounds(30,0,400,50);
        Q1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        U1.setBounds(500,0,200,50);
        U1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        C1.setBounds(630,0,300,50);
        C1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));




        pan2.setBounds(30,280,750,50);

        pan2.setBorder(new RoundedBorder());
        pan2.setLayout(null);

        Q2.setBounds(30,0,400,50);
        Q2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        U2.setBounds(500,0,200,50);
        U2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C2.setBounds(630,0,200,50);
        C2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        pan3.setBounds(30,340,750,50);

        pan3.setBorder(new RoundedBorder());
        pan3.setLayout(null);

        Q3.setBounds(30,0,400,50);
        Q3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        U3.setBounds(500,0,200,50);
        U3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C3.setBounds(630,0,200,50);
        C3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

        pan4.setBounds(30,400,750,50);

        pan4.setBorder(new RoundedBorder());
        pan4.setLayout(null);

        Q4.setBounds(30,0,400,50);
        Q4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        U4.setBounds(500,0,300,50);
        U4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C4.setBounds(630,0,200,50);
        C4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

        pan5.setBounds(30,460,750,50);

        pan5.setBorder(new RoundedBorder());
        pan5.setLayout(null);

        Q5.setBounds(30,0,400,50);
        Q5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        U5.setBounds(500,0,200,50);
        U5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C5.setBounds(630,0,200,50);
        C5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        pan6.setBounds(30,520,750,50);

        pan6.setBorder(new RoundedBorder());
        pan6.setLayout(null);

        Q6.setBounds(30,0,400,50);
        Q6.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        U6.setBounds(500,0,200,50);
        U6.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C6.setBounds(630,0,200,50);
        C6.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        pan7.setBounds(30,580,750,50);

        pan7.setBorder(new RoundedBorder());
        pan7.setLayout(null);

        Q7.setBounds(30,0,400,50);
        Q7.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        U7.setBounds(500,0,200,50);
        U7.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C7.setBounds(630,0,200,50);
        C7.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

        pan8.setBounds(30,640,750,50);

        pan8.setBorder(new RoundedBorder());
        pan8.setLayout(null);

        Q8.setBounds(30,0,400,50);
        Q8.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        U8.setBounds(500,0,200,50);
        U8.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C8.setBounds(630,0,200,50);
        C8.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        pan9.setBounds(30,700,750,50);

        pan9.setBorder(new RoundedBorder());
        pan9.setLayout(null);

        Q9.setBounds(30,0,400,50);
        Q9.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        U9.setBounds(500,0,200,50);
        U9.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C9.setBounds(630,0,200,50);
        C9.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

        pan10.setBounds(30,760,750,50);

        pan10.setBorder(new RoundedBorder());
        pan10.setLayout(null);

        Q10.setBounds(30,0,400,50);
        Q10.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        U10.setBounds(500,0,200,50);
        U10.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));


        C10.setBounds(630,0,200,50);
        C10.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));



        frame.add(panel);
        panel.add(northPanel);
        panel.add(southPanel);
        northPanel.add(revLbl);
        northPanel.add(logo);
        northPanel.add(AppName);
        northPanel.add(Q);
        northPanel.add(A);
        northPanel.add(C);
        panel.add(pan1);
        panel.add(pan2);
        panel.add(pan3);
        panel.add(pan4);
        panel.add(pan5);
        panel.add(pan6);
        panel.add(pan7);
        panel.add(pan8);
        panel.add(pan9);
        panel.add(pan10);
        pan1.add(Q1);
        pan1.add(C1);
        pan1.add(U1);
        pan2.add(Q2);
        pan2.add(U2);
        pan2.add(C2);
        pan3.add(Q3);
        pan3.add(U3);
        pan3.add(C3);
        pan4.add(Q4);
        pan4.add(U4);
        pan4.add(C4);
        pan5.add(Q5);
        pan5.add(U5);
        pan5.add(C5);
        pan6.add(Q6);
        pan6.add(U6);
        pan6.add(C6);
        pan7.add(Q7);
        pan7.add(U7);
        pan7.add(C7);
        pan8.add(Q8);
        pan8.add(U8);
        pan8.add(C8);
        pan9.add(Q9);
        pan9.add(U9);
        pan9.add(C9);
        pan10.add(Q10);
        pan10.add(U10);
        pan10.add(C10);

        ReQuiz.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });

        if(dark){
            setDark();
        }else{
            setLight();
        }

        Q1.setText(Qiestions[0]);
        Q2.setText(Qiestions[1]);
        Q3.setText(Qiestions[2]);
        Q4.setText(Qiestions[3]);
        Q5.setText(Qiestions[4]);
        Q6.setText(Qiestions[5]);
        Q7.setText(Qiestions[6]);
        Q8.setText(Qiestions[7]);
        Q9.setText(Qiestions[8]);
        Q10.setText(Qiestions[9]);
        U1.setText(useranswer[0]);
        U2.setText(useranswer[1]);
        U3.setText(useranswer[2]);
        U4.setText(useranswer[3]);
        U5.setText(useranswer[4]);
        U6.setText(useranswer[5]);
        U7.setText(useranswer[6]);
        U8.setText(useranswer[7]);
        U9.setText(useranswer[8]);
        U10.setText(useranswer[9]);
        C1.setText(right[0]);
        C2.setText(right[1]);
        C3.setText(right[2]);
        C4.setText(right[3]);
        C5.setText(right[4]);
        C6.setText(right[5]);
        C7.setText(right[6]);
        C8.setText(right[7]);
        C9.setText(right[8]);
        C10.setText(right[9]);
        if(Objects.equals(useranswer[0], right[0])){
            U1.setForeground(new Color(0, 204, 51));
        }else
            U1.setForeground(Color.red);

        if(Objects.equals(useranswer[1], right[1])){
            U2.setForeground(new Color(0, 204, 51));
        }else
            U2.setForeground(Color.red);

        if(Objects.equals(useranswer[2], right[2])){
            U3.setForeground(new Color(0, 204, 51));
        }else
            U3.setForeground(Color.red);

        if(Objects.equals(useranswer[3], right[3])){
            U4.setForeground(new Color(0, 204, 51));
        }else
            U4.setForeground(Color.red);

        if(Objects.equals(useranswer[4], right[4])){
            U5.setForeground(new Color(0, 204, 51));
        }else
            U5.setForeground(Color.red);

        if(Objects.equals(useranswer[5], right[5])){
            U6.setForeground(new Color(0, 204, 51));
        }else
            U6.setForeground(Color.red);

        if(Objects.equals(useranswer[6], right[6])){
            U7.setForeground(new Color(0, 204, 51));
        }else
            U7.setForeground(Color.red);

        if(Objects.equals(useranswer[7], right[7])){
            U8.setForeground(new Color(0, 204, 51));
        }else
            U8.setForeground(Color.red);

        if(Objects.equals(useranswer[8], right[8])){
            U9.setForeground(new Color(0, 204, 51));
        }else
            U9.setForeground(Color.red);

        if(Objects.equals(useranswer[9], right[9])){
            U10.setForeground(new Color(0, 204, 51));
        }else
            U10.setForeground(Color.red);
    }


    public void setLight(){
        panel.setBackground(Color.WHITE);
        northPanel.setBackground(new Color(0,168,97));
        revLbl.setForeground(new Color(255, 255, 255));
        Q.setForeground(new Color(255, 255, 255));
        A.setForeground(new Color(255, 255, 255));
        C.setForeground(new Color(255, 255, 255));
        pan1.setBackground(new Color(234,234,236));
        Q1.setForeground(new Color(102,102,102));
        U1.setForeground(new Color(102,102,102));
        C1.setForeground(new Color(0, 168, 97));
        pan2.setBackground(new Color(234,234,236));
        Q2.setForeground(new Color(102,102,102));
        U2.setForeground(new Color(102,102,102));
        C2.setForeground(new Color(0, 168, 97));
        pan3.setBackground(new Color(234,234,236));
        Q3.setForeground(new Color(102,102,102));
        U3.setForeground(new Color(102,102,102));
        C3.setForeground(new Color(0, 168, 97));
        pan4.setBackground(new Color(234,234,236));
        Q4.setForeground(new Color(102,102,102));
        U4.setForeground(new Color(102,102,102));
        C4.setForeground(new Color(0, 168, 97));
        pan5.setBackground(new Color(234,234,236));
        Q5.setForeground(new Color(102,102,102));
        U5.setForeground(new Color(102,102,102));
        C5.setForeground(new Color(0, 168, 97));
        pan6.setBackground(new Color(234,234,236));
        Q6.setForeground(new Color(102,102,102));
        U6.setForeground(new Color(102,102,102));
        C6.setForeground(new Color(0, 168, 97));
        pan7.setBackground(new Color(234,234,236));
        Q7.setForeground(new Color(102,102,102));
        U7.setForeground(new Color(102,102,102));
        C7.setForeground(new Color(0, 168, 97));
        pan8.setBackground(new Color(234,234,236));
        Q8.setForeground(new Color(102,102,102));
        U8.setForeground(new Color(102,102,102));
        C8.setForeground(new Color(0, 168, 97));
        pan9.setBackground(new Color(234,234,236));
        Q9.setForeground(new Color(102,102,102));
        U9.setForeground(new Color(102,102,102));
        C9.setForeground(new Color(0, 168, 97));
        pan10.setBackground(new Color(234,234,236));
        Q10.setForeground(new Color(102,102,102));
        U10.setForeground(new Color(102,102,102));
        C10.setForeground(new Color(0, 168, 97));
    }

    public void setDark(){
        panel.setBackground(new Color(43, 45, 49, 255));
        northPanel.setBackground(new Color(81, 81, 81));
        revLbl.setForeground(new Color(255, 255, 255));
        Q.setForeground(new Color(255, 255, 255));
        A.setForeground(new Color(255, 255, 255));
        C.setForeground(new Color(255, 255, 255));
        pan1.setBackground(new Color(51, 53, 56));
        Q1.setForeground(new Color(128, 132, 142));
        C1.setForeground(new Color(0, 168, 97));
        pan2.setBackground(new Color(51, 53, 56));
        Q2.setForeground(new Color(102,102,102));
        C2.setForeground(new Color(0, 168, 97));
        pan3.setBackground(new Color(51, 53, 56));
        Q3.setForeground(new Color(102,102,102));
        C3.setForeground(new Color(0, 168, 97));
        pan4.setBackground(new Color(51, 53, 56));
        Q4.setForeground(new Color(102,102,102));
        C4.setForeground(new Color(0, 168, 97));
        pan5.setBackground(new Color(51, 53, 56));
        Q5.setForeground(new Color(102,102,102));
        C5.setForeground(new Color(0, 168, 97));
        pan6.setBackground(new Color(51, 53, 56));
        Q6.setForeground(new Color(102,102,102));
        C6.setForeground(new Color(0, 168, 97));
        pan7.setBackground(new Color(51, 53, 56));
        Q7.setForeground(new Color(102,102,102));
        C7.setForeground(new Color(0, 168, 97));
        pan8.setBackground(new Color(51, 53, 56));
        Q8.setForeground(new Color(102,102,102));
        C8.setForeground(new Color(0, 168, 97));
        pan9.setBackground(new Color(51, 53, 56));
        Q9.setForeground(new Color(102,102,102));
        C9.setForeground(new Color(0, 168, 97));
        pan10.setBackground(new Color(51, 53, 56));
        Q10.setForeground(new Color(102,102,102));
        C10.setForeground(new Color(0, 168, 97));
    }

    }




