package principal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		cancion c1 = new cancion("Piensan", "Mike Towers");
		
		System.out.println("Introduce el nombre de la canción: ");
		
		cancion c2 = new cancion();
		
		c2.setTitulo(teclado.nextLine());
		
		System.out.println("Ahora el autor: ");
		
		c2.setAutor(teclado.nextLine());
		
		System.out.println("Canción 1:");
		
		System.out.print("La cancion es " + c1.getTitulo() + " por " + c1.getAutor() + "\n");
		
		System.out.println("Canción 2:");
		
		System.out.print("La cancion es " + c2.getTitulo() + " por " + c2.getAutor());
		
		

	}

}
