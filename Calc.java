import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class myFrame extends Frame implements ActionListener
{
    TextField t1 = new TextField(40);
    TextField t2 = new TextField(40);
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String s1,s2,s3;
    int a,b;
    float z;
    myFrame()
    {
        setSize(600,600);
        setVisible (true);
        setLayout(null);
        b1 = new Button ("1");
        b2 = new Button ("2");
        b3 = new Button ("3");
        b4 = new Button ("4");
        b5 = new Button ("5");
        b6 = new Button ("6");
        b7 = new Button ("7");
        b8 = new Button ("8");
        b9 = new Button ("9");
        b10 = new Button ("0");
        b11 = new Button ("+");
        b12 = new Button ("-");
        b13 = new Button ("*");
        b14 = new Button ("/");
        b15 = new Button ("=");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        t1.setBounds(50, 70, 500, 50);
        t2.setBounds(50, 140, 500, 50);
       /*  
        b1.setBounds(50,248,125,50);
        b2.setBounds(175,248,125,50);
        b3.setBounds(300,248,125,50);
        
        b4.setBounds(50,336,125,50);
        b5.setBounds(175,336,125,50);
        b6.setBounds(300,336,125,50);
       
        b7.setBounds(50,424,125,50);
        b8.setBounds(175,424,125,50);
        b9.setBounds(300,424,125,50);
       
        b15.setBounds(425,512,125,50);
        */
        b14.setBounds(50,336,125,50);
        b13.setBounds(175,336,125,50);
         b12.setBounds(300,336,125,50);
          b11.setBounds(425,336,125,50);
    }

    public void actionPerformed (ActionEvent e)
    {
        s1 = e.getActionCommand();
        
       /*  if (s1 == "1"){
           t1.setText("1");
           }
        

        else if (s1 == "2")
         {
              t1.setText("2");
         }
        else if (s1 == "3")
           {
           
            t1.setText("3");
           }
        else if (s1 == "4")
        {
               
               t1.setText("4");
        }
        else if (s1 == "5")
        {
               t1.setText("5");
        }
        else if (s1 == "6")
        {
               
               t1.setText("6");
        }
        else if (s1 == "7")
        {
              
               t1.setText("7");
        }
        else if (s1 == "8")
        {
              
               t1.setText("8");
        }
        else if (s1 == "9")
        {
              
               t1.setText("9");
        }
        else if (s1 == "0")
        {
             
               t1.setText("0");
        }
        
        s3 = e.getActionCommand();
        s2 = e.getActionCommand();

        if (s2 == "1"){
                       
           t2.setText("1");
        }

        else if (s2 == "2")
         {
              
              t2.setText("2");
         }
        else if (s2 == "3")
           {
            
            t2.setText("3");
           }
        else if (s2 == "4")
        {
               
               t2.setText("4");
        }
        else if (s2 == "5")
        {
               
               t2.setText("5");
        }
        else if (s2 == "6")
        {
               
               t2.setText("6");
        }
        else if (s2 == "7")
        {
               
               t2.setText("7");
        }
        else if (s2 == "8")
        {
            
               t2.setText("8");
        }
        else if (s2 == "9")
        {
            
               t2.setText("9");
        }
        else if (s2 == "0")
        {
            
               t2.setText("0");
        }
*/
        a =Integer.parseInt(t1.getText());
        b =Integer.parseInt(t2.getText());

        

        if (s1 == "+"){
             z = a+b;
             t1.setText(""+z);    
        }
        if (s1 == "*"){
             z = a*b;
             t1.setText(""+z);    
        }
        if (s1 == "/"){
            if(b!=0)
            z = (float)a/b; 
            t1.setText(""+z);   
        }
        if (s1 == "-"){
             z = a-b;  
             t1.setText(""+z);  
        }
    }
}

class Calc
{
    public static void main (String [] args)
    {
        myFrame f = new myFrame();
    }
}
