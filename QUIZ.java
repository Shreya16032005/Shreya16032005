package QUIZ_APP;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Quiz extends JFrame  implements ActionListener{

    
        String questions[][]= new String[10][5];
    
        String answer[][]= new String[10][2];
    
        String userquestions[][]= new String[10][1];
    
    
    
        JLabel qno, question; 
    
        JRadioButton opt1, opt2, opt3, opt4; 
    
        ButtonGroup group;
    
        JButton next,submit,help;

        
                private String[][] useranswers;
                
                                private int timer;
                                
                                                    
                                                            
                                                                public static int timed = 15;
                                                            
                                                                public static int ans_given = 0;
                                                            
                                                                public static int count = 0;
                                                            
                                                                public static int score = 0;
                                                                String name;
                                                                
                                                            
                                                            
                                                            
                                                                Quiz(String name){

                                                                    this.name = name;
                                                            
                                                                    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
                                                                    JLabel img = new JLabel(i1);
                                                                    img.setBounds(0,0,1440,392);
                                                                    add(img);
                                                                    
                                                                    qno = new JLabel();
                                                                    qno.setBounds(100,450,50,30);
                                                                    qno.setFont(new Font("Tahoma",Font.PLAIN,24));
                                                                    add(qno);
                                                            
                                                                    question = new JLabel();
                                                                    question.setBounds(150,450,50,30);
                                                                    question.setFont(new Font("Tahoma",Font.PLAIN,24));
                                                                    add(question);
                                                                    
                                                                    questions[0][0] = "Number of primitive data types in Java are.?";
                                                                    questions[0][1] = "6";
                                                                    questions[0][2] = "7";
                                                                    questions[0][3] = "8";
                                                                    questions[0][4] = "9";
                                                            
                                                                    questions[1][0] = "What is the size of float and double in java.?";
                                                                    questions[1][1] = "32 and 64";
                                                                    questions[1][2] = "32 and 32";
                                                                    questions[1][3] = "64 and 64";
                                                                    questions[1][4] = "64 and 32";
                                                            
                                                                    questions[2][0] = "Automatic type conversion is possible in which of the possible cases?";
                                                                    questions[2][1] = "Byte to int";
                                                                    questions[2][2] = "Int to Long";
                                                                    questions[2][3] = "Long to int";
                                                                    questions[2][4] = "Short to int";
                                                            
                                                                    questions[3][0] = "When an array is passed to a method, what does the method receive?";
                                                                    questions[3][1] = "The reference of the array";
                                                                    questions[3][2] = "A copy of the array";
                                                                    questions[3][3] = "Length of the array";
                                                                    questions[3][4] = "Copy of first element";
                                                            
                                                                    questions[4][0] = "Arrays in java are.?";
                                                                    questions[4][1] = "Object References";
                                                                    questions[4][2] = "Objects";
                                                                    questions[4][3] = "Primitive data type";
                                                                    questions[4][4] = "None";
                                                            
                                                                    questions[5][0] = "When is the object created with new keyword?";
                                                                    questions[5][1] = "At rum time";
                                                                    questions[5][2] = "At compile time";
                                                                    questions[5][3] = "Depends on the code";
                                                                    questions[5][4] = "None";
                                                            
                                                                    questions[6][0] = "Identify the corrected definition of a package.?";
                                                                    questions[6][1] = "A package is a collection of editing tools";
                                                                    questions[6][2] = "A package is a collection of Classes";
                                                                    questions[6][3] = "A package is a collection of Classes and interfaces";
                                                                    questions[6][4] = "A package is a collection of interfaces";
                                                            
                                                                    questions[7][0] = "compareTo() returns";
                                                                    questions[7][1] = "True";
                                                                    questions[7][2] = "False";
                                                                    questions[7][3] = "An int value";
                                                                    questions[7][4] = "None";
                                                            
                                                                    questions[8][0] = "To which of the following does the class string belong to.";
                                                                    questions[8][1] = "java.lang";
                                                                    questions[8][2] = "java.awt";
                                                                    questions[8][3] = "java.applet";
                                                                    questions[8][4] = "java.String";
                                                            
                                                                    questions[9][0] = "Total constructor string class have.?";
                                                                    questions[9][1] = "3";
                                                                    questions[9][2] = "7";
                                                                    questions[9][3] = "13";
                                                                    questions[9][4] = "20";
                                                                    
                                                            
                                                                    answer[0][1] = "8";
                                                                    answer[1][1] = "32 and 64";
                                                                    answer[2][1] = "Int to Long";
                                                                    answer[3][1] = "The reference of the array";
                                                                    answer[4][1] = "Objects";
                                                                    answer[5][1] = "At rum time";
                                                                    answer[6][1] = "A package is a collection of Classes and interfaces";
                                                                    answer[7][1] = "An int value";
                                                                    answer[8][1] = "java.lang";
                                                                    answer[9][1] = "13";
                                                            
                                                                    opt1 = new JRadioButton();
                                                                    opt1.setBounds(170,520,700,30);
                                                                    opt1.setBackground(Color.WHITE);
                                                                    opt1.setFont(new Font("Dialog",Font.PLAIN,20));
                                                                    add(opt1);
                                                            
                                                                    opt2 = new JRadioButton();
                                                                    opt2.setBounds(170,560,700,30);
                                                                    opt2.setBackground(Color.WHITE);
                                                                    opt2.setFont(new Font("Dialog",Font.PLAIN,20));
                                                                    add(opt2);
                                                            
                                                                    opt3 = new JRadioButton();
                                                                    opt3.setBounds(170,600,700,30);
                                                                    opt3.setBackground(Color.WHITE);
                                                                    opt3.setFont(new Font("Dialog",Font.PLAIN,20));
                                                                    add(opt3);
                                                            
                                                                    opt4 = new JRadioButton();
                                                                    opt4.setBounds(170,640,700,30);
                                                                    opt4.setBackground(Color.WHITE);
                                                                    opt4.setFont(new Font("Dialog",Font.PLAIN,20));
                                                                    add(opt4);
                                                            
                                                                    group = new ButtonGroup();
                                                                    group.add(opt1);
                                                                    group.add(opt2);
                                                                    group.add(opt3);
                                                                    group.add(opt4);
                                                            
                                                                   
                                                                    next = new JButton("Next");
                                                                    next.setBounds(700,750,200,30);
                                                                    next.setBackground(Color.WHITE);
                                                                    next.addActionListener(this);
                                                                    add(next);
                                                            
                                                                    submit = new JButton("Submit");
                                                                    submit.setBounds(700,750,200,30);
                                                                    submit.setBackground(Color.WHITE);
                                                                    submit.addActionListener(this);
                                                                    add(submit);
                                                            
                                                                    help = new JButton("Help");
                                                                    help.setBounds(700,750,200,30);
                                                                    help.setBackground(Color.WHITE);
                                                                    help.addActionListener(this);
                                                                    add(help);
                                                                      
                                                                    start(count);
                                                                    
                                                                                
                                                                                
                                                                                
                                                                                
                    setSize(1440,850);
          setLocation(50,0);
                   getContentPane().setBackground(Color.WHITE);
                       setLayout(null);
                       setUndecorated(true);
              setVisible(true);
                                                                                
                      }
                 private void start(int count2) {
                                  
         throw new UnsupportedOperationException("Unimplemented method 'start'");
                   }
                       @Override
                     public void actionPerformed(ActionEvent e) {
                         if(e.getSource() == next){
                         repaint();
             opt1.setEnabled(true); 
              opt2.setEnabled(true); 
             opt3.setEnabled(true); 
                 opt4.setEnabled(true); 
                 ans_given = 1;
                     if(group.getSelection()==null){
                  useranswers[count][0] = "";
                    }else{
         useranswers[count][0] = group.getSelection().getActionCommand();
                      }
                  if(count==8){
                                                            next.setEnabled(false);
                                                            submit.setEnabled(true);
                                                           }
                                                            
                                                           count++;
                                                            start(count);
                                                
                                                        }else if (e.getSource()==help){
                                                            if(count==2 ||count==4 || count==6 || count==8 || count==9 ){
                                                             opt2.setEnabled(false);
                                                             opt3.setEnabled(false);
                                                                
                                                            }else{
                                                                opt1.setEnabled(false);
                                                                opt4.setEnabled(false);
                                                                   
                                                            }
                                                            help.setEnabled(false);
                                                         }else if(e.getSource()==submit){
                                                           ans_given=1;
                                                            if(group.getSelection()==null){
                                                                useranswers[count][0]="";
                                                
                                                            }else{
                                                                useranswers[count][0]= group.getSelection().getActionCommand();
                                                            }
                                                            for(int i=0; i<useranswers.length;i++){
                                                                if(useranswers[i][0].equals(answer[i][1])){
                                                                    score +=10;
                                                
                                                                }else{
                                                                    score += 0;
                                                                }
                                                            }
                                                            setVisible(false);
                                                
                                                         }
                                                    }
                                                
                                                    public void paint(Graphics g){
                                                        super.paint(g);
                                                
                                                        String time ="Time left -"+ timer +"seconds";
                                                        g.setColor(Color.RED);
                                                        g.setFont(new Font("Tahona",Font.BOLD,25));
                                                        if(timer > 0 ){
                                                            g.drawString(timer,1100,500);
                                
                                                        }else{
                                                            g.drawString("Times up !!", 1100,500);
                                                        }
                                                        timer --;
                                
                                                        try{
                                                           Thread.sleep(1000);
                                                           repaint(); 
                                                         } catch (Exception E){
                                                            E.printStackTrace();
                                                         }
                                
                                                         if (ans_given ==1){
                                                            ans_given = 0;
                                                            timer = 15;
                                                         }else if (timer < 0){
                                                          timer = 15;
                                                          opt1.setEnabled(true);
                                                          opt2.setEnabled(true);
                                                          opt3.setEnabled(true);
                                                          opt4.setEnabled(true);
                                
                                                          if (count == 8){
                                                             next.setEnabled(false);
                                                             submit.setEnabled(true);
                                
                                
                                                          }
                                                           if (count == 9){
                                                              if(group.getSelection() == null);
                                                              useranswers[count][0]="";
                                
                                
                                                           }else{
                                
                                                            useranswers[count][0]= group.getSelection().getActionCommand();
                                                           }
                                
                                                             Object[][] answers;
                                                    for(int i=0; i< useranswers.length;i++)
                                                            if(useranswers[i][0].equals(answers[i][1])){
                                                               score += 10;
                                                            
                                 } else{
                                     score+= 0;


                                }


                             }  
                             setVisible(false);
                             new Score(name, score);
                            
                            
                            }else{
                                if(group.getSelection()== null){
                                     useranswers[count][0]="";

                                }else{
                                    useranswers[count][0]= group.getSelection().getActionCommand();
                                }
                                count++;
                                start(count);
                            }
                        
    }
     public void start(int count){
        qno.setText("" + (count + 1)+".");
        question.setText(questions[count][0]);
        opt1.setText(questions);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][1]);
        opt2.setActionCommand(questions[count][1]);


        opt3.setText(questions[count][1]);
        opt3.setActionCommand(questions[count][1]);


        opt4.setText(questions[count][1]);
        opt4.setActionCommand(questions[count][1]);

          group.clearSelection();


     }

    public static void main(String[] args) {
        new Quiz("User");
    }

  
}
