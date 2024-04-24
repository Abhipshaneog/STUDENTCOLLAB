package com.Project.StudentCollaborativeApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.StudentCollaborativeApplication.entities.A_AuthenticationTable;

public interface A_AuthenticationRepo extends JpaRepository<A_AuthenticationTable, Integer> {
	
	
	A_AuthenticationTable findByEmailId(String emailId);
	A_AuthenticationTable findById(int id);

}
