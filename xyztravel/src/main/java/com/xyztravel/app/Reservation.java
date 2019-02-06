package com.xyztravel.app;

import java.util.concurrent.atomic.AtomicInteger;

public class Reservation {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	private int transectionNumber;
	private String category;
	private String customerName;
	
	public Reservation(String category, String customerName) {
		//transectionNumber=0;
		this.category = category;
		this.customerName = customerName;
	}

	public int getTransectionNumber() {
		return transectionNumber=count.incrementAndGet();
	}

	public String getCategory() {
		return category;
	}

	public String getCustomerName() {
		return customerName;
	}
		
	public boolean validateCategory() {
		
		if (category.equalsIgnoreCase("train") || category.equalsIgnoreCase("flight")){
			return true;
		}else {
			return false;
		}
	}

}
