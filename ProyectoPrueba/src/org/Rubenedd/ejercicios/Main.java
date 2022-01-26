package org.Rubenedd.ejercicios;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    
	  String s = "Esto es una oración de prueba";
	  
	  String[] prueba = s.split(" ", 6);
	  
	  for(int i =0; i<prueba.length; i++) {
	  
	  System.out.println(prueba[i]);
	  
	  }
	  

    
  }

}
