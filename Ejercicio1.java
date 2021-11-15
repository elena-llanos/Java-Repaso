package repaso;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
					
		
		System.out.println("De cuántas posiciones quieres tu array?");
		
		int posiciones = teclado.nextInt();
		int array[] = new int[posiciones];
		
		System.out.println(Arrays.toString(array));
		
 	}
		

}
	
//Ejercicio 1
//Crear un programa que pida al usuario de cuantas posiciones quiere crear un array (de enteros) e inicializarlo a 0.
