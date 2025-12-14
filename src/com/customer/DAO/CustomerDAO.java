package com.customer.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.banking.util.JDBCConnection;
import com.cutomer.DTO.CustomerDetails;

public class CustomerDAO {
	JDBCConnection jdbcconnection = new JDBCConnection();
	private static final String insert = "insert into customer_details(Customer_Name, Customer_MobileNum, Customer_Gender, Customer_Age, Customer_IFCSCode, Customer_Address)values(?,?,?,?,?,?)";

	public boolean insertCustomerDetails(CustomerDetails customerdetails) {
		try {
			Connection connection = jdbcconnection.mysqlConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(insert);
			preparedstatement.setString(1, customerdetails.getCustomerName());
			preparedstatement.setLong(2, customerdetails.getCustomerMobileNum());
			preparedstatement.setString(3, customerdetails.getCustomerGender());
			preparedstatement.setInt(4, customerdetails.getCustomerAge());
			preparedstatement.setString(5, customerdetails.getCustomerIFCSCode());
			preparedstatement.setString(6, customerdetails.getCustomerAddres());
			int resultset = preparedstatement.executeUpdate();
			if (resultset > 0) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	private static final String select = "select * from customer_details  where Customer_MobileNum=? and  Customer_IFCSCode=?";

	ArrayList<CustomerDetails> list = new ArrayList<CustomerDetails>();

	public ArrayList<CustomerDetails> CustomerLogin(long mobileNum, String IFCSCODE) {
		try {
			Connection connection = jdbcconnection.mysqlConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(select);
			preparedstatement.setLong(1, mobileNum);
			preparedstatement.setString(2, IFCSCODE);
			ResultSet resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				CustomerDetails customerdetails = new CustomerDetails();
				System.out.println("cutomer id:" + resultset.getInt("Customer_Id"));
				System.out.println("customer Name:" + resultset.getString("Customer_Name"));
				System.out.println("customer mobile number:" + resultset.getLong("Customer_MobileNum"));
				System.out.println("customer gender:" + resultset.getString("Customer_Gender"));
				System.out.println("customer age:" + resultset.getInt("Customer_Age"));
				System.out.println("cutomer IFCS Code:" + resultset.getString("Customer_IFCSCode"));
				System.out.println("customer address:" + resultset.getString("Customer_Address"));
				list.add(customerdetails);
			}
			return list;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	private static final String balanceenquiry="select  Customer_balance from customer_details where Customer_Id=? and Customer_MobileNum=? ";

	public void getTheCurrentBalance( int Customer_Id,long Customer_MobileNum ) {
		try {
			Connection connection=jdbcconnection.mysqlConnection();
			PreparedStatement preparedstatement=connection.prepareStatement(balanceenquiry);
			preparedstatement.setInt(1, Customer_Id);
			preparedstatement.setLong(2, Customer_MobileNum);
			ResultSet resultset=preparedstatement.executeQuery();
			if(resultset.next())
			{
				System.out.println("current balance is:"+resultset.getInt("Customer_balance"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		

	}
	private static final String update="update Customer_balance from customer_details set ";
	public void updateCustomerBalance()
	{
		
	}

}
