import javax.swing.*;
import javax.swing.border.LineBorder;

// import java.awt.Font;
import java.awt.event.*;
import java.lang.Math;
import java.awt.*;

import java.util.Scanner;

public class projectCalculator extends JFrame implements ActionListener{

    JTextField t;
    JLabel l;
    String str = "";
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdel,bclr,beq,bper,bdec,bpow,bsqrt,bfact,bpi,bsign,brev,bsin,bcos,btan,blog;
    Scanner sc = new Scanner(System.in);
    
    static double num1 = 0, num2 = 0, result = 0;
    static String operator = "";

    projectCalculator() {
        setSize(350,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);
        Font fo = new Font("Arial", Font.BOLD, 15);
        
        l = new JLabel("", JLabel.RIGHT);
        l.setBounds(20,10,300,30);
        add(l);
        l.setForeground(Color.white);
        l.setFont(fo);
        // l.setFont(new Font("Verdana", Font.PLAIN, 13));

        t = new JTextField("");
        t.setBounds(20,40,300,35);
        t.setHorizontalAlignment(JTextField.RIGHT);
        add(t);
        t.setFont(fo);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.WHITE);
        t.setBorder(null);


        // 1st ROW

        bclr = new JButton("AC");
        bclr.setBounds(20,90,60,40);
        add(bclr); bclr.addActionListener(this);
        bclr.setFont(fo);
        bclr.setBackground(Color.BLACK);
        bclr.setForeground(Color.WHITE);
        bclr.setBorderPainted(false);

        
        bdel = new JButton("<-");
        bdel.setBounds(80,90,60,40);
        add(bdel); bdel.addActionListener(this);
        bdel.setFont(fo);
        bdel.setBackground(Color.BLACK);
        bdel.setForeground(Color.WHITE);
        bdel.setBorderPainted(false);

        bper = new JButton("%");
        bper.setBounds(140,90,60,40);
        add(bper); bper.addActionListener(this);
        bper.setFont(fo);
        bper.setBackground(Color.BLACK);
        bper.setForeground(Color.WHITE);
        bper.setBorderPainted(false);
        
        bdiv = new JButton("/");
        bdiv.setBounds(200,90,60,40);
        add(bdiv); bdiv.addActionListener(this);
        bdiv.setBackground(Color.orange);
        bdiv.setBorder(new LineBorder(Color.BLACK));
        bdiv.setFont(fo);
        // bdiv.setBorderPainted(false);
        
        bpow = new JButton("^");
        bpow.setBounds(260,90,60,40);
        add(bpow); bpow.addActionListener(this);
        bpow.setFont(fo);
        bpow.setBackground(Color.BLACK);
        bpow.setForeground(Color.WHITE);
        bpow.setBorderPainted(false);

        // 2nd ROW

        b7 = new JButton("7");
        b7.setBounds(20,130,60,40);
        add(b7); b7.addActionListener(this);
        b7.setFont(fo);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);

        b8 = new JButton("8");
        b8.setBounds(80,130,60,40);
        add(b8); b8.addActionListener(this);
        b8.setFont(fo);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBorderPainted(false);

        b9 = new JButton("9");
        b9.setBounds(140,130,60,40);
        add(b9); b9.addActionListener(this);
        b9.setFont(fo);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBorderPainted(false);

        bmul = new JButton("x");
        bmul.setBounds(200,130,60,40);
        add(bmul); bmul.addActionListener(this);
        bmul.setBackground(Color.orange);
        bmul.setBorder(new LineBorder(Color.BLACK));
        bmul.setFont(fo);
        // bmul.setBorderPainted(false);

        bsqrt = new JButton("\u221A");
        bsqrt.setBounds(260,130,60,40);
        add(bsqrt); bsqrt.addActionListener(this);
        bsqrt.setFont(fo);
        bsqrt.setBackground(Color.BLACK);
        bsqrt.setForeground(Color.WHITE);
        bsqrt.setBorderPainted(false);
        
        // 3rd ROW

        b4 = new JButton("4");
        b4.setBounds(20,170,60,40);
        add(b4); b4.addActionListener(this);
        b4.setFont(fo);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);


        b5 = new JButton("5");
        b5.setBounds(80,170,60,40);
        add(b5); b5.addActionListener(this);
        b5.setFont(fo);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);

        b6 = new JButton("6");
        b6.setBounds(140,170,60,40);
        add(b6); b6.addActionListener(this);
        b6.setFont(fo);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);

        bsub = new JButton("-");
        bsub.setBounds(200,170,60,40);
        add(bsub); bsub.addActionListener(this);
        bsub.setBackground(Color.orange);
        bsub.setBorder(new LineBorder(Color.BLACK));
        bsub.setFont(fo);
        // bsub.setBorderPainted(false);

        bfact = new JButton("!");
        bfact.setBounds(260,170,60,40);
        add(bfact); bfact.addActionListener(this);
        bfact.setFont(fo);
        bfact.setBackground(Color.BLACK);
        bfact.setForeground(Color.WHITE);
        bfact.setBorderPainted(false);

        // 4th ROW

        b1 = new JButton("1");
        b1.setBounds(20,210,60,40);
        add(b1); b1.addActionListener(this);
        b1.setFont(fo);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);

        b2 = new JButton("2");
        b2.setBounds(80,210,60,40);
        add(b2); b2.addActionListener(this);
        b2.setFont(fo);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);

        b3 = new JButton("3");
        b3.setBounds(140,210,60,40);
        add(b3); b3.addActionListener(this);
        b3.setFont(fo);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);

        badd = new JButton("+");
        badd.setBounds(200,210,60,40);
        add(badd); badd.addActionListener(this);
        badd.setBackground(Color.orange);
        badd.setBorder(new LineBorder(Color.BLACK));
        badd.setFont(fo);
        // badd.setBorderPainted(false);

        bpi = new JButton("\u03C0");
        bpi.setBounds(260,210,60,40);
        add(bpi); bpi.addActionListener(this);
        bpi.setFont(fo);
        bpi.setBackground(Color.BLACK);
        bpi.setForeground(Color.WHITE);
        bpi.setBorderPainted(false);

        // 5th ROW

        b0 = new JButton("0");
        b0.setBounds(20,250,90,40);
        add(b0); b0.addActionListener(this);
        b0.setBackground(Color.orange);
        b0.setBorder(new LineBorder(Color.BLACK));
        b0.setFont(fo);
        // b0.setBorderPainted(false);
        
        beq = new JButton("=");
        beq.setBounds(110,250,90,40);
        add(beq); beq.addActionListener(this);
        beq.setBackground(Color.orange);
        beq.setBorder(new LineBorder(Color.BLACK));
        beq.setFont(fo);
        // beq.setBorderPainted(false);

        bdec = new JButton(".");
        bdec.setBounds(200,250,60,40);
        add(bdec); bdec.addActionListener(this);
        bdec.setBackground(Color.orange);
        bdec.setBorder(new LineBorder(Color.BLACK));
        bdec.setFont(fo);
        // bdec.setBorderPainted(false);

        bsign = new JButton("+/-");
        bsign.setBounds(260,250,60,40);
        add(bsign); bsign.addActionListener(this);
        bsign.setFont(fo);
        bsign.setBackground(Color.BLACK);
        bsign.setForeground(Color.WHITE);
        bsign.setBorderPainted(false);

        // 6th ROW

        bsin = new JButton("sin");
        bsin.setBounds(20,290,60,40);
        add(bsin); bsin.addActionListener(this);
        bsin.setFont(fo);
        bsin.setBackground(Color.BLACK);
        bsin.setForeground(Color.WHITE);
        bsin.setBorderPainted(false);

        bcos = new JButton("cos");
        bcos.setBounds(80,290,60,40);
        add(bcos); bcos.addActionListener(this);
        bcos.setFont(fo);
        bcos.setBackground(Color.BLACK);
        bcos.setForeground(Color.WHITE);
        bcos.setBorderPainted(false);

        btan = new JButton("tan");
        btan.setBounds(140,290,60,40);
        add(btan); btan.addActionListener(this);
        btan.setFont(fo);
        btan.setBackground(Color.BLACK);
        btan.setForeground(Color.WHITE);
        btan.setBorderPainted(false);

        blog = new JButton("log");
        blog.setBounds(200,290,60,40);
        add(blog); blog.addActionListener(this);
        blog.setFont(fo);
        blog.setBackground(Color.BLACK);
        blog.setForeground(Color.WHITE);
        blog.setBorderPainted(false);

        brev = new JButton("1/x");
        brev.setBounds(260,290,60,40);
        add(brev); brev.addActionListener(this);
        brev.setFont(fo);
        brev.setBackground(Color.BLACK);
        brev.setForeground(Color.WHITE);
        brev.setBorderPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bclr){
            l.setText("");
            t.setText("");
        }

        if(e.getSource() == bdel){
            String s = t.getText();
            t.setText("");
            for(int i = 0; i<s.length()-1; i++){
                t.setText(t.getText() + s.charAt(i));
            }
        }
        if(e.getSource() == b0){
            t.setText(t.getText().concat("0"));
        }
        
        if(e.getSource() == b1){
            t.setText(t.getText().concat("1"));
        }
        
        if(e.getSource() == b2){
            t.setText(t.getText().concat("2"));
        }
        
        if(e.getSource() == b3){
            t.setText(t.getText().concat("3"));
        }
        
        if(e.getSource() == b4){
            t.setText(t.getText().concat("4"));
        }
        
        if(e.getSource() == b5){
            t.setText(t.getText().concat("5"));
        }
        
        if(e.getSource() == b6){
            t.setText(t.getText().concat("6"));
        }
        
        if(e.getSource() == b7){
            t.setText(t.getText().concat("7"));
        }
        
        if(e.getSource() == b8){
            t.setText(t.getText().concat("8"));
        }
        
        if(e.getSource() == b9){
            t.setText(t.getText().concat("9"));
        }
        
        if(e.getSource() == bdec){
            t.setText(t.getText().concat("."));
        }

        if(e.getSource() == badd){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "+";
            l.setText(str+"+");
            t.setText("");
        }

        if(e.getSource() == bsub){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "-";
            l.setText(str+"-");
            t.setText("");
        }

        if(e.getSource() == bmul){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "*";
            l.setText(str+"x");
            t.setText("");
        }

        if(e.getSource() == bdiv){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "/";
            l.setText(str+"/");
            t.setText("");
        }

        if(e.getSource() == bper){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "%";
            l.setText(str+"%");
            t.setText("");
        }

        if(e.getSource() == bpow){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "^";
            l.setText(str+"^");
            t.setText("");
        }

        if(e.getSource() == bsqrt){
            l.setText("\u221A");
            operator = "\u221A";
            t.setText("");
        }

        if(e.getSource() == bfact){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "!";
            l.setText(str+"!");
            int fact = 1;
            for(int i = 1; i<=num1;i++){
                fact = fact * i;
                }
                    t.setText(Double.toString(fact));
                }
        

        if(e.getSource() == bpi){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            l.setText(str+"\u03C0");
            operator = "\u03C0";
            t.setText("");
        }

        if(e.getSource() == bsign){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "+/-";
            if(num1 > 0){
                l.setText("-"+str);
            }
            t.setText("-"+str);
            num1 = (-1)*(num1);
        }

        if(e.getSource() == brev){
            String str = t.getText();
            num1 = Double.parseDouble(t.getText());
            operator = "1/x";
            l.setText("1/"+str);
            t.setText(Double.toString(1/num1));
        }

        
        if(e.getSource() == bsin){
            l.setText("sin"+"(");
            operator = "sin";
        }
        
        if(e.getSource() == bcos){
            l.setText("cos"+"(");
            operator = "cos";
        }
        
        if(e.getSource() == btan){
            l.setText("tan"+"(");
            operator = "tan";
        }
        
        if(e.getSource() == blog){
            l.setText("log"+"(");
            operator = "log";
        }

        if(e.getSource() == beq){
            // String str = t.getText();
            num2 = Double.parseDouble(t.getText());
            switch (operator){
                case "+": result = num1 + num2;
                break;
                case "-": result = num1 - num2;
                break;
                case "*": result = num1 * num2;
                break;
                case "/": result = num1 / num2;
                break;
                case "%": result = (num1 * num2)/100;
                break;
                case "^": result = Math.pow(num1, num2);
                break;
                case "\u221A": result = Math.sqrt(num2);
                break;
                case "\u03C0": result = num1 * 3.14159 * num2;
                break;
                case "sin": result = Math.sin(num2);
                break; 
                case "cos": result = Math.cos(num2);
                break; 
                case "tan": result = Math.tan(num2);
                break; 
                case "log": result = Math.log(num2);
                break; 
        }
        
            t.setText(Double.toString(result));
            l.setText(l.getText()+num2);
    }
}  
    


    public static void main(String[] args) {
    new projectCalculator();
    } 
}
