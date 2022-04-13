
public class Articulo {
	
	private String categoria;
	private int precio;
	private boolean descuento;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isDescuento() {
		return descuento;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	
	public Articulo() {
		
	}
	
	public Articulo(String categoria, int precio, boolean descuento) {
		this.categoria=categoria;
		this.precio=precio;
		this.descuento=descuento;
	}
}
