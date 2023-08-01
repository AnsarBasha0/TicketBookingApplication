package com.ak.Ticketbooking.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ak.Ticketbooking.Model.Ticket;

@Repository
public interface TicketDAO extends CrudRepository<Ticket,Integer>
{
		
	// Derived method
	// filter with name
	public Iterable<Ticket> findByemail(String email);
	
	
	
}
