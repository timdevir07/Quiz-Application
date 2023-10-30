package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    
    Score(String name,int score){
            setBounds(600,150,750,550);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
         
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2); 
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
         
        JLabel heading=new JLabel("Thankyou "+name+" for playing Quiz Time");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel scoref=new JLabel("Your Score is "+score);
        scoref.setBounds(350,200,300,30);
        scoref.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(scoref);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(400,270,180,30);
        submit.setFont(new Font("scoref",Font.BOLD,20));
        submit.setForeground(Color.pink);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Login();
    }
    public static void main(String[] args){
        new Score("User",0);
    }
    
}
