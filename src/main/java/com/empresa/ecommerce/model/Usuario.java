package com.empresa.ecommerce.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String nombreUsuario;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String contraseña;
	
	@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;
	@OneToMany(mappedBy = "usuario")
	private List<Orden> ordenes;
}
