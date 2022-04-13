
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
	
	@Override
	
	public int precioFinal() {
		
		int precioFinal = 0;
		
		switch (this.getConsumoEnergetico()) {
		
			case 'A': precioFinal+=100;
			break;
			case 'B': precioFinal+=80;
			break;
			case 'C': precioFinal+=60;
			break;
			case 'D': precioFinal+=50;
			break;
			case 'E': precioFinal+=30;
			break;
			case 'F': precioFinal+=10;
			break;
		}
		
		if(this.getPeso() < 19) {
			precioFinal+=10;
		}else if(this.getPeso() >= 19 && this.getPeso() < 50) {
			precioFinal+=50;
		}else if(this.getPeso() >= 50 && this.getPeso() < 79) {
			precioFinal+=80;
		}else if(this.getPeso() >= 79) {
			precioFinal+=100;
		}
		
		if(this.carga>30) {
			precioFinal+=50;
		}
		
		precioFinal+=getPrecioBase();
		
		return precioFinal;
	}


}
