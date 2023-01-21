package com.corejava.training.sql.day5;

import java.sql.*;
import java.sql.DriverManager;
import java.util.UUID;

public class JdbcExample {

	public static void main(String[] args) {
		String uid = UUID.randomUUID().toString();
		String[] uArray = uid.split("-");
		insertQuery(uArray[0],"yash","reddy");
		selectQuery();
	}
	public static void selectQuery() {
		// Opening a DB Connection
		try(Connection conn = DriverManager.getConnection(DbConstants.DB_URL, DbConstants.USER, DbConstants.PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(DbConstants.QUERY);){
			//Extracting data from the ResultSet
			while(rs.next()) {
				System.out.print("Id: "+rs.getString("user_id"));
				System.out.print(", First Name: "+rs.getString("first_name"));
				System.out.print(", Last Name: "+rs.getString("last_name") +" \n");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void insertQuery(String id, String fname, String lname) {
		// Opening a DB Connection
		try(Connection conn = DriverManager.getConnection(DbConstants.DB_URL, DbConstants.USER, DbConstants.PASSWORD);
				Statement stmt = conn.createStatement();){
				int count = stmt.executeUpdate("insert into a_user_table values('"+id+"', '"+fname+"','"+lname+"')");
				System.out.println(count);
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
