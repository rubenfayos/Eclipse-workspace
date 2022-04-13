
public class episodio {
	
	//Atributos
	
	private String nombre;
	private int temporada, episodio;
	private double duracion;
	private serie serie;
	
	//Getters/Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public int getEpisodio() {
		return episodio;
	}
	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	//Constructores
	
	public episodio() {
		
	}
	
	public episodio(int temporada, int episodio, String nombre, double duracion, serie serie) {
		
		this.nombre = nombre;
		this.temporada = temporada;
		this.episodio = episodio;
		this.duracion = duracion;
		this.serie = serie;
	}
	
	public void setserie(serie serie) {
		this.serie = serie;
	}
	
	public serie getserie() {
		return this.serie;
	}
	
	

}
