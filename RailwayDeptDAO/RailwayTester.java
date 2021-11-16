package com.xworkz.DB.DAO.RailwayDeptDAO;

public class RailwayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndianRailwayDAO ir=new IndianRailwayDAO();
		ir.travel("bangalore", "mantralayam");
		ir.ticketBooking(5);
		ir.travelDuration();
		ir.SeatConfirmation();
	}

}
