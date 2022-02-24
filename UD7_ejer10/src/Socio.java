import java.util.Date;

public class Socio extends Usuario{
	
	private int descuento, talla;

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}
	
	public Socio() {
		
	}
	
	public Socio(int talla, String nombre, String apellido, Date fechaRegistro, int edad) {
		super(nombre, apellido, fechaRegistro, edad);
		this.talla=talla;
	}

}
