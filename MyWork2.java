package mywork2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.border.Border;

public class MyWork2 extends JFrame implements ActionListener{

    //private JLabel l;
    //private JTextField t,t1,t2;
    public JTextField t,t1,t2,l;
    private final JButton b,b1,b2;
    private final JPanel pane;
    private final GridLayout gd;
    
    MyWork2() throws IOException{
        super("Auto Logoff");
        
        Color btnTheme = new Color(139,0,0);
        Color sbtnTheme = new Color(0,128,0);
        Color tfTheme = new Color(139,0,0);
        Color ltfTheme = new Color(189,183,107);
        
        l = new JTextField("Select time");
        l.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));//set visibility of line border i.e the color and thickness
        l.setHorizontalAlignment(JTextField.CENTER);
        l.setFont(new Font("Baskerville Old Face", Font.ITALIC, 15));
        l.setForeground(Color.BLACK);
        l.setBackground(ltfTheme);
        l.setEditable(false);
        add(l, BorderLayout.NORTH);
        
        pane = new JPanel();
        pane.setBackground(tfTheme);
        add(pane, BorderLayout.CENTER);
        
        gd = new GridLayout(3,3,7,7);
        pane.setLayout(gd);
        
        //textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
        //int num = 00;
        t=new JTextField("00");
        t.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setFont(new Font("Times New Romans",Font.BOLD, 15));
        t.setForeground(Color.WHITE);
        t.setBackground(tfTheme);
        //t.setEditable(false);
        //t.setOpaque(false);
        pane.add(t);
        
        t1=new JTextField(":");
        t1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Times New Romans",Font.BOLD, 15));
        t1.setForeground(Color.WHITE);
        t1.setBackground(tfTheme);
        t1.setEditable(false);
        pane.add(t1);
        
        t2=new JTextField("00")/*{
            @Override
            public void setBorder(Border border){
                
            }
        }*//*sets border to null ie no border*/;
        t2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setForeground(Color.WHITE);
        t2.setBackground(tfTheme);
        t2.setFont(new Font("Times New Romans",Font.BOLD, 15));
        //t2.setEditable(false);
        //t2.setOpaque(false);
        pane.add(t2);
        
        b1 = new JButton("-");
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setFont(new Font("Times New Romans",Font.BOLD, 22));
        b1.setForeground(Color.WHITE);
        b1.setBackground(btnTheme);
        b1.addActionListener(this);
        add(b1, BorderLayout.WEST);
        
        b2 = new JButton("+");
        b2.setBorderPainted(false);
        b2.setFocusable(false);
        b2.setFont(new Font("Times New Romans",Font.BOLD, 22));
        b2.setForeground(Color.WHITE);
        b2.setBackground(btnTheme);
        b2.addActionListener(this);
        add(b2, BorderLayout.EAST);
        
        b = new JButton("START TIMER");
        b.setFocusable(false);
        b.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        //b.setBorderPainted(true);
        b.setForeground(Color.WHITE);
        b.setBackground(sbtnTheme);
        b.addActionListener(this);
        add(b, BorderLayout.SOUTH);
        
        //ImageIcon img = new ImageIcon("C:\\Users\\NOSA\\Documents\\NetBeansProjects\\MyWork2\\src\\mywork2\\clock-icon.png");
        //this.setIconImage(img.getImage());
        
        ImageIcon img = new ImageIcon("C:\\Program Files (x86)\\SLO\\clock-icon.png");
        this.setIconImage(img.getImage());
        
        //ImageIcon img = new ImageIcon("clock-icon.png");
        //this.setIconImage(img.getImage());
        
        //Icon img = new ImageIcon(getClass().getResource("clock-icon.png"));
        //this.setIconImage((Image) img);
        this.getRootPane().setWindowDecorationStyle(4);//decorates view windows
        this.setUndecorated(true);
        //Color btnTheme = new Color(99,47,0);//sets Button color
        //b.setBackground(btnTheme);
        
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //use hide on close later
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            //gets textfield value and reduces it
            String text = t2.getText();
            int t2int = Integer.parseInt(text);
            --t2int;
            if(t2int<0){
                Integer.toString(t2int);
                t2.setText("59");
                
                String texty = t.getText();
                int tint = Integer.parseInt(texty);
                --tint;
                if(tint<0){
                    Integer.toString(tint);
                    t.setText("23");
                }
                /*else if(tint>23){
                    Integer.toString(tint);
                    t.setText("00");
                }*/
                else{
                    Integer.toString(tint);
                    t.setText(""+tint);
                }
            }
            else{
                Integer.toString(t2int);
                t2.setText(""+t2int);
            }
        }
        else if(e.getSource()==b2){
            //gets textfield value and increases it
            String text = t2.getText();
            int t2int = Integer.parseInt(text);
            ++t2int;
            if(t2int>59){
                Integer.toString(t2int);
                t2.setText("00");
                
                String texty = t.getText();
                int tint = Integer.parseInt(texty);
                tint++;
                if(tint>23){
                    Integer.toString(tint);
                    t.setText("00");
                }
                else{
                    Integer.toString(tint);
                    t.setText(""+tint);
                }
            }
            else{
                Integer.toString(t2int);
                t2.setText(""+t2int);
            }
        }
        else if(e.getSource()==b){
            //convert textfield string to integer
            String text = t.getText();
            int tint = Integer.parseInt(text);
            
            //convert textfield string to integer
            String text2 = t2.getText();
            int t2int = Integer.parseInt(text2);
            
            //get current date
            Date date = new Date();
            
            //format only displays hour and minute
            SimpleDateFormat ft = new SimpleDateFormat("HH:mm");
            
            System.out.println(ft.format(date));
            
            Time22 time = new Time22();
            
            time.setTime(tint, t2int); //time.setTime(Hour, Minute);
            System.out.print("The initial universal time is: ");
            System.out.println(time.toUniversalString());
            System.out.print("The initial standard time is: ");
            System.out.println(time.toString());
            System.out.println();
            
            if(ft.format(date) == null ? time.toUniversalString() == null : ft.format(date).equals(time.toUniversalString())){
                //below is the lock code //if time is equal to current time
                Runtime runtime = Runtime.getRuntime();
                try {
                    Process proc = runtime.exec("shutdown -l");//to logoff
                } catch (IOException ex) {
                    Logger.getLogger(MyWork2.class.getName()).log(Level.SEVERE, null, ex);
                }
            System.exit(0);
            }
            else{
                //if time is not equal to current time
                while(true){
                    //keep doing below loop until current time is equal to set time
                    try {
                        Date date2 = new Date();
                        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm");
                        System.out.println(ft2.format(date2));
                        System.out.println(time.toUniversalString());
                        Thread.sleep(10*1000);//for 10 second loop wait before continuing loop
                        if(ft2.format(date2) == null ? time.toUniversalString() == null : ft2.format(date2).equals(time.toUniversalString())){
                        //below is the lock code //if time is equal to current time
                        Runtime runtime = Runtime.getRuntime();
                            try {
                                Process proc = runtime.exec("shutdown -l");//to logoff at 0 time
                            } catch (IOException ex) {
                                Logger.getLogger(MyWork2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        System.exit(0);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MyWork2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        MyWork2 myWork = new MyWork2();
    }
}