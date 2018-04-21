package AyinaPercy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;

public class Departments extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departments frame = new Departments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Departments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 496);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchDepartmentsData = new JLabel("SEARCH DEPARTMENTS DATA");
		lblSearchDepartmentsData.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearchDepartmentsData.setBounds(366, 11, 309, 28);
		contentPane.add(lblSearchDepartmentsData);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					

					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					String searchTerm = textField.getText();
					searchTerm = "%"+searchTerm +"%";
					
					String query = "select * from Departments where (DepartmentNumber like ? OR DepartmentName like ? OR staffId like ? )";
				
					
					PreparedStatement prt = myConn.prepareStatement(query);
					
					prt.setString(1, searchTerm);
					prt.setString(2, searchTerm);
					prt.setString(3, searchTerm);
			
					ResultSet rs = prt.executeQuery();
					
					
					 
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch(Exception e) {
					
					System.out.println(e);
					
				}
			}
		});
		textField.setBounds(357, 49, 318, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 92, 996, 354);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.cyan);
	}

}
