package com.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.Donor;
import com.training.dao.DonorDAO;

public class DonorDAOImpl implements DonorDAO {

	private Connection con;

	public DonorDAOImpl(Connection con) {

		this.con = con;
	}

	private List<Donor> convertToList(ResultSet rs) throws SQLException {

		List<Donor> donorList = new ArrayList<>();

		while (rs.next()) {

			Donor donor = new Donor();

			donor.setDonorId(rs.getLong("donorId"));
			donor.setDonorName(rs.getString("donorName"));
			donor.setLocation(rs.getString("loc"));
			donor.setBloodType(rs.getString("bloodType"));
			donor.setTimesDonated(rs.getInt("timesDonated"));

			donorList.add(donor);
		}

		return donorList;
	}

	@Override
	public int add(Donor donor) throws SQLException {

		int donorAdded = 0;

		String sql = "insert into hz_blooddonor values (?, ?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setLong(1, donor.getDonorId());
		pstmt.setString(2, donor.getDonorName());
		pstmt.setString(3, donor.getLocation());
		pstmt.setString(4, donor.getBloodType());
		pstmt.setInt(5, donor.getTimesDonated());

		donorAdded = pstmt.executeUpdate();

		return donorAdded;
	}

	@Override
	public int update(Donor donor) throws SQLException {

		int donorUpdated = 0;

		String sql = "update hz_blooddonor set donorName = ?, loc = ?, bloodType = ?, timesDonated = ? where donorId = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, donor.getDonorName());
		pstmt.setString(2, donor.getLocation());
		pstmt.setString(3, donor.getBloodType());
		pstmt.setInt(4, donor.getTimesDonated());
		pstmt.setLong(5, donor.getDonorId());

		donorUpdated = pstmt.executeUpdate();

		return donorUpdated;
	}

	@Override
	public List<Donor> getByLoc(String location) throws SQLException {

		String sql = "SELECT * FROM hz_blooddonor WHERE loc = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, location);

		ResultSet rs = pstmt.executeQuery();

		return convertToList(rs);
	}

	@Override
	public List<Donor> getByType(String bloodType) throws SQLException {

		String sql = "select * from hz_blooddonor where bloodType = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, bloodType);

		ResultSet rs = pstmt.executeQuery();

		return convertToList(rs);
	}

	@Override
	public List<Donor> getByLocAndType(String location, String bloodType) throws SQLException {

		String sql = "select * from hz_blooddonor where bloodType = ? and loc = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, bloodType);
		pstmt.setString(2, location);

		ResultSet rs = pstmt.executeQuery();

		return convertToList(rs);
	}

	@Override
	public List<String> getLocations() throws SQLException {

		List<String> locationList = new ArrayList<>();

		String sql = "select distinct loc from hz_blooddonor";
		PreparedStatement pstmt = con.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			locationList.add(rs.getString("loc"));
		}

		return locationList;
	}

	@Override
	public List<String> getTypeByLoc(String location) throws SQLException {

		List<String> locationList = new ArrayList<>();

		String sql = "select distinct bloodType from hz_blooddonor where loc = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, location);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			locationList.add(rs.getString("bloodType"));
		}

		return locationList;
	}

}
