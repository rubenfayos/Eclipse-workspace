
public class Main {

	public static void main(String[] args) {
		
		Fotografo[] listaFotografos = new Fotografo[3];
		
		listaFotografos[0] = new Fotografo("Rubén Fayos Medie", 30, 1, 260);
		listaFotografos[1] = new Fotografo("Samuel", 59, 2, 230);
		listaFotografos[2] = new Fotografo("Carles", 62, 1, 300);
		
		for(int i = 0; i<listaFotografos.length; i++) {
			
			System.out.println("Fotografo " + (i+1) + ": ");
			System.out.println("Nombre: " + listaFotografos[i].getNombreCompleto());
			System.out.println("Edad: " + listaFotografos[i].getEdad());
			System.out.println("Número de fotografias realizadas: " + listaFotografos[i].getFotosSemana());
			System.out.println("Número máximo de fotografias: " + listaFotografos[i].getMaxFotos() + "\n");
			
		}
		
		System.out.println(listaFotografos[1].getNombreCompleto());
		
		for(int i = 0; i<listaFotografos.length; i++) {
			
			System.out.println("El sueldo mensual de " + listaFotografos[i].getNombreCompleto() + " es: " + listaFotografos[i].obtenerSueldo() + "€");
			
		}
		
		System.out.println("");
		
		listaFotografos[1].setEdad(60);
		
		listaFotografos[1].añadirFotos(100);
		
		//Para que veas que falla al añadir fotos
		//             V
		
		listaFotografos[0].añadirFotos(400);
		
		System.out.println("\nEl nuevo sueldo mensual de " + listaFotografos[1].getNombreCompleto() + " es: " + listaFotografos[1].obtenerSueldo() + "€\n");
		
		for(int i = 0; i<listaFotografos.length; i++) {
			
			listaFotografos[i].fotosDisponibles();
			
		}

	}

}
