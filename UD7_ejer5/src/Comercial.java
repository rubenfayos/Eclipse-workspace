
public class Comercial extends Empleado{
	
	private double comision;
	
	public Comercial() {
		
	}
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	@Override
	public String toString() {
		String frase = this.getNombre() + "es un objeto de la clase Comercial.";
		return frase;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Los datos del empleado son los siguientes:"+ 
				"\nNombre: " + this.getNombre() +
				"\nEdad: " + this.getEdad() +
				"\nSalario: " + this.getSalario() +
				"\nComision: " + this.comision + "\n" + this.toString());
		this.toString();
	}
	
	public void plus(){
		if(this.getEdad()>30 && this.comision > 200) {
			this.setSalario(this.getSalario()+this.getPlus());
		}
		
	}


}
