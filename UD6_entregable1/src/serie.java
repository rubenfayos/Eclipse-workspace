
public class serie {
	
	//Atributos
	
	private String nombre;
	private int temporadas, año, codigo, publico;
	double valoracion;
	
	//Getters/Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPublico() {
		return publico;
	}
	public void setPublico(int publico) {
		this.publico = publico;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	
	//Constructores
	
	public serie() {
		
	}
	
	public serie(String nombre, int codigo, int temporadas, int año, int publico, double valoracion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.temporadas = temporadas;
		this.año = año;
		this.publico = publico;
		this.valoracion = valoracion;
	}
	
	public String gettipopublico() {
		if(this.publico == 1) {
			return "Infantil";
		}else if(this.publico == 2) {
			return "Jóvenes";
		}else if(this.publico == 3) {
			return "Adultos";
		}else
			return "";
		
	}
	
	public boolean temporadas(int num) {
	
		if(this.temporadas == 1 && num == 1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean compserie() {

		if (this.codigo > 0) {
			return true;
		}else
			return false;
	}
	
	

}
