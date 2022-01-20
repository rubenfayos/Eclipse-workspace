package principal;

public class cafetera {

	private int capacidadMaxima, capacidadActual;
	
	public cafetera() {
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}
	
	public int getcapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public int getcapacidadActual() {
		return this.capacidadActual;
	}
	
	public void llenarCafetera() {
		this.capacidadActual = this.capacidadMaxima;
		System.out.println("Cafetera llenada");
	}
	
	public void servirTaza(int cantidad) {
		if(this.capacidadActual >= cantidad) {
			this.capacidadActual-= cantidad;
			System.out.println("Taza servida");
		}else {
			System.out.println("No es posible");
	}	
		
	}
	
	public void vaciarCafetera() {
		this.capacidadActual = 0;
		System.out.println("Cafetera vaciada");
	}
	
	public void ponerCafe(int cantidad) {
		if((this.capacidadActual + cantidad) <= this.capacidadMaxima) {
		this.capacidadActual+= cantidad;
		System.out.println("Cafe puesto");
		}else {
			System.out.println("No es posible");
		}
	}
}
