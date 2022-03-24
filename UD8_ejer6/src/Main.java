import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> ingles = new HashMap<String, String>();
		
		ingles.put("hola", "Hello");
		ingles.put("coche", "Car");
		ingles.put("adios", "Bye");
		ingles.put("dia", "Day");
		ingles.put("cancion", "Song");
		ingles.put("volar", "Fly");

		Diccionario d1 = new Diccionario(ingles, "Ingles");
		
		HashMap<String, String> aleman = new HashMap<String, String>();
		
		aleman.put("hola", "hallo");
		aleman.put("cancion", "lied");
		aleman.put("coche", "wagen");
		aleman.put("adios", "Tschüss");
		aleman.put("volar", "fliegen");
		aleman.put("dia", "Tag");
		
		Diccionario d2= new Diccionario(aleman, "aleman");
		
		d1.recuperarPalabra();
		d1.recuperarPalabra();
		d2.recuperarPalabra();
		d2.recuperarPalabra();

	}

}
