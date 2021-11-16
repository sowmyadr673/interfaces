package com.xworkz.DB.DAO.RailwayDeptDAO;

public class IxigoDAO implements TrainReservationInterface {

	
	@Override
	public void travel(String source, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Train start from" + source + "to" + destination);

	}

	@Override
	public void ticketBooking(int NoOfSeats) {
		// TODO Auto-generated method stub
		System.out.println("ticket booked in ixigo");
	}

	public void travelDuration() {
		System.out.println("travel duration is 6 hours");
	}

	public void SeatConfirmation() {
		System.out.println("seat is confirmed in ixigo");
	}
}
