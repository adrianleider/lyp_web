package com.lyp_web.utils;

import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseUtils {
	
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/lypcom_wsfe", "root", "Cerveza_2011");
			return con;
		} catch (Exception ex) {
			System.out.println("Database.getConnection() Error -->"
					+ ex.getMessage());
			return null;
		}
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception ex) {
		}
	}

}
