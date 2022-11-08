package com.EmployeePayrollDB.java;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollQueryTest {
	@Test
	public void UpdateQueryTest() {
		EmployeePayroll obj = new EmployeePayroll();
		String q = "update employee_payroll set salary = 3000000 where name = 'Tony'";
		Assert.assertEquals(true, EmployeePayroll.CreateConnection(q));
	}

	@Test
	public void CheckUpdateQuery() throws SQLException {
		EmployeePayroll obj = new EmployeePayroll();
		Assert.assertEquals(true, EmployeePayroll.preparedStatement("Tony", 3000000.0));
	}
}