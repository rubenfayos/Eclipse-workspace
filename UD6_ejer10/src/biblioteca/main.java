package biblioteca;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String salto = "";
		
		libro[] arraylibros = new libro[10];
		
		arraylibros[0] = new libro(01, 153, 1, "975-231", "El duende verde", "Rub�n Fayos", 'C');
		arraylibros[1] = new libro(02, 231, 0, "975-265", "Violeta", "Isabelle Allende", 'H');
		arraylibros[2] = new libro(03, 432, 0, "975-298", "Por si las voces vuelven", "Angel Mart�n", 'S');
		arraylibros[3] = new libro(04, 158, 0, "975-276", "La bestia", "Carmen Mola", 'T');
		arraylibros[4] = new libro(05, 89, 1, "975-261", "Antes de diciembre", "Joana Marc�s", 'C');
		arraylibros[5] = new libro(06, 1530, 1, "975-290", "Proyecto Silverview", "John le carr�", 'C');
		arraylibros[6] = new libro(07, 654, 1, "975-301", "�ltimos d�as en Berl�n", "Paloma S�nchez", 'H');
		arraylibros[7] = new libro(12, 180, 0, "975-312", "El Italiano", "Arturo P�rez Reverte", 'S');
		arraylibros[8] = new libro(11, 530, 1, "975-325", "Nosotros en la luna", "Alice Kellen", 'S');
		arraylibros[9] = new libro(10, 879, 0, "975-308", "Nunca", "Ken follet", 'T');
		
		System.out.print("Bienvenido a la biblioteca, ");
		
		int menu;
		
		do {
			
			System.out.println("elige una de las siguientes opcciones: \n1)Ver libros \n2)Solicitar pr�stamo de libro \n3)Realizar devoluci�n de libro \n4)Recomendador de libros \n5)Salir");
			
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
		break;
		default:		
		}
		
		}while(menu < 4 || menu > 1);
	}
		
	
	public static void prestamo(libro[] arraylibros) {
		Scanner teclado = new Scanner(System.in);
		
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
		
		System.out.println("�Cual quieres llevarte? (Introduce la ID)");
		
		int id = teclado.nextInt();
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getid() == id) {
				arraylibros[i].prestamo();
				System.out.println("El libro se ha prestado correctamente");
			}
		}
		
	}
	
	
	public static void visualizarLibros(libro[] arraylibros){
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			System.out.println(arraylibros[i].getTitulo() + ", Num. p�ginas: " + arraylibros[i].getnumpag()  + ", id : " + arraylibros[i].getid() + ", ISBN : " + arraylibros[i].getISBN() + ", autor: " + arraylibros[i].getAutor() + ", tem�tica: " + arraylibros[i].getTematica() + "\n");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void devolucion(libro[] arraylibros) {
		Scanner teclado = new Scanner(System.in);
		
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
		
		System.out.println("�Cual quieres devolver? (Introduce la ID)");
		
		int id = teclado.nextInt();
		
		for(int i = 0; i < arraylibros.length; i++ ) {
			if(arraylibros[i].getid() == id) {
				arraylibros[i].devolucion();
				System.out.println("El libro se ha devuelto correctamente");
			}
		}
		
	}
}

