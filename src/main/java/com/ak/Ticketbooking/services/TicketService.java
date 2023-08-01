package com.ak.Ticketbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ak.Ticketbooking.DAO.TicketDAO;
import com.ak.Ticketbooking.Model.Ticket;

@Service
public class TicketService 
{	
	@Autowired
	private TicketDAO ticketdao;

	// Create Ticket

	public Ticket createTicket(Ticket ticketObj)

	{
		return ticketdao.save(ticketObj);

	}

	// Retrieve Ticket

	public Iterable<Ticket> getAllTickets()
	{
		return ticketdao.findAll();

	}

	// Retrieve Particular Ticket

	public Ticket getTicket(Integer ticketid)
	{
		return ticketdao.findById(ticketid).orElse(new Ticket());

	}
	

	// Update Ticket

	public Ticket UpdateTicket(Integer ticketid,String Email)
	{
		Ticket dbticketObject=getTicket(ticketid);
		dbticketObject.setEmail(Email);
		return ticketdao.save(dbticketObject);

	}

	// Delete Ticket
	
	public void deleteTicket(Integer ticketid)
	{
	 ticketdao.deleteById(ticketid);

	}
	
	//get Ticket by name

	
	  public Iterable<Ticket> findByemail(String email) 
	  { 
		  return ticketdao.findByemail(email);
	  
	  }
	 
	

}
