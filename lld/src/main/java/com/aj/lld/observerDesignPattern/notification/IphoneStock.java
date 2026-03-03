package com.aj.lld.observerDesignPattern.notification;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements IStockOberservable {
	
	List<INotificationObserver> notificationObserverList = new ArrayList<>();
	
	int noOfProducts =0;

	@Override
	public void addObserver(INotificationObserver notificationObserver) {
		 notificationObserverList.add(notificationObserver);

	}

	@Override
	public void removeObserver(INotificationObserver notificationObserver) {
		notificationObserverList.remove(notificationObserver);

	}

	@Override
	public void notification() {
		for(INotificationObserver n: notificationObserverList) {
			n.update();
		}

	}

	@Override
	public int getStock() {
		return noOfProducts;
	}

	@Override
	public void updateStock(int count) {
		if(noOfProducts==0) {
			noOfProducts =count;
			notification();
		}
		else {
			noOfProducts += count;
		}
	}

}
