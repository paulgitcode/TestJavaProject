import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	public myJFrame ()
	{
		super ("My First Frame");
		

  	 	myJPanel mjp = new myJPanel();
    
    	
    	
		getContentPane().add(mjp,"Center");
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (900, 450);
		setVisible(true);
	}

}
