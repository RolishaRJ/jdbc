package com.jdbctask.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbctask.dao.DBConnection;
import com.jdbctask.model.Employee;
import com.jdbctask.service.Service;

public class ServiceImpl implements Service {

	@Override
	public void insert(Employee emplyee) {
		String sql = "insert into employee(Name,Age,Salary,City)values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = DBConnection.getConnection().prepareStatement(sql);

			ps.setString(1, emplyee.getName());
			ps.setInt(2, emplyee.getAge());
			ps.setInt(3, emplyee.getSalary());
			ps.setString(4, emplyee.getCity());
			int rowsInserted = ps.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void updateCity(int employeeId, String city) {
		String sql = "update employee set city = ? where id = ?";
		PreparedStatement ps;
		try {
			ps = DBConnection.getConnection().prepareStatement(sql);

			ps.setString(1, "nagercoil");
			ps.setInt(2, 3);
			int rowsUpdated = ps.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!" + rowsUpdated);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void delte(int employeeId) {
		String sql = "delete from employee where id = ?";
		PreparedStatement ps;
		try {
			ps = DBConnection.getConnection().prepareStatement(sql);

			ps.setInt(1, employeeId);
			int rowsUpdated = ps.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was Delete successfully!" + rowsUpdated);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void fetchAllEmployee() {
		String sql = "select * from employee";
		PreparedStatement ps;
		try {
			ps = DBConnection.getConnection().prepareStatement(sql);

			ResultSet result = (ResultSet) ps.executeQuery();

			while (result.next())
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " "
						+ result.getInt(4) + " " + result.getString(5));

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
