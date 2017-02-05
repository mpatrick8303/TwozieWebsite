package com.twozie.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Product implements DomainObject
{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private final Integer id;
	@OneToMany
	private final CoreProduct coreProduct;
	@Column(name="color")
	private final String color;
	@Column(name="quantity")
	private final Integer quantity;
	@Column(name="inventory")
	private final Integer inventory;
	@Column(name="price")
	private final BigDecimal price;
	@Column(nullable = false)
	boolean isLoaded;

	public Product(Integer id, CoreProduct coreProduct, String color, Integer quantity, Integer inventory, BigDecimal price)
    {
        this(id, coreProduct, color, quantity, inventory, price, false);
    }

    public Product(CoreProduct coreProduct, String color, Integer quantity, Integer inventory, BigDecimal price)
    {
        this(null, coreProduct, color, quantity, inventory, price);
    }
    
    public Product(Integer id, CoreProduct coreProduct, String color, Integer quantity, Integer inventory,
            BigDecimal price, Boolean loaded)
    {
        this.id = id;
        this.coreProduct = coreProduct;
        this.color = color;
        this.quantity = quantity;
        this.inventory = inventory;
        this.price = price;
        this.isLoaded = loaded;
        
    }
}
