package com.example.blibli.repository;

import java.util.List;
import com.example.blibli.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.blibli.model.entity.Guest;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
	Reservation findById(String id);
	List<Reservation> findBy(String id);
	@Query(value= "SELECT COUNT(1) FROM reservations", nativeQuery = true) Long countTotalRecords();
	

    @Query(value = "SELECT * FROM reservations LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Reservation> findPageable(int limit, int offset);
    List<Guest> findByName(String name);
}
