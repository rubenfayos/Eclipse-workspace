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

		cancion[] disco1 = new cancion[5];
		
		disco1[0] = new cancion(01, "Esta cabron ser yo", 251, 1);
		disco1[1] = new cancion(02, "Si veo a tu mama", 182, 2);
		disco1[2] = new cancion(03, "La difícil", 173, 3);
		disco1[3] = new cancion(04, "Pero ya no", 232, 3);
		disco1[4] = new cancion(05, "Safaera", 203, 2);
		
		cancion[] disco2 = new cancion[5];
		
		disco2[0] = new cancion(01, "La droga", 265, 1);
		disco2[1] = new cancion(02, "Si veo a tu mama", 109, 4);
		disco2[2] = new cancion(03, "Booker T", 154, 2);
		disco2[3] = new cancion(04, "100 millones", 201, 5);
		disco2[4] = new cancion(05, "120", 198, 4);
		
		cancion[] disco3 = new cancion[5];
		
		disco3[0] = new cancion(01, "Future nostalgia", 205, 1);
		disco3[1] = new cancion(02, "Love again", 189, 2);
		disco3[2] = new cancion(03, "Cool", 134, 2);
		disco3[3] = new cancion(04, "Don't start now", 198, 2);
		disco3[4] = new cancion(05, "Levitating", 173, 4);
		
		cancion[] disco4 = new cancion[5];
		
		disco4[0] = new cancion(01, "Montero", 205, 4);
		disco4[1] = new cancion(02, "Industry baby", 189, 3);
		disco4[2] = new cancion(03, "Dead right now", 134, 2);
		disco4[3] = new cancion(04, "Scoop", 198, 1);
		disco4[4] = new cancion(05, "Thats what I want", 173, 4);
		
		cancion[] disco5 = new cancion[5];
		
		disco5[0] = new cancion(01, "Bussiness", 175, 5);
		disco5[1] = new cancion(02, "Soldier", 136, 5);
		disco5[2] = new cancion(03, "Drips", 156, 5);
		disco5[3] = new cancion(04, "Superman", 198, 4);
		disco5[4] = new cancion(05, "Without me", 200, 3);
		
		cancion[] disco6 = new cancion[5];
		
		disco6[0] = new cancion(01, "Kill you", 170, 1);
		disco6[1] = new cancion(02, "Stan", 187, 3);
		disco6[2] = new cancion(03, "The real slim shady", 140, 4);
		disco6[3] = new cancion(04, "Amityville", 201, 5);
		disco6[4] = new cancion(05, "Im back", 213, 3);
		
		cancion[] disco7 = new cancion[5];
		
		disco7[0] = new cancion(01, "Greatest", 179, 2);
		disco7[1] = new cancion(02, "Lucky you", 157, 1);
		disco7[2] = new cancion(03, "The alfreds theme", 190, 1);
		disco7[3] = new cancion(04, "Power", 232, 2);
		disco7[4] = new cancion(05, "Black", 205, 3);
		
		cancion[] disco8 = new cancion[5];
		
		disco8[0] = new cancion(01, "Distorted", 159, 1);
		disco8[1] = new cancion(02, "Praise the lord", 177, 1);
		disco8[2] = new cancion(03, "Asap Rmx", 180, 3);
		disco8[3] = new cancion(04, "Stunt on you", 182, 5);
		disco8[4] = new cancion(05, "Leave some day", 251, 5);
		
		cancion[] disco9 = new cancion[5];
		
		disco9[0] = new cancion(01, "No la dejes caer", 199, 5);
		disco9[1] = new cancion(02, "Billetes azules", 200, 1);
		disco9[2] = new cancion(03, "Tyler Herro", 160, 1);
		disco9[3] = new cancion(04, "Im Poppin", 221, 4);
		disco9[4] = new cancion(05, "Safaera", 222, 2);
		
		cancion[] disco10 = new cancion[5];
		
		disco10[0] = new cancion(01, "Azul", 169, 3);
		disco10[1] = new cancion(02, "Rojo", 197, 1);
		disco10[2] = new cancion(03, "Morado", 180, 2);
		disco10[3] = new cancion(04, "Verde", 212, 5);
		disco10[4] = new cancion(05, "Negro", 157, 5);
		
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
				listarDiscos(discos);
				listarCancionesDisco();
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

	public static void listarCancionesDisco( ) {
		System.out.println("Selecciona el disco que quieres visualizar:");
		Scanner teclado = new Scanner(System.in);
		int disco = teclado.nextInt();
		
		if(disco == 1) {
			for(int i = 0; i < disco.length; i++ ) {
				System.out.println("Disco: " + discos[i].getNombre() + " , año: " + discos[i].getAño());
			}
			
			
			
		}
		
	
	}
	
	public static boolean valorarCancion(disco[] discos){
		boolean comp = false;
		
		return comp;
	}
}
