package com.FSpring.Hibernate_WebApp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")

public class Clientes {

//	Atributos
	@Id
	@Column(name = "id_cliente")
	private int id_cliente;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "direccion")
	private String direccion;

//	Getters y setters
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

//	Constructores
	public Clientes() {
		super();
	}

	public Clientes(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	@Override // Metodo toString()
	public String toString() {
		return "[id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + "]";
	}

}
