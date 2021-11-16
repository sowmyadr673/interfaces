package com.xworkz.DB.DAO.ChatApplicationDAO;

public class Tester {

	public static void main(String[] args) {
		WhatsappDAO whatsapp = new WhatsappDAO();
		whatsapp.sendMessage();
		whatsapp.receiveMessage();
		whatsapp.deleteMessage();
	}
}