package com.slokam.scriptone.service;

import com.slokam.scriptone.dto.LocationDTO;

public interface ILocationServise {
	public LocationDTO save(LocationDTO locdto);
	public LocationDTO getbyid(LocationDTO locationdto);
//	public List<LocationDTO> getbyall();
	
	public LocationDTO deletebyid(Integer id);
	


}
