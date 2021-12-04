import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
//import javax.swing.JFrame; import javax.swing.JTextArea;

//Note App Version 1.0
// 12-3 Just got a GUI from stackoverflow, trying to understand it, and make desirable changes
public class gijoe{

    public static void main(String[] args) {

        JFrame f = new JFrame("Jose's Notes");
        f.setSize(800, 800);
        f.setResizable(false);
        f.setLocation(300,200);
        final JTextArea textArea = new JTextArea(40, 40);
        f.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Button IDK yet");
        f.getContentPane().add(BorderLayout.SOUTH, button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button was clicked\n");
            }
        });

        f.setVisible(true);

    }

}
