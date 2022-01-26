package Principal;

/**
 * @author Fayos
 * @version 1.0
 * @since 19/01/2022
 */

public class libro {
	
	//variables
	
	private String titulo, autor;
	private int ejemplares, prestados;
	
	//constructores
	
	/**
	 * Metodo set de T�tulo
	 * @param titulo T�tulo del libro
	 */
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Metodo get de T�tulo
	 * @param titulo T�tulo del libro
	 */
	
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * M�todo set del autor
	 * @param autor Autor del libro
	 */
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * M�todo get del autor
	 * @param autor Autor del libro
	 */
	
	public String getAutor() {
		return this.autor;
	}
	
	/**
	 * M�todo set de ejemplares
	 * @param ejemplares Cantidad de ejemplares de un libro
	 */
	
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	/**
	 * M�todo get de ejemplares
	 * @param ejemplares Cantidad de ejemplares de un libro
	 */
	
	
	public int getEjemplares() {
		return this.ejemplares;
	}
	
	/**
	 * M�todo set de prestados
	 * @param prestados Cantidad de libros prestados
	 */
	
	
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	/**
	 * M�todo get de prestados
	 * @param prestados Cantidad de libros prestados
	 */
	
	public int getPrestados() {
		return this.prestados;
	}
	
	/**
	 * M�todo de creacion de un libro
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param ejemplares Cantidad de ejemplares de un libro
	 * @param prestados Cantidad de libros prestados
	 */
	
	
	public libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		
	}
	
	/**
	 * M�todo de prestamo de un libro
	 * @param ejemplares Cantidad de ejemplares de un libro
	 * @param prestados Cantidad de libros prestados
	 */
	
	public void prestamo(int ejemplares, int prestados) {
		
		if(ejemplares > 0) {
			this.ejemplares--;
			this.prestados++;
			System.out.println("True");
		}else {
			System.out.println("False");
		}	
	}
	
	/**
	 * M�todo de devolucion de un libro
	 * @param ejemplares Cantidad de ejemplares de un libro
	 * @param prestados Cantidad de libros prestados
	 */
	
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
