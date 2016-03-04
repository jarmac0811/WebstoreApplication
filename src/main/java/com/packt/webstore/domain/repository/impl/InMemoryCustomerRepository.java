package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	List<Customer> listOfCustomers=new ArrayList<Customer>();
	InMemoryCustomerRepository(){
		Customer customer1=new Customer();
		customer1.setCustomerId(1);
		customer1.setName("Alan Pardew");
		customer1.setAddress("Kensington Road 202, Albany 03-234");
		customer1.setNoOfOrdersMade(0);
		Customer customer2=new Customer();
		customer2.setCustomerId(1);
		customer2.setName("John Kahn");
		customer2.setAddress("Obituary Road 156, Glasgow 06-184");
		customer2.setNoOfOrdersMade(0);
		Customer customer3=new Customer();
		customer3.setCustomerId(1);
		customer3.setName("Andrew Houston");
		customer3.setAddress("Picadilly Road 110, Hounslow 07-344");
		customer3.setNoOfOrdersMade(0);
		listOfCustomers.add(customer1);
		listOfCustomers.add(customer2);
		listOfCustomers.add(customer3);
	}
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
