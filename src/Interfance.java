import javax.swing.*;
import java.awt.Color; 
import java.awt.GradientPaint; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.*;
import static javax.swing.JFrame.*; 
public class Interfance {
	public static void main(String[] args){
		JFrame frm0=new JFrame();
		frm0.setBackground(Color.RED);     
		frm0.setTitle("��ӰƱϵͳ");
		frm0.setLayout(new BorderLayout());
		frm0.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel centerPanel=new JPanel();
		frm0.getContentPane().add(centerPanel,BorderLayout.CENTER);
		JPanel eastPanel=new JPanel();
		frm0.getContentPane().add(eastPanel,BorderLayout.EAST);
		JPanel westPanel=new JPanel();
		frm0.getContentPane().add(westPanel,BorderLayout.WEST);
		JPanel southPanel=new JPanel();
		frm0.getContentPane().add(southPanel,BorderLayout.SOUTH);
		JPanel northPanel=new JPanel();
		frm0.getContentPane().add(northPanel,BorderLayout.NORTH);
		JLabel label=new JLabel("��ӭ�����ӰƱϵͳ��");
		label.setBounds(5,5,160,80);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("label.jpg"));
		frm0.getContentPane().add(label,BorderLayout.NORTH);
		JLabel label1=new JLabel("����ӰԺ��Ӱʱ��Ϊ0~24");
		label1.setBounds(5,5,80,40);
		label1.setFont(new Font("",Font.BOLD,16));
		label1.setIcon(new ImageIcon("label1.jpg"));
		frm0.getContentPane().add(label1,BorderLayout.CENTER);
		JButton firstbutton=new JButton("�������");
		southPanel.add(firstbutton);
		JButton masterbutton=new JButton("����Ա��½");
		southPanel.add(masterbutton);
		Firsthandler firstbuttonHandler=new Firsthandler();
		firstbutton.addActionListener(firstbuttonHandler);
		Masterregister registerbuttonHandler=new Masterregister();
		masterbutton.addActionListener(registerbuttonHandler);
		frm0.setBounds(400,200,400,200);
		frm0.setVisible(true);
	} 
}
