package com.example.blibli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blibli.model.entity.LoginRecord;

@Repository
public interface LoginRecordRepository extends JpaRepository<LoginRecord, String> {

}
