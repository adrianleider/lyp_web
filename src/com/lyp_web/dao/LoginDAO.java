package com.lyp_web.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyp_web.utils.DatabaseUtils;

public class LoginDAO {
	
	
	public static BigDecimal validate(String user, String password) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DatabaseUtils.getConnection();
			ps = con.prepareStatement("Select cliweb from sec_users where login = ? and pswd = md5(?)");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				
				return rs.getBigDecimal("cliweb");
			}
			
			DatabaseUtils.close(con);	
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return new BigDecimal(-1);
		} finally {
			DatabaseUtils.close(con);
		}
		return new BigDecimal(-1);
	}

}
