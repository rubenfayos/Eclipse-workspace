import java.util.ArrayList;

public class ejer1 {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Ruben");
		nombres.add("Samuel");
		nombres.add("Carles");
		nombres.add("Jordi");
		nombres.add("Pau");
		nombres.add("Antoni");
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}

	}

}
