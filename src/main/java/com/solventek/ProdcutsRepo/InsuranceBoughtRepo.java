 package com.solventek.ProdcutsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solventek.ProductsEntities.InsuranceBought;

@Repository
public interface InsuranceBoughtRepo extends JpaRepository<InsuranceBought,Integer> {

}
