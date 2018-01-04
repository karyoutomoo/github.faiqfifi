package com.example.blibli.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.blibli.model.entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String>{
Transaction findById(String id);
	
	@Query(value= "SELECT COUNT(1) FROM transaction", nativeQuery = true) 
	Long countTotalRecords();

    @Query(value = "SELECT * FROM transaction LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Transaction> findPageable(int limit, int offset);
    
}
