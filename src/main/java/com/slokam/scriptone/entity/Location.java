package com.slokam.scriptone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class Location {

	@Id
	@GeneratedValue
	
	private Long id;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="locTypeId")
	private LocationType locationType;
	
	
}
