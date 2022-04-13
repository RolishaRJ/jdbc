package com.jdbctask.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task", "root", "@Lolita1");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Connected");
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
