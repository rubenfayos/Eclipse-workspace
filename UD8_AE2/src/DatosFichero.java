import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DatosFichero {
	
	public void muestraContenido() throws FileNotFoundException, IOException { 
		String cadena;
		FileReader f = new FileReader("ficheros\\categorias"); 
		BufferedReader b = new BufferedReader(f); 
		while((cadena = b.readLine())!=null) { 
			System.out.println(cadena); 
		} 
		b.close(); 
	}
}
