package Elementos;

public class coche {
	
	//Variables
	
	private String marca, color, modelo;
	
	//Constructores
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return this.modelo;
	}

	public void Coche(String marca, String color, String modelo) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}
	
	public coche() {
		
	}

	
}
