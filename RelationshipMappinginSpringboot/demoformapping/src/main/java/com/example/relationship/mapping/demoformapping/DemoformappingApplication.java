package com.example.relationship.mapping.demoformapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.relationship.mapping.demoformapping.entity.Customer;
import com.example.relationship.mapping.demoformapping.entity.Item;
import com.example.relationship.mapping.demoformapping.repository.CustomerRepository;
import com.example.relationship.mapping.demoformapping.repository.ItemRepository;

@SpringBootApplication
public class DemoformappingApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoformappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Laptop");

		Item item1 = new Item("Item 1");
		Item item2 = new Item("Item 2");
		Item item3 = new Item("Item 3");

		Set<Customer> customerSet = new HashSet<Customer>();

		customerSet.add(customer);
		
//		customer.setItem(item1);
//		customer.setItem(item2);
		
//		ArrayList<Item> itemList = (ArrayList)customer.getItem();
//
//		itemList.add(item1);
//		customer.getItem().add(item1);
//		customer.getItem().add(item2);
//		customer.getItem().add(item3);

		item1.setCustomer(customerSet);
		item2.setCustomer(customerSet);

		customerRepository.save(customer);

	}

}
