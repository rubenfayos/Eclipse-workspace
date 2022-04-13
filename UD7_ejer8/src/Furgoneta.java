
public class Furgoneta extends Vehiculo{
	
	private int carga, traccion, ventanasOpacas;
	private boolean asientoDesmontable;
	
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getTraccion() {
		return traccion;
	}
	public void setTraccion(int traccion) {
		
		if(traccion == 2 || traccion == 4) {
			this.traccion = traccion;
		}else {
			System.out.println("La traccion debe ser 2 o 4 ruedas");
		}
	}
	public int getVentanasOpacas() {
		return ventanasOpacas;
	}
	public void setVentanasOpacas(int ventanasOpacas) {
		this.ventanasOpacas = ventanasOpacas;
	}
	public boolean isAsientoDesmontable() {
		return asientoDesmontable;
	}
	public void setAsientoDesmontable(boolean asientoDesmontable) {
		this.asientoDesmontable = asientoDesmontable;
	}
	
	public Furgoneta() {

	}
	
	public Furgoneta(int numSerie, int año, int precio, String marca, boolean enStock, int carga, int traccion, int ventanasOpacas, boolean asientoDesmontable) {
		super(numSerie, año, precio, marca, enStock);
		this.carga=carga;
		this.traccion=traccion;
		this.ventanasOpacas=ventanasOpacas;
		this.asientoDesmontable=asientoDesmontable;
	}

	
}
