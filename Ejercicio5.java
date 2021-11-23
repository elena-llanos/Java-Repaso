package examenEvalUno;

import java.util.Scanner;

public class Ejercicio5 {

	static Scanner teclado = new Scanner(System.in);
	static String opcion;
	static int numeroUsuario1 = 0;
	static int numeroUsuario2 = 0;
	static int suma = 0;
	static int resta = 0;
	static int multi = 0;
	static int divi = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		do {
		System.out.println("Menú de opciones\n"

				+ "1-Opcion A \t \r\n"
				+ "2-Opcion B\t \r\n"
				+ "3-Opcion C\t \r\n"
				+ "4-Opcion D\t \r\n"
				+ "0- Salir\n");

		opcion = teclado.next();




		


			switch (opcion) { 


			case "A" :

				metodo1();
				break;

			case "B":
				metodo2();
				break;

			case "C":
				metodo3();
				break;
			case "D":
				metodo4();
				break;
			case "0":
				break;
			default:
				System.out.println("Has elegido Opción " + opcion);
				System.out.println("La opcion  " + opcion + "  no es correcta");

			}
		}while (opcion.equals("A") &&opcion.equals("B") && opcion.equals("C") &&opcion.equals("D") );
	}







	public static void metodo1(){
		System.out.println("Has seleccionado la opción: " + opcion + "\n" );
		System.out.println("Ejecutando la opción: " + opcion  );


		System.out.println("Introduce un número");		
		numeroUsuario1 = teclado.nextInt();
		System.out.println("Introduce otro número");
		numeroUsuario2 = teclado.nextInt();






		suma = numeroUsuario1 + numeroUsuario2;
		resta = numeroUsuario1 - numeroUsuario2;
		multi = numeroUsuario1 * numeroUsuario2;
		divi = numeroUsuario1 / numeroUsuario2;

		System.out.println(numeroUsuario1 + "+" + numeroUsuario2 + "=" + suma);
		System.out.println(numeroUsuario1 + "-" + numeroUsuario2 + "=" + resta);
		System.out.println(numeroUsuario1 + "*" + numeroUsuario2 + "=" + multi);
		System.out.println(numeroUsuario1 + "/" + numeroUsuario2 + "=" + divi);


	}
	public static void metodo2(){
		System.out.print("Has seleccionado la opción: " + opcion + "\n" );
		System.out.print("Ejecutando la opción: " + opcion  );


	}
	public static void metodo3(){
		System.out.print("Has seleccionado la opción: " + opcion + "\n" );
		System.out.print("Ejecutando la opción: " + opcion  );


	}
	public static void metodo4(){
		System.out.print("Has seleccionado la opción: " + opcion + "\n" );
		System.out.print("Ejecutando la opción: " + opcion  );


	}
}








