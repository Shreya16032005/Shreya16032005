package QUIZ_APP;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton Next,back;

Login(){
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i = i1.getImage().getScaledInstance(550, 500,Image.SCALE_DEFAULT);
    ImageIcon i2 = new ImageIcon(i);
    JLabel image = new JLabel(i2);
    image.setBounds(450,0,550,500);
    add(image);
    
    JLabel heading = new JLabel("QUIZ TEST");
    heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Monogolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(22,99,54));
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(text);
        
        Next = new JButton("Next");
        Next.setBounds(100,270,120,25);
        Next.setBackground(new Color(22,99,54));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        back = new JButton("Back");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



    setSize(1000,500);
    setLocation(200,150);
    setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource() == Next) {
        
    } else if (e.getSource() == back) {
        System.exit(50);
         
    }



}

    public static void main(String[] args) {
        
    }
}
