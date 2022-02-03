package biblioteca;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String salto = "";
		
		libro[] arraylibros = new libro[10];
		
		arraylibros[0] = new libro(01, 153, 1, "975-231", "El duende verde", "Rubén Fayos", 'C');
		arraylibros[1] = new libro(02, 231, 0, "975-265", "Violeta", "Isabelle Allende", 'H');
		arraylibros[2] = new libro(03, 432, 0, "975-298", "Por si las voces vuelven", "Angel Martín", 'S');
		arraylibros[3] = new libro(04, 158, 0, "975-276", "La bestia", "Carmen Mola", 'T');
		arraylibros[4] = new libro(05, 89, 1, "975-261", "Antes de diciembre", "Joana Marcús", 'C');
		arraylibros[5] = new libro(06, 1530, 1, "975-290", "Proyecto Silverview", "John le carré", 'C');
		arraylibros[6] = new libro(07, 654, 1, "975-301", "Últimos días en Berlín", "Paloma Sánchez", 'H');
		arraylibros[7] = new libro(12, 180, 0, "975-312", "El Italiano", "Arturo Pérez Reverte", 'S');
		arraylibros[8] = new libro(11, 530, 1, "975-325", "Nosotros en la luna", "Alice Kellen", 'S');
		arraylibros[9] = new libro(10, 879, 0, "975-308", "Nunca", "Ken follet", 'T');
		
		System.out.print("Bienvenido a la biblioteca, ");
		
		int menu;
		
		do {
			
			System.out.println("elige una de las siguientes opcciones: \n1)Ver libros \n2)Solicitar préstamo de libro \n3)Realizar devolución de libro \n4)Recomendador de libros \n5)Salir");
			
			menu = teclado.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println("Estos son los libros que tenemos disponibles: ");
				visualizarLibros(arraylibros);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 2:
				System.out.println("Este es el listado de libros disponibles");
				prestamo(arraylibros);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
				
		break;
			case 3:
				System.out.println("Este es el listado de libros prestados");
				devolucion(arraylibros);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 4:
				recomendar(arraylibros);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
		default: System.out.println("Opción incorrecta");
		System.out.println("Pulsa para continuar...");
		teclado.nextLine();
		salto = teclado.nextLine();
		}
		
		}while(menu < 4 || menu > 1);
	}
		
	
	public static void prestamo(libro[] arraylibros) {
		Scanner teclado = new Scanner(System.in);
		boolean comp = false;
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getestado() == 0) {
			System.out.println(arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
		do {
		
		System.out.println("¿Cual quieres llevarte? (Introduce la ID)");
		
		int id = teclado.nextInt();
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getid() == id) {
				if(arraylibros[i].getestado() == 0) {
				arraylibros[i].prestamo();
				System.out.println("El libro se ha prestado correctamente");
				comp = true;
				}
				}
			}
		if (comp== false) {
			System.out.println("Opción incorrecta");
		}
		}while(comp == false);
		
	}
	
	
	public static void visualizarLibros(libro[] arraylibros){
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			System.out.println(arraylibros[i].getTitulo() + ", Num. páginas: " + arraylibros[i].getnumpag()  + ", id : " + arraylibros[i].getid() + ", ISBN : " + arraylibros[i].getISBN() + ", autor: " + arraylibros[i].getAutor() + ", temática: " + arraylibros[i].getTematica() + "\n");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void devolucion(libro[] arraylibros) {
		Scanner teclado = new Scanner(System.in);
		boolean comp = false;
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getestado() == 1) {
			System.out.println(arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
		do {
		
		System.out.println("¿Cual quieres devolver? (Introduce la ID)");
		
		int id = teclado.nextInt();
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getid() == id) {
				if(arraylibros[i].getestado() == 1) {
				arraylibros[i].devolucion();
				System.out.println("El libro se ha devuelto correctamente");
				comp = true;
				}
			}
			
		}
		
		if (comp== false) {
			System.out.println("Opción incorrecta");
		}
		
		}while(comp == false);
	}
	
	public static void recomendar(libro[] arraylibros) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cual de las siguientes temáticas prefieres: (Terror | Ciencia Ficción | Humor | Suspense)");
		
		String tematica = teclado.nextLine();
		
		System.out.println("Cuantas ganas tienes de leer: (1 Muy pocas | 2 Pocas | 3 Bastantes | 4 Muchas)");
		
		int ganas = teclado.nextInt();
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getTematica().equalsIgnoreCase(tematica)) {
				if(arraylibros[i].getnumpag() < 150 && ganas == 1) {
					System.out.println("El libro recomendado es: " + arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid() + ", num pag: " + arraylibros[i].getnumpag() + ",temática: " + arraylibros[i].getTematica());
				}else if(arraylibros[i].getnumpag() >= 150 && arraylibros[i].getnumpag() < 300 && ganas == 2) {
					System.out.println("El libro recomendado es: " + arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid() + ", num pag: " + arraylibros[i].getnumpag() + ",temática: " + arraylibros[i].getTematica());
				}else if(arraylibros[i].getnumpag() >= 300 && arraylibros[i].getnumpag() < 600 && ganas == 3) {
					System.out.println("El libro recomendado es: " + arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid() + ", num pag: " + arraylibros[i].getnumpag() + ",temática: " + arraylibros[i].getTematica());
				}else if(arraylibros[i].getnumpag() >= 600 && ganas == 4){
					System.out.println("El libro recomendado es: " + arraylibros[i].getTitulo() + " id : " + arraylibros[i].getid() + ", num pag: " + arraylibros[i].getnumpag() + ",temática: " + arraylibros[i].getTematica());
				}else {
					System.out.println("Lo sentimos no hay ninguna opción para tí");
				}
			}
		}
	}
}

