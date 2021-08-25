package com.udayPB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.udayPB.model.PhoneBookUser;

@Repository
public interface ContactRepository extends JpaRepository<PhoneBookUser, Integer>{

	@Query("select c from PhoneBookUser c "
			+ "where UPPER(c.firstName) like CONCAT('%',UPPER(:name),'%') "
			+ " or UPPER(c.lastName) like CONCAT('%',UPPER(:name),'%')"
			+ " or c.phoneNumber like CONCAT('%',UPPER(:name),'%')")
	Iterable<PhoneBookUser> findByFName(@Param("name") String fName);

}
