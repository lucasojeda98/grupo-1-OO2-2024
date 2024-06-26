package com.unla.grupo1.repositories;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.grupo1.entities.OrdenCompra;

@Repository("ordenCompraRepository")
public interface IOrdenCompraRepository extends JpaRepository<OrdenCompra, Serializable>{

	 
}
