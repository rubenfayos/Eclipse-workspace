
public class Usuario {
	
	private String nombre, nif;
	private int edad, puntos;
	private char tipoCarnet;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public char getTipoCarnet() {
		return tipoCarnet;
	}
	public void setTipoCarnet(char tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String nif, int edad, int puntos, char tipoCarnet) {
		this.nombre=nombre;
		this.nif=nif;
		this.edad=edad;
		this.puntos=puntos;
		this.tipoCarnet=tipoCarnet;
	}
	
	

}
