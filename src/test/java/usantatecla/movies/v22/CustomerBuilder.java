package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.List;

import usantatecla.movies.v22.Customer;
import usantatecla.movies.v22.Rental;

public class CustomerBuilder {

	private String name;
	private List<Rental> rentals;
	
	public CustomerBuilder() {
		rentals = new ArrayList<Rental>();
	}
	
	public CustomerBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public CustomerBuilder rental(Rental rental) {
		rentals.add(rental);
		return this;
	}
	
	public Customer build() {
		Customer customer = new Customer(name);
		for(Rental rental : rentals) {
			customer.addRental(rental);
		}
		return customer;
	}
}
