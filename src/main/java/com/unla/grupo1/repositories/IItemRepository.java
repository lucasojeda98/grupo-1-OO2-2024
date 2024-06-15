package com.unla.grupo1.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo1.entities.Item;

@Repository("itemRepository")
public interface IItemRepository extends JpaRepository<Item, Serializable>{

}
