
public class Perfume extends Articulo{
	
	private int tama�o;

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	public Perfume() {
		
	}
	
	public Perfume(String categoria, int precio, boolean descuento, int tama�o) {
		super(categoria, precio, descuento);
		this.tama�o=tama�o;
	}

}
