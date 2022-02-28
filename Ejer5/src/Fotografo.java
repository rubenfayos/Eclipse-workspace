
public class Fotografo {
	
	public static final int futbol = '1';
	public static final int tenis = '2';
	
	private String nombreCompleto;
	private int edad, tipo, fotosSemana, maxFotos;
	private int fotos;
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getFotosSemana() {
		return fotosSemana;
	}
	public void setFotosSemana(int fotosSemana) {
		this.fotosSemana = fotosSemana;
	}
	public int getMaxFotos() {
		return maxFotos;
	}
	public void setMaxFotos(int maxFotos) {
		this.maxFotos = maxFotos;
	}
	
	public Fotografo() {
		
	}
	
	public Fotografo(String nombreCompleto, int edad, int tipo, int fotosSemana) {
		this.nombreCompleto=nombreCompleto;
		this.edad=edad;
		this.tipo=tipo;
		this.fotosSemana=fotosSemana;
		
		if(edad>60) {
			this.maxFotos=500;
		}else {
			this.maxFotos=600;
		}
		
		
	}
	
	public double obtenerSueldo(){
		
		double foto= 0;
		
		if(this.tipo==1 && this.fotosSemana>=250) {
			foto=5;
		}else if(this.tipo==1 && this.fotosSemana<250) {
			foto=3.5;
		}else if(this.tipo==2 && this.fotosSemana>=250) {
			foto=4;
		}else if(this.tipo==2 && this.fotosSemana<250) {
			foto=3;
		}
		
		return (this.fotosSemana * foto * 4);
		
	}
	
	public void añadirFotos(int fotos) {
		
		if(fotos >= 0 && this.maxFotos >= (fotos+this.fotosSemana)) {
			this.fotosSemana+=fotos;
			System.out.println("True");
		}else {
			System.out.println("False");
		}	
	}
	
	
	public void fotosDisponibles() {
		System.out.println("El número de fotografías disponibles de " + this.nombreCompleto + " es: " + (this.maxFotos-this.fotosSemana));
	}

}
