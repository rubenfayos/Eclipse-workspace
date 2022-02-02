package principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String tirada;
		String tiradamaq = "";
		maquina m = new maquina();
		
		System.out.println("Hola, introduce tu nombre");
		
		String nombre = teclado.nextLine();
		
		
		
		int i = 0, n = 0;
		
		do {
			
			System.out.println("La puntuación actual es: " + nombre + " " + i + ", la máquina " + n);
			System.out.println("Introduce tu siguiente tirada (piedra | papel | tijera)");
			
			tirada = teclado.nextLine();
			
			tiradamaq = m.tirada();
			
			if(tirada.equalsIgnoreCase(tiradamaq)) {
				
				System.out.println("¡Empate!");
					
			} else if(tirada.equalsIgnoreCase("piedra") && tiradamaq.equalsIgnoreCase("papel")) {
				n++;
				System.out.println("Perdiste");
			}else if(tirada.equalsIgnoreCase("piedra") && tiradamaq.equalsIgnoreCase("tijera")) {
				i++;
				System.out.println("Ganaste");
			}else if(tirada.equalsIgnoreCase("tijera") && tiradamaq.equalsIgnoreCase("papel")) {
				i++;
				System.out.println("Ganaste");
			}else if(tirada.equalsIgnoreCase("tijera") && tiradamaq.equalsIgnoreCase("piedra")) {
				n++;
				System.out.println("Perdiste");
			}else if(tirada.equalsIgnoreCase("papel") && tiradamaq.equalsIgnoreCase("piedra")) {
				i++;
				System.out.println("Ganaste");
			}else if(tirada.equalsIgnoreCase("papel") && tiradamaq.equalsIgnoreCase("tijera")) {
				n++;
				System.out.println("Perdiste");
			}	
			
		}while(i < 3 || n < 3);
		
		if(i == 3) {
			System.out.println("¡Enhorabuena, has ganado!");
		}else {
			System.out.println("Qué pena, has perdido :(");
		}
		
	}

}
