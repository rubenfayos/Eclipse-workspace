
public class Compacto extends Vehiculo{
	
	private int cantPasajeros, numPuertas;

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public Compacto() {
		
	}
	
	public Compacto(int numSerie, int a�o, int precio, String marca, boolean enStock, int cantPasajeros, int numPuertas) {
		super(numSerie, a�o, precio, marca, enStock);
		this.numPuertas=numPuertas;
		this.cantPasajeros=cantPasajeros;
	}

}
