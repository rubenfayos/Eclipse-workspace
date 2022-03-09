
public class Lavadora extends Electrodomestico{
	
	private int carga;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public Lavadora() {
		this.carga=5;
		
	}
	
	public Lavadora(int precioBase, int peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga=carga;
		
	}

}
