package com.example.relationship.mapping.demoformapping.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Integer id;

	private String empName;
	private Integer empAge;

	// ---------------------------------------------------------------------------------------
	// Eample for OneToOne mapping uniDirectional
	// by default if you dont use @joinColumn, it will generate address_add_id

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId", referencedColumnName = "add_id")
	private Address address;

	// ---------------------------------------------------------------------------------------

	 //Example for OneToMany unidirectional
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
//	private List<Address> address;
}
