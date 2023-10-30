package quiz.application;

//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{  
    
    JButton rules,exit;
    JTextField tname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading=new JLabel("QUIZ TIME");
        heading.setBounds(750,60,300,45);
        add(heading);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
        heading.setForeground(new Color(30,144,254));
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        add(name);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        
        
        tname=new JTextField();
        tname.setBounds(735,200,300,25);
        tname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(tname);
        
        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setBackground(Color.pink);
        rules.addActionListener(this);
        add(rules);
        
        exit=new JButton("Exit");
        exit.setBounds(915,270,120,25);
        exit.setBackground(new Color(30,144,254));
        exit.setBackground(Color.pink);
        exit.addActionListener(this);
        add(exit);
        
        
        setSize(1200,500);
        setLocation(150,150);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == rules){
           String name=tname.getText();
           setVisible(false);
           new Rules(name);
           }else if(ae.getSource()==exit){
            setVisible(false);   
           } 
        
    }
    
    public static void main(String[] args){
        new Login();
        
    }

    //@Override
    //public void actionPerformed(ActionEvent e) {
     //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
