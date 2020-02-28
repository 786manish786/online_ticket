package capgemini_pro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class infodisplayDao implements tic {
	public void display() {
		ArrayList<online_ticket> ai=new ArrayList<online_ticket>();
		online_ticket ob = new online_ticket();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ticket id");
		ob.setBookingRef(sc.nextInt());
		System.out.println("enter booking ref");
		ob.setTicketId(sc.nextInt());
		System.out.println("enter no of seats");
		ob.setNoOfSeats(sc.nextInt());
		sc.nextLine();
		System.out.println("enter seat name");
		ob.setSeatName(sc.nextLine());
		System.out.println("enter ticket status");
		ob.setTicketStatus(sc.nextBoolean());
		 System.out.println("enter screen name");
		 sc.nextLine();
		ob.setScreenName(sc.nextLine());
		ai.add(ob);
		Iterator it=ai.iterator();
		while(it.hasNext()){
			online_ticket o1=(online_ticket)it.next();
			System.out.println("************************************");
			System.out.println("_________________Ticket_________________");
			System.out.println("ticket id \t "+ ob.getTicketId());
			System.out.println("booking ref \t"+ob.getBookingRef());
			System.out.println("no of seats \t"+ob.getNoOfSeats());
			System.out.println("seat name \t"+ob.getSeatName());
			System.out.println("screen name \t"+ob.getScreenName());
			System.out.println("ticket status \t"+ob.getTicketStatus());
		}	}}	
