package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	static Scanner teclado = new Scanner (System.in);
	static int array[] = new int [0];
	static int numUsuario = 0;
	static int numeroMetido = 0;
	static int posicion = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub




		do {
			System.out.println("De cuantas posiciones quieres tu array?");
			int posiciones = teclado.nextInt();
			System.out.println(posiciones);

			numUsuario = menu();
			switch(numUsuario)  {

			case 1: 
				conCeros(posiciones, array);
				break;

			case 2:
				conNumAle(posiciones, array);
				break;
			case 3:	
				conNumInsert(posiciones, array, numeroMetido, posicion);
			default:
			}
		}while(numUsuario >0 && numUsuario <=3);
	}


	public static int menu() {

		System.out.println("Como quieres inicializar tu array:\r\n"
				+ "1.- Con ceros\r\n"
				+ "2.- Con números aleatorios del 1 al 100\r\n"
				+ "3.- Insertando los números manualmente.\r\n"
				+"" );
		return teclado.nextInt();
	} 

	public static void conCeros(int posiciones, int array[]) {

		array = new int [posiciones];

		System.out.println(Arrays.toString(array));

	}

	public static void conNumAle(int posiciones, int array[]) {
		array = new int [posiciones];


		for(int i = 0; i<array.length; i++) {
			posiciones = (int) (Math.random()*100);
			array[i] = posiciones;

		}
		System.out.println(Arrays.toString(array));



	}

	public static void conNumInsert (int posiciones, int array[], int numeroMetido, int posicion){
		array = new int [posiciones];
		posicion = 0;
		
		while(posicion < posiciones){
			System.out.print("Introduce el número para la posición "  + posicion );
			numeroMetido = teclado.nextInt();
			array[posicion]= numeroMetido;
			posicion++;
			

		} 
		System.out.println(Arrays.toString(array));



		
	}	
}	






//Ejercicio 2
//Modificar el programa anterior para preguntar después de insertar el número de posiciones 
//pregunte si quiere inicializar el array a ceros (esta sería la funcionalidad anterior), 
//con números aleatorios del 1 al 100 o insertar todos los números.
