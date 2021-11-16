package com.xworkz.DB.DAO.OnlinePaymentDAO;

public class PaymentTester {

	public static void main(String[] args) {

		PaytmDAO pay = new PaytmDAO();
		pay.mobilePayement();
		pay.electricityPayement();
		pay.cardPayement();
		pay.addMoneyToWallet();

	}

}
