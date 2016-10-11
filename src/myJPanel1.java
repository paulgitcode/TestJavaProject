import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanel1 extends JPanel
{
	JButton b1;
        JButton b2;
        JTextField tf1;
        JTextField tf2;
        JSlider js1;
        JLabel fname;
        JLabel lname;
        JLabel lage;
        JLabel sage;
        JTextField tf3;
        
        
	public myJPanel1()
	{
		super();
		setBackground(Color.gray);
		
                tf1 = new JTextField(10);
                fname = new JLabel("First Name: ");
                tf2= new JTextField(10);
                tf3 = new JTextField(5);
                lname = new JLabel("Last Name: ");
                lage = new JLabel("Age: ");
                sage = new JLabel("Selected Age: ");
                b1 = new JButton("OK");
                js1 = new JSlider(JSlider.HORIZONTAL,0,70,35);
                js1.setMajorTickSpacing(10);
                js1.setMinorTickSpacing(1);
                js1.setPaintTicks(true);
                js1.setPaintLabels(true);
                
                
		add(fname);
                add(tf1);
                add(lname);
                add(tf2);
                add(lage);
                add(js1);
                add(sage);
                add(tf3);
                add(b1);
		}


		
}