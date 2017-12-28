package com.example.blibli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blibli.model.entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String>{

}
