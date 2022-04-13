import java.util.Scanner;

public class Poligono {
	
	private int numLados;

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public Poligono() {
		
	}
	
	public Poligono(int numLados) {
		this.numLados=numLados;
	}

	@Override
	public String toString() {
		return "Este objeto pertenece a la clase Poligono";
	}
	
	public double perimetro() {
		Scanner teclado = new Scanner(System.in);
		double perimetro = 0;
		
		for(int i = 1; i <= this.numLados; i++) {
			System.out.println("Introduce el lado " + i + ":");
			perimetro+=teclado.nextDouble();
		}
		
		return perimetro;
	}

}
