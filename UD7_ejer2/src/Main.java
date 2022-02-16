
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] arrayEmpleados = new Empleado[3];
		
		arrayEmpleados[0] = new Empleado("Ruben", "20882841Z", 18, true, 2000.21);
		arrayEmpleados[1] = new Empleado("Samuel", "20892312Y", 21, false, 1740.67);
		arrayEmpleados[2] = new Empleado("Carles", "20654211Ñ", 27, true, 2576.09);
		
		Programador[] arrayProgramadores = new Programador[3];
		
		arrayProgramadores[0] = new Programador("Ruben", "20882841Z", 18, true, 2000.21, 600, "Ingles");
		arrayProgramadores[1] = new Programador("Samuel", "20892312Y", 21, false, 1740.67, 150, "Castellano");
		arrayProgramadores[2] = new Programador("Carles", "20654211Ñ", 27, true, 2576.09, 350, "Alemán");
		
		for(int i = 0; i < arrayEmpleados.length; i++) {
			arrayEmpleados[i].mostrarDatos();
		}
		
		for(int i = 0; i < arrayProgramadores.length; i++) {
			arrayProgramadores[i].mostrarDatos();
			System.out.print("Nivel de programación: ");
			arrayProgramadores[i].nivelProgramacion();
		}
		
	}

}
