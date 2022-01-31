package biblioteca;

public class libro {
	
	private int id, numpag, estado;
	private String ISBN, titulo, autor, tematica;
	private char tema;
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getid() {
		return this.id;
	}
	
	public void setnumpag(int numpag) {
		this.numpag = numpag;
	}
	
	public int getnumpag() {
		return this.numpag;
	}
	
	public void setestado(int estado) {
		this.estado = estado;
	}
	
	public int getestado() {
		return this.estado;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
			return this.titulo;
	}
	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	public libro(int id, int numpag, int estado, String ISBN, String titulo, String autor, char tema) {
		this.id=id;
		this.numpag=numpag;
		this.estado = estado;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		if(tema == 'T') {
			this.tematica = "Terror";
		}else if(tema == 'C') {
			this.tematica = "Ciencia ficción";
		}else if(tema == 'H') {
			this.tematica = "Humor";
		}else if(tema == 'S') {
			this.tematica = "Suspense";
		}
	}
	

}
