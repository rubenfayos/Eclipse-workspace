package Elementos;

	/**
	 * @author Fayos
	 * @version 1.0
	 * @since 19/01/2022
	 * <h2>coche</h2>
	 * Esta clase creara un coche al que se le asignarán una serie de atributos.
	 */

public class coche {
	
	//Variables
	
	private String marca, color, modelo;
	
	//Constructores
	
	/**
	 * Método set para marca 
	 * @param Marca Marca del coche
	 */
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Método get para marca 
	 * @param Marca Marca del coche
	 * @return Devuelve la marca
	 */
	
	public String getMarca(){
		return this.marca;
	}
	
	/**
	 * Método set para color
	 * @param Color Color del coche
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Método get para color
	 * @param Color Color del coche
	 * @return Devuelve el color
	 */
	
	public String getColor(){
		return this.color;
	}
	
	/**
	 * Método set para modelo
	 * @param Modelo Modelo del coche
	 */
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Método get para modelo
	 * @param Modelo Modelo del coche
	 * @return Devuelve el modelo
	 */
	
	public String getModelo(){
		return this.modelo;
	}
	
	/**
	 * Método de creación del objeto coche
	 * @param Marca Marca del coche
	 * @param Color Color del coche
	 * @param Modelo Modelo del coche
	 */

	public void Coche(String marca, String color, String modelo) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}
	
	/**
	 * Método por defecto para la creación de un coche
	 */
	
	public coche() {
		
	}

	
}
