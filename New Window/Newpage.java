package newWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Newpage {
	JFrame myframe= new JFrame();
	JLabel mylabel=new JLabel("Welcome to a new Window");
	Newpage(){
		mylabel.setBounds(0,0,500,100);
		mylabel.setFont(new Font(null,Font.PLAIN,25));
		  
		 myframe.add(mylabel);
		  
		 myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 myframe.setSize(420,420);
		 myframe.setLayout(null);
		 myframe.setVisible(true);
	}
}
