
public class Camiseta extends Articulo{
	
	private char talla;
	private String color;
	
	public char getTalla() {
		return talla;
	}
	public void setTalla(char talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Camiseta() {
		
	}
	
	public Camiseta(String categoria, int precio, boolean descuento, char talla, String color) {
		super(categoria,precio, descuento);
		this.talla=talla;
		this.color=color;
	}

}
