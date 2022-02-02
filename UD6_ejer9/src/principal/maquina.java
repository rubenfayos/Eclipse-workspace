package principal;

public class maquina {
	
	public String tirada(){
		
		double numero = Math.random()*10;
		if(numero < 3.33) {
			return "piedra";
		}else if(numero < 6.66) {
			return "papel";
		}else {
			return "tijera";
		}
		
		
	}

}
