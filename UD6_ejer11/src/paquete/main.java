package paquete;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String salto = "";
		int menu;
		
		disco[] discos = new disco[10];
		
		discos[0] = new disco(01, "YHLQMDLG", "Bad bunny", 1, 2020);
		discos[1] = new disco(01, "El último tour del mundo", "Bad bunny", 2, 2021);
		discos[2] = new disco(01, "Future nostalgia", "Dua lipa", 3, 2018);
		discos[3] = new disco(01, "Montero", "Lil nas X", 4, 2020);
		discos[4] = new disco(01, "Recovery", "Eminem", 5, 2002);
		discos[5] = new disco(01, "The Marshal Matherslp", "Eminem", 1, 2001);
		discos[6] = new disco(01, "Suicidal", "Eminem", 2, 2020);
		discos[7] = new disco(01, "Donda", "Kanye West", 3, 2020);
		discos[8] = new disco(01, "Eniac", "Ozuna", 4, 2020);
		discos[9] = new disco(01, "Colores", "J Balvin", 5, 2020);

		cancion[] canciones = new cancion[50];
		//Disco 1
		
		canciones[0] = new cancion(01, "Esta cabron ser yo", 251, 1, discos[0]);
		canciones[1] = new cancion(02, "Si veo a tu mama", 182, 2, discos[0]);
		canciones[2] = new cancion(03, "La difícil", 173, 3, discos[0]);
		canciones[3] = new cancion(04, "Pero ya no", 232, 3, discos[0]);
		canciones[4] = new cancion(05, "Safaera", 203, 2, discos[0]);
		
		//Disco 2
		
		canciones[5] = new cancion(01, "La droga", 265, 1, discos[1]);
		canciones[6] = new cancion(02, "Si veo a tu mama", 109, 4, discos[1]);
		canciones[7] = new cancion(03, "Booker T", 154, 2, discos[1]);
		canciones[8] = new cancion(04, "100 millones", 201, 5, discos[1]);
		canciones[9] = new cancion(05, "120", 198, 4, discos[1]);
		
		//Disco 3
		
		canciones[10] = new cancion(01, "Future nostalgia", 205, 1, discos[2]);
		canciones[11] = new cancion(02, "Love again", 189, 2, discos[2]);
		canciones[12] = new cancion(03, "Cool", 134, 2, discos[2]);
		canciones[13] = new cancion(04, "Don't start now", 198, 2, discos[2]);
		canciones[14] = new cancion(05, "Levitating", 173, 4, discos[2]);
		
		//Disco 4
		
		canciones[15] = new cancion(01, "Montero", 205, 4, discos[3]);
		canciones[16] = new cancion(02, "Industry baby", 189, 3, discos[3]);
		canciones[17] = new cancion(03, "Dead right now", 134, 2, discos[3]);
		canciones[18] = new cancion(04, "Scoop", 198, 1, discos[3]);
		canciones[19] = new cancion(05, "Thats what I want", 173, 4, discos[3]);
		
		//Disco 5
		
		canciones[20] = new cancion(01, "Bussiness", 175, 5, discos[4]);
		canciones[21] = new cancion(02, "Soldier", 136, 5, discos[4]);
		canciones[22] = new cancion(03, "Drips", 156, 5, discos[4]);
		canciones[23] = new cancion(04, "Superman", 198, 4, discos[4]);
		canciones[24] = new cancion(05, "Without me", 200, 3, discos[4]);
		
		//Disco 6
		
		canciones[25] = new cancion(01, "Kill you", 170, 1, discos[5]);
		canciones[26] = new cancion(02, "Stan", 187, 3, discos[5]);
		canciones[27] = new cancion(03, "The real slim shady", 140, 4, discos[5]);
		canciones[28] = new cancion(04, "Amityville", 201, 5, discos[5]);
		canciones[29] = new cancion(05, "Im back", 213, 3, discos[5]);
		
		//Disco 7
		
		canciones[30] = new cancion(01, "Greatest", 179, 2, discos[6]);
		canciones[31] = new cancion(02, "Lucky you", 157, 1, discos[6]);
		canciones[32] = new cancion(03, "The alfreds theme", 190, 1, discos[6]);
		canciones[33] = new cancion(04, "Power", 232, 2, discos[6]);
		canciones[34] = new cancion(05, "Black", 205, 3, discos[6]);
		
		//Disco 8
		
		canciones[35] = new cancion(01, "Distorted", 159, 1, discos[7]);
		canciones[36] = new cancion(02, "Praise the lord", 177, 1, discos[7]);
		canciones[37] = new cancion(03, "Asap Rmx", 180, 3, discos[7]);
		canciones[38] = new cancion(04, "Stunt on you", 182, 5, discos[7]);
		canciones[39] = new cancion(05, "Leave some day", 251, 5, discos[7]);
		
		//Disco 9
		
		canciones[40] = new cancion(01, "No la dejes caer", 199, 5, discos[8]);
		canciones[41] = new cancion(02, "Billetes azules", 200, 1, discos[8]);
		canciones[42] = new cancion(03, "Tyler Herro", 160, 1, discos[8]);
		canciones[43] = new cancion(04, "Im Poppin", 221, 4, discos[8]);
		canciones[44] = new cancion(05, "Safaera", 222, 2, discos[8]);
		
		//Disco 10
		
		canciones[45] = new cancion(01, "Azul", 169, 3, discos[9]);
		canciones[46] = new cancion(02, "Rojo", 197, 1, discos[9]);
		canciones[47] = new cancion(03, "Morado", 180, 2, discos[9]);
		canciones[48] = new cancion(04, "Verde", 212, 5, discos[9]);
		canciones[49] = new cancion(05, "Negro", 157, 5, discos[9]);
		
do {
			
			System.out.println("elige una de las siguientes opcciones: \n1)Listar discos \n2)Listar canciones de un disco \n3)Valorar cancion \n4)Recomendador de canciones \n5)Salir");
			
			menu = teclado.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println("Estos son los discos:");
				listarDiscos(discos);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 2:
				System.out.println("Estos son los discos:");
				listarCancionesDisco(discos, canciones);
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
				
		break;
			case 3:
				System.out.println("Estos son los discos:");
				if(valorarCancion(discos) == true) {
					System.out.println("Se ha puesto la valoración correctamente");
				}else {
					System.out.println("La operación ha fallado");
				}
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 4:
				
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
		default: System.out.println("Opción incorrecta");
		System.out.println("Pulsa para continuar...");
		teclado.nextLine();
		salto = teclado.nextLine();
		}
		
		}while(menu < 4 || menu > 1);
		

	}
	
	public static void listarDiscos(disco[] discos) {
		
		for(int i = 0; i < discos.length; i++ ) {
			System.out.println("Disco: " + discos[i].getNombre() + " , año: " + discos[i].getAño());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
}

	public static void listarCancionesDisco(disco[] discos, cancion[] canciones) {
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < discos.length; i++ ) {
			System.out.println((i+1) + ") Disco: " + discos[i].getNombre() + " , año: " + discos[i].getAño());
		}
		
		System.out.println("Selecciona el disco que quieres visualizar:");
		
		int disco = teclado.nextInt() - 1;
	
			for(int i = 0; i < canciones.length; i++ ) {
				if(discos[disco] == canciones[i].getdisco()) {
				System.out.println("Nombre: " + canciones[i].getNombre() + ", duracion: " + canciones[i].getDuracion() + "s, valoracion: " + canciones[i].getValoracion());
				}
			}	
		}
	
	public static boolean valorarCancion(disco[] discos){
		boolean comp = false;
		
		return comp;
	}
}
