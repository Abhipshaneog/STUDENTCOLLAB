/*package com.Project.StudentCollaborativeApplication.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.StudentCollaborativeApplication.Payloads.A_AuthenticationTableDto;
import com.Project.StudentCollaborativeApplication.entities.A_AuthenticationTable;
import com.Project.StudentCollaborativeApplication.repositories.A_AuthenticationRepo;
import com.Project.StudentCollaborativeApplication.services.A_AuthenticationTableService;

@Service
public class A_AuthenticationServiceImpl implements A_AuthenticationTableService {

	@Autowired
	private A_AuthenticationRepo authenticationRepo; 
	
	private A_AuthenticationTableDto entityToDto(A_AuthenticationTable entity) {
	    A_AuthenticationTableDto dto = new A_AuthenticationTableDto();
	    dto.setId(entity.getId());
	    dto.setEmailId(entity.getEmailId());
	    dto.setPassword(entity.getPassword());
	    // You may need to map other fields as well
	    return dto;
	}

	
	@Override
	public A_AuthenticationTableDto registerUser(A_AuthenticationTableDto userDto) {
		// Convert DTO to entity
		A_AuthenticationTable userEntity = dtoToEntity(userDto);
		userEntity.setId(userDto.getId());
		userEntity.setEmailId(userDto.getEmailId());
		userEntity.setPassword(userDto.getPassword());
		
		authenticationRepo.save(userEntity);
		
		// Convert the saved entity back to DTO
	    A_AuthenticationTableDto savedUserDto = entityToDto(userEntity);
		return savedUserDto;
		// TODO Auto-generated method stub
		
	}

	@Override
	public A_AuthenticationTableDto updateUser(A_AuthenticationTableDto user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public A_AuthenticationTableDto getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<A_AuthenticationTableDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}
	
	private A_AuthenticationTable dtoToEntity(A_AuthenticationTableDto user) {
		A_AuthenticationTable entity= new A_AuthenticationTable();
		entity.setId(user.getId());
		entity.setEmailId(user.getEmailId());
		entity.setPassword(user.getPassword());
		return entity;
		
	}

	
}
*/
