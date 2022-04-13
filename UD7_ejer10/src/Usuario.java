
public class Usuario {
	
	private String nombre, apellidos;
	private String fechaRegistro;
	private int edad;
	
	public String getNombre() {
		return this.nombre;
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
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public Usuario(String nombre, String apellido, String fecha, int edad) {
		this.nombre=nombre;
		this.apellidos=apellido;
		this.fechaRegistro=fecha;
		this.edad=edad;
	}

}
