package com.Project.StudentCollaborativeApplication.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.StudentCollaborativeApplication.entities.A_AuthenticationTable;
import com.Project.StudentCollaborativeApplication.services.A_AuthenticationTableService;

@RestController
@RequestMapping("/api/users")
@Controller
public class LoginController {
	
	@Autowired
	private A_AuthenticationTableService authenticationService;
	
	@PostMapping("/loginuser")
    public ResponseEntity<String> login(@RequestBody A_AuthenticationTable authenticationTable) {
        String emailId = authenticationTable.getEmailId();
        String password = authenticationTable.getPassword();
        
        A_AuthenticationTable authenticatedUser = authenticationService.authenticateUser(emailId, password);
        
        if (authenticatedUser != null) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
	

}
