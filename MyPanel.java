import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JFrame {
    MyPanel(){
        this.setTitle("Learning about the Panels");
        this.setSize(720,720);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(true);
        //this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(new Color(60,123,180));
        this.setLayout(null);
        

        //JPanel= aGUI component that function as a container to hold other componenets.
        JPanel panel=new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(0, 0, 250, 250);
        panel.setLayout(new BorderLayout());//set the label to vertically center and horizontally left.
       
        JPanel panel1=new JPanel();
        panel1.setBackground(Color.PINK);
        panel1.setBounds(250, 0, 250, 250);

        JPanel panel2=new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(0, 250, 500, 250);

        JLabel lab=new JLabel();
        lab.setText("HI");
        lab.setVerticalAlignment(JLabel.BOTTOM);
        ImageIcon ig=new ImageIcon("smile.png");
        lab.setIcon(ig);

        panel.add(lab);
        
        this.add(panel);
        this.add(panel1);
        this.add(panel2);
        this.setVisible(true);



    }
}
