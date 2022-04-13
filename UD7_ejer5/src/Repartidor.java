
public class Repartidor extends Empleado{
	
	private String zona;
	
	public Repartidor() {
		
	}
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona=zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase Repartidor.";
		return frase;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Los datos del empleado son los siguientes:"+ 
				"\nNombre: " + this.getNombre() +
				"\nEdad: " + this.getEdad() +
				"\nSalario: " + this.getSalario() +
				"\nZona: " + this.zona + "\n" + this.toString());
		this.toString();
	}
	
	public void plus(){
		if(this.getEdad()<25 && this.zona.equalsIgnoreCase("Zona 3")) {
			this.setSalario(this.getSalario()+this.getPlus());
		}
		
	}

}
