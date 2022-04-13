
public class ProfesorEnfermo extends Profesor{

	public ProfesorEnfermo(String nombre, int edad, String Despacho) {
		super(nombre, edad, Despacho);
	}

	@Override
	public void getConsultas() {
		System.out.println(this.getNombre() + " está enfermo, se suspenden las consultas hasta que se recupere.");
	}
}
