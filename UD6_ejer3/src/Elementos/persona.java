package Elementos;

public class persona {
	
	//Variables
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return this.nombre;
	}
	
	//Constructores
	
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
	}
	
	private coche c;
	
	public void setC(coche c) {
		this.c = c;
	}
	
	public coche getCoche() {
		return this.c;
		
	}

}
