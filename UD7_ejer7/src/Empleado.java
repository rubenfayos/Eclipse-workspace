import java.util.Date;

public class Empleado extends Trabajador{
	
	private double sueldo, impuestos;

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String puesto, String direccion, int telefono, Date fechaNacimiento, Date fechaContratacion, String NSS, double sueldo, double impuestos) {
		super(nombre, puesto, direccion, telefono, fechaNacimiento, fechaContratacion, NSS);
		this.sueldo=sueldo;
		this.impuestos=impuestos;
	}
	

	public double calcularPaga() {
		return (this.sueldo - this.impuestos) / 14;
	}

}
