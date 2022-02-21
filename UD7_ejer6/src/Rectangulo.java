import java.util.Scanner;

public class Rectangulo extends Poligono{
	
	private double lado1, lado2;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(double lado1, double lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	
	@Override
	public String toString() {
		return "Este objeto pertenece a la clase Rectangulo";
	}
	
	@Override
	public double perimetro() {
		double perimetro = this.lado1 * 2 + this.lado2 * 2;
		
		return perimetro;
	}

}
