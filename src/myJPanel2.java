import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class myJPanel2 extends JPanel  implements ActionListener , ChangeListener
{
	JButton b2;
        JButton b3;
	student st1;
        myJPanel1 p;
        int age;
        ImageIcon img = new ImageIcon("images/s1.jpg");
        ImageIcon img1 = new ImageIcon("images/s2.jpg");
        ImageIcon img2 = new ImageIcon("images/s3.jpg");
        ImageIcon img3 = new ImageIcon("images/s4.jpg");
        
	public myJPanel2(myJPanel1 informedPanel)
	{
		super();
		//st1 = new student("Fred","Fonseca",44);
                p = informedPanel;
             
		setBackground(Color.pink);
		b2 = new JButton("Student will be shown here." );
                b3 = new JButton();
                
                p.b1.addActionListener(this);
                p.js1.addChangeListener(this);
                age = 35;
		add(b2);
                add(b3);
                b3.setIcon(img3);
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        //p.b1.setText(st1.getInfo());
        //b2.setText(st1.whatsUp());
        
        Object obj = e.getSource();
        
        if (obj == p.b1){
            st1 = new student(p.tf1.getText(),p.tf2.getText(),age);
            b2.setText(st1.getInfo());
            
            b3.setIcon(img3);
            
            if(st1.firstName.equalsIgnoreCase("John")){
                b3.setIcon(img);
            } if(st1.firstName.equalsIgnoreCase("Jess")){
                b3.setIcon(img1);
            } if(st1.firstName.equalsIgnoreCase("Tom")){
                b3.setIcon(img2);
            }
        }
    }
    
    /**
     *
     */
    public void stateChanged(ChangeEvent f){
        
        Object obj = f.getSource();
        if(obj == p.js1){
            int getage = p.js1.getValue();
            age = getage;
            p.tf3.setText(String.valueOf(age));
        }
    }
	
}