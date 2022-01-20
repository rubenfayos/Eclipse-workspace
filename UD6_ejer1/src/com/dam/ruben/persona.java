package com.dam.ruben;

public class persona {
	
	//Variables
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public persona() {
		
	}
	
	public persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}

}
