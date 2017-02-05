package com.twozie.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name="_order")
public class Order implements DomainObject
{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private final Integer id;
	@OneToOne(mappedBy="customer_id")
	private final Customer customer;
	@Column(name="date")
	private final LocalDateTime date;
	@
	
	
	@Data
	@Entity
	public static class OrderDetail
    {
        Product product;
        Integer qty;
        BigDecimal unitPrice;

        public OrderDetail(Product product, Integer qty, BigDecimal unitPrice)
        {
            this.product = product;
            this.qty = qty;
            this.unitPrice = unitPrice;
        }
    }
}
