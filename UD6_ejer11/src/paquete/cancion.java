package paquete;

public class cancion {
	
	//Variables
	
	private int id, duracion, valoracion;
	private String nombre;
	
	//getters & setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructores
	
	public cancion() {
		
	}
	
	public cancion(int id, String nombre, int duracion, int valoracion) {
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.valoracion = valoracion;
	}

}
