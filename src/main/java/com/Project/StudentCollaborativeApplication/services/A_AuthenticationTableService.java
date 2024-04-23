package com.Project.StudentCollaborativeApplication.services;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.StudentCollaborativeApplication.entities.A_AuthenticationTable;
import com.Project.StudentCollaborativeApplication.repositories.A_AuthenticationRepo;




@Service
public class A_AuthenticationTableService {
	
	@Autowired
	private A_AuthenticationRepo authenticationRepo;
	
	public A_AuthenticationTable saveDetails(A_AuthenticationTable authenticationTable) {
		
		
		return authenticationRepo.save(authenticationTable);
		
	
	
}
	/*A_AuthenticationTableDto registerUser(A_AuthenticationTableDto user);
	A_AuthenticationTableDto updateUser(A_AuthenticationTableDto user, int id);
	A_AuthenticationTableDto getUserById(int id);
	List<A_AuthenticationTableDto> getAllUsers();
	void deleteUser(int id);
	
	*/

}
