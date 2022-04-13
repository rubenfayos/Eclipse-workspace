
public class Operario extends Empleado{
	
	public Operario() {
		
	}
	
	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase empleado-->operario";
		return frase;
	}

}
