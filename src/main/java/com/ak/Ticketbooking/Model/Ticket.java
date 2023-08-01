package com.ak.Ticketbooking.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity									//JPA will create table name as Ticket
@Table(name="Ticket_table")				//@Table is an optional
public class Ticket 
{
	
	// By default every property of the java class is a database column
	// @Column is a optional
	
	//@ID this will create primary key
	//
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)   // Auto generation
	private Integer ticketid;  
	
	@Column(name="Customer_Name")
	private String CustomerName;
	
	@Column(name="Travel_Date")
	private Date travelDate;
	
	@Column(name="Source_Station")
	private String sourceStation;
	
	@Column(name="Destination_Station")
	private String DestinationStation;
	
	private String email;

	public Integer getTicketid() {
		return ticketid;
	}

	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return DestinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		DestinationStation = destinationStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(String customerName, String travelDate, String sourceStation,
			String destinationStation, String email) {
		super();
		
		this.CustomerName = customerName;
		this.travelDate = new Date();
		this.sourceStation = sourceStation;
		this.DestinationStation = destinationStation;
		this.email = email;
	}
	
	public Ticket ()
	{
		
	}

	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", CustomerName=" + CustomerName + ", travelDate=" + travelDate
				+ ", sourceStation=" + sourceStation + ", DestinationStation=" + DestinationStation + ", email=" + email
				+ "]";
	}
	
	
	
}
