package com.org;

import java.util.Date;

public class CreditCard {
	public long creditCardNum;
	public String customerName;
	
	public String customerEmail;
	public long customerPhone;
	public long getCreditCardNum() {
		// TODO Auto-generated method stub
		return creditCardNum;
	}
	
	public void setCreditCardNum(long creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(long billAmount) {
		this.billAmount = billAmount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double billAmount;
	public Date dueDate;
	public Date paymentDate;
	public CreditCard(long creditCardNum,String customerName,String customerEmail,long customerPhone,double billAmount,Date dueDate,Date paymentDate) {
		super();
		this.creditCardNum=creditCardNum;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPhone=customerPhone;
		this.billAmount=billAmount;
		this.dueDate=dueDate;
		this.paymentDate=paymentDate;
		
		
		
	}
	

}
