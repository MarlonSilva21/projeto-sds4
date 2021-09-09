package com.marlon.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
	

}
