
public class Empleado {
	
	private String nombre, dni;
	private int edad;
	private boolean casado;
	private double salario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.casado=casado;
		this.salario=salario;
	}
	
	public String clasificacion() {
		String clas = "";
		if(this.edad < 18) {
			clas="novato";
		}else if(this.edad >= 18 && this.edad <= 25) {
			clas="junior";
		}else {
			clas="Senior";
		}
		
		return clas;
	}
	
	public void mostrarDatos() {
		System.out.println("Los datos del empleado son los siguientes:"+ 
				"\nNombre: " + this.nombre +
				"\nDni: " + this.dni +
				"\nEdad: " + this.edad +
				"\nCasado: " + this.casado + 
				"\nSalario: " + this.salario + 
				"\nClasificacion: " + clasificacion());
	}
	
	public void aumentarSueldo(int porcentaje) {
		this.salario = this.salario * porcentaje;
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	
}
