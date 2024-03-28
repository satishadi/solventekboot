package com.solventek.RegisterRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solventek.RegisterEntity.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register,Integer>{

}
