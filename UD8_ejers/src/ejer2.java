import java.util.ArrayList;

public class ejer2 {

	public static void main(String[] args) {

		int tamaño= (int)Math.floor(Math.random()*(20-10+1)+10);
		int suma = 0;
		int max = 0;
		int min = 100;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
				
		for(int i = 0; i < tamaño; i++) {
			numeros.add((int)Math.floor(Math.random()*(100-0+1)+0));
			System.out.println(numeros.get(i));
			suma+= numeros.get(i);
			if(i>0){
				if(numeros.get(i) < min) {
					min=numeros.get(i);
				}else if(numeros.get(i) > max) {
					max=numeros.get(i);
				}
			}
			
		}
		
		
		
		System.out.println("La suma total es: " + suma);
		System.out.println("La media es: " + (suma/tamaño));
		System.out.println("El mínimo es: " + min);
		System.out.println("El máximo es: " + max);


	}

}
