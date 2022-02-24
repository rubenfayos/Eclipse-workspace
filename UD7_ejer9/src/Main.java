
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Jugador[] jugadores = new Jugador[12];
		
		jugadores[0] = new Portero(1, 0, 453, "Rub�n Fayos", "", 5, 123);
		jugadores[1] = new Portero(13, 0, 103, "Antoni","", 2, 21);
		jugadores[2] = new Portero(99, 0, 673, "Samuel", "", 9, 211);
		
		jugadores[3] = new Jugador(5, 2, 1021, "Sergio", "DEF");
		jugadores[4] = new Jugador(6, 1, 421, "Salva", "DEF");
		jugadores[5] = new Jugador(7, 5, 867, "Carles", "DEF");
		
		jugadores[6] = new Jugador(8, 4, 1022, "Jordi", "MED");
		jugadores[7] = new Jugador(9, 7, 1200, "Pau", "MED");
		jugadores[8] = new Jugador(10, 2, 845, "Borja", "MED");

		jugadores[9] = new Jugador(11, 21, 1672, "Alex", "DEL");
		jugadores[10] = new Jugador(16, 12, 1400, "Arnau", "DEL");
		jugadores[11] = new Jugador(23, 14, 999, "Oscar", "DEL");
		
		System.out.println("Indica lo que quieres hacer: \n1)Listar los jugadores \n2)Listar por posici�n \n3)Listar por goles anotados \n4)Listar por minutos jugados \n5)Listar porteros por goles encajados");
		
		int menu = teclado.nextInt();
		
		switch (menu){
			case 1: 
				System.out.println("Aqu� est�n los jugadores:");
				listarJugadores(jugadores);
		break;
			
			case 2: 
				System.out.println("introduce la posici�n que quieres listar: (1 Portero, 2 Defensa, 3 Medio, 4 Delantero)");
				menu=teclado.nextInt();
				listarPorPosicion(jugadores, menu);
		break;
		
			case 3:
				System.out.println("Este es el orden de los jugadores por goles");
				listarPorGoles(jugadores);
				System.out.println("Este es el orden de los jugadores por goles");
				listarPorGoles(jugadores);
		break;
		
			case 4:
				System.out.println("Este es el orden de los jugadores por minutos");
				listarPorMinutos(jugadores);
		break;
			case 5:
				System.out.println("Este es el orden de los porteros por goles encajados");
				listarPorGolesEncajados(jugadores);
		break;
			
		
		}
		
		
		System.out.println();
		
	}
	
	public static void listarJugadores(Jugador[] jugadores) {
		
		for(int i = 0; i<jugadores.length; i++) {
			if(jugadores[i] instanceof Portero) {
				Portero ref=(Portero)jugadores[i];
				System.out.println("Posici�n: " + jugadores[i].getPosicion() + ", nombre: " + jugadores[i].getNombre() + ", n�mero: " + jugadores[i].getNumero() + ", minutos jugados " + jugadores[i].getMinutos() + ", goles encajados: " + ref.getGolesEncajados() + ", minutos sin encajar: " + ref.getMinutosSinGol());
			}else
				System.out.println("Posici�n: " + jugadores[i].getPosicion() + ", nombre: " + jugadores[i].getNombre() + ", n�mero: " + jugadores[i].getNumero() + ", minutos jugados " + jugadores[i].getMinutos() + ", goles anotados: " + jugadores[i].getGolesAnotados());
		}
		
		
	}

	public static void listarPorPosicion(Jugador[] jugadores, int menu) {
		
		String pos="";
		
		switch (menu) {
		case 1: pos="POR";
		break;
		case 2: pos="DEF";
		break;
		case 3: pos="MED";
		break;
		case 4: pos="DEL";
		break;
		}
		
		for(int i = 0; i<jugadores.length; i++) {
			if(jugadores[i].getPosicion().equals(pos)) {
				if(jugadores[i] instanceof Portero) {
					Portero ref=(Portero)jugadores[i];
					System.out.println("Posici�n: " + jugadores[i].getPosicion() + ", nombre: " + jugadores[i].getNombre() + ", n�mero: " + jugadores[i].getNumero() + ", minutos jugados " + jugadores[i].getMinutos() + ", goles encajados: " + ref.getGolesEncajados() + ", minutos sin encajar: " + ref.getMinutosSinGol());
				}else
					System.out.println("Posici�n: " + jugadores[i].getPosicion() + ", nombre: " + jugadores[i].getNombre() + ", n�mero: " + jugadores[i].getNumero() + ", minutos jugados " + jugadores[i].getMinutos() + ", goles anotados: " + jugadores[i].getGolesAnotados());
			}
		}

		
		
	}

	public static void listarPorGoles(Jugador[] jugadores) {
		
		int[] jugadoresaux = new int[12];
		
		int num=0;
		for(int i = 3; i<jugadores.length; i++) {
			for(int x = 3; x<jugadores.length; x++) {		
				if(jugadores[x].getGolesAnotados() >= jugadores[num].getGolesAnotados()) {
				num = x;
				}	
			}
			System.out.println("Posici�n: " + jugadores[num].getPosicion() + ", nombre: " + jugadores[num].getNombre() + ", n�mero: " + jugadores[num].getNumero() + ", minutos jugados " + jugadores[num].getMinutos() + ", goles anotados: " + jugadores[num].getGolesAnotados());
			jugadoresaux[num]=jugadores[num].getGolesAnotados();
			jugadores[num].setGolesAnotados(0);
		}
		
		for(int x = 0; x<jugadores.length; x++) {
			jugadores[x].setGolesAnotados(jugadoresaux[x]);
			}
		

	}
	
	public static void listarPorMinutos(Jugador[] jugadores) {
		
		int num=0;
		for(int i = 0; i<jugadores.length; i++) {
			for(int x = 0; x<jugadores.length; x++) {		
				if(jugadores[x].getMinutos() >= jugadores[num].getMinutos()) {
				num = x;
				}	
			}
			System.out.println("Posici�n: " + jugadores[num].getPosicion() + ", nombre: " + jugadores[num].getNombre() + ", n�mero: " + jugadores[num].getNumero() + ", minutos jugados " + jugadores[num].getMinutos() + ", goles anotados: " + jugadores[num].getGolesAnotados());
			jugadores[num].setMinutos(num);
		}

	}

	public static void listarPorGolesEncajados(Jugador[] jugadores) {
		
		int num=0;
		for(int i = 0; i<jugadores.length; i++) {
			if(jugadores[i] instanceof Portero) {
				Portero ref=(Portero)jugadores[i];
				for(int x = 0; x<jugadores.length; x++) {
					if(jugadores[x] instanceof Portero) {
						Portero ref2=(Portero)jugadores[x];
						if(ref.getGolesEncajados() >= ref2.getGolesEncajados()) {
							ref = ref2;
						}
					}	
				}
				System.out.println("Posici�n: " + ref.getPosicion() + ", nombre: " + ref.getNombre() + ", n�mero: " + ref.getNumero() + ", minutos jugados " + ref.getMinutos() + ", goles encajados: " + ref.getGolesEncajados() + ", minutos sin encajar: " + ref.getMinutosSinGol());
				ref.setGolesEncajados(99);
			}
		}

	}
		
}
	
