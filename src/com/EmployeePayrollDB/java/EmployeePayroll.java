package com.EmployeePayrollDB.java;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeePayroll {

	public static void CreatConnection() {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root");
			String Select = "select * from employee_payroll";
			PreparedStatement ps = con.prepareStatement(Select);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				String name = res.getString(2);
				Double salary = res.getDouble(4);
				System.out.println("Name -" + name + "|" + "salary -"+salary);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws SQLException {
		CreatConnection();
	}
}