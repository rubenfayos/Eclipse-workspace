
public class Directivo extends Empleado{
	
	public Directivo() {
		
	}
	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase empleado-->directivo";
		return frase;
	}

}
