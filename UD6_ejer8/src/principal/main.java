package principal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		cuerpo c1 = new cuerpo();
		
		System.out.println("Vamos a crear un cuerpo, primero introduce su masa en kg: ");
		
		c1.setmasa(teclado.nextInt());
		
		System.out.println("Ahora la densidad: ");
		
		c1.setdensidad(teclado.nextInt());
		
		System.out.println("Ahora el diametro: ");
		
		c1.setdiametro(teclado.nextInt());
		
		System.out.println("Ahora la distancia al sol: ");
		
		c1.setdissol(teclado.nextInt());
		
		System.out.println("Ahora la añadele un id: ");
		
		c1.setid(teclado.nextInt());
		
		teclado.nextLine();
		
		System.out.println("Ahora añadelé un nombre: ");
		
		c1.setnombre(teclado.nextLine());
		
		System.out.println("Por último vamos a añadirle las lunas, primero introduce la cantidad de lunas: ");
		
		c1.setnumlunas(teclado.nextInt());
		
		teclado.nextLine();
		
		for(int i = 0; i < c1.getnumlunas(); i++ ) {
			System.out.println("La luna " + (i+1) + " es: ");
			c1.lunas(i, teclado.nextLine());
		}
		
		System.out.println("El planeta creado es el siguiente: ");
		
		System.out.println("Nombre: " + c1.getnombre());
		System.out.println("Masa: " + c1.getmasa());
		System.out.println("Densidad: " + c1.getdensidad());
		System.out.println("Diametro: " + c1.getdiametro());
		System.out.println("Distancia al sol: " + c1.getdissol());
		System.out.println("Id: " + c1.getid());
		System.out.println("En total tiene " + c1.getnumlunas() + " lunas.");
		
		for(int i = 0; i < c1.getnumlunas(); i++ ) {
			System.out.print(c1.getluna(i)+ " ");
		}
		
		
		
	}

}
