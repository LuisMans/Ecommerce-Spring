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
@Table(name = "Usuarios")
public class Usuario {

	@Id
	private Long id;
	private String nombre;
	private String nombreUsuario;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String contraseña;
}
