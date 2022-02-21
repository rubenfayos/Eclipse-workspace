
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poligono p1 = new Triangulo(3.25, 4.55, 2.71);
		Poligono p2 = new Rectangulo(5.7, 2.29);
		
		System.out.println("El perimetro de p1 es: " + p1.perimetro());
		
		System.out.println("El perimetro de p2 es: " + p2.perimetro());

	}

}
