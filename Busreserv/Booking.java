package Busreserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Passenger name : ");
		passengerName = input.next();
		System.out.println("Enter Busno : ");
		busNo = input.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = input.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
		date = dateFormat.parse(dateInput);
		}
		catch (ParseException e){
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity =0;
		for(Bus bus : buses) {
			if(bus.getBusNo()== busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked =0;
		for(Booking b : bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
