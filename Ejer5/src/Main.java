import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<String> Palabras = new HashSet<String>();
		
		Palabras.add("Esto");
		Palabras.add("es");
		Palabras.add("una");
		Palabras.add("prueba");
		
		
		for(String palabra : Palabras) {
			System.out.print(palabra + " ");
		}
		
		if(Palabras.contains("una")) {
			System.out.print("\nEl conjunto tiene una ");
		}
		
		
	}
}
