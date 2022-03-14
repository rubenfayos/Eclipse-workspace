
public class Television extends Electrodomestico{
	
	public int resolucion;
	public boolean smartv;
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSmartv() {
		return smartv;
	}
	public void setSmartv(boolean smartv) {
		this.smartv = smartv;
	}
	
	public Television() {
		this.resolucion=20;
		this.smartv= false;
	}
	
	public Television(int precioBase, int peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.resolucion=20;
		this.smartv= false;
	}
	
	public Television(int precioBase, int peso, String color, char consumoEnergetico, int resolucion, boolean smartv) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion=resolucion;
		this.smartv=smartv;
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
		
		if(this.resolucion>40) {
			precioFinal=(int) (precioFinal*1.3);
		}
		
		if(this.smartv == true) {
			precioFinal+=50;
		}
		
		precioFinal+=getPrecioBase();
		
		return precioFinal;
	}
	
}
