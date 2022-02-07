import java.util.Scanner;

public class main {

	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		String salto = "";
		int menu;
		int random;
		
		//Series
		
		serie[] series = new serie[6];
		series[0] = new serie("El juego del calamar", 01, 1, 2021, 2, 4.8);
		series[1] = new serie("Peaky Blinders", 02, 5, 2013, 3, 4.9);
		series[2] = new serie("The mandalorian", 03, 2, 2019, 2, 4.6);
		series[3] = new serie("Hora de aventuras", 04, 9, 2003, 1, 4.3);
		series[4] = new serie("Bob Esponja", 05, 1, 1999, 1, 4.1);
		series[5] = new serie("Arrow", 06, 1, 2012, 3, 3.9);
		
		episodio[] episodios = new episodio[30];
		
		//Serie1
		
		episodios[0] = new episodio(1, 01, "El resplandor", 22.30, series[0]);
		episodios[1] = new episodio(1, 02, "Problemas", 21.33, series[0]);
		episodios[2] = new episodio(1, 03, "Pelea", 20.12, series[0]);
		episodios[3] = new episodio(1, 04, "Solucion", 19.40, series[0]);
		episodios[4] = new episodio(1, 05, "Final", 24.34, series[0]);
		
		//Serie2
		
		episodios[5] = new episodio(1, 02, "Inicio", 25.24, series[1]);
		episodios[6] = new episodio(2, 03, "Tommy", 20.00, series[1]);
		episodios[7] = new episodio(3, 05, "Cancion", 25.40, series[1]);
		episodios[8] = new episodio(4, 02, "Las peleas", 19.40, series[1]);
		episodios[9] = new episodio(1, 8, "Muerte", 30.20, series[1]);
		
		//Serie3
		
		episodios[10] = new episodio(1, 01, "Brasil", 23.40, series[2]);
		episodios[11] = new episodio(2, 05, "Vida", 29.23, series[2]);
		episodios[12] = new episodio(2, 04, "La pelea definitiva", 21.59, series[2]);
		episodios[13] = new episodio(2, 07, "El principio del fin", 26.45, series[2]);
		episodios[14] = new episodio(1, 01, "El ataque de los clones", 22.30, series[2]);
		
		//Serie4
		
		episodios[15] = new episodio(1, 23, "Hora de aventuras", 13.40, series[3]);
		episodios[16] = new episodio(1, 05, "Vida despues de la muerte", 19.23, series[3]);
		episodios[17] = new episodio(1, 06, "Ricardio corazón", 11.59, series[3]);
		episodios[18] = new episodio(1, 9, "La princesa chicle", 16.45, series[3]);
		episodios[19] = new episodio(1, 8, "Finn el humano", 12.30, series[3]);
		
		//Serie5
		
		episodios[20] = new episodio(1, 01, "Ayuda", 13.40, series[4]);
		episodios[21] = new episodio(1, 05, "Patricio Estrella", 19.23, series[4]);
		episodios[22] = new episodio(1, 14, "Crustaceo Crujiente", 11.59, series[4]);
		episodios[23] = new episodio(1, 07, "Calamardo", 16.45, series[4]);
		episodios[24] = new episodio(1, 01, "Final", 12.30, series[4]);
		
		//Serie6
		
		episodios[25] = new episodio(1, 11, "Episodio 1", 13.40, series[5]);
		episodios[26] = new episodio(1, 15, "Cambio", 19.23, series[5]);
		episodios[27] = new episodio(1, 04, "Disparos", 11.59, series[5]);
		episodios[28] = new episodio(1, 17, "Sangre", 16.45, series[5]);
		episodios[29] = new episodio(1, 01, "Tyler herro", 12.30, series[5]);
		
		System.out.println("Esta aplicación funciona como un reproductor de series y sus episodios, tambien tiene una funcion de recomendador de series y un generador de series aleatorias.");

		
do {
			
			System.out.println("elige una de las siguientes opciones: \n1)Ver Series \n2)Ver episodios \n3)Recomendador de series \n4)Serie aleatoria \n5)Salir");
			
			menu = teclado.nextInt();
		
		switch (menu) {
			case 1:
				verseries(series);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 2:
				
				verepisodios(series, episodios);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
				
		break;
			case 3:
				recomendar(series);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 4:
				random = (int) (Math.random()*7);
				System.out.println("La serie aleatoria es: ");
				System.out.println(series[random].getNombre() + " " + series[random].getAño() + ", Temporadas: " + series[random].getTemporadas());
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
		default: System.out.println("Opción incorrecta");
		System.out.println("Pulsa para continuar...");
		teclado.nextLine();
		salto = teclado.nextLine();
		}
		
		}while(menu != 5);
	
	System.out.println("Has salido del programa con éxito.");

	}
	
	public static void verseries(serie[] series) {
		System.out.println("Estas son las series que tenemos disponibles: ");
		
		for(int i = 0; i < series.length; i++) {
			System.out.println((i+1) + ") Nombre: " + series[i].getNombre() + ", Año: " + series[i].getAño() + ", Temporadas: " + series[i].getTemporadas() + ", Público: " + series[i].gettipopublico() + ", Valoracion: " + series[i].getValoracion()+ "/5.");
		}
	}
	
	public static void verepisodios(serie[] series, episodio[] episodios) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Estas son las series que tenemos disponibles: ");
		
		for(int i = 0; i < series.length; i++) {
			System.out.println((i+1) + ") " + series[i].getNombre() + " " + series[i].getAño() + ", Temporadas: " + series[i].getTemporadas());
		}
		
		System.out.println("Elige la serie para ver los episodios: ");
		int serie = teclado.nextInt() -1;
		
		System.out.println("Episodios de " + series[serie].getNombre() + ":");
		
		for(int i = 0; i < episodios.length; i++) {
			if(series[serie] == episodios[i].getserie()) {
				System.out.println("Episodio " + episodios[i].getEpisodio() + ", temporada " + episodios[i].getTemporada() + ", nombre: " + episodios[i].getNombre() + ", duración " + episodios[i].getDuracion());
			}
		}
	}
	
	public static void recomendar(serie[] series) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para que tipo de público buscas: (1 niños | 2 jóvenes | 3 Adultos)");
		int publico = teclado.nextInt();
		System.out.println("Buscas series con 1 temporada o más (1 temporada única | 2 más)");
		int temporadas = teclado.nextInt();
		System.out.println("La serie recomendada es: ");
		for(int i = 0; i < series.length; i++) {
			if(publico == series[i].getPublico()) {
				if(temporadas == 1) {
					if(series[i].getTemporadas() == 1) {
				System.out.println(series[i].getNombre() + " " + series[i].getAño() + ", Temporadas: " + series[i].getTemporadas());
					}
				}else {
					if(series[i].getTemporadas() > 1) {
						System.out.println(series[i].getNombre() + " " + series[i].getAño() + ", Temporadas: " + series[i].getTemporadas());
					}
				}
			}
		}	
	}				
}
