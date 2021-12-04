import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
//import javax.swing.JFrame; import javax.swing.JTextArea;

//Note App Version 1.0
// 12-3 Just got a GUI from stackoverflow, trying to understand it, and make desirable changes
public class gijoe{


    public static void main(String args[])
    {
        JFrame f = new JFrame("Notes V1");
        JTextField t1; // uneditable by line 26

        t1 = new JTextField("Welcome to Notes V1");
        JTextArea textArea = new JTextArea(5, 10);
        textArea.setBounds(150,50, 600, 680);
        f.add(textArea);
        textArea.setLineWrap(true);

        t1.setBounds(350,5, 125,30);
        t1.setEditable(false); // makes t1 uneditable
        f.setResizable(true);
        f.add(t1);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);


    }
}

   