package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuizFormS extends JFrame {

    String [] question = {
            "What is the chemical symbol for gold?",
            "Which planet has the most moons?",
            "What is the speed of light in a vacuum?",
            "What is the largest organ in the human body?",
            "What is the scientific name for water, H2O?",
            "What is the process of converting sunlight into electricity?",
            "What force pulls objects towards the center of the Earth?",
            "What is the smallest unit of matter?",
            "What is the study of insects called?",
            "What is the normal human body temperature?"
    };

    //the 5th answer will not be displayed but will be compaired to the selected to see if it is correct
    String[][] options ={
            {"Au", "Ag", "Fe", "Cu", "Au"},
            {"Venus", "Mars", "Jupiter", "Saturn", "Mars"},
            {"186,000 miles per second", "299,792,458 meters per second", "670 million miles per hour", "249,792,458 meters per second", "299,792,458 meters per second"},
            {"Brain", "Skin", "Liver", "Heart", "Skin"},
            {"H2SO4", "H2O", "CO2", "CH4", "H2O"},
            {"Photosynthesis", "Nuclear fusion", "Solar radiation", "Photovoltaic effect", "Photovoltaic effect"},
            {"Centripetal force", "Centrifugal force", "Gravitational force", "Inertia", "Gravitational force"},
            {"Molecule", "Atom", "Proton", "Electron", "Atom"},
            {"Ichthyology", "Entomology", "Ornithology", "Herpetology", "Entomology"},
            {"35°C", "36.5°C", "37°C", "38°C", "37°C"}
    };
    String [] correctAnswers={"Au","Mars","299,792,458 meters per second","Skin","H2O", "Photovoltaic effect", "Gravitational force","Atom", "Entomology", "37°C"};
    String[] UserAnswer = new String[question.length];


    JPanel panel=new JPanel();
    JPanel QuestionPanel=new JPanel();
    JLabel titel= new JLabel("Question : ");
    JLabel questionLbl = new JLabel();
    JPanel op1 =new JPanel();
    JRadioButton option_1 = new JRadioButton();
    JPanel op2 =new JPanel();
    JRadioButton option_2 = new JRadioButton();
    JPanel op3 =new JPanel();
    JRadioButton option_3 = new JRadioButton();
    JPanel op4 =new JPanel();
    JRadioButton option_4 = new JRadioButton();
    JButton Next_btn=new JButton("Next");


    boolean dark;
    int index = 0, correct =0;
    ButtonGroup bg = new ButtonGroup();
    public QuizFormS(boolean Dark){
        dark=Dark;


        //the non-Colored properties
        setSize(730,760);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        panel.setSize(730,760);
        panel.setBorder(new Utils.RoundedBorder());
        panel.setLayout(null);

        QuestionPanel.setBounds(30,50,650,200);
        QuestionPanel.setBorder(new Utils.RoundedBorder());

        QuestionPanel.setLayout(null);

        titel.setBounds(30,20,130,20);
        titel.setFont(new Font("Segoe UI", Font.BOLD, 20));


        questionLbl.setBounds(0,60,650,80);
        questionLbl.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        questionLbl.setHorizontalAlignment(SwingConstants.CENTER);

        op1.setBounds(30,300,650,50);
        op1.setBorder(new Utils.RoundedBorder());
        op1.setLayout(null);

        option_1.setBounds(30,9,600,30);
        option_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
        option_1.setHorizontalAlignment(SwingConstants.LEADING);

        op2.setBounds(30,380,650,50);
        op2.setBorder(new Utils.RoundedBorder());
        op2.setLayout(null);

        option_2.setBounds(30,9,600,30);
        option_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
        option_2.setHorizontalAlignment(SwingConstants.LEADING);

        op3.setBounds(30,460,650,50);
        op3.setBorder(new Utils.RoundedBorder());
        op3.setLayout(null);

        option_3.setBounds(30,9,600,30);
        option_3.setFont(new Font("Segoe UI", Font.BOLD, 17));
        option_3.setHorizontalAlignment(SwingConstants.LEADING);

        op4.setBounds(30,540,650,50);
        op4.setBorder(new Utils.RoundedBorder());
        op4.setLayout(null);

        option_4.setBounds(30,9,600,30);
        option_4.setFont(new Font("Segoe UI", Font.BOLD, 17));
        option_4.setHorizontalAlignment(SwingConstants.LEADING);


        Next_btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        Next_btn.setBounds(30,650,650,40);
        Next_btn.setBorder(new Utils.RoundedBorder());


        //colored theme choose
        if(Dark){
            setDark();
        }else{
            setLight();
        }


        bg.add(option_1);
        bg.add(option_2);
        bg.add(option_3);
        bg.add(option_4);
        add(panel);
        panel.add(QuestionPanel);
        panel.add(titel);
        QuestionPanel.add(questionLbl);
        panel.add(op1);
        panel.add(op2);
        panel.add(op3);
        panel.add(op4);
        op1.add(option_1);
        op2.add(option_2);
        op3.add(option_3);
        op4.add(option_4);
        panel.add(Next_btn);

        questionLbl.setText(question[0]);
        option_1.setText(options[0][0]);
        option_2.setText(options[0][1]);
        option_3.setText(options[0][2]);
        option_4.setText(options[0][3]);
        enablelRbuttons(true);

        UserAnswer[index] = options[index][4];

        //action when next
        Next_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Next_btn.getText().equals("Results"))
                {
                    Results result =new Results(dark,question,options,correctAnswers,UserAnswer);
                }

                if(index == question.length)
                {
                    // display the result and score
                    questionLbl.setText("Your Score : " + correct + " / "+ question.length);
                    if(correct >= (float) question.length/2){
                        QuestionPanel.setBackground(Color.green);
                        questionLbl.setForeground(Color.white);
                    }
                    else{
                        QuestionPanel.setBackground(Color.red);
                        questionLbl.setForeground(Color.white);
                    }
                    Next_btn.setText("Results");
                }
                else
                {
                    //enable radio buttons after click
                    enablelRbuttons(true);

                    //display the next question
                    questionLbl.setText(question[index]);
                    option_1.setText(options[index][0]);
                    option_2.setText(options[index][1]);
                    option_3.setText(options[index][2]);
                    option_4.setText(options[index][3]);

                    if(index == question.length-1){
                        Next_btn.setText("Finish and See the Result");
                    }

                }

                //clear the selected option after going to the next Question
                bg.clearSelection();

            }
        });

        option_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserAnswer[index] = option_1.getText();
                getSelectedOption(option_1);
            }
        });

        option_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserAnswer[index] = option_2.getText();
                getSelectedOption(option_2);
            }
        });

        option_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserAnswer[index] = option_3.getText();
                getSelectedOption(option_3);
            }
        });

        option_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserAnswer[index] = option_4.getText();
                getSelectedOption(option_4);
            }
        });
    }

    public void enablelRbuttons(boolean yes_or_no)
    {
        option_1.setEnabled(yes_or_no);
        option_2.setEnabled(yes_or_no);
        option_3.setEnabled(yes_or_no);
        option_4.setEnabled(yes_or_no);
    }

    public void getSelectedOption(JRadioButton rbtn) {
        if (rbtn.isSelected()) {
            UserAnswer[index] = rbtn.getText();
            if (rbtn.getText().equals(options[index][4])) {
                correct++;
            }
            index++;
            enablelRbuttons(false);
        }
    }

    public void setLight(){
        panel.setBackground(new Color(245,245,245));
        QuestionPanel.setBackground(new Color(234,234,236));
        titel.setForeground(new Color(79, 79, 79));
        questionLbl.setForeground(new Color(0,168,97));
        op1.setBackground(new Color(234,234,236));
        option_1.setForeground(new Color(0, 0, 0));
        option_1.setBackground(new Color(234,234,236));
        op2.setBackground(new Color(234,234,236));
        option_2.setForeground(new Color(0, 0, 0));
        option_2.setBackground(new Color(234,234,236));
        op3.setBackground(new Color(234,234,236));
        option_3.setForeground(new Color(0, 0, 0));
        option_3.setBackground(new Color(234,234,236));
        op4.setBackground(new Color(234,234,236));
        option_4.setForeground(new Color(0, 0, 0));
        option_4.setBackground(new Color(234,234,236));
        Next_btn.setBackground(new Color(234,234,236));
        Next_btn.setForeground(new Color(0,168,97));
    }

    public void setDark(){
        panel.setBackground(new Color(43, 45, 49));
        QuestionPanel.setBackground(new Color(102,102,102));
        titel.setForeground(new Color(255, 255, 255));
        questionLbl.setForeground(new Color(255, 255, 255));
        op1.setBackground(new Color(102,102,102));
        option_1.setForeground(new Color(255, 255, 255));
        option_1.setBackground(new Color(102,102,102));
        op2.setBackground(new Color(102,102,102));
        option_2.setForeground(new Color(255, 255, 255));
        option_2.setBackground(new Color(102,102,102));
        op3.setBackground(new Color(102,102,102));
        option_3.setForeground(new Color(255, 255, 255));
        option_3.setBackground(new Color(102,102,102));
        op4.setBackground(new Color(102,102,102));
        option_4.setForeground(new Color(255, 255, 255));
        option_4.setBackground(new Color(102,102,102));
        Next_btn.setBackground(new Color(102,102,102));
        Next_btn.setForeground(new Color(255, 255, 255));
    }


}
