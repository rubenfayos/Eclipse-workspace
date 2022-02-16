
public class Oficial extends Empleado{
	
	public Oficial() {
		
	}
	
	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase empleado-->operario-->oficial";
		return frase;
	}

}
