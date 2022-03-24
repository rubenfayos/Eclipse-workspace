import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	
	private HashMap<String, String> traducciones = new HashMap<String, String>();
	private String idioma;
	
	public HashMap<String, String> getTraducciones() {
		return traducciones;
	}

	public void setTraducciones(HashMap<String, String> traducciones) {
		this.traducciones = traducciones;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Diccionario() {
		
	}
	
	public Diccionario(HashMap<String, String> traducciones, String idioma) {
		this.traducciones = traducciones;
		this.idioma = idioma;
	}
	
	public void recuperarPalabra() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la palabra en espa�ol: ");
		
		String espa�ol=teclado.nextLine();
		
		
		if(this.traducciones.containsKey(espa�ol)) {
		System.out.println("La palabra " + espa�ol + " en "+ this.idioma +" es: " + this.traducciones.get(espa�ol));
		}else {
			System.out.println("Esa palabra no existe, vamos a a�adirla");
			a�adirEntrada();
		}
		
	}
	
	public void a�adirEntrada() {
		Scanner teclado = new Scanner(System.in);
		String traduccion="";
		
		System.out.println("Introduce la palabra en espa�ol: ");
		
		String espa�ol=teclado.nextLine();
		
		System.out.println("Introduce la traducci�n en " + this.idioma + ": ");
			traduccion=teclado.nextLine();
			this.traducciones.put(espa�ol, traduccion);
		System.out.println("Palabra a�adida correctamente.");
			

	}		
}

