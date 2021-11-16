package com.xworkz.DB.DAO.DatabaseDAO;

public class TesterDatabase {

	public static void main(String[] args) {

		CompanyBdao b = new CompanyBdao();
		b.connectDB("sowmya", "sow12");
		b.saveDB("Sowmya", "tumkur");
		b.updateDB("sowmya D R", "bangalore");
		b.deleteDB("Sowmya D R");

	}

}
