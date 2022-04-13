
public class Empleado {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String frase = this.nombre + "es un objeto de la clase empleado";
		return frase;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

}
