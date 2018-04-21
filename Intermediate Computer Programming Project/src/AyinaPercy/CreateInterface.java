package AyinaPercy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Finish.DatabaseInfo;
import Finish.DisplayData;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class CreateInterface {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateInterface window = new CreateInterface();
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
	public CreateInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1035, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFoodId = new JLabel("Food ID");
		lblFoodId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodId.setBounds(23, 66, 60, 19);
		frame.getContentPane().add(lblFoodId);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField.setBounds(93, 65, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFoodName = new JLabel("Food Name");
		lblFoodName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodName.setBounds(23, 105, 74, 14);
		frame.getContentPane().add(lblFoodName);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_1.setBounds(93, 102, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFoodType = new JLabel("Food Type");
		lblFoodType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodType.setBounds(24, 144, 74, 14);
		frame.getContentPane().add(lblFoodType);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_2.setBounds(93, 141, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(23, 185, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		textField_3 = new JTextField();
		textField_3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_3.setBounds(93, 182, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerId.setBounds(189, 68, 86, 14);
		frame.getContentPane().add(lblCustomerId);
		
		textField_4 = new JTextField();
		textField_4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_4.setBounds(270, 65, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(189, 105, 74, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField_5 = new JTextField();
		textField_5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_5.setBounds(270, 102, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(189, 144, 74, 14);
		frame.getContentPane().add(lblLastName);
		
		textField_6 = new JTextField();
		textField_6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_6.setBounds(270, 141, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(189, 185, 60, 14);
		frame.getContentPane().add(lblGender);
		
		textField_7 = new JTextField();
		textField_7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_7.setBounds(270, 182, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblFoodId_1 = new JLabel("Food ID");
		lblFoodId_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodId_1.setBounds(189, 224, 60, 14);
		frame.getContentPane().add(lblFoodId_1);
		
		textField_8 = new JTextField();
		textField_8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_8.setBounds(270, 221, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStaffId.setBounds(358, 68, 55, 14);
		frame.getContentPane().add(lblStaffId);
		
		textField_9 = new JTextField();
		textField_9.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_9.setBounds(423, 65, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblFirstName_1 = new JLabel("First Name");
		lblFirstName_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName_1.setBounds(358, 105, 66, 14);
		frame.getContentPane().add(lblFirstName_1);
		
		textField_10 = new JTextField();
		textField_10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_10.setBounds(423, 102, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName_1.setBounds(358, 144, 66, 14);
		frame.getContentPane().add(lblLastName_1);
		
		textField_11 = new JTextField();
		textField_11.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_11.setBounds(423, 141, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblGender_1 = new JLabel("Gender");
		lblGender_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender_1.setBounds(358, 185, 55, 14);
		frame.getContentPane().add(lblGender_1);
		
		textField_12 = new JTextField();
		textField_12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_12.setBounds(423, 182, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblHireDate = new JLabel("Hire Date");
		lblHireDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHireDate.setBounds(358, 224, 60, 14);
		frame.getContentPane().add(lblHireDate);
		
		textField_13 = new JTextField();
		textField_13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_13.setBounds(423, 221, 86, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblFoodId_2 = new JLabel("Food ID");
		lblFoodId_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodId_2.setBounds(358, 263, 55, 14);
		frame.getContentPane().add(lblFoodId_2);
		
		textField_14 = new JTextField();
		textField_14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_14.setBounds(423, 260, 86, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblCustomerId_1 = new JLabel("Customer ID");
		lblCustomerId_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerId_1.setBounds(344, 303, 80, 14);
		frame.getContentPane().add(lblCustomerId_1);
		
		textField_15 = new JTextField();
		textField_15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_15.setBounds(423, 300, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblDeptNumber = new JLabel("Dept Number");
		lblDeptNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeptNumber.setBounds(512, 68, 86, 14);
		frame.getContentPane().add(lblDeptNumber);
		
		textField_16 = new JTextField();
		textField_16.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_16.setBounds(590, 65, 86, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblDeptName = new JLabel("Dept Name");
		lblDeptName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeptName.setBounds(512, 105, 73, 14);
		frame.getContentPane().add(lblDeptName);
		
		textField_17 = new JTextField();
		textField_17.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_17.setBounds(590, 102, 86, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblStaffId_1 = new JLabel("Staff ID");
		lblStaffId_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStaffId_1.setBounds(513, 144, 60, 14);
		frame.getContentPane().add(lblStaffId_1);
		
		textField_18 = new JTextField();
		textField_18.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_18.setBounds(590, 141, 86, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblSalaryId = new JLabel("Salary ID");
		lblSalaryId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSalaryId.setBounds(677, 68, 60, 14);
		frame.getContentPane().add(lblSalaryId);
		
		textField_19 = new JTextField();
		textField_19.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_19.setBounds(740, 65, 86, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSalary.setBounds(677, 105, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		textField_20 = new JTextField();
		textField_20.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_20.setBounds(740, 102, 86, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblFromdate = new JLabel("FromDate");
		lblFromdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFromdate.setBounds(677, 144, 60, 14);
		frame.getContentPane().add(lblFromdate);
		
		textField_21 = new JTextField();
		textField_21.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_21.setBounds(740, 141, 86, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblToDate = new JLabel("To Date");
		lblToDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblToDate.setBounds(677, 182, 60, 14);
		frame.getContentPane().add(lblToDate);
		
		textField_22 = new JTextField();
		textField_22.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_22.setBounds(740, 182, 86, 20);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblStaffId_2 = new JLabel("Staff ID");
		lblStaffId_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStaffId_2.setBounds(677, 221, 55, 14);
		frame.getContentPane().add(lblStaffId_2);
		
		textField_23 = new JTextField();
		textField_23.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_23.setBounds(740, 221, 86, 20);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblManagerId = new JLabel("Manager ID");
		lblManagerId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblManagerId.setBounds(828, 68, 74, 14);
		frame.getContentPane().add(lblManagerId);
		
		textField_24 = new JTextField();
		textField_24.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_24.setBounds(923, 65, 86, 20);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblFirstName_2 = new JLabel("First Name");
		lblFirstName_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName_2.setBounds(830, 105, 72, 14);
		frame.getContentPane().add(lblFirstName_2);
		
		textField_25 = new JTextField();
		textField_25.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_25.setBounds(923, 102, 86, 20);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblLastName_2 = new JLabel("Last Name");
		lblLastName_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName_2.setBounds(828, 144, 66, 14);
		frame.getContentPane().add(lblLastName_2);
		
		textField_26 = new JTextField();
		textField_26.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_26.setBounds(923, 141, 86, 20);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblHireDate_1 = new JLabel("Hire Date");
		lblHireDate_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHireDate_1.setBounds(828, 185, 60, 14);
		frame.getContentPane().add(lblHireDate_1);
		
		textField_27 = new JTextField();
		textField_27.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_27.setBounds(923, 182, 86, 20);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDob.setBounds(828, 224, 46, 14);
		frame.getContentPane().add(lblDob);
		
		textField_28 = new JTextField();
		textField_28.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_28.setBounds(923, 221, 86, 20);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblExpenditureId = new JLabel("Expenditure ID");
		lblExpenditureId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExpenditureId.setBounds(0, 264, 97, 14);
		frame.getContentPane().add(lblExpenditureId);
		
		textField_29 = new JTextField();
		textField_29.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_29.setBounds(93, 260, 86, 20);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItem.setBounds(0, 304, 46, 14);
		frame.getContentPane().add(lblItem);
		
		textField_30 = new JTextField();
		textField_30.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_30.setBounds(93, 300, 86, 20);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblAmountSpent = new JLabel("Amount Spent");
		lblAmountSpent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmountSpent.setBounds(0, 345, 95, 14);
		frame.getContentPane().add(lblAmountSpent);
		
		textField_31 = new JTextField();
		textField_31.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_31.setBounds(93, 342, 86, 20);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(0, 383, 46, 17);
		frame.getContentPane().add(lblDate);
		
		textField_32 = new JTextField();
		textField_32.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_32.setBounds(93, 381, 86, 20);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);
		
		JLabel lblStaffId_3 = new JLabel("Staff ID");
		lblStaffId_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStaffId_3.setBounds(0, 419, 69, 14);
		frame.getContentPane().add(lblStaffId_3);
		
		textField_33 = new JTextField();
		textField_33.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_33.setBounds(93, 416, 86, 20);
		frame.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.setBackground(Color.GREEN);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String FoodId = textField.getText();
					String FoodName = textField_1.getText();
					String FoodType = textField_2.getText();
					String Price = textField_3.getText();
					
					
					String CustomerID = textField_4.getText();
					String FirstName = textField_5.getText();
					String LastName = textField_6.getText();
					String Gender = textField_7.getText();
					String FoodID = textField_8.getText();
					
					
					String StaffID = textField_9.getText();
					String FName = textField_10.getText();
					String Lname = textField_11.getText();
					String Gender1 = textField_12.getText();
					String HireDate = textField_13.getText();
					String FoodId1 = textField_14.getText();
					String CustomerID1 = textField_15.getText();
					
					
					
					String DeptNum = textField_16.getText();
					String DeptName = textField_17.getText();
					String StaffId = textField_18.getText();
					
					
					
					String SalaryId = textField_19.getText();
					String Salary = textField_20.getText();
					String FromDate = textField_21.getText();
					String ToDate = textField_22.getText();
					String StaffId1 = textField_23.getText();
					
					
					String ManagerID = textField_24.getText();
					String ManagerFname = textField_25.getText();
					String ManagerLname = textField_26.getText();
					String HireDate1 = textField_27.getText();
					String dataOfBirth = textField_28.getText();
					String DepartmentID = textField_34.getText();
					
					
					
					String ExpenditureID = textField_29.getText();
					String Item = textField_30.getText();
					String AmountSpent = textField_31.getText();
					String date = textField_32.getText();
					String StaffId2 = textField_33.getText();
					

					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					PreparedStatement myStmt =myConn.prepareStatement("INSERT INTO Food VALUES "
							+ "(?,?, ?, ?)");
					
					myStmt.setString(1, FoodId);
					myStmt.setString(2, FoodName);
					myStmt.setString(3, FoodType);
					myStmt.setString(4, Price);
					
					myStmt.executeUpdate();
					JOptionPane.showMessageDialog(null,"Data Saved");
					myStmt.close();
					
					
					PreparedStatement myStmt1 =myConn.prepareStatement("INSERT INTO Customers VALUES "
							+ "(?,?, ?, ?,?)");
					
					myStmt1.setString(1, CustomerID);
					myStmt1.setString(2, FirstName);
					myStmt1.setString(3, LastName);
					myStmt1.setString(4, Gender);
					myStmt1.setString(5, FoodID);
					
					myStmt1.executeUpdate();
					myStmt1.close();
					
					
					PreparedStatement myStmt2 =myConn.prepareStatement("INSERT INTO Staff VALUES "
							+ "(?,?, ?, ?,?, ?, ?)");
					
					myStmt2.setString(1, StaffID);
					myStmt2.setString(2, FName);
					myStmt2.setString(3, Lname);
					myStmt2.setString(4, Gender1);
					myStmt2.setString(5, HireDate);
					myStmt2.setString(6, FoodId1);
					myStmt2.setString(7, CustomerID1);
					
					myStmt2.executeUpdate();
					myStmt2.close();
					
					
					PreparedStatement myStmt3 =myConn.prepareStatement("INSERT INTO Departments VALUES "
							+ "(?,?,?)");
					
					myStmt3.setString(1, DeptNum);
					myStmt3.setString(2, DeptName);
					myStmt3.setString(3, StaffId);
					
					myStmt3.executeUpdate();
					myStmt3.close();
					
					
					PreparedStatement myStmt4 =myConn.prepareStatement("INSERT INTO Salaries VALUES "
							+ "(?,?, ?, ?,?)");
					
					myStmt4.setString(1, SalaryId);
					myStmt4.setString(2, Salary);
					myStmt4.setString(3, FromDate);
					myStmt4.setString(4, ToDate);
					myStmt4.setString(5, StaffId1);
					
					myStmt4.executeUpdate();
					myStmt4.close();
					
					
					PreparedStatement myStmt5 =myConn.prepareStatement("INSERT INTO DepartmentManager VALUES "
							+ "(?,?, ?, ?,?, ?)");
					
					myStmt5.setString(1, ManagerID);
					myStmt5.setString(2, ManagerFname);
					myStmt5.setString(3, ManagerLname);
					myStmt5.setString(4, HireDate1);
					myStmt5.setString(5, dataOfBirth);
					myStmt5.setString(6, DepartmentID);
					
					myStmt5.executeUpdate();
					myStmt5.close();
					
					
					PreparedStatement myStmt6 =myConn.prepareStatement("INSERT INTO Expenditure VALUES "
							+ "(?,?, ?, ?,?)");
					
					myStmt6.setString(1, ExpenditureID);
					myStmt6.setString(2, Item);
					myStmt6.setString(3, AmountSpent);
					myStmt6.setString(4, date);
					myStmt6.setString(5, StaffId2);
					
					myStmt6.executeUpdate();
					myStmt6.close();
					
					
				}catch(Exception se) {
					System.out.println(se.toString());
				}finally {textField.setText("");textField_1.setText("");
				textField_2.setText("");textField_3.setText("");textField_4.setText("")
			;textField_5.setText("");textField_6.setText("");textField_7.setText("");textField_8.setText(""); 
			textField_9.setText(""); textField_10.setText(""); textField_11.setText("");
			textField_12.setText(""); textField_13.setText(""); textField_14.setText("");
			textField_15.setText(""); textField_16.setText(""); textField_17.setText("");
			textField_18.setText(""); textField_19.setText(""); textField_20.setText("");
			textField_21.setText(""); textField_22.setText(""); textField_23.setText("");
			textField_24.setText(""); textField_25.setText(""); textField_26.setText("");
			textField_27.setText(""); textField_28.setText(""); textField_29.setText("");
			textField_30.setText(""); textField_31.setText(""); textField_32.setText("");
			textField_33.setText(""); textField_34.setText("");}
			}
		});
		btnInsert.setForeground(Color.BLACK);
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInsert.setBounds(900, 339, 109, 23);
		frame.getContentPane().add(btnInsert);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(Color.cyan);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					PreparedStatement myStmt =myConn.prepareStatement("Update Food set FoodID = '"+textField.getText()+"', FoodName = '"+
					textField_1.getText()+"', FoodType = '"+ textField_2.getText()+"', Price = '"+textField_3.getText()+"' where FoodID =  '"+textField.getText()+"' ");
					
					myStmt.executeUpdate();
					
					JOptionPane.showMessageDialog(null,"Data Updated");
					myStmt.close();
					
					
					
					PreparedStatement myStmt1 =myConn.prepareStatement("Update Customers set CustomerID = '"+textField_4.getText()+"', FirstName = '"+
							textField_5.getText()+"', LastName = '"+ textField_6.getText()+"', Gender = '"+textField_7.getText()+"', foodId = '"+textField_8.getText()+
							"' where CustomerID =  '"+textField_4.getText()+"' ");
							
							myStmt1.executeUpdate();
							myStmt1.close();
							
					
					PreparedStatement myStmt2 =myConn.prepareStatement("Update Staff set StaffID = '"+textField_9.getText()+"', FirstName = '"+
							textField_10.getText()+"', LastName = '"+ textField_11.getText()+"', Gender = '"+textField_12.getText()+"', HireDate = '"+textField_13.getText()+
							"', foodID = '"+textField_14.getText()+"', customerId = '" + textField_15.getText()+"' where StaffID =  '"+textField_9.getText()+"' ");
									
							myStmt2.executeUpdate();
							myStmt2.close();
							
							

					PreparedStatement myStmt3 =myConn.prepareStatement("Update Departments set DepartmentNumber = '"+textField_16.getText()+"', DepartmentName = '"+
							textField_17.getText()+"', staffId = '"+ textField_18.getText()+"' where DepartmentNumber =  '"+textField_16.getText()+"' ");
									
							myStmt3.executeUpdate();
							myStmt3.close();			
							
					
							
					PreparedStatement myStmt4 =myConn.prepareStatement("Update Salaries set SalaryID = '"+textField_19.getText()+"', Salary = '"+
							textField_20.getText()+"', FromDate = '"+ textField_21.getText()+"', ToDate = '"+textField_22.getText()+"', staffID = '"+textField_23.getText()+
							"' where SalaryID =  '"+textField_19.getText()+"' ");
									
							myStmt4.executeUpdate();
							myStmt4.close();
							
							
					PreparedStatement myStmt5 =myConn.prepareStatement("Update DepartmentManager set ManagerID = '"+textField_24.getText()+"', FirstName = '"+
							textField_25.getText()+"', LastName = '"+ textField_26.getText()+"', HireDate = '"+textField_27.getText()+"', DateOfBirth = '"+textField_28.getText()+
							"', DepartmentID = '"+textField_34.getText()+"' where ManagerID =  '"+textField_24.getText()+"' ");
											
							myStmt5.executeUpdate();
							myStmt5.close();
									
							
					PreparedStatement myStmt6 =myConn.prepareStatement("Update Expenditure set ExpenditureID = '"+textField_29.getText()+"', Item = '"+
							textField_30.getText()+"', AmountSpent = '"+ textField_31.getText()+"', ExpenditureDate = '"+textField_32.getText()+"', staffid = '"+textField_33.getText()+
							"' where ExpenditureID =  '"+textField_29.getText()+"' ");
											
							myStmt6.executeUpdate();
							myStmt6.close();
							
							
				}catch(Exception se) {
					System.out.println(se.toString());
				}finally {textField.setText("");textField_1.setText("");
				textField_2.setText("");textField_3.setText("");textField_4.setText("")
			;textField_5.setText("");textField_6.setText("");textField_7.setText("");textField_8.setText(""); 
			textField_9.setText(""); textField_10.setText(""); textField_11.setText("");
			textField_12.setText(""); textField_13.setText(""); textField_14.setText("");
			textField_15.setText(""); textField_16.setText(""); textField_17.setText("");
			textField_18.setText(""); textField_19.setText(""); textField_20.setText("");
			textField_21.setText(""); textField_22.setText(""); textField_23.setText("");
			textField_24.setText(""); textField_25.setText(""); textField_26.setText("");
			textField_27.setText(""); textField_28.setText(""); textField_29.setText("");
			textField_30.setText(""); textField_31.setText(""); textField_32.setText("");
			textField_33.setText(""); textField_34.setText("");}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(900, 378, 109, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/Cafeteria","root","ayinawu1");
					
					PreparedStatement myStmt =myConn.prepareStatement("Delete from Food where FoodID = '"+textField.getText()+"'");
					
					myStmt.executeUpdate();
					
					JOptionPane.showMessageDialog(null,"Data Deleted");
					myStmt.close();
					
					
					PreparedStatement myStmt1 =myConn.prepareStatement("Delete from Customers where CustomerID = '"+textField_4.getText()+"'");
					
					myStmt1.executeUpdate();
					
					myStmt1.close();
					
					
					
					PreparedStatement myStmt2 =myConn.prepareStatement("Delete from Staff where StaffID = '"+textField_9.getText()+"'");
					
					myStmt2.executeUpdate();
					
					myStmt2.close();
					
					
					PreparedStatement myStmt3 =myConn.prepareStatement("Delete from Departments where DepartmentNumber = '"+textField_16.getText()+"'");
					
					myStmt3.executeUpdate();
					
					myStmt3.close();
					
					
					PreparedStatement myStmt4 =myConn.prepareStatement("Delete from Salaries where SalaryID = '"+textField_19.getText()+"'");
					
					myStmt4.executeUpdate();
					
					myStmt4.close();
					
					
					PreparedStatement myStmt5 =myConn.prepareStatement("Delete from DepartmentManager where ManagerID = '"+textField_24.getText()+"'");
					
					myStmt5.executeUpdate();
					
					myStmt5.close();
					
					
					
					PreparedStatement myStmt6 =myConn.prepareStatement("Delete from Expenditure where ExpenditureID = '"+textField_29.getText()+"'");
					
					myStmt6.executeUpdate();
					
					myStmt6.close();
					
				}catch(Exception se) {
					System.out.println(se.toString());
				}finally {textField_4.setText("");textField_9.setText("");
				textField_16.setText("");textField_19.setText("");textField_24.setText("")
				;textField_29.setText("");}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(760, 339, 103, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnView = new JButton("VIEW");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JOptionPane.showMessageDialog(null, "View on next page");
				}catch(Exception se) {
					System.out.println(se.toString());
				}
				
				frame.dispose();
				ViewData view = new ViewData();
				view.setVisible(true);
			}
		});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnView.setBounds(761, 378, 102, 23);
		frame.getContentPane().add(btnView);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.red);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(900, 414, 109, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblDepartmentId = new JLabel("Department ID");
		lblDepartmentId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartmentId.setBounds(828, 263, 95, 14);
		frame.getContentPane().add(lblDepartmentId);
		
		textField_34 = new JTextField();
		textField_34.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textField_34.setBounds(923, 260, 86, 20);
		frame.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		JLabel lblHilltopCafeteria = new JLabel("HILLTOP CAFETERIA");
		lblHilltopCafeteria.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHilltopCafeteria.setBounds(328, 11, 348, 31);
		frame.getContentPane().add(lblHilltopCafeteria);
		
		JButton btnSearchFoodData = new JButton("SEARCH FOOD DATA");
		btnSearchFoodData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					SearchFoodData search = new SearchFoodData();
					search.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchFoodData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchFoodData.setBounds(204, 340, 214, 23);
		frame.getContentPane().add(btnSearchFoodData);
		
		JButton btnSearchCustomerData = new JButton("SEARCH CUSTOMER DATA");
		btnSearchCustomerData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					SearchCustomerData search1 = new SearchCustomerData();
					search1.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchCustomerData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchCustomerData.setBounds(204, 375, 214, 23);
		frame.getContentPane().add(btnSearchCustomerData);
		
		JButton btnSearchStaffTable = new JButton("SEARCH STAFF TABLE");
		btnSearchStaffTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					SearchStaffData search2 = new SearchStaffData();
					search2.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchStaffTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchStaffTable.setBounds(204, 410, 214, 23);
		frame.getContentPane().add(btnSearchStaffTable);
		
		JButton btnSearchDepartmentData = new JButton("SEARCH DEPARTMENT DATA");
		btnSearchDepartmentData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Departments search3 = new Departments();
					search3.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchDepartmentData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchDepartmentData.setBounds(467, 327, 226, 23);
		frame.getContentPane().add(btnSearchDepartmentData);
		
		JButton btnSearchSalaryData = new JButton("SEARCH SALARY DATA");
		btnSearchSalaryData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Salaries search4 = new Salaries();
					search4.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchSalaryData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchSalaryData.setBounds(467, 358, 227, 23);
		frame.getContentPane().add(btnSearchSalaryData);
		
		JButton btnSearchManagerData = new JButton("SEARCH MANAGER DATA");
		btnSearchManagerData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Manager search5 = new Manager();
					search5.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchManagerData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchManagerData.setBounds(467, 387, 226, 23);
		frame.getContentPane().add(btnSearchManagerData);
		
		JButton btnSearchExpenditureData = new JButton("SEARCH EXPENDITURE DATA");
		btnSearchExpenditureData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Expenditure search6 = new Expenditure();
					search6.setVisible(true);
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		});
		btnSearchExpenditureData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchExpenditureData.setBounds(467, 419, 226, 23);
		frame.getContentPane().add(btnSearchExpenditureData);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/anot.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -205, 1019, 649);
		frame.getContentPane().add(lblNewLabel);
		/*
		JLabel label = new JLabel("New label");
		Image img1 = new ImageIcon(this.getClass().getResource("/anot.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		label.setBounds(902, 342, 17, 19);
		frame.getContentPane().add(label);
		*/
	}
}
