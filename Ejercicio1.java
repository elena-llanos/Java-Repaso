package examenEvalUno;

import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion;

		System.out.println("Menú de opciones\n"

				+ "1-Opcion A \t \r\n"
				+ "2-Opcion B\t \r\n"
				+ "3-Opcion C\t \r\n"
				+ "4-Opcion D\t \r\n");

		opcion = teclado.next();
		System.out.println("Has elegido Opción " + opcion);



	}
}



