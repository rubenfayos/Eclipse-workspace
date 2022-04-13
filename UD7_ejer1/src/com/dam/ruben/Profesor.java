package com.dam.ruben;

public class Profesor extends Persona {

	private String Despacho;
	private String HorarioTutorias;
	
	
	public String getDespacho() {
		return Despacho;
	}
	public void setDespacho(String despacho) {
		Despacho = despacho;
	}
	public String getHorarioTutorias() {
		return HorarioTutorias;
	}
	public void setHorarioTutorias(String horarioTutorias) {
		HorarioTutorias = horarioTutorias;
	}
	
	public void getConsultas() {
		System.out.println(this.getNombre() + " tiene tutoria " + this.getHorarioTutorias());
	}
	
	public Profesor(String nombre, int edad, String Despacho) {
		super(nombre, edad);
		this.Despacho=Despacho;
	}
	

}
