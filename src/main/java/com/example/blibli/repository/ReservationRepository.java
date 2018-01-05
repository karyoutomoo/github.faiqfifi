package com.example.blibli.repository;

import java.util.List;
import com.example.blibli.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
	Reservation findById(String id);
	
	@Query(value= "SELECT COUNT(1) FROM reservation", nativeQuery = true) 
	Long countTotalRecords();
	/**
	 * kode diatas untuk menghitung total row
	 * kode dibawah untuk menerima limit dan offset paging
	**/
    @Query(value = "SELECT * FROM reservation LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Reservation> findPageable(int limit, int offset);
   
}
