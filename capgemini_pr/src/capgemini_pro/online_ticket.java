package capgemini_pro;


public class online_ticket 
{
private int ticketId;
private int  noOfSeats;
private String seatName;
private int bookingRef;
private boolean ticketStatus =true;
 private String screenName;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getSeatName() {
	return seatName;
}
public void setSeatName(String seatName) {
	this.seatName = seatName;
}
public int getBookingRef() {
	return bookingRef;
}
public void setBookingRef(int bookingRef) {
	this.bookingRef = bookingRef;
}
public boolean getTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(boolean ticketStatus) {
	this.ticketStatus = ticketStatus;
}
public String getScreenName() {
	return screenName;
}
public void setScreenName(String screenName) {
	this.screenName = screenName;
} 
	
}
