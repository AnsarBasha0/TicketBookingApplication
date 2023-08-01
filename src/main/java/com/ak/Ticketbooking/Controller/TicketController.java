package com.ak.Ticketbooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.Ticketbooking.Model.Ticket;
import com.ak.Ticketbooking.services.TicketService;

@RestController
@RequestMapping(value="/tickets")
public class TicketController 
{
	@Autowired
	private TicketService ticketservice;

	// Retrieve Ticket
	@GetMapping(value="/all")
	public Iterable<Ticket> getTickets()
	{	
		return ticketservice.getAllTickets();
	}

	// Create Ticket
	@PostMapping(value="/Create")
	public Ticket CreateTicket(@RequestBody Ticket ticketobj)
	{	
		return ticketservice.createTicket(ticketobj);
	}

	// Retrieve Particular Ticket

	@GetMapping(value="/{ticketid}")
	public Ticket getTicket(@PathVariable("ticketid") Integer ticketId)
	{	
		return ticketservice.getTicket(ticketId);
	}

	// Update Ticket

	@PutMapping(value="/{ticketid}/{newMail}")
	public Ticket updateTicket(@PathVariable("ticketid") Integer ticketId, @PathVariable("newMail") String newmail)
	{	
		return ticketservice.UpdateTicket(ticketId, newmail);
	}

	// Delete Ticket

	@DeleteMapping(value="/{ticketid}")
	public void deleteTicket(@PathVariable("ticketid") Integer ticketId)
	{	
		ticketservice.deleteTicket(ticketId);
	}

	//Retrieve TIcket by Customer Name

	@GetMapping(value="/{email}") 
	public Iterable<Ticket> getTicket(@PathVariable("email") String email) 
	{
		return ticketservice.findByemail(email);

	}

}
