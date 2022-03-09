
public class Electrodomestico {
	
	private int precioBase, peso;
	private String color;
	private char consumoEnergetico;
	
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	public Electrodomestico() {
		this.precioBase=100;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso=5;
		
	}
	
	public Electrodomestico(int precioBase, int peso, String color, char consumoEnergetico) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.consumoEnergetico=consumoEnergetico;
		
		if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||color.equalsIgnoreCase("rojo") ||color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris"))
			this.color = color;
			else
				System.out.println("Color no válido");
		
	}
	
	public void comprobarConsumo() {
		if(this.consumoEnergetico == 'A' || this.consumoEnergetico == 'B' || this.consumoEnergetico == 'C' || this.consumoEnergetico == 'D' || this.consumoEnergetico == 'E' || this.consumoEnergetico == 'F')
			System.out.println("Consumo válido");
			
		else
			System.out.println("Consumo no válido");
			this.consumoEnergetico='F';
	}
	
	public void comprobarColor() {
		if(this.color.equalsIgnoreCase("blanco") || this.color.equalsIgnoreCase("negro") || this.color.equalsIgnoreCase("rojo") || this.color.equalsIgnoreCase("azul") || this.color.equalsIgnoreCase("gris"))
			System.out.println("Color válido");
			
		else
			System.out.println("Color no válido");
			this.color="blanco";
	}
	
	public int precioFinal() {
		
		int precioFinal = 0;
		
		switch (this.consumoEnergetico) {
		
			case 'A': precioFinal=100;
			break;
			case 'B': precioFinal=80;
			break;
			case 'C': precioFinal=60;
			break;
			case 'D': precioFinal=50;
			break;
			case 'E': precioFinal=30;
			break;
			case 'F': precioFinal=10;
			break;
		}
		
		if(this.peso < 19) {
			precioFinal+=10;
		}else if(this.peso >= 19 && this.peso < 50) {
			precioFinal+=50;
		}else if(this.peso >= 50 && this.peso < 79) {
			precioFinal+=80;
		}else if(this.peso >= 79) {
			precioFinal+=100;
		}
		
		return precioFinal;
	}

}
