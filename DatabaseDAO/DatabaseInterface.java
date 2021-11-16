package com.xworkz.DB.DAO.DatabaseDAO;

public interface DatabaseInterface {

	public void connectDB(String username, String password);

	public void saveDB(String name, String place);

	public void updateDB(String name, String place);

	public void deleteDB(String name);
}
