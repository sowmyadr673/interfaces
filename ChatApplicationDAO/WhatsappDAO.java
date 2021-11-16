package com.xworkz.DB.DAO.ChatApplicationDAO;

public class WhatsappDAO implements ChatApplicationInterface {
	
	public void sendMessage() {
		System.out.println("send message via Whatsapp");
		
	}

	@Override
	public void receiveMessage() {
System.out.println("recive message via Whatsapp");		
	}

	@Override
	public void deleteMessage() {
System.out.println("delete messgage");		
	}
	

}
