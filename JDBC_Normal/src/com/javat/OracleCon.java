package com.javat;

import java.sql.*;

class OracleCon {
	public static void main(String args[]) {
		// Select Statement
		/*
		 * try { Class.forName("oracle.jdbc.driver.OracleDriver");
		 * 
		 * Connection con =
		 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
		 * "root");
		 * 
		 * Statement stmt = con.createStatement();
		 * 
		 * ResultSet rs = stmt.executeQuery("select * from emp"); while (rs.next())
		 * System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " +
		 * rs.getString(3));
		 * 
		 * con.close();
		 * 
		 * } catch (Exception e) { System.out.println(e); }
		 */
		// Fetch Record
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from emp");

			// getting the record of 3rd row
			rs.absolute(3);
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
		// Insert Statement
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe","system","root");

			PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?)");
			stmt.setInt(1,101);//1 specifies the first parameter in the query
			stmt.setString(2, "Ratan");

			int i=stmt.executeUpdate();
			System.out.println(i+" records inserted");

			con.close();

			}catch(Exception e){ System.out.println(e);}
	}
}