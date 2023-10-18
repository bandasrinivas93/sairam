package com.slokam.scriptone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.scriptone.dto.LocationDTO;
import com.slokam.scriptone.service.ILocationServise;

@RestController
@RequestMapping("locationcontroller")
public class LocationController {
	
	@Autowired
	private ILocationServise  ilocationServises;
	

	@PostMapping("savelocation")
	public ResponseEntity<LocationDTO> savelocation(@RequestBody LocationDTO locdto)
	{
		LocationDTO locdto1 = ilocationServises.save(locdto); 
		      return ResponseEntity.status(HttpStatus.OK).body(locdto1);
	} 
	@DeleteMapping("/{id}")
	public ResponseEntity<LocationDTO>deletebyid(@RequestBody  @PathVariable("id") Integer id) {
	ilocationServises.deletebyid(id);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	}






