import java.awt.BorderLayout;
import static javax.swing.JFrame.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
public class Buttonhandler implements ActionListener{
public void actionPerformed(ActionEvent e){
	JFrame frm=new JFrame();
	frm.setTitle("订票");
	frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	String[] films={"第一场1~2","第二场2~3","第三场3~4","……","……","……","……"};
	JList list=new JList(films);
	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	list.setFixedCellHeight(20);
	list.setVisibleRowCount(5);
	JScrollPane scrollpane=new JScrollPane();
	scrollpane.setViewportView(list);
	scrollpane.setBounds(30,130,120,120);
	JPanel northPanel=new JPanel();
	frm.getContentPane().add(northPanel,BorderLayout.NORTH);
	northPanel.add(scrollpane);
	JComboBox comboBox=new JComboBox(films);
	comboBox.setEditable(true);
	comboBox.setMaximumRowCount(6);
	comboBox.setBounds(230,130,120,25);
	northPanel.add(comboBox);
	JPanel westPanel=new JPanel();
	JButton backbutton=new JButton("返回");
	frm.getContentPane().add(westPanel,BorderLayout.WEST);
	westPanel.add(backbutton);
	JPanel eastPanel=new JPanel();
	frm.getContentPane().add(eastPanel,BorderLayout.EAST);
	JButton buybutton=new JButton("购买");
	eastPanel.add(buybutton);
	frm.setBounds(400,200,400,200);
	frm.setVisible(true);
}}
