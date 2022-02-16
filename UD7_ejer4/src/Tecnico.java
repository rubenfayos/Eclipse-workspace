
public class Tecnico extends Empleado{

	public Tecnico() {
		
	}
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase empleado-->operario-->tecnico";
		return frase;
	}
}
