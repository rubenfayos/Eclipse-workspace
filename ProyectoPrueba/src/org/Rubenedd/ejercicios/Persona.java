package org.Rubenedd.ejercicios;

public class Persona {

  String nombre;
  
  int edad;
  
  float altura;
  
  public Persona() {
    nombre = "Pruebas";
    
    edad = 22;
    
    altura = 1.70F;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

}
