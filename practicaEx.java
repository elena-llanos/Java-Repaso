package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class practicaEx {
	static Scanner teclado  = new Scanner(System.in);


	static int[][] matrizentero ;
	static int pos = 0;
	static int userNumber = 0;
	static int numeroNuevo = 0;
	static int posicionAmodificar = 0 ;
	static int posicionAborrar = 0;
	static int otroNumber = 0 ;

	public static void main(String[] args) {
		// El codigo que se ejecuta


		String userNumber;

		do {
			userNumber = menu();
			switch (userNumber) {



			case "1":
				System.out.println("Has elegido inicializar");			
				iniArr();
				break;


			case "2":
				System.out.println("Has elegido ver");
				verArr();
				break;

			case "3":
				System.out.println("Has elegido añadir");
				addElement();
				break;

			case "4":
				System.out.println("Has elegido modificar");		
				modifyElement();	
				break;

			case "5":
				System.out.println("Has elegido borrar");
				delElements();	
				break;

			case "6":
				System.out.println("Has elegido salir");
			default:

			}
		}while (userNumber != "6");





	}

	private static void delElements() {
		System.out.print("¿Qué posición quieres borrar?");
		int posicionAborrar  = teclado.nextInt();
		//tengo un array de una posicion menos
		int [] [] matrizNuevo = new int [matrizentero.length -1]  [];
		for(int i = 0; i < matrizentero.length; i++) {

			if (i < posicionAborrar) {
				matrizNuevo [i] = matrizentero [i];

			}else  {
				matrizNuevo [i -1] = matrizentero [i];
			}
		}
		matrizentero = matrizNuevo;
		verArr();

	}

	private static void modifyElement() {
		//Esta función pide la posición y el número que queremos modificar
		System.out.print("¿Qué posición quieres modificar?");
		int posicionAmodificar  = teclado.nextInt();

		System.out.print("¿Qué número quieres poner?");
		int numeroNuevo  = teclado.nextInt();

		matrizentero[posicionAmodificar] = numeroNuevo;
		verArr();
	}

	private static void addElement() {
		//Esta función añade un número en una posición que pedimos por teclado

		System.out.print("¿Qué posición quieres añadir?");
		int posicionAñadir  = teclado.nextInt();

		System.out.print("¿Qué número quieres poner?");
		int otroNumber  = teclado.nextInt();	


		matrizentero [posicionAñadir] = otroNumber;
		verArr();
	}
	public static String menu() {
		System.out.println("Operaciones Array\n" +

			"1. Inicializar Array\n"+
			"2. Ver Array\n"+
			"3. Añadir elemento\n"+
			"4. Modificar elemento\n"+
			"5. Borrar elemento\n"+
				"6.Salir\n" );
		return teclado.next();
	}

	public static void iniArr() {

		//Función de inicialización del array
		int matrizentero [][] =  new int[3][2];		

		for (int i = 0; i < 3; i++){

			for(int j = 0; j < 2; j++) {
				i++;
				j++;
			}
			
					
			System.out.println(Arrays.toString(matrizentero));
		}

			
		

	}
	public static void verArr() {
		//Función que muestra el array
		System.out.println(Arrays.toString(matrizentero));
		System.out.println("\n");


	}
}





