package Busreserv;
import java.util.*;

public class Busdemo {
	public static void main(String[] args) {
		
		ArrayList <Bus> buses =  new ArrayList<Bus>();
		ArrayList <Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,35));
		buses.add(new Bus(3,true,40));
		
		
		
		
		int UserInpt = 1 ;
		try (Scanner input = new Scanner(System.in)) {
			for(Bus b : buses) {
				b.displayBusInfo();
			}
			
			while(UserInpt == 1 ) {
				System.out.println("Enter 1 to Booking and 2 to Exit");
				UserInpt = input.nextInt();
				if(UserInpt == 1) {
					Booking booking = new Booking();
					if(booking.isAvailable(bookings,buses)) {
						bookings.add(booking);
						System.out.println("Your booking is confirmed !! ");
					}
					else {
						System.out.println("Sorry all were booked please try another date and bus...");
					}
				}
				else {
					System.out.println("Booking exited !");
				}
			}
		}
		
	}

}
