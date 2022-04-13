
public class Main {

	public static void main(String[] args) {

		Empleado[] arrayEmpleados = new Empleado[5];
		
		arrayEmpleados[0] = new Repartidor("Rubén", 23, 1400, "Zona 1");
		arrayEmpleados[1] = new Repartidor("Samuel", 27, 1800, "Zona 2");
		arrayEmpleados[2] = new Repartidor("Alfredo", 23, 2100, "Zona 3");
		arrayEmpleados[3] = new Comercial("Carles", 31, 2150, 250);
		arrayEmpleados[4] = new Comercial("Ferran", 27, 1340, 170);
		
		for(int i = 0; i < arrayEmpleados.length; i++) {
			arrayEmpleados[i].mostrarDatos();
		}

	}

}
