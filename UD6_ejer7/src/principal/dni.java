package principal;

public class dni {
	
	private int dni;
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	public String getDni() {
		
	}
	
	public char leer(int dni) {
		
		char letra = 'a';
		
		if(dni%23 == 0) {
			letra ='t';
		}else if (dni%23 == 1) {
			letra = 'r';
		}else if (dni%23 == 2) {
			letra = 'W';
		}else if (dni%23 == 3) {
			letra = 'A';
		}else if (dni%23 == 4) {
			letra = 'G';
		}else if (dni%23 == 5) {
			letra = 'M';
		}else if (dni%23 == 6) {
			letra = 'Y';
		}else if (dni%23 == 7) {
			letra = 'F';
		}else if (dni%23 == 8) {
			letra = 'P';
		}else if (dni%23 == 9) {
			letra = 'D';
		}else if (dni%23 == 10) {
			letra = 'X';
		}else if (dni%23 == 11) {
			letra = 'B';
		}else if (dni%23 == 12) {
			letra = 'N';
		}else if (dni%23 == 13) {
			letra = 'J';
		}else if (dni%23 == 14) {
			letra = 'Z';
		}else if (dni%23 == 15) {
			letra = 'S';
		}else if (dni%23 == 16) {
			letra = 'Q';
		}else if (dni%23 == 17) {
			letra = 'V';
		}else if (dni%23 == 18) {
			letra = 'H';
		}else if (dni%23 == 19) {
			letra = 'L';
		}else if (dni%23 == 20) {
			letra = 'C';
		}else if (dni%23 == 21) {
			letra = 'K';
		}else if (dni%23 == 22) {
			letra = 'E';
		}t 
		return letra;
	}

}
