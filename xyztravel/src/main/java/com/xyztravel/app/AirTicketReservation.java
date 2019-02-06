package com.xyztravel.app;

import com.xyztravel.constants.AmountPerTicketConstants;
import com.xyztravel.constants.BookingClassConstants;

public class AirTicketReservation extends Reservation{
	
	String flightName;
	int numberOfTickets;
	String bookingClass;
	
	public AirTicketReservation(String category, String customerName, String flightName, int numberOfTickets,
			String bookingClass) {
		super(category, customerName);
		this.flightName = flightName;
		this.numberOfTickets = numberOfTickets;
		this.bookingClass = bookingClass;
	}

	public String getFlightName() {
		return flightName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void calculateAmount() {
		
		int amount=0;
		
		if (bookingClass.equalsIgnoreCase(BookingClassConstants.BUSINESS)) {
		
			amount = numberOfTickets * AmountPerTicketConstants.BUSINESS;
			
		}
		
		if (bookingClass.equalsIgnoreCase(BookingClassConstants.ECONOMY)) {
			
			amount = numberOfTickets * AmountPerTicketConstants.ECONOMY;
			
		}
				
		System.out.println("amount : "+amount);
				
	}

	

}
