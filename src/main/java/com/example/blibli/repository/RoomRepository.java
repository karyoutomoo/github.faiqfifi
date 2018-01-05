package com.example.blibli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.blibli.model.entity.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room, String>{
	Room findById(String id);
	List<Room> findByName(String name);
	@Query(value= "SELECT COUNT(1) FROM room", nativeQuery = true) Long countTotalRecords();
	/**
	 * kode diatas untuk menghitung total row
	 * kode dibawah untuk menerima limit dan offset paging
	**/
    @Query(value = "SELECT * FROM room LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Room> findPageable(int limit, int offset);
}
