package Elementos;

	/**
	 * @author Fayos
	 * @version 1.0
	 * @since 19/01/2022
	 * <h2>Persona</h2>
	 * Esta clase creara una persona, además, tiene varias funciones como la asignación
	 * de un coche (creado en la clase coche) a la persona.
	 */

public class persona {
	
	//Variables
	
	private String nombre;
	private int edad;
	
	/**
	 * Método get para nombre 
	 * @param Nombre Nombre de la persona
	 * @return Devuelve el nombre
	 */
	
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Método Set para nombre 
	 * @param Nombre Nombre de la persona
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método get para edad 
	 * @param Edad Edad de la persona
	 * @return Devuelve la edad
	 */
	
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * Método set para edad 
	 * @param Edad Edad de la persona
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Método por defecto
	 */
	
	public persona() {
		
	}
	
	/**
	 * Método para la creacion del objeto persona
	 * @param Edad Edad de la persona
	 */
	
	public persona(String nombre) {
		this.nombre = nombre;
	}
	
	private coche c;
	
	/**
	 * Método set para el coche de la persona
	 * @param C Coche de la persona
	 */
	
	public void setC(coche c) {
		this.c = c;
	}
	
	/**
	 * Método get para el coche de la persona
	 * @param C Coche de la persona
	 * @return Devuelve el coche de la persona
	 */
	
	public coche getCoche() {
		return this.c;
		
	}

}
