
public class Jugador {
	
	private int numero, golesAnotados, minutos;
	private String nombre;
	private String posicion;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public Jugador() {
		
	}
	
	public int getGolesAnotados() {
		return golesAnotados;
	}
	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public Jugador(int numero, int golesAnotados, int minutos, String nombre, String posicion) {
		this.numero=numero;
		this.golesAnotados=golesAnotados;
		this.minutos=minutos;
		this.nombre=nombre;
		this.posicion=posicion;
	}
	
	

}
