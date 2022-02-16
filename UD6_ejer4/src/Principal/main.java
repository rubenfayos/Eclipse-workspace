package principal;
import java.util.Scanner;

/**
 * @author Fayos
 * @version 1.0
 * @since 19/01/2022
 */

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		
		Libro l1 = new Libro("Harry poter", "J K Rowling", 15, 3);
		Libro l2 = new Libro("el señor de los anillos", "J R R Tolkien", 11, 1);
		
		do 
		{
			System.out.println("Que quieres hacer 1 Ver libros | 2 Prestamo | 3 devolución | 4 Salir");
			menu = teclado.nextInt();
			if(menu == 1) 
			{
				System.out.println("Elije un libro:\n1 " + l1.getTitulo() + "\n2 " + l2.getTitulo());
				menu = teclado.nextInt();
				
				if(menu == 1) 
				{
					System.out.println("Titulo: " + l1.getTitulo());
					System.out.println("Autor: " + l1.getAutor());
					System.out.println("Ejemplares: " + l1.getEjemplares());
					System.out.println("Prestados: " + l1.getPrestados());
				}
				else
				{
					System.out.println("Titulo: " + l2.getTitulo());
					System.out.println("Autor: " + l2.getAutor());
					System.out.println("Ejemplares: " + l2.getEjemplares());
					System.out.println("Prestados: " + l2.getPrestados());
				}
				}
				else if(menu == 2) 
				{
					System.out.println("Elije el libro que quieras pedir:\n1 " + l1.getTitulo() + "\n2 " + l2.getTitulo());
					menu = teclado.nextInt();
					if(menu == 1) 
					{
						l1.prestamo(l1.getEjemplares(), l1.getPrestados());
					}else 
					{
						l2.prestamo(l2.getEjemplares(), l2.getPrestados());
					}
				}
				else if(menu == 3) 
				{
					System.out.println("Elije el libro que quieras devolver:\n1 " + l1.getTitulo() + "\n2 " + l2.getTitulo());
					menu = teclado.nextInt();	
				}	
				
					if(menu == 1) 
					{
						l1.devolucion(l1.getEjemplares(), l1.getPrestados());
						
					}else
					{
						l2.devolucion(l2.getEjemplares(), l2.getPrestados());
					}

			
		}while(menu < 4);

	}

}
