
public class CocheLujo extends Vehiculo{

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
	
	public CocheLujo() {
		
	}
	
	public CocheLujo(int numSerie, int año, int precio, String marca, boolean enStock, int cantPasajeros, int numPuertas) {
		super(numSerie, año, precio, marca, enStock);
		this.numPuertas=numPuertas;
		this.cantPasajeros=cantPasajeros;
	}

}

