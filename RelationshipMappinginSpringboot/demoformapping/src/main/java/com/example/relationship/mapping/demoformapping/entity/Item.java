package com.example.relationship.mapping.demoformapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemid;

	private String itemname;

	public Item(String name) {
		this.itemname = name;
	}

	public String getName() {
		return itemname;
	}

	public void setName(String itemname) {
		this.itemname = itemname;

	}
//-----------------------------------------------
// hear we making Bidirection OneToOne

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
//	private Customer customer;
//-----------------------------------------------
	// Example for @ManyToOne unidirectional way

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id")
//	private Customer customer;
//----------------------------------------------------

//Example for Bidirectional @ManyToMany
//
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "item")
	private Set<Customer> customer = new HashSet<>();

//-------------------------
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}



	// ---------------------

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

//	public void setCustomer(Customer customer2) {
//		// TODO Auto-generated method stub
//		
//	}

	

}
