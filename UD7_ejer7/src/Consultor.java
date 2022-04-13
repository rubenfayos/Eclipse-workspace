import java.util.Date;

public class Consultor extends Trabajador{
	
	private int horas;
	private double tarifa;
	
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public Consultor() {
		
	}
	
	public Consultor(String nombre, String puesto, String direccion, int telefono, Date fechaNacimiento, Date fechaContratacion, String NSS, int horas, double tarifa) {
		super(nombre, puesto, direccion, telefono, fechaNacimiento, fechaContratacion, NSS);
		this.horas=horas;
		this.tarifa=tarifa;
	}
	
	public double calcularPaga() {
		return this.horas * this.tarifa;
	}

}
