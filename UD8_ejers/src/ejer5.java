import java.util.HashMap;
import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		HashMap<Integer, Double> combustible = new HashMap<Integer, Double>();
		
		combustible.put(1, 1.50);
		combustible.put(2, 1.40);
		combustible.put(3, 1.60);
		combustible.put(4, 1.70);
		
		System.out.println("Estos son los precios del combustible, elige el que quieras: "
				+ "\n1)Gasolina: 1.50 "
				+ "\n2)Diesel: 1.40"
				+ "\n3)Sin Plomo: 1.60"
				+ "\n4)Sin Plomo 98: 1.70");
		
		int eleccion=teclado.nextInt();
		
		System.out.println("Ahora introduce la cantidad de L que quieres repostar: ");
		
		int litros=teclado.nextInt();
		
		System.out.println("El precio total es " + (combustible.get(eleccion)*litros) + "€.");

		
	}

}
