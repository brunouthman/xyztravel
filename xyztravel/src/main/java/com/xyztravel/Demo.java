package com.xyztravel;

import com.xyztravel.app.AirTicketReservation;
import com.xyztravel.app.RailwayReservation;
import com.xyztravel.constants.PrintConstants;

public class Demo {

	public static void main(String[] args) {

		RailwayReservation objRailReservation = new RailwayReservation("train", "ashok", "rajdhani", 2, "AC2");

		AirTicketReservation objAirTicketReservation = new AirTicketReservation("flight", "anjana", "airINDIA", 3,
				"economy");

		// " Invoke corresponding getter methods of the RailwayReservationclass
		// and display the details as follows:
		printText(PrintConstants.TRANSACTION_NUMBER + objRailReservation.getTransectionNumber());
		printText(PrintConstants.TICKET_CATEGORY + objRailReservation.getCategory());
		printText(PrintConstants.CUSTOMER_NAME + objRailReservation.getCustomerName());
		printText(PrintConstants.TRAIN_NAME + objRailReservation.getTrainName());
		printText(PrintConstants.NUMBER_OF_TICKETS + objRailReservation.getNumberOfTickets());

		objRailReservation.calculateAmount();

		// " Invoke corresponding getter methods of the
		// AirTicketReservationclass and display the details as follows:
		printText(PrintConstants.TRANSACTION_NUMBER + objAirTicketReservation.getTransectionNumber());
		printText(PrintConstants.TICKET_CATEGORY + objAirTicketReservation.getCategory());
		printText(PrintConstants.CUSTOMER_NAME + objAirTicketReservation.getCustomerName());
		printText(PrintConstants.FLIGHT_NAME + objAirTicketReservation.getFlightName());
		printText(PrintConstants.NUMBER_OF_TICKETS + objAirTicketReservation.getNumberOfTickets());

		objAirTicketReservation.calculateAmount();
	}

	public static void printText(String text) {
		System.out.println(text);
	}
}
