
public class Vehiculo {
	
	private int numSerie, año, precio;
	private String marca;
	private boolean enStock;
	
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
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
	
	public Vehiculo(int numSerie, int año, int precio, String marca, boolean enStock) {
		this.numSerie=numSerie;
		this.año=año;
		this.precio=precio;
		this.marca=marca;
		this.enStock=enStock;
	}

}
