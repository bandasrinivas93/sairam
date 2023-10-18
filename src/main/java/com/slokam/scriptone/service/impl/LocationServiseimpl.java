package com.slokam.scriptone.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.scriptone.dao.ILocationDAO;
import com.slokam.scriptone.dto.LocationDTO;
import com.slokam.scriptone.dto.LocationTypeDto;
import com.slokam.scriptone.entity.Location;
import com.slokam.scriptone.service.ILocationServise;
@Service
public class LocationServiseimpl implements ILocationServise  {
	
	@Autowired
	private ILocationDAO ilocationdao; 
	
	
      @Autowired
	  private ModelMapper modelmapper;

	

	
	@Override
	public LocationDTO save(LocationDTO locdto) {
		
		Location dto=modelmapper.map(locdto,Location.class);
		ilocationdao.save(dto);
		dto.setId(dto.getId());
		return locdto;

	}




	@Override
	public LocationDTO getbyid(LocationDTO locationdto) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public LocationDTO deletebyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}




//	@Override
//	public LocationDTO getbyid(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//
//	@Override
//	public List<LocationDTO> getbyall() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//
//	@Override
//	public LocationDTO deletebyid(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
