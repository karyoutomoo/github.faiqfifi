package com.example.blibli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.blibli.model.entity.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, String> {
	Guest findById(String id);
	Guest findByName(String name);
	//List<Guest> findByName(String name);
	@Query(value= "SELECT COUNT(1) FROM guest", nativeQuery = true) Long countTotalRecords();
	/**
	 * kode diatas untuk menghitung total row
	 * kode dibawah untuk menerima limit dan offset paging
	**/
    @Query(value = "SELECT * FROM guest LIMIT ?1 OFFSET ?2", nativeQuery = true)
	List<Guest> findPageable(int limit,int offset);
}
