package com.ak.Ticketbooking;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ak.Ticketbooking.Model.Ticket;
import com.ak.Ticketbooking.services.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {


	@Autowired
	private TicketService ticketservice;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
		/*
		Ticket ticket=new Ticket();
		ticket.setCustomerName("Ansar");
		ticket.setSourceStation("HX");
		ticket.setDestinationStation("KCG");
		ticket.setEmail("ansar@gmail.com");
		ticket.setTravelDate(new Date());
		ticketservice.createTicket(ticket);
		*/
		
	}

}
