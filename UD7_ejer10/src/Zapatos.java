
public class Zapatos extends Articulo{
	
	private int talla;
	private String material;
	
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Zapatos() {
		
	}
	
	public Zapatos(String categoria, int precio, boolean descuento, int talla, String material) {
		super(categoria, precio, descuento);
		this.talla=talla;
		this.material=material;
	}

}
