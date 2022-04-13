import java.util.ArrayList;

public class ejer3 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);
		numeros.add(7);
		numeros.add(9);
		numeros.add(10);
		numeros.add(1);
		numeros.add(5);
		numeros.add(8);
		numeros.add(6);
		
		numeros.sort((o1, o2) -> o1.compareTo(o2));
		
		for(int i=0; i<10; i++) {
			System.out.println(numeros.get(i));
		}

	}

}
