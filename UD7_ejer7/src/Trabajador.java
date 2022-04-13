import java.util.Date;

public class Trabajador {
	
	private String nombre, puesto, direccion, NSS;
	private int telefono;
	private Date fechaNacimiento, fechaContratacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	
	public Trabajador() {
		
	}
	
	public Trabajador(String nombre, String puesto, String direccion, int telefono, Date fechaNacimiento, Date fechaContratacion, String NSS) {
		this.nombre=nombre;
		this.puesto=puesto;
		this.direccion=direccion;
		this.telefono=telefono;
		this.fechaNacimiento=fechaNacimiento;
		this.fechaContratacion=fechaContratacion;
		this.NSS=NSS;
	}
	
	public String toString() {
		return "Este objeto pertenece a la clase Trabajador";
	}


}
