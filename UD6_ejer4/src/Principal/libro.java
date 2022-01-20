package Principal;

public class libro {
	
	//variables
	
	private String titulo, autor;
	private int ejemplares, prestados;
	
	//constructores
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	public int getEjemplares() {
		return this.ejemplares;
	}
	
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public int getPrestados() {
		return this.prestados;
	}
	
	public libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		
	}
	
	public void prestamo(int ejemplares, int prestados) {
		
		if(ejemplares > 0) {
			this.ejemplares--;
			this.prestados++;
			System.out.println("True");
		}else {
			System.out.println("False");
		}	
	}
	
	public void devolucion(int ejemplares, int prestados) {
		if(prestados > 0) {
			this.ejemplares++;
			this.prestados--;
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
	
}
