import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcion = 0;
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(145, 21, "Rojo", 'B');
		Electrodomestico e3 = new Electrodomestico(235, 42, "Gris", 'C');
		
		Lavadora l1 = new Lavadora(250, 30, "Azul" , 'F', 22);
		Lavadora l2 = new Lavadora(300, 40, "Negro" , 'D', 35);
		Lavadora l3 = new Lavadora(400, 70, "Azul" , 'F', 50);
		
		Television t1 = new Television(450, 15, "Negro", 'B', 45, true);
		Television t2 = new Television(500, 15, "Rojo", 'A', 55, true);
		Television t3 = new Television(200, 15, "Blanco", 'D', 25, false);
		
		electrodomesticos.add(e1);
		electrodomesticos.add(e2);
		electrodomesticos.add(e3);
		electrodomesticos.add(l1);
		electrodomesticos.add(l2);
		electrodomesticos.add(l3);
		electrodomesticos.add(t1);
		electrodomesticos.add(t2);
		electrodomesticos.add(t3);
		
		do {
		
		System.out.println("Elije una de las siguientes opciones: \n1)Listar electrodomésticos \n2)Añadir electrodomestico \n3)Eliminar electrodoméstico \n4)Mostrar precio agrupado \n5)Salir");
		
		opcion = teclado.nextInt();
		
		switch(opcion) {
		
			case 1: System.out.println("Ahora se van a listar los electrodomésticos: \n");
					listarElectrodomesticos(electrodomesticos);
			break;
			
			case 2: añadirElectrodomestico(electrodomesticos);
			break;
			
			case 3: System.out.println("Ahora se van a listar los electrodomésticos: \n"); 
					listarElectrodomesticos(electrodomesticos);
					eliminarElectrodomestico(electrodomesticos);
			break;
			
			case 4: agruparPrecios(electrodomesticos);
			break;
			
			case 5: System.out.println("Saliendo del programa...");
			break;
			
			default: System.out.println("Opción incorrecta");
			
			}
		
		}while(opcion != 5);
		
		
	}
	
	public static void listarElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
		
		int i = 0;
		
		for(Electrodomestico e : electrodomesticos) {
		
			if(electrodomesticos.get(i) instanceof Lavadora) {
				Lavadora l = (Lavadora) e;
				System.out.println((i+1)+") Lavadora Peso: " + l.getPeso() + "kg ,Color: " + l.getColor() + " ,Eficiencia energetica: " + l.getConsumoEnergetico() + ", Capacidad de carga: " + l.getCarga() +" ,Precio final: " + l.precioFinal());
			
			}else if(e instanceof Television) {
				Television t = (Television) e;
				System.out.println((i+1)+") Television Peso: " + t.getPeso() + "kg ,Color: " + t.getColor() + " ,Eficiencia energetica: " + t.getConsumoEnergetico() + ", Pulgadas: " + t.getResolucion() + ", Smart TV: " + t.isSmartv() +" ,Precio final: " + t.precioFinal());
			
			}else if(electrodomesticos.get(i) instanceof Electrodomestico) {
				System.out.println((i+1)+") Electrodomestico Peso: " + e.getPeso() + "kg ,Color: " + e.getColor() + " ,Eficiencia energetica: " + e.getConsumoEnergetico() + " ,Precio final: " + e.precioFinal());
			}
			
			i++;
		}
		
		System.out.println("");
		
	}
	
	public static void añadirElectrodomestico(ArrayList<Electrodomestico> electrodomesticos) {
		Scanner teclado = new Scanner(System.in);
		
		Electrodomestico e = new Electrodomestico();
		
		System.out.println("\nVamos a añadir una electrodomestico, primero introduce el peso:");
		
		e.setPeso(teclado.nextInt());
		
		teclado.nextLine();
		
		System.out.println("Ahora el color (Negro-Blanco-Gris-Rojo-Azul):");
		
		e.setColor(teclado.nextLine());
		
		System.out.println("Ahora la eficiencia energética (A-B-C-D-E-F):");
		
		e.setConsumoEnergetico(teclado.next().charAt(0));
		
		System.out.println("Por último el precio base:");
		
		e.setPrecioBase(teclado.nextInt());

		electrodomesticos.add(e);
		
	}

	public static void eliminarElectrodomestico(ArrayList<Electrodomestico> electrodomesticos) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elije cual quieres eliminar: ");
		
		int opcion = teclado.nextInt() - 1;
		
		System.out.print("Estas seguro de eliminar ");
		
		Electrodomestico e = electrodomesticos.get(opcion);
		
		if(electrodomesticos.get(opcion) instanceof Lavadora) {
			Lavadora l = (Lavadora) e;
			System.out.println("Lavadora Peso: " + l.getPeso() + "kg ,Color: " + l.getColor() + " ,Eficiencia energetica: " + l.getConsumoEnergetico() + ", Capacidad de carga: " + l.getCarga() +" ,Precio final: " + l.precioFinal());
		
		}else if(e instanceof Television) {
			Television t = (Television) e;
			System.out.println("Television Peso: " + t.getPeso() + "kg ,Color: " + t.getColor() + " ,Eficiencia energetica: " + t.getConsumoEnergetico() + ", Pulgadas: " + t.getResolucion() + ", Smart TV: " + t.isSmartv() +" ,Precio final: " + t.precioFinal());
		
		}else if(electrodomesticos.get(opcion) instanceof Electrodomestico) {
			System.out.println("Electrodomestico Peso: " + e.getPeso() + "kg ,Color: " + e.getColor() + " ,Eficiencia energetica: " + e.getConsumoEnergetico() + " ,Precio final: " + e.precioFinal());
		}
		
		System.out.println("1 Si | 2 No ");
		
		int comprobacion = teclado.nextInt();
		
		if(comprobacion == 1) {
			electrodomesticos.remove(opcion);
			System.out.println("Electrodomestico borrado\n");
		}else {
			System.out.println("Se ha cancelado el borrado\n");
		}
		
	}
	
	public static void agruparPrecios(ArrayList<Electrodomestico> electrodomesticos) {
		
		int i = 0;
		int precioL=0;
		int precioT=0;
		int precioE=0;
		
		for(Electrodomestico e : electrodomesticos) {
		
			if(electrodomesticos.get(i) instanceof Lavadora) {
				Lavadora l = (Lavadora) e;
				precioL+=e.precioFinal();
			
			}else if(e instanceof Television) {
				Television t = (Television) e;
				precioT+=e.precioFinal();
			
			}else if(electrodomesticos.get(i) instanceof Electrodomestico) {
				precioE+=e.precioFinal();
			}
			
			i++;
		}
		
		System.out.println("Precio agrupado electrodomesticos: " + precioE);
		System.out.println("Precio agrupado televisiones " + precioT);
		System.out.println("Precio agrupado lavadoras " + precioL + "\n");
		
	}

	
}
