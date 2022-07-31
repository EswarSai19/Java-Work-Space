package com.ques2;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	int totalAmount;
	boolean flag=false;
	
	public Ticket(int id, int pr) {
		this.ticketId = id;
		this.price = pr;
	}
	
	
	public void setTicketId(int id) {
		this.ticketId = id;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setAvailableTickets(int ticks) {
		if(ticks<=0) {
			System.out.println("Invalid Available Tickets Entered");
			flag = true;
		}else {
			availableTickets = ticks;
			
		}
		
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	

	public void calculateTicketCost(int nooftickets) {
		availableTickets-= nooftickets;
		totalAmount = nooftickets*price;
		if(!flag) {
			System.out.println("Ticket Id : "+getTicketId());
			System.out.println("Total Amount : "+totalAmount);
			System.out.println("Available ticket after booking : "+getAvailableTickets());
		}	
	}
	
	
}
