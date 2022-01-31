package biblioteca;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		libro[] arraylibros = new libro[10];
		
		arraylibros[0] = new libro(01, 153, 1, "975-231", "El duende verde", "Rubén Fayos", 'C');
		libro l2 = new libro(02, 231, 0, "975-265", "Violeta", "Isabelle Allende", 'H');
		libro l3 = new libro(03, 432, 0, "975-298", "Por si las voces vuelven", "Angel Martín", 'S');
		libro l4 = new libro(04, 158, 0, "975-276", "La bestia", "Carmen Mola", 'T');
		libro l5 = new libro(05, 89, 1, "975-261", "Antes de diciembre", "Joana Marcús", 'C');
		libro l6 = new libro(06, 1530, 1, "975-290", "Proyecto Silverview", "John le carré", 'C');
		libro l7 = new libro(07, 654, 1, "975-301", "Últimos días en Berlín", "Paloma Sánchez", 'H');
		libro l8 = new libro(12, 180, 0, "975-312", "El Italiano", "Arturo Pérez Reverte", 'S');
		libro l9 = new libro(11, 530, 1, "975-325", "Nosotros en la luna", "Alice Kellen", 'S');
		libro l10 = new libro(10, 879, 0, "975-308", "Nunca", "Ken follet", 'T');
		
		System.out.print("Bienvenido a la biblioteca, ");
		
		System.out.println("elige una de las siguientes opcciones: \n1)Ver libros \n2)Solicitar préstamo de libro \n3)Realizar devolución de libro \n4)Recomendador de libros \n5)Salir");
	
		int menu = teclado.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println("Estos son los libros que tenemos disponibles: ");
				visualizarLibros(arraylibros);
		break;
			case 2:
				System.out.println("Elige el libro que quieras llevarte:");
				
		break;
			case 3:
		break;
			case 4:
		break;
		default:
				
		}
		
	}
	
	public static void visualizarLibros(libro[] listadoLibros) {
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println("Libro " + listadoLibros[i]);
		}
		
	}

}
