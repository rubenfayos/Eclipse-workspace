
public class Portero extends Jugador{
	
	private int golesEncajados, minutosSinGol;

	public int getGolesEncajados() {
		return golesEncajados;
	}

	public void setGolesEncajados(int golesEncajados) {
		this.golesEncajados = golesEncajados;
	}

	public int getMinutosSinGol() {
		return minutosSinGol;
	}

	public void setMinutosSinGol(int minutosSinGol) {
		this.minutosSinGol = minutosSinGol;
	}
	
	public Portero(int numero, int minutos,  int golesAnotados, String nombre, String posicion, int golesEncajados, int minutosSinGol) {
		super(numero, minutos, golesAnotados, nombre, posicion);
		this.setPosicion("POR");
		this.golesEncajados=golesEncajados;
		this.minutosSinGol=minutosSinGol;
	}
	
	

}
