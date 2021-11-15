package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	static Scanner teclado = new Scanner (System.in);
	static int array[] = new int [0];
	static int numUsuario = 0;
	static int numUsuario2 =0;
	static int posiciones = 0;
	 
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
			
		
		do {
			

			numUsuario2 = menuCambiar();
			
			switch(numUsuario2) {
			
			case 1:
				cambiarValor(posiciones, array, posicion, numeroMetido);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				
			default:
			
			}
		}while(numUsuario2 > 0 && numUsuario2 <=4);
	}
			


	public static int menu() {

		System.out.println("Como quieres inicializar tu array:\r\n"
				+ "1.- Con ceros\r\n"
				+ "2.- Con números aleatorios del 1 al 100\r\n"
				+ "3.- Insertando los números manualmente.\r\n"
				+"" );
		
		return teclado.nextInt();
	} 

	public static int menuCambiar() {

		System.out.print("¿Qué quieres hacer con tu array?\r\n"
				+ "1.- Cambiar valores de todo el array\r\n"
				+ "2.- Cambiar un valor del array\r\n"
				+ "3.- Reiniciar el array\r\n"
				+ "4.- Mostrar Array\r\n"
				+ "0.- Salir\r\n"
				+ "");
		
		return  teclado.nextInt();
	}	

	public static void conCeros(int posiciones, int array[]) {

		array = new int [posiciones];

		System.out.println(Arrays.toString(array));
		menuCambiar();



	}

	public static void conNumAle(int posiciones, int array[]) {
		array = new int [posiciones];


		for(int i = 0; i<array.length; i++) {
			posiciones = (int) (Math.random()*100);
			array[i] = posiciones;

		}
		System.out.println(Arrays.toString(array));
		menuCambiar();



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
		menuCambiar();
	}	
	public static void cambiarValor(int posiciones, int array[],int posicion, int numeroMetido ) {
		array = new int [posiciones];
		posicion = 0;
		
		while(posicion < posiciones){
				System.out.print("Introduce el número para la posición "  + posicion );
				numeroMetido = teclado.nextInt();
				array[posicion]= numeroMetido;
				posicion++;
				
	}
}
}

