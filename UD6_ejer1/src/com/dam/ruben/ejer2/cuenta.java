package com.dam.ruben.ejer2;

public class cuenta {
	
	//Variables
	
	private String nombre, numcuenta;
	private double interes, saldo;
	
	//Constructores
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNumcuenta() {
		return this.numcuenta;
	}
	
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public double getInteres() {
		return this.interes;
	}
	
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public cuenta() {
		
	}
	
	//Constructores
	
	public void ingreso(double cantidad) {
		
		if(cantidad > 0) {
		this.saldo = this.saldo + cantidad;
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public void reintegro(double cantidad) {
	
	
	if(this.saldo > cantidad) {	
		if(cantidad > 0) {
		this.saldo = this.saldo - cantidad;
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		}else {
			System.out.println("No hay suficiente dinero");
		}
	}
	
	public void transferencia1(double cantidad, cuenta c2) {
		
		this.saldo= this.saldo - cantidad;
		c2.saldo = c2.saldo + cantidad;
		
	}
	
	public void transferencia2(double cantidad, cuenta c1) {
		
		this.saldo= this.saldo - cantidad;
		c1.saldo = c1.saldo + cantidad;
		
	}
	
	

}
