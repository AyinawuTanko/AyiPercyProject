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

public class Salaries extends JFrame {

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
					Salaries frame = new Salaries();
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
	public Salaries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchSalaryData = new JLabel("SEARCH SALARY DATA");
		lblSearchSalaryData.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearchSalaryData.setBounds(371, 11, 263, 25);
		contentPane.add(lblSearchSalaryData);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				try {
					

					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					String searchTerm = textField.getText();
					searchTerm = "%"+searchTerm +"%";
					
					String query = "select * from Salaries where (SalaryID like ? OR Salary like ? OR FromDate like ? OR ToDate like ? OR "
							+ "staffID like ?)";
				
					
					PreparedStatement prt = myConn.prepareStatement(query);
					
					prt.setString(1, searchTerm);
					prt.setString(2, searchTerm);
					prt.setString(3, searchTerm);
					prt.setString(4, searchTerm);
					prt.setString(5, searchTerm);
			
					ResultSet rs = prt.executeQuery();
					
					
					 
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch(Exception e) {
					
					System.out.println(e);
					
				}
			}
		});
		textField.setBounds(357, 41, 258, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 84, 1002, 354);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.cyan);
	}

}
