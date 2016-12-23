import java.awt.GridLayout;
import static javax.swing.JFrame.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Firsthandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JFrame frm=new JFrame();
		frm.setTitle("订票");
		frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridLayout gridlayout=new GridLayout(2,5);
		frm.setLayout(gridlayout);
	JButton film1=new JButton("电影1");
	frm.getContentPane().add(film1);
	Buttonhandler film1Handler=new Buttonhandler();
	film1.addActionListener(film1Handler);
	JButton film2=new JButton("电影2");
	frm.getContentPane().add(film2);
	Buttonhandler film2Handler=new Buttonhandler();
	film2.addActionListener(film2Handler);
		frm.setBounds(800,400,800,400);
		frm.setVisible(true);
		
	}
}
