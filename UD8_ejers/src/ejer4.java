import java.util.ArrayList;
import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> divisas = new ArrayList<String>();
		
		divisas.add("€");
		divisas.add("$");
		divisas.add("Y");
		divisas.add("BTC");
		
		System.out.println("Introduce la divisa que quieras: (1 € | 2 $ | 3 Y | 4 BTC)");
		
		int eleccion = teclado.nextInt();
		
		if(eleccion > 4) {
			System.out.println("Elección incorrecta");
		}else {
			System.out.println("Has elegido: " + divisas.get(eleccion-1));
		}
		
		

	}

}
