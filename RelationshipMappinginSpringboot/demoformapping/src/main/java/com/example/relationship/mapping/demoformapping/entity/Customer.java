package com.example.relationship.mapping.demoformapping.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "customer")
public class Customer {

	// Unidirectional , we can also make Bidirection way by giving mapping
	// annotation in Item class

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;

	public Customer(String name) {
		this.name = name;
	}
	// Example for OneToOne Mapping
//	@OneToOne(cascade = CascadeType.ALL, targetEntity = Item.class)
//	@JoinColumn(name ="itemid")
//	private Item item;
//-----------------------------------------------------------------------------------------------
	// Example for create a table, ie it will create a table (customer_item) in
	// that, column name are id & itemid

//	@OneToOne(cascade = CascadeType.ALL, targetEntity = Item.class)
//	@JoinTable(name = "customer_item", joinColumns = { @JoinColumn(name = "idu") }, inverseJoinColumns = {
//			@JoinColumn(referencedColumnName = "itemid") })
//	private Item item;

	// -----------------------------------------------------------------------------------------------
	// example for @OneToMany
//	@OneToMany(cascade = CascadeType.ALL, targetEntity = Item.class)
//	@JoinColumn(name ="customer_id")
//	private List<Item> item;

	// -----------------------------------------------------------------------------------------------

	// example for oneToMany Bidirectional way, because in Item entity I have
	// mappedBy customer_id

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
//	private List<Item> item = new ArrayList<>();

	// -----------------------------------------------------------------------------------------------

	// Example for @ManyToMany Uni-directional it is define only in Customer class,
	// when you work with ManyToMany you shld use Set
	// instead List. first

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_item", joinColumns = { @JoinColumn(name = "customer_fk") }, inverseJoinColumns = {
			@JoinColumn(referencedColumnName = "itemid") })
	private Set<Item> item = new HashSet<>();

	// -----------------------------------------------------------------------------------------------

//	public Item getItem() {
//		return item;
//	}
//
//	public void setItem(Item item) {
//		this.item = item;
//	}
	// -----------------------------------------------------------------------------------------------
//	public List<Item> getItem() {
//		return item;
//	}
//
//	public void setItem(List<Item> item) {
//		this.item = item;
//	}
 //----------------------------------------------------------------------
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
	


}
