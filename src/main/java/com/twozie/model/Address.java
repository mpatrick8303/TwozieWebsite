package com.twozie.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Address implements DomainObject
{
	
	@Column(name="street")
	String street;
	@Column(name="city")
	String city;
	@Column(name="zipcode")
	String zip;
	@Column(name="state")
	String state;

}
