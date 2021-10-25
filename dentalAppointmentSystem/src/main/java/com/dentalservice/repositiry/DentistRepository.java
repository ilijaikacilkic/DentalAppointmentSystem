package com.dentalservice.repositiry;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalservice.model.Dentist;



public interface DentistRepository extends JpaRepository<Dentist, Long> {	
	
}
