package AyinaPercy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ViewData extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewData frame = new ViewData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JButton btnViewCustomersTable;
	private JScrollPane scrollPane;
	private JButton btnViewDepartmentData;
	private JButton btnNewButton;
	private JButton btnViewManagersData;
	private JButton btnNewButton_1;
	private JButton btnExit;

	/**
	 * Create the frame.
	 */
	public ViewData() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
			}catch(Exception e) {
				System.out.println(e.toString());
			
			}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.blue);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(259, 24, 746, 398);
		contentPane.add(scrollPane);
		
	
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.white);
		
		JButton btnLoadFoodData = new JButton("View Food Data");
		btnLoadFoodData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Food";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
					
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnLoadFoodData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLoadFoodData.setBounds(10, 24, 248, 33);
		contentPane.add(btnLoadFoodData);
		
		btnViewCustomersTable = new JButton("View Customer Data");
		btnViewCustomersTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Customers";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnViewCustomersTable.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewCustomersTable.setBounds(10, 83, 248, 33);
		contentPane.add(btnViewCustomersTable);
		
		JButton btnViewStaffData = new JButton("View Staff Data");
		btnViewStaffData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Staff";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnViewStaffData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewStaffData.setBounds(10, 144, 248, 33);
		contentPane.add(btnViewStaffData);
		
		btnViewDepartmentData = new JButton("View Department Data");
		btnViewDepartmentData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Departments";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnViewDepartmentData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewDepartmentData.setBounds(10, 205, 248, 33);
		contentPane.add(btnViewDepartmentData);
		
		btnNewButton = new JButton("View Salaries Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Salaries";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 270, 248, 33);
		contentPane.add(btnNewButton);
		
		btnViewManagersData = new JButton("View Managers Data");
		btnViewManagersData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from DepartmentManager";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnViewManagersData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewManagersData.setBounds(10, 330, 248, 33);
		contentPane.add(btnViewManagersData);
		
		btnNewButton_1 = new JButton("View Expenditure Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Expenditure";
					PreparedStatement pre = connection.prepareStatement(query);
					ResultSet re = pre.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(10, 392, 248, 33);
		contentPane.add(btnNewButton_1);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(916, 424, 89, 23);
		contentPane.add(btnExit);
	}
}
