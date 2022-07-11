package com.assignment.database.repo2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.database.model2.user2;


public interface Repository2 extends JpaRepository<user2, String> {

	List<user2> findByPatient(String patientname);

}