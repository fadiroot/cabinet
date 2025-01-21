package com.medical.cabinet.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.cabinet.entities.Patient; 

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
