package com.empresa.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Orden")
public class Orden {

	private Long id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
}
