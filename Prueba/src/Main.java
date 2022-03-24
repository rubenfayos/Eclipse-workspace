import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		HashSet<Hotel> hoteles = new HashSet<Hotel>();
		
		Hotel h1=new Hotel(01, "playa", 60);
		Hotel h2=new Hotel(02, "playa", 75);
		Hotel h3=new Hotel(03, "playa", 90);
		Hotel h4=new Hotel(04, "montaña", 160);
		Hotel h5=new Hotel(05, "montaña", 55.34);
		Hotel h6=new Hotel(06, "montaña", 60.09);
		Hotel h7=new Hotel(07, "rural", 210.20);
		Hotel h8=new Hotel(8, "rural", 84);
		Hotel h9=new Hotel(9, "rural", 97);
		Hotel h10=new Hotel(10, "rural", 101.25);
		
		hoteles.add(h1);
		hoteles.add(h2);
		hoteles.add(h3);
		hoteles.add(h4);
		hoteles.add(h5);
		hoteles.add(h6);
		hoteles.add(h7);
		hoteles.add(h8);
		hoteles.add(h9);
		hoteles.add(h10);
		
		System.out.println("Elije la zona que quieres mostrar: \n1)Playa \n2)Montaña \n3)Rural ");
		
		int selecion = teclado.nextInt();
		
		System.out.println("Introduce un precio minimo: ");
		
		int min = teclado.nextInt();
		
		System.out.println("Introduce un precio máximo: ");
		
		int max = teclado.nextInt();
		
		switch (selecion) {
			case 1:
				System.out.println("Estos son los hoteles de playa con precios entre " + min + "€ y " + max + "€:");
				for(Hotel h : hoteles) {
					if(h.getZona().equals("playa") && h.getPrecio() > min && h.getPrecio() < max)
						System.out.println("ID: " + h.getIdHotel() + " Zona: " + h.getZona() + " Precio: " + h.getPrecio() + "€.");
				}
		break;
			case 2:
				System.out.println("Estos son los hoteles de montaña con precios entre " + min + "€ y " + max + "€:");
				for(Hotel h : hoteles) {
					if(h.getZona().equals("montaña") && h.getPrecio() > min && h.getPrecio() < max)
						System.out.println("ID: " + h.getIdHotel() + " Zona: " + h.getZona() + " Precio: " + h.getPrecio() + "€.");
				}
		break;
			case 3:
				System.out.println("Estos son los hoteles rurales con precios entre" + min + "€ y " + max + "€:");
				for(Hotel h : hoteles) {
					if(h.getZona().equals("rural") && h.getPrecio() > min && h.getPrecio() < max)
						System.out.println("ID: " + h.getIdHotel() + " Zona: " + h.getZona() + " Precio: " + h.getPrecio() + "€.");
				}
		break;
		
			}
		}
	}
