import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.*; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Master implements ActionListener{
	public void actionPerformed(ActionEvent e){
	   String masterpassword=new String("password");
		//ȱһ�λ�ȡMasterregister���е�������е�ֵ��
		
		JFrame frm=new JFrame();
		frm.setTitle("����Ա����");
		frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JButton addbutton=new JButton("��ӵ�ӰƱ");
		JButton deletebutton=new JButton("ɾ����ӰƱ");
		JLabel label1=new JLabel("��Ӱ����:");
		JLabel label2=new JLabel("��Ӱ����:");
		JLabel label3=new JLabel("��Ӱ�۸�:");
		JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.NORTH);
		JPanel centerPanel=new JPanel();
		frm.getContentPane().add(centerPanel,BorderLayout.CENTER);
		JPanel bottomPanel=new JPanel();
		frm.getContentPane().add(bottomPanel,BorderLayout.SOUTH);
		JTextField input1=new JTextField();
		input1.setEditable(true);
		input1.setHorizontalAlignment(SwingConstants.LEFT);
		input1.setColumns(25);
		topPanel.add(label1);
		topPanel.add(input1);
		centerPanel.add(label2);
		JTextField input2=new JTextField();
		input2.setEditable(true);
		input2.setHorizontalAlignment(SwingConstants.LEFT);
		input2.setColumns(25);
		centerPanel.add(input2);
		JTextField input3=new JTextField();
		input3.setEditable(true);
		input3.setHorizontalAlignment(SwingConstants.LEFT);
		input3.setColumns(25);
		centerPanel.add(label3);
	    centerPanel.add(input3);
		bottomPanel.add(addbutton);
		bottomPanel.add(deletebutton);
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
		
	}
}

