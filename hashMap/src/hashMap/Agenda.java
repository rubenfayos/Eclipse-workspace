package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
	
	private HashMap<String, Integer> listaContactos;

	public HashMap<String, Integer> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(HashMap<String, Integer> listaContactos) {
		this.listaContactos = listaContactos;
	}
	
	public Agenda(HashMap<String, Integer> listaContactos) {
		this.listaContactos = listaContactos;
	}
	
	public Agenda() {
		this.listaContactos = new HashMap<String, Integer>();
		
	}
	
	public void añadirContacto() {
		Scanner teclado = new Scanner(System.in);
		
		boolean comp=false;
		
		System.out.println("Introduce el nombre del contacto: ");
		
		do {
		
			String nombre=teclado.nextLine();
			
			if(listaContactos.containsKey(nombre) == true) {
				
				System.out.println("Ese contacto ya existe, introduce otro nombre: ");
				
			}else {
			
				System.out.println("Introduce el número del contacto: ");
				
				int numero=teclado.nextInt();
				
				this.listaContactos.put(nombre, numero);
				
				System.out.println("Se ha creado el contacto " + nombre + " con el número " + numero);
				
				comp = true;
			
			}
		
		}while(comp == false);
				
	}
	
	public void eliminarContacto() {
		Scanner teclado = new Scanner(System.in);
		
		boolean comp=false;
		
		System.out.println("Introduce el nombre del contacto a eliminar: ");
		
		do {
		
		String nombre=teclado.nextLine();
		
		if(listaContactos.containsKey(nombre) == true) {
			
			System.out.println("Se ha eliminado el contacto " + nombre + " con el número " + this.listaContactos.get(nombre));
			
			this.listaContactos.remove(nombre);
			
			comp = true;
			
		}else {
			System.out.println("Ese contacto no existe, introduce otro nombre: ");
		}
		
		}while(comp==false);
		
		
				
	}
	
	public void modificarContacto() {
		Scanner teclado = new Scanner(System.in);
		
		boolean comp=false;
		
		do {
		
			System.out.println("Introduce el nombre del contacto a modificar: ");
			
			String nombre=teclado.nextLine();
			
			if(listaContactos.containsKey(nombre) == true) {
			
				System.out.println("el número anterior es: " + listaContactos.get(nombre) +  "\nIntroduce el nuevo número: ");
				
				int numero=teclado.nextInt();
				
				this.listaContactos.put(nombre, numero);
				
				comp=true;
				
				System.out.println("Se ha modificado el contacto " + nombre + " con el número " + numero);
			
			}else {
				System.out.println("Ese contacto no existe.");
			}
			
		}while(comp==false);
		
	}
	
	public void verTelefono() {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean comp=false;
		
		do {
		
			System.out.println("Introduce el nombre del contacto que quieres ver: ");
			
			String nombre=teclado.nextLine();
			
			if(listaContactos.containsKey(nombre) == true) {
			
				System.out.println("el contacto " + nombre + " tiene el número " + this.listaContactos.get(nombre));
				
				comp = true;
			
			}else {
				System.out.println("Ese contacto no existe.");
			}
			
		}while(comp==false);
		
	}

}
