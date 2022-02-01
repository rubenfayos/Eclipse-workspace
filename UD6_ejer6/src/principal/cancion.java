package principal;

public class cancion {
	
	private String titulo, autor;
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public cancion(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	public cancion() {
		this.titulo="";
		this.autor="";
	}
	
}
