public class Main {

	public static void main(String[] args) {
		Double numeroPersonal = new Double(7);
		
		Double resultado = examenDebug(numeroPersonal);	
	}
	
	public static Double examenDebug(Double variable) {
		
		double resultado = (double) 0;
		
		for(int i = 0; i < 50000; i++) {
			
			resultado += Math.log(variable);
			
			
		}
		
		return resultado;		
	}
}
