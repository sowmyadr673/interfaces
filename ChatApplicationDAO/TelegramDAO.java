package com.xworkz.DB.DAO.ChatApplicationDAO;

public class TelegramDAO implements ChatApplicationInterface{
	
	public void sendMessage() {
		System.out.println("send message via telegram ");
		
	}

	@Override
	public void receiveMessage() {
System.out.println("recive message via telegram");		
	}

	@Override
	public void deleteMessage() {
System.out.println("delete messgage");		
	}
	

}
