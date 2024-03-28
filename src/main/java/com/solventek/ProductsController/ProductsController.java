package com.solventek.ProductsController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solventek.ProdcutsRepo.ProductsRepo;
import com.solventek.ProductsEntities.Insurance;

@RestController
@RequestMapping("/products")

public class ProductsController {

	
	@Autowired
	ProductsRepo productsRepo;
	
	@PostMapping("/add")
	public ResponseEntity<String> createInsurance(@RequestBody Insurance insurance) {
		
		productsRepo.save(insurance);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Insurance>>  getInsurance() {
	List<Insurance> list=	productsRepo.findAll();
	
	return new ResponseEntity<List<Insurance>>(list,HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Insurance> updateInsurace(@RequestBody Insurance insurance){
		 int id =insurance.getInsuranceId();
		 System.out.println(id+"*****");
		 Insurance in=productsRepo.findById(id).get();
		  in.setInsuranceId(insurance.getInsuranceId());
		  in.setInsuranceName(insurance.getInsuranceName());
		  in.setInsurancePremium(insurance.getInsurancePremium());
		  in.setInsuranceValue(insurance.getInsuranceValue());
		  productsRepo.save(in);
	    System.out.println(insurance+"*****");
		return new ResponseEntity<Insurance>(HttpStatus.ACCEPTED);
		
	}
	

}
