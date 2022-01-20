package com.dam.ruben;

public class main {
	
	/*
	 * 	Crea una clase denominada Persona que almacene al menos, el nombre y
		la edad. Los atributos deben ser privados y los métodos (getters y setters) públicos.
		Añade también un constructor que asigne la edad de la persona a 0 y el nombre con el
		valor pasado por parámetro
		Para probar el funcionamiento de tu clase, desde la clase principal (Main):
			- Crea tres personas:
			- Pepe (10 años).
			- Luis (25 años).
			- Maria ( 18 años).
			
		- Visualiza la edad y el nombre de los tres.
		- Añádele a Luis la edad de Maria y posteriormente, restale la de Pepe.
		- Visualiza de nuevo la edad de los tres.
	 * 
	 */

	public static void main(String[] args) {
		
		persona p1 = new persona("Pepe");
		persona p2 = new persona("Luís");
		persona p3 = new persona("María");
		
		p1.setEdad(10);
		p2.setEdad(25);
		p3.setEdad(18);
		
		System.out.println("La persona 1 se llama " + p1.getNombre() + " y su edad es " + p1.getEdad() + " años.");
		System.out.println("La persona 2 se llama " + p2.getNombre() + " y su edad es " + p2.getEdad() + " años.");
		System.out.println("La persona 3 se llama " + p3.getNombre() + " y su edad es " + p3.getEdad() + " años.\n");
		
		p2.setEdad(p3.getEdad() + p2.getEdad() - p1.getEdad());
		
		System.out.println("La persona 1 se llama " + p1.getNombre() + " y su edad es " + p1.getEdad() + " años.");
		System.out.println("La persona 2 se llama " + p2.getNombre() + " y su edad es " + p2.getEdad() + " años.");
		System.out.println("La persona 3 se llama " + p3.getNombre() + " y su edad es " + p3.getEdad() + " años.");

	}

}
