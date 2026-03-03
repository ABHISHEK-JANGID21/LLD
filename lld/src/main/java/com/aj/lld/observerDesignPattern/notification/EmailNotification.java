package com.aj.lld.observerDesignPattern.notification;

public class EmailNotification implements INotificationObserver {
	
	String emailId;
	
	IStockOberservable stockOberservable;
	
	public EmailNotification(String emailId,IStockOberservable sOberservable) {
		this.emailId = emailId;
		this.stockOberservable =sOberservable;
	}

	@Override
	public void update() {
		sendEmail(emailId);
	}
	
	public void sendEmail(String emailId) {
		System.out.println("Hi" + emailId +", This is to inform you that the product you subscribed is available to buy");
	}
	

}
