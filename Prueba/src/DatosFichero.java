import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DatosFichero {
	
	public void muestraContenido() throws FileNotFoundException, IOException { 
		String cadena;
		FileReader f = new FileReader("C:\\Users\\USER\\eclipse-workspace\\Prueba\\src\\ficheros\\productos.txt"); 
		BufferedReader b = new BufferedReader(f); 
		Producto p1 = b.readLine(1);
		b.close(); 
	}
	
	public DatosFichero() {
		
	}
}
