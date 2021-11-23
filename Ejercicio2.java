package examenEvalUno;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion;	



		do {
			System.out.println("Menú de opciones\n"

				+ "1-Opcion A \t \r\n"
				+ "2-Opcion B\t \r\n"
				+ "3-Opcion C\t \r\n"
				+ "4-Opcion D\t \r\n");

		opcion = teclado.next();


			switch (opcion) { 



			case  "A" :

				System.out.println("Has elegido Opción " + opcion);

				break;

			case "B":
				System.out.println("Has elegido Opción " + opcion);

				break;

			case "C":
				System.out.println("Has elegido Opción " + opcion);

				break;
			case "D":
				System.out.println("Has elegido Opción " + opcion);

				break;
			default:
				System.out.println("Has elegido Opción " + opcion);
				System.out.println("La opcion  " + opcion + "  no es correcta");


			}

		}while(!(opcion.equalsIgnoreCase("A") && opcion.equalsIgnoreCase("B") && opcion.equalsIgnoreCase("C") && opcion.equalsIgnoreCase("D") ));


	}


}








