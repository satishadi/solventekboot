package com.solventek.ProdcutsRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solventek.ProductsEntities.Insurance;

public interface ProductsRepo  extends JpaRepository<Insurance,Integer>{

}
