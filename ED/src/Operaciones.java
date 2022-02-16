/*
 * Mediante las t�cnicas de refactorizaci�n realiza los siguientes cambios en el c�digo visto a continuaci�n:
 * 
 * 1) Renombra la funci�n f utilizando la funcionalidad "Refactor -> Rename" para darle un nombre m�s intuitivo.
 * 2) Extrae la l�nea que imprime el resultado de la operaci�n utilizando la funcionalidad "Refactor -> Extract Method".
 * 3) Refactoriza la variable result del m�todo m utilizando la funcionalidad "Refactor -> inline".
 * 4) Mediante la funcionalidad Change Method Signature cambia el tipo de la funci�n p de int a double, 
 * a�ade un par�metro extra z, da valores por defecto a 1 para las variables y cambiale el nombre a la funci�n.
 * 
 * Documenta el proceso realizado con capturas de pantalla explicando cada uno de los pasos realizados.
 * 
 * */
public class Operaciones {

	public static void main(String[] args) {

		int x = 5, y = 3, z;
		z = f(x,y);
		System.out.print(z);
	}

	public static int f(int x, int y) {
		return x + y;
	}
	
	public static int m(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static int p(int x, int y) {
		return x * y;
	}
}
