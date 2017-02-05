package com.twozie.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.twozie.model.Address;
import com.twozie.model.Password;

public class Customer implements DomainObject
{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private final Integer id;
	@Column(name="username")
	private final String userName;
	@Column(name="salt")
	private final String salt;
	@Column(name="hash")
	private final String hash;
	@Column(name="firstName")
	private final String firstName;
	@Column(name="lastName")
	private final String lastName;
	private final Address address;
	@Column(name="birthDate")
	private final LocalDateTime birthDate;
	@Column(nullable = false)
	boolean isLoaded;
	
	public Customer(Integer id)
    {
        this(id, null, null, null, null, null, null, null, false);
    }

    
    public Customer(String userName, String salt, String hash)
    {
        this(null, userName, salt, hash, null, null, null, null, false);
    }

    public Customer(String userName, String salt, String hash, String firstName, String lastName, Address address,
                    LocalDateTime birthDate)
    {
        this(null, userName, salt, hash, firstName, lastName, address, birthDate, false);
    }
    
    public Customer(Integer id, String userName, String salt, String hash, String firstName, String lastName, Address address,
                    LocalDateTime birthDate)
    {
        this(id, userName, salt, hash, firstName, lastName, address, birthDate, false);
    }

    public Customer(Integer id, String userName, String salt, String hash, String firstName, String lastName, Address address,
                    LocalDateTime birthDate, Boolean loaded)
    {
    	this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.salt = salt;
        this.hash = hash;
        this.address = address;
        this.birthDate = birthDate;
    }
}
