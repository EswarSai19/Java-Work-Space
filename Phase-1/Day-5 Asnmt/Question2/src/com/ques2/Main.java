package com.ques2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Ticket Id : ");
		int id = scan.nextInt();
		System.out.println("Enter num of bookings");
		int totalMembers = scan.nextInt();
		System.out.println("Enter Price of Ticket");
		int price = scan.nextInt();
		System.out.println("Enter Available Tickets");
		int avbTic = scan.nextInt();
		Ticket tic1 = new Ticket(id,price);
		
		tic1.setAvailableTickets(avbTic);
		System.out.println("Available Tickets : "+tic1.getAvailableTickets());
		tic1.calculateTicketCost(totalMembers);
		
	}
}
