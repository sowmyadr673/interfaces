package com.xworkz.DB.DAO.ChatApplicationDAO;

public class MessengerDAO implements ChatApplicationInterface {

	@Override
	public void sendMessage() {
		System.out.println("send message via messenger");

	}

	@Override
	public void receiveMessage() {
		System.out.println("recive message via messanger");
	}

	@Override
	public void deleteMessage() {
		System.out.println("delete messgage");
	}

}
