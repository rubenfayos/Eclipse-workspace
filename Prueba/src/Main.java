import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner teclado = new Scanner(System.in);
		
		DatosFichero d = new DatosFichero();
		
		d.muestraContenido();
		
		
	}	
}
