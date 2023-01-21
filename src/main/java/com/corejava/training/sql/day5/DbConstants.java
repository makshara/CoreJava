package com.corejava.training.sql.day5;

public interface DbConstants {
	String DB_URL = "jdbc:oracle:thin:@localhost:1521/orcl.attlocal.net";
	String USER = "db_user as sysdba";
	String PASSWORD = "db_password";
	String QUERY = "SELECT * from A_USER_TABLE";
}
