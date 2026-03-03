package com.aj.lld.observerDesignPattern.notification;

public interface IStockOberservable {
	
	public void addObserver(INotificationObserver notificationObserver);
	
	public void removeObserver(INotificationObserver notificationObserver);
	
	public void notification();
	
	public int getStock();
	
	public void updateStock(int count);

}
