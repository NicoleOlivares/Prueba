package com.ejercicio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "peluches")//creando tabla en base de datos 
public class Peluche {
	
	//atributos
	@Id//indica que es el id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrementable, genera un valor. 
	private Long id;
	
	@Size(min=2, max=15)
	private String nombre;
	
	private String material;
	@NotNull
	private String cobertura;
	
	
	public Peluche() {
		super();
	}


	public Peluche(Long id, String nombre, String material, String cobertura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.material = material;
		this.cobertura = cobertura;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getCobertura() {
		return cobertura;
	}


	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
}
