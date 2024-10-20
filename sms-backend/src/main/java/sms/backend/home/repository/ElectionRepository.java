package sms.backend.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sms.backend.home.model.Citizen;
@Repository
public interface ElectionRepository extends JpaRepository<Citizen, Integer> {
	
	

}
