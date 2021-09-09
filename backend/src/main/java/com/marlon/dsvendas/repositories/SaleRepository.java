package com.marlon.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	

}
