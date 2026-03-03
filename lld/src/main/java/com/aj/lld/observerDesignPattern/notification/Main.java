package com.aj.lld.observerDesignPattern.notification;

public class Main {
	
	public static void main(String [] args) {
		IStockOberservable iphoneTrack= new IphoneStock();
		INotificationObserver notificationObserver = new EmailNotification("Aj.gmail.com",iphoneTrack);
		iphoneTrack.addObserver(notificationObserver);
		iphoneTrack.updateStock(10);
	}

}
