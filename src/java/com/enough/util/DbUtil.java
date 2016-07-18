package com.enough.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public Connection getCon() throws Exception {
                Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_dorm","root", "root");
                return con;
	}
//	JDBC数据库连接
	public void closeCon(Connection con) throws Exception {
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("no");
			e.printStackTrace();
		}
	}
}
