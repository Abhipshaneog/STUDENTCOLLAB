package com.Project.StudentCollaborativeApplication.entities;

import java.time.LocalDateTime;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

//import org.hibernate.annotations.Columns;

//import com.springboothibernate.springboothibernate.myentity.A_AuthenticationTable.Status;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="a_authentication_table")
@NoArgsConstructor
@Getter
@Setter
public class A_AuthenticationTable {
	
	 	@Id
	    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private int id;
	 
	 	@NotBlank
	    @Email
	    @Column(name = "EMAIL_ID", unique = true)
	    private String emailId;

	    @NotBlank
	    @Column(name = "PASSWORD")
	    private String password;

	    

		

	    @Column(name = "CREATED_DATE", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	    
	    private LocalDateTime createdDate;
	    
	    @PrePersist
	    protected void onCreate() {
	        createdDate = LocalDateTime.now();
	    }
	    

	    public A_AuthenticationTable(int id, String emailId, String password,
				LocalDateTime createdDate) {
			
			this.id = id;
			this.emailId = emailId;
			this.password = password;
			//this.status = status;
			this.createdDate = createdDate;
		}


		


}
