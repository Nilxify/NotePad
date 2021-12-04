import javax.swing.*;
import java.awt.*;

//Note App Version 1.0
// 12-3 Just got a GUI from stackoverflow, trying to understand it, and make desirable changes
public class gui {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Notes V1");
        f.setResizable(false);
        f.setSize(800,800);

        //textArea.setBounds(150,50, 600, 680);
        // This is for top title on gui
        JTextField title1; // uneditable
        title1 = new JTextField("Welcome to Notes V1");
        JPanel panelTop = new JPanel();
        panelTop.add(title1);
        f.add(panelTop, BorderLayout.NORTH);
        title1.setBounds(350,5, 125,30);
        title1.setEditable(false); // makes title1 uneditable

        // areas for writing notes
        JTextArea textArea = new JTextArea(5, 10);
        JPanel panelCenter = new JPanel();
        textArea.setPreferredSize(new Dimension(600,740));
        //textArea.setBounds(150,100, 300, 300);
        panelCenter.add(textArea);
        f.add(panelCenter, BorderLayout.CENTER);
        textArea.setLineWrap(true);


        //one of many buttons, not sure what for at the moment
        JButton buttonIdk = new JButton("IDK Yet");
        JPanel panelWest = new JPanel();
        buttonIdk.setPreferredSize(new Dimension(100,30));
        panelWest.add(buttonIdk);
        f.add(panelWest, BorderLayout.WEST);

        f.setVisible(true);


    }
}


