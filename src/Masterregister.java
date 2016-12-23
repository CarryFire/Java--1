import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static javax.swing.JFrame.*; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Masterregister implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JFrame frm=new JFrame();
		frm.setTitle("¹ÜÀíÔ±µÇÂ½");
		frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JLabel label=new JLabel("ÃÜÂë£º");
		JButton registerbutton=new JButton("µÇÂ½");
		JPanel eastPanel=new JPanel();
		frm.getContentPane().add(eastPanel,BorderLayout.EAST);
		JPanel westPanel=new JPanel();
		frm.getContentPane().add(westPanel,BorderLayout.WEST);
		JPanel bottomPanel=new JPanel();
		frm.getContentPane().add(bottomPanel,BorderLayout.SOUTH);
		 JPasswordField pwdText=new JPasswordField(10);
				pwdText.setBounds(0,0,120,30);
		eastPanel.add(pwdText);
		westPanel.add(label);
		bottomPanel.add(registerbutton);
			Master masterhandler=new Master();
			registerbutton.addActionListener(masterhandler);
		frm.setBounds(200,100,200,100);
		frm.setVisible(true);
	}
	}