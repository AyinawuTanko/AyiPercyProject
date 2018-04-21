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
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;

public class SearchFoodData extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFoodData frame = new SearchFoodData();
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
	public SearchFoodData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchFoodData = new JLabel("SEARCH FOOD DATA");
		lblSearchFoodData.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearchFoodData.setBounds(380, 11, 208, 28);
		contentPane.add(lblSearchFoodData);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 84, 1004, 366);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					

					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					String searchTerm = textField.getText();
					searchTerm = "%"+searchTerm +"%";
					
					String query = "select * from Food where (FoodID like ? OR FoodName like ? OR FoodType like ? \r\n" + 
							"OR Price like ?)";
				
					
					PreparedStatement prt = myConn.prepareStatement(query);
					
					prt.setString(1, searchTerm);
					prt.setString(2, searchTerm);
					prt.setString(3, searchTerm);
					prt.setString(4, searchTerm);
					ResultSet rs = prt.executeQuery();
					
					
					 
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch(Exception e) {
					
					System.out.println(e);
					
				}
			}
		});
		textField.setBounds(305, 41, 351, 32);
		table.setBackground(Color.cyan);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
