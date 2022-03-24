
public class Hotel {
	
	private int idHotel;
	private String zona;
	private double precio;
	
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Hotel() {
		
	}
	
	public Hotel(int idHotel, String zona, double precio) {
		this.idHotel=idHotel;
		this.zona=zona;
		this.precio=precio;
	}
}
