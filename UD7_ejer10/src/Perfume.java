
public class Perfume extends Articulo{
	
	private int tamaño;

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public Perfume() {
		
	}
	
	public Perfume(String categoria, int precio, boolean descuento, int tamaño) {
		super(categoria, precio, descuento);
		this.tamaño=tamaño;
	}

}
