import java.awt.*;
import javax.swing.*;

public class myJPanel extends JPanel
{
	public myJPanel()
	{
		super();
		setBackground(Color.gray);
		
		setLayout(new BorderLayout());

		myJPanel1 p1 = new myJPanel1();
		myJPanel2 p2 = new myJPanel2(p1);

		
		add(p1,"North");
		add(p2,"Center");
		
			
		
	}
}