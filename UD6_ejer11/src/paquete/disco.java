package paquete;

public class disco {
	
	private int id, genero, año;
	String nombre, autor;
	cancion[] canciones = new cancion[5];
	
	//Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	// Constructores
	
	public disco(int id, String nombre, String autor, int genero, int año) {
		this.id=id;
		this.nombre=nombre;
		this.autor=autor;
		this.genero=genero;
		this.año=año;	
	}
	
	public int getDuracionTotalDisco(cancion[] canciones) {
		int duracion=0;
		
		for(int i = 0; i < canciones.length; i++) {
			duracion+=canciones[i].getDuracion();
		}
		
		return duracion;
	}
	
	public int getValoracionDisco(cancion[] canciones) {
		int valoracion=0;
		
		for(int i = 0; i < canciones.length; i++) {
			valoracion+=canciones[i].getDuracion();
		}
		
		valoracion/=canciones.length;
		
		return valoracion;
	}
	
	

}
