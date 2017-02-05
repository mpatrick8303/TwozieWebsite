package com.twozie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin implements DomainObject
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
	@Column(name="role")
	private final Integer role;
	@Column(nullable = false)
	boolean isLoaded;
	
	public Admin(Integer id, String username, String salt, String hash, String firstName, String lastName, Integer role,
            Boolean loaded)
    {
        this.id = id;
        this.userName = username;
        this.salt = salt;
        this.hash = hash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Admin(Integer id, String username, String salt, String hash, String firstName, String lastName, Integer role)
    {
        this(id, username, salt, hash, firstName, lastName, role, false);
    }

    public Admin(String username, String salt, String hash, String firstName, String lastName, Integer role)
    {
        this(null, username, salt, hash, firstName, lastName, role, false);
    }

    public Admin(String username, String salt, String hash)
    {
        this(null, username, salt, hash, null, null, null, false);
    }
	
	
	
	
}
