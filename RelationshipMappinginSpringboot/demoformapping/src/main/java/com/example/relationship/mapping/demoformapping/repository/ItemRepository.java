package com.example.relationship.mapping.demoformapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.mapping.demoformapping.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
