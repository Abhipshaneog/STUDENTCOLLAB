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
	public A_AuthenticationTable authenticateUser(String emailId, String password) {
		
	    
        // Find the user by email in the repository
        A_AuthenticationTable user = authenticationRepo.findByEmailId(emailId);
        
        // If user not found or password does not match, return false
        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        
        // Authentication successful
        return authenticationRepo.save(user);
    }
	
	 public boolean isIdUnique(int id) {
		 A_AuthenticationTable existingUser = authenticationRepo.findById(id);
		 
		 return existingUser == null; // If null, the ID is unique; otherwise, it's not.
	        // Check if any user exists with the given ID
	        //A_AuthenticationTable user = authenticationRepo.findById(id).orElse(null);
	        // Return true if user is null (ID is unique), false otherwise
	        //return user;
	    }
	 public boolean isEmailIdUnique(String emailId) {
		    A_AuthenticationTable existingUser = authenticationRepo.findByEmailId(emailId);
		    return existingUser == null;
		}
	

}
