
public class Camiseta extends Articulo{
	
	private String color, talla;
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
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
	
	public Camiseta(String categoria, int precio, boolean descuento, String talla, String color) {
		super(categoria,precio, descuento);
		this.talla=talla;
		this.color=color;
	}

}
