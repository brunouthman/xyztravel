package com.xyztravel.app;

import com.xyztravel.constants.AmountPerTicketConstants;
import com.xyztravel.constants.BookingClassConstants;

public class RailwayReservation extends Reservation {
	
	String trainName;
	int numberOfTickets;
	String bookingClass;
	
	public RailwayReservation(String category, String customerName, String trainName, int numberOfTickets, String bookingClass) {
		super(category, customerName);
		this.trainName = trainName;
		this.numberOfTickets = numberOfTickets;
		this.bookingClass = bookingClass;		
	}

	public String getTrainName() {
		return trainName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	
	public void calculateAmount() {
		
		int amount=0;
		
		if (bookingClass.equalsIgnoreCase(BookingClassConstants.AC1)) {
		
			amount = numberOfTickets * AmountPerTicketConstants.AC1;
			
		}
		
		if (bookingClass.equalsIgnoreCase(BookingClassConstants.AC2)) {
			
			amount = numberOfTickets * AmountPerTicketConstants.AC2;
			
		}
		
		if (bookingClass.equalsIgnoreCase(BookingClassConstants.AC3)) {
			
			amount = numberOfTickets * AmountPerTicketConstants.AC3;
			
		}
		
		System.out.println("amount : "+amount);
				
	}

}
