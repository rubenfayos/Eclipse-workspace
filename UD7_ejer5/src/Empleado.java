
public class Empleado {
	
	private final int PLUS = 500;
	private String nombre;
	private int edad;
	private double salario;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getPlus() {
		return this.PLUS;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public void mostrarDatos() {
		System.out.println("Los datos del empleado son los siguientes:"+ 
				"\nNombre: " + this.nombre +
				"\nEdad: " + this.edad +
				"\nSalario: " + this.salario + "\n" + this.toString());
		
	}
	
	public String toString() {
		String frase = this.nombre + "es un objeto de la clase Empleado.";
		return frase;
	}

}
