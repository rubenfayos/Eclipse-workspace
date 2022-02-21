
public class Vehiculo {
	
	private int numSerie, a�o, precio;
	private String marca;
	private boolean enStock;
	
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isEnStock() {
		return enStock;
	}
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int numSerie, int a�o, int precio, String marca, boolean enStock) {
		this.numSerie=numSerie;
		this.a�o=a�o;
		this.precio=precio;
		this.marca=marca;
		this.enStock=enStock;
	}

}
