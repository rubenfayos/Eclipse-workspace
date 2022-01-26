package Elementos;

	/**
	 * @author Fayos
	 * @version 1.0
	 * @since 19/01/2022
	 */

public class persona {
	
	//Variables
	
	private String nombre;
	private int edad;
	
	/**
	 * M�todo get para nombre 
	 * @param Nombre Nombre de la persona
	 */
	
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * M�todo Set para nombre 
	 * @param Nombre Nombre de la persona
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo get para edad 
	 * @param Edad Edad de la persona
	 */
	
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * M�todo set para edad 
	 * @param Edad Edad de la persona
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * M�todo por defecto
	 */
	
	public persona() {
		
	}
	
	/**
	 * M�todo para la creacion del objeto persona
	 * @param Edad Edad de la persona
	 */
	
	public persona(String nombre) {
		this.nombre = nombre;
	}
	
	private coche c;
	
	/**
	 * M�todo set para el coche de la persona
	 * @param C Coche de la persona
	 */
	
	public void setC(coche c) {
		this.c = c;
	}
	
	/**
	 * M�todo get para el coche de la persona
	 * @param C Coche de la persona
	 */
	
	public coche getCoche() {
		return this.c;
		
	}

}
