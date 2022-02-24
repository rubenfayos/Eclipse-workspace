
public class Pantalon extends Articulo{
	
	public static final int CORTO = '1';
	public static final int LARGO = '2';
	
	private int talla;
	private int tipo;
	
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public Pantalon() {
		
	}
	
	public Pantalon(String categoria, int precio, boolean descuento, int talla, int tipo) {
		super(categoria, precio, descuento);
		this.talla=talla;
		this.tipo=tipo;
	}
	
	

}
