import java.util.Scanner;

public class CompletarArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del array: ");

		int N = teclado.nextInt();
		
		int[] numeros = new int[N];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i]=i;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
