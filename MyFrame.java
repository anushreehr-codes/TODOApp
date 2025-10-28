import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
    MyFrame() {
       
        this.setTitle("TODO List Application");//sets the title
        // this.setVisible(true);//makes frame visible
       // this.setSize(420,420);//sets the x and y dimension of frame
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exits application when closed
        this.setResizable(true);//prevents frame from being resized
        ImageIcon image= new ImageIcon("TODO.png");//creates an image icon
        this.setIconImage(image.getImage());//change the icon of the frame.
        //this.getContentPane().setBackground(Color.green);//change the background color of the frame
        this.getContentPane().setBackground(new Color(60,123,180));//we can also pass the rgb values to set the background color.
        // we can pass the hexa decimal values inside the rgb as 0x000000/0xFFFFFF.
        
        //add the componenets like label.
        JLabel label=new JLabel();
        label.setText("Complete the java Swing concept ");
       // label.setForeground(Color.MAGENTA);
       label.setForeground(new Color(120,56,89));//set the font color
       label.setFont(new Font("MV Boli",Font.BOLD,12));//set the font text
        label.setHorizontalTextPosition(JLabel.CENTER);//set the text left,center,right of the image icon.
        label.setVerticalTextPosition(JLabel.TOP);//set the text top,center,bottom of the image icon.
        label.setIconTextGap(10);// to set the gap between the text and images and i can also pass the neagtive numbers.
        label.setBackground(Color.GREEN);//set the background color
        label.setOpaque(true);// helps to apply the back ground color
       
        ImageIcon im=new ImageIcon("pic.png");
        Border border = BorderFactory.createLineBorder(new Color(255,0,0),3);//create a border
        label.setIcon(im);
        label.setBorder(border);//set the border to label.
        label.setVerticalAlignment(JLabel.CENTER);//set the vertical alignment of the label(image+text).
        label.setHorizontalAlignment(JLabel.CENTER);//set the horizontal position of the (image+text)within the label.
       // label.setBounds(80, 50, 250, 250);//sets the x axis,y axis and the width and height of the label.

        //this.setLayout(null);//sets the layout to null
        this.add(label);
        this.pack();//size of the frame automatically adjust to the size of the label.
        this.setVisible(true);//makes frame visible
    }
}
