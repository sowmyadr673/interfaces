package com.xworkz.DB.DAO.OnlinePaymentDAO;

public class PaytmDAO implements OnlineTransactionInterface{

	public void mobilePayement() {
		System.out.println("Mobile bill paid via Paytm");

	}

	public void electricityPayement() {
		System.out.println("Electricity bill paid via Paytm");

	}

	public void cardPayement() {
		System.out.println("Card bill paid via Paytm");

	}

	public void addMoneyToWallet() {
		System.out.println("Add money to phone Paytm wallet");
	}

}
