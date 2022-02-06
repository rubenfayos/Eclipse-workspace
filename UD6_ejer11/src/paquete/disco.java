package paquete;

public class disco {
	
	private int id, genero, año;
	String nombre, autor;
	
	
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
	
	public cancion[] canciones() {
		cancion[] disco1 = new cancion[5];
		
		disco1[0] = new cancion(01, "Esta cabron ser yo", 251, 1);
		disco1[1] = new cancion(02, "Si veo a tu mama", 182, 2);
		disco1[2] = new cancion(03, "La difícil", 173, 3);
		disco1[3] = new cancion(04, "Pero ya no", 232, 3);
		disco1[4] = new cancion(05, "Safaera", 203, 2);
		return disco1;
	}


}
