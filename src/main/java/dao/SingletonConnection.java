package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	
	// Creer une propri�t� connection
	private static Connection connection;

	public static Connection getConnection() {
		return connection;
	}
	static {
		try {
			//1. Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connection � la base MYSQL
			connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/DB_CATALOGUE","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
