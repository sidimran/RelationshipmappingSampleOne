package com.example.relationship.mapping.demoformapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add_id")
	private Long addressId;

	private String city;

	private String addressType;

	// example for OneToOne Bi-directional mapping ie employee & address

//	@OneToOne(mappedBy = "address")
//	private Employee employee;
}
