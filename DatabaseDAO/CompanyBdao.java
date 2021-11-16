package com.xworkz.DB.DAO.DatabaseDAO;

public class CompanyBdao implements DatabaseInterface {

	@Override
	public void connectDB(String username, String password) {
		System.out.println("Company B Database connected");

	}

	@Override
	public void saveDB(String name, String place) {
		System.out.println("Company B Database saved");

	}

	@Override
	public void updateDB(String name, String place) {
		System.out.println("Company B Database updated");

	}

	@Override
	public void deleteDB(String name) {
		System.out.println("Company B Database deleted");

	}
}
