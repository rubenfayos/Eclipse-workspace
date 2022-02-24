import java.util.Date;

public class Usuario {
	
	private String nombre, apellidos;
	private Date fechaRegistro;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellido, Date fechaRegistro, int edad) {
		this.nombre=nombre;
		this.apellidos=apellido;
		this.fechaRegistro=fechaRegistro;
		this.edad=edad;
	}

}
