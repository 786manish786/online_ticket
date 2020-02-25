package online_movie_ticket;

import java.util.Scanner;

public class ticket1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
System.out.println("enter no of seats");
int noOfSeats =sc.nextInt();
System.out.println("enter seatname");
String seatName = sc.nextLine();
System.out.println("enter booking referemnce");
int bookingRef = sc.nextInt();
System.out.println("enter ticketstatus");
boolean ticketStatus = sc.nextBoolean();
System.out.println("enter screenname");
String screenname =sc.nextLine();
	}

}
