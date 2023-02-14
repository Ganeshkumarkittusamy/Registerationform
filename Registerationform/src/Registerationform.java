import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import net.proteanit.sql.DbUtils;

public class Registerationform {

	private JFrame frame;
	private JTextField FtextField;
	private JTextField LtextField;
	private JTextField EtextField;
	private JTextField PtextField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerationform window = new Registerationform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registerationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 255, 102));
		frame.setBounds(100, 100, 937, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration Form");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel.setBounds(338, 10, 204, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(0, 0, 153));
		lblFirstName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblFirstName.setBounds(27, 61, 100, 29);
		frame.getContentPane().add(lblFirstName);
		
		FtextField = new JTextField();
		FtextField.setBounds(168, 66, 141, 23);
		frame.getContentPane().add(FtextField);
		FtextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(0, 0, 153));
		lblLastName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblLastName.setBounds(491, 61, 100, 29);
		frame.getContentPane().add(lblLastName);
		
		LtextField = new JTextField();
		LtextField.setColumns(10);
		LtextField.setBounds(647, 66, 141, 23);
		frame.getContentPane().add(LtextField);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(0, 0, 153));
		lblGender.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblGender.setBounds(27, 127, 100, 29);
		frame.getContentPane().add(lblGender);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(168, 133, 141, 21);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.setSelectedItem(null);
		
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(0, 0, 153));
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblEmail.setBounds(491, 127, 100, 29);
		frame.getContentPane().add(lblEmail);
		
		EtextField = new JTextField();
		EtextField.setColumns(10);
		EtextField.setBounds(647, 132, 141, 23);
		frame.getContentPane().add(EtextField);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(0, 0, 153));
		lblPhoneNumber.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblPhoneNumber.setBounds(27, 187, 127, 29);
		frame.getContentPane().add(lblPhoneNumber);
		
		PtextField = new JTextField();
		PtextField.setColumns(10);
		PtextField.setBounds(168, 194, 141, 23);
		frame.getContentPane().add(PtextField);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(new Color(0, 0, 153));
		lblState.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblState.setBounds(491, 187, 100, 29);
		frame.getContentPane().add(lblState);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(647, 193, 141, 21);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Andhra pradesh");
		comboBox_1.addItem("Bihar");
		comboBox_1.addItem("Chhattisgarh");
		comboBox_1.addItem("Goa");
		comboBox_1.addItem("Haryana");
		comboBox_1.addItem("Jharkhand");
		comboBox_1.addItem("Karnataka");
		comboBox_1.addItem("Kerala");
		comboBox_1.addItem("Odisha");
		comboBox_1.addItem("TamilNadu");
		comboBox_1.addItem("Odisha");
		comboBox_1.addItem("West Bengal");
		comboBox_1.setSelectedItem(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Fname=FtextField.getText();
				String Lname=LtextField.getText();
				String ComboBox=comboBox.getSelectedItem().toString();
				String Ename=EtextField.getText();
				String Phone=PtextField.getText();
				String ComboBox1=comboBox_1.getSelectedItem().toString();
				if(Fname.equals("")) {
					JOptionPane.showMessageDialog(null, "please the first name");
				}
				if(Lname.equals("")) {
					JOptionPane.showMessageDialog(null, "please the last name");
				}
				if(Ename.equals("")) {
					JOptionPane.showMessageDialog(null, "please the Email");
				}
				if(Phone.equals("")) {
					JOptionPane.showMessageDialog(null, "please the Phone");
				}
				else {
					JOptionPane.showMessageDialog(null, "Successfully");
					Connection con=null;
					Statement stmt=null;
					
					try {
						 
                        	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration", "root", "123456789");
                        	 System.out.println("DB connected");

                        	 stmt=con.createStatement();
                        	 String sql="insert into registerationform values ('"+Fname+"','"+Lname+"','"+ComboBox+"','"+Ename+"','"+Phone+"','"+ComboBox1+"')";

                        	 int addrow=stmt.executeUpdate(sql);
                        	 
                        	 
                        	 
                        	 
                        			
					}
					catch(Exception ee) {
						System.out.println(ee);
						FtextField.setText(null);
						LtextField.setText(null);
						PtextField.setText(null);
						EtextField.setText(null);
						comboBox.setSelectedItem(null);
						comboBox_1.setSelectedItem(null);
					}
					try {
					String  open="select * from registerationform";
               	 PreparedStatement pst=con.prepareStatement(open);
               	 ResultSet rs=pst.executeQuery();
               	 table_1.setModel(DbUtils.resultSetToTableModel(rs));
					}
					catch(Exception ee) {
						System.out.print(ee);
					}
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(271, 248, 127, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FtextField.setText(null);
				LtextField.setText(null);
				PtextField.setText(null);
				EtextField.setText(null);
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
			}
		});
		btnCancel.setForeground(new Color(0, 0, 153));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnCancel.setBounds(482, 248, 127, 21);
		frame.getContentPane().add(btnCancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 292, 766, 217);
		frame.getContentPane().add(scrollPane);
		String columnNames[]={"FirstName","LastName","Gender","Email","Phone","State"};
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		
		
	}
}
