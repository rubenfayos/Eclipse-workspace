package com.dam.ruben;

public class Main {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Rubén Fayos", 18, 001, "1º Dam");
		
		double notas[] = new double[7];
		
		notas[0] = 8.3;
		notas[1] = 9.3;
		notas[2] = 7.4;
		notas[3] = 8.2;
		notas[4] = 8.6;
		notas[5] = 5.9;
		notas[6] = 7.1;
		e1.setNotas(notas);
		
		Profesor p1 = new Profesor("Juan Mateu", 40, "4");
		p1.setHorarioTutorias("Jueves de 11:00 a 12:00 en la sala de Inglés 1");
		
		System.out.println("Estudiante 1: " + e1.getNombre() + ", edad " + e1.getEdad() + ", num. expediente " + e1.getNumeroExpendiente() + ", curso actual " + e1.getCurso_actual());
		System.out.println("La nota media es: " + e1.getnotamedia());
		System.out.println("Profesor 1: " + p1.getNombre() + ", edad " + p1.getEdad() + ", despacho " + p1.getDespacho());
		p1.getConsultas();
		
		Persona[] personas = new Persona[4];
		
		personas[0] = new Profesor("Juan Mateu", 25, "Hola");
		personas[1] = new Estudiante("Rubén", 18, 11, "1º DAM");
		personas[2] = new Profesor("Salva", 31, "Informatica 1");
		personas[3] = new Estudiante("Samuel", 19, 12, "2º Dam");

	}

}
