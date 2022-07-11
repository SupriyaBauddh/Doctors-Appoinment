package com.assignment.database.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.database.model.user;


public interface Repository extends JpaRepository<user, String> {

	List<user> findByUser(String username);

}