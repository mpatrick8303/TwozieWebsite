package com.twozie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CoreProduct implements DomainObject
{

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private final Integer id;
	@Column(name="name")
	private final String name;
	@Column(name="type")
	private final String type;
	@Column(name="subtype")
	private final String subtype;
	@Column(name="description")
	private final String description;
	@Column(name="fullSizeImage")
	private final String fullSizeImage;
	@Column(name="thumbnail")
	private final String thumbnail;
	@Column(nullable = false)
	boolean isLoaded;
	
	public CoreProduct(Integer id, String name, String type, String subType, String description)
    {
        this(id, name, type, subType, description,"null", "null", false);
    }
    
    public CoreProduct(String name, String type, String subType, String description, String full, String thumb)
    {
        this(null, name, type, subType, description,full, thumb, false);
    }

    public CoreProduct(String name, String type, String subType, String description)
    {
        this(null, name, type, subType, description, "null", "null", false);
    }

    public CoreProduct(Integer id, String name, String type, String subtype, String description, String fullSizeImage,
            String thumbnail, boolean loaded)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.subtype = subtype;
        this.description = description;
        this.fullSizeImage = fullSizeImage;
        this.thumbnail = thumbnail;
        
    }
	
}
