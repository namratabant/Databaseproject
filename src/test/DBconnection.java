package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException {
{
		// TODO Auto-generated method stub


		Class.forName("com.mysql.cj.jdbc.Driver");  
		//creating connection between machine and java using ,getconnectionin driver manager class//
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		//givin statement using .createstatement//
		Statement stm = con.createStatement();
		//result can be iterated using .next in while loop//
		ResultSet result = stm.executeQuery("select * from eproduct");
		
		while(result.next()) {
			
			System.out.println(result.getString("name"));
			System.out.println(result.getInt("ID"));
		}
		
		con.close();
		
	} 


}}


