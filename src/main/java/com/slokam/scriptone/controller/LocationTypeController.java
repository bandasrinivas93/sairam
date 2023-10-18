package com.slokam.scriptone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.scriptone.dto.LocationTypeDto;
import com.slokam.scriptone.service.IlocationTypeService;



@RestController
@RequestMapping("locationtype")
public class LocationTypeController {
	
	@Autowired
	private IlocationTypeService ilocsetypervice;
	
	@PostMapping("savelocationtype")
	public ResponseEntity<LocationTypeDto> savelocationtype(@RequestBody LocationTypeDto locdto)
	{
		       LocationTypeDto loctypedto = ilocsetypervice.save(locdto); 
		        ResponseEntity<LocationTypeDto> re;
		        re = new ResponseEntity<LocationTypeDto>(loctypedto,HttpStatus.OK);
		        return re;
	}

	
	
	@GetMapping("/{id}")
	public ResponseEntity<LocationTypeDto> findbylocationid(@PathVariable Integer id)
	{
		             LocationTypeDto loc =  ilocsetypervice.getbyid(id);
		       
		       return ResponseEntity.status(HttpStatus.OK).body(loc);
	}
	
	@GetMapping("deletebyid/{id}") 
	public ResponseEntity<LocationTypeDto> deletebyid(@PathVariable Integer id)
	{
		             LocationTypeDto locdtp = ilocsetypervice.deletebyid(id);
		    return ResponseEntity.status(HttpStatus.OK).body(locdtp);
	}
	
	@GetMapping("getalllocation")
	public ResponseEntity<List<LocationTypeDto>> getalllocationtype()
	{
		              List<LocationTypeDto> locationdto = ilocsetypervice.getbyall();
		      return ResponseEntity.status(HttpStatus.OK).body(locationdto);
		
	}

}
