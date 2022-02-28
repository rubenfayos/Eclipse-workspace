import java.util.Scanner;

public class multiplicacionElementosArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del array: ");
		
		int array = teclado.nextInt();
		
		System.out.println("Introduce por que número quieres dividir el array: ");
		
		int A = teclado.nextInt();
		
		int[] numeros = new int[array];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número " + (i+1) + ": ");
			numeros[i]=teclado.nextInt();
		}
		
		double resultado = 1;
		
		for(int i = 0; i < numeros.length; i++) {
			resultado*= numeros[i];
		}
		
		System.out.println("El resultado final es: " + (resultado/A));

		
		

	}

}
