package com.Project.StudentCollaborativeApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.StudentCollaborativeApplication.entities.A_AuthenticationTable;
//import com.Project.StudentCollaborativeApplication.Payloads.A_AuthenticationTableDto;
import com.Project.StudentCollaborativeApplication.services.A_AuthenticationTableService;

@RestController
@RequestMapping("/api/users")
@Controller
public class RegisterController {
	
	@Autowired
	private A_AuthenticationTableService authenticationService;
	
	//Endpoint to check if ID is unique
	@GetMapping("/checkIdUnique/{id}")
	public ResponseEntity<String> checkIdUnique(@PathVariable int id) {
	    boolean isIdUnique = authenticationService.isIdUnique(id);
	    if (isIdUnique) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("ID already exists");
        }
	}
	
	@GetMapping("/checkEmailIdUnique/{emailId}")
	public ResponseEntity<?> checkEmailIdUnique(@PathVariable String emailId) {
	    boolean isEmailIdUnique = authenticationService.isEmailIdUnique(emailId);
	    if (isEmailIdUnique) {
	        return ResponseEntity.ok().build();
	    } else {
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists");
	    }
	}

	
	@PostMapping("/registeruser")
	public A_AuthenticationTable postDetails(@RequestBody A_AuthenticationTable authenticationTable) {
		return authenticationService.saveDetails(authenticationTable);
		
	}
	
	
    
}

/*	public RegisterController(A_AuthenticationTableService authenticationService) {
        this.authenticationService = authenticationService;
    }
	//POST register user
	@PostMapping("/registeruser")
	public ResponseEntity<A_AuthenticationTableDto> registerUser(@RequestBody A_AuthenticationTableDto userDto ){
		A_AuthenticationTableDto registerUserDto =this.authenticationService.registerUser(userDto);
		
		return new ResponseEntity<>(registerUserDto, HttpStatus.CREATED);
		
	}
	
 
}
*/
