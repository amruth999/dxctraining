package com.org;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
	public static void main(String args[])throws ClassNotFoundException,IOException,SQLException,CreditCardAdminSystemException {
		CreditCardAdminService obj=new CreditCardAdminService();
		if(obj.addCreditCardDetails("inputFeed.txt"))
			System.out.println("Elements addes succesfully");
		else {
			System.out.println("No elements addeed");
		}

		
	}

}
