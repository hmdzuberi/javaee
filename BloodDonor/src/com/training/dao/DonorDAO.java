package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.beans.Donor;

public interface DonorDAO {

	public int add(Donor donor) throws SQLException;

	public int update(Donor donor) throws SQLException;

	public List<Donor> getByLoc(String location) throws SQLException;

	public List<Donor> getByType(String bloodType) throws SQLException;

	public List<Donor> getByLocAndType(String location, String bloodType) throws SQLException;

	public List<String> getLocations() throws SQLException;

	public List<String> getTypeByLoc(String location) throws SQLException;

}
