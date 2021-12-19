package com.example.relationship.mapping.demoformapping.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.mapping.demoformapping.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
