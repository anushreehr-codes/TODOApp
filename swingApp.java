import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class swingApp {
    public static void main(String[] args)
    {
        // JFrame frame = new JFrame();//creates the frame
        //MyFrame frame=new MyFrame();
        // JLabel label = new JLabel();//create the label
        // label.setText("Complete the java Swing concept ");//set the text of label.
        //label.setForeground(new Color(255,255,255));//set the color of text
        // frame.add(label);//add label to frame
        // frame.revalidate();
        // frame.repaint();
        //these above two forces the frameto redraw withe new label.

        MyPanel p=new MyPanel();
    }  
}
