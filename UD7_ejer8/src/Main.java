import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Vehiculo[] listaCoches = new Vehiculo[12];
		
		listaCoches[0] = new Compacto(1, 2014, 23000, "Ford", true, 5, 5);
		listaCoches[1] = new Compacto(2, 2010, 23000, "Fiat", false, 4, 5);
		listaCoches[2] = new Compacto(3, 2007, 13000, "Volkswagen", true, 5, 5);
		
		listaCoches[3] = new CocheLujo(11, 2019, 55000, "Maseratti", true, 2, 3);
		listaCoches[4] = new CocheLujo(12, 2020, 75000, "Porsche", false, 2, 3);
		listaCoches[5] = new CocheLujo(13, 2017, 45000, "Mercedes", true, 5, 5);
		
		listaCoches[6] = new Furgoneta(21, 1999, 3000, "Renault", true, 4500, 2, 2, false);
		listaCoches[7] = new Furgoneta(22, 2009, 6000, "Mercedes", false, 5000, 4, 2, true);
		listaCoches[8] = new Furgoneta(23, 2011, 9000, "Volkswagen", false, 5200, 2, 2, false);
		
		listaCoches[9] = new SUV(31, 2020, 16000, "Nissan", false);
		listaCoches[10] = new SUV(32, 2018, 10000, "Ford", false);
		listaCoches[11] = new SUV(33, 2011, 6900, "Nissan", false);
		
		System.out.println("Elige una de las siguientes opciones: \n1)Listar coches \n2)Listar por tipo \n3)Recomendar un vehículo");
		
		int eleccion = teclado.nextInt();
		
		if(eleccion == 1) {
			listarCoches(listaCoches);
		}else if(eleccion == 2) {
			System.out.println("Elige el tipo de coche que quieres listar: \n1)Compactos \n2)Coches de lujo \n3)Furgonetas \n4)SUVs");
			
			eleccion = teclado.nextInt();

			listarPorTipo(listaCoches, eleccion);
		}else if(eleccion == 3) {
			int number = (int)(Math.random() * 13);
			System.out.println("Se va a elegir un coche aleatorio");
			System.out.println("Número serie: " + listaCoches[number].getNumSerie() + ", Marca: " + listaCoches[number].getMarca() + ", año: " + listaCoches[number].getAño() + ", precio: " + listaCoches[number].getPrecio());
		}
		
	}
	
	public static void listarCoches(Vehiculo[] listaCoches) {
		
		System.out.println("La lista de coches es la siguiente: ");
		
		for(int i = 0; i<listaCoches.length; i++) {
			System.out.println((i+1) + ") Número serie: " + listaCoches[i].getNumSerie() + ", Marca: " + listaCoches[i].getMarca() + ", año: " + listaCoches[i].getAño() + ", precio: " + listaCoches[i].getPrecio());
		}
		
	}
	
	public static void listarPorTipo(Vehiculo[] listaCoches, int eleccion) {

		System.out.println(eleccion);
		
		switch (eleccion) {
		
		case 1: 
			for(int i = 0; i<listaCoches.length; i++) {
				if(listaCoches[i] instanceof Compacto) {
					Compacto ref=(Compacto)listaCoches[i];
					System.out.println("Número serie: " + listaCoches[i].getNumSerie() + ", Marca: " + listaCoches[i].getMarca() + ", año: " + listaCoches[i].getAño() + ", precio: " + listaCoches[i].getPrecio() + ", Cantidad de pasajeros: " + ref.getCantPasajeros() + ", cantidad de puertas: " + ref.getNumPuertas());
				}
			}
		break;
		case 2:
			for(int i = 0; i<listaCoches.length; i++) {
				if(listaCoches[i] instanceof CocheLujo) {
					CocheLujo ref=(CocheLujo)listaCoches[i];
					System.out.println("Número serie: " + listaCoches[i].getNumSerie() + ", Marca: " + listaCoches[i].getMarca() + ", año: " + listaCoches[i].getAño() + ", precio: " + listaCoches[i].getPrecio() + ", Cantidad de pasajeros: " + ref.getCantPasajeros() + ", cantidad de puertas: " + ref.getNumPuertas());
				}
			}
		break;
		case 3:
			for(int i = 0; i<listaCoches.length; i++) {
				if(listaCoches[i] instanceof Furgoneta) {
					Furgoneta ref=(Furgoneta)listaCoches[i];
					System.out.println("Número serie: " + listaCoches[i].getNumSerie() + ", Marca: " + listaCoches[i].getMarca() + ", año: " + listaCoches[i].getAño() + ", precio: " + listaCoches[i].getPrecio() + ", Carga máxima: " + ref.getCarga() + "kg, traccion: " + ref.getTraccion() + "ruedas, Cantidad de ventanas opacas: " + ref.getVentanasOpacas() + ", el asiento es desmontable" + ref.isAsientoDesmontable());
				}
			}
		break;
		case 4:
			for(int i = 0; i<listaCoches.length; i++) {
				if(listaCoches[i] instanceof SUV) {
					System.out.println("Número serie: " + listaCoches[i].getNumSerie() + ", Marca: " + listaCoches[i].getMarca() + ", año: " + listaCoches[i].getAño() + ", precio: " + listaCoches[i].getPrecio());
				}
		}
		break;
		}
		
	}

}
