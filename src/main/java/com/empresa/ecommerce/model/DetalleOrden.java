package com.empresa.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DetalleOrden")
public class DetalleOrden {

	@Id
	private Long id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	
}
