package Principal;
import java.util.Scanner;

import Elementos.persona;
import Elementos.coche;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		int edad;
		
		//personas
		
		System.out.println("Vamos a crear 3 personas, persona 1:");
		nombre = teclado.nextLine();
		persona p1 = new persona(nombre);
	
		System.out.println("Ahora introduce la edad:");
		edad = teclado.nextInt();
		p1.setEdad(edad);
		
		teclado.nextLine();
	
		System.out.println("Persona 2:");
		nombre = teclado.nextLine();
		persona p2 = new persona(nombre);
	
		System.out.println("Ahora introduce la edad:");
		edad = teclado.nextInt();
		p2.setEdad(edad);
		
		teclado.nextLine();
	
		System.out.println("Persona 3:");
		nombre = teclado.nextLine();
		persona p3 = new persona(nombre);
	
		System.out.println("Ahora introduce la edad:");
		edad = teclado.nextInt();
		p3.setEdad(edad);
		
		teclado.nextLine();
		
		//Creación de coches
		
		System.out.println("Ahora vamos a crear los coches");
		
		coche c1 = new coche(); 
		System.out.println("Coche 1, marca:");
		String marca = teclado.nextLine();
		
		System.out.println("Coche 1, modelo:");
		String modelo = teclado.nextLine();
		
		System.out.println("Coche 1, color:");
		String color = teclado.nextLine();
		c1.Coche(marca, color, modelo);
		
		coche c2 = new coche(); 
		System.out.println("Coche 2, marca:");
		marca = teclado.nextLine();
		
		System.out.println("Coche 2, modelo:");
		modelo = teclado.nextLine();
		
		System.out.println("Coche 2, color:");
		color = teclado.nextLine();
		c2.Coche(marca, modelo, color);
		
		p1.setC(c1);
		p2.setC(c1);
		p3.setC(c2);
		
		System.out.println("El coche de " + p1.getNombre() + " es " + p1.getCoche().getMarca() +" "+ p1.getCoche().getModelo()+ " color " + p1.getCoche().getColor());
		System.out.println("El coche de " + p2.getNombre() + " es " + p2.getCoche().getMarca() +" "+ p2.getCoche().getModelo()+ " color " + p2.getCoche().getColor());
		System.out.println("El coche de " + p3.getNombre() + " es " + p3.getCoche().getMarca() +" "+ p3.getCoche().getModelo()+ " color " + p3.getCoche().getColor());
		
	}
}
