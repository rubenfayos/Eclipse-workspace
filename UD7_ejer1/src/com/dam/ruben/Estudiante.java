package com.dam.ruben;

public class Estudiante extends Persona{
	
	private int NumeroExpendiente;
	private String curso_actual;
	private double notas[] = new double[7];
	
	
	public int getNumeroExpendiente() {
		return NumeroExpendiente;
	}
	public void setNumeroExpendiente(int numeroExpendiente) {
		NumeroExpendiente = numeroExpendiente;
	}
	public String getCurso_actual() {
		return curso_actual;
	}
	public void setCurso_actual(String curso_actual) {
		this.curso_actual = curso_actual;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public Estudiante(String nombre, int edad, int Numeroexpediente, String curso_actual) {
		super(nombre, edad);
		this.NumeroExpendiente=Numeroexpediente;
		this.curso_actual=curso_actual;
	}
	
	public double getnotamedia() {
		double media = 0;
		for(int i = 0; i < this.notas.length; i++) {
			media+=this.notas[i];
		}
		
		return media/7;	
	}

}
