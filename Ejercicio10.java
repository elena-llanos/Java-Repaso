package Examen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String [] args) {
		String op="";
		int IVA = 21;
		double precio = 40;
		double total = 0;
		boolean control = false;

		do {
			System.out.println("Bienbenido:\r\n"
					+ "0- Salir 0\r\n"
					+ "1- Opción A\r\n"
					+ "2- Opción B\r\n"
					+ "3- Opción C\r\n"
					+ "4- Opción D\r\n"
					+ "5- Opción F\r\n"
					+ "6- Opción G\r\n\r\n"
					+ "Elige una opción:");
			op=sc.next();

			if((op.equals("A"))||(op.equals("B"))||(op.equals("C")||(op.equals("D"))||(op.equals("O"))||(op.equals("F"))||(op.equals("G")))){
				control=false;
				switch (op) {
				case "A":
					metodo1();
					control= true;
					break;

				case "B":
					metodo2();
					control= true;
					break;

				case "C":
					metodo3();
					control= true;
					break;

				case "D":
					total=metodo4(precio,IVA);
					System.out.println("Resultado: "+total);
					control= true;
					break;

				case "F":
					metodo5();
					control= true;
					break;

				case "G":
					metodo6();
					control= true;
					break;

				case "O":
					System.out.println("Salir");
					control = false;
					break;
				}
			}else{
				System.out.println("Ha seleccionado la opción: "+op);
				System.out.println("La opcion "+op+" no es valida");
				control = true;
			}
		}while(control);
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/
	
	public static void metodo1() {
		int num1=1;
		int num2;
		int resultado;
		boolean control = false;

		System.out.println("Ha seleccionado la opción: A");

		do {
			try {
				System.out.println("Introduce número 1");
				num1= sc.nextInt();
				System.out.println("Introduce número 2");
				num2= sc.nextInt();
				resultado=num1+num2;
				System.out.println(num1+" + "+num2+" = "+resultado);
				resultado=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resultado);
				resultado=num1*num2;
				System.out.println(num1+" * "+num2+" = "+resultado);
				if(num2==0){
					System.out.println("Division por 0\r\n");
				}
				else {
					resultado=num1/num2;
					System.out.println(num1+" / "+num2+" = "+resultado+"\r\n");
				}
				control = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Número introducido incorrecto, prueba de nuevo.");
				sc.nextLine();
				control = true;
			}
		}while(control);
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/	
	public static void metodo2() {
		String[] arr = new String [5];
		String producto = "";
		int pos = 0;

		System.out.println("Ha seleccionado la opción: B");

		while(pos < arr.length){
			System.out.println("Dime un producto:");
			producto= sc.next();
			arr[pos] = producto;
			pos++;
		}
		for( int i = 0; i < arr.length; i++) {
			System.out.println("Producto ["+i+"] = "+arr[i]);
		}
		System.out.println("");
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/
	public static void metodo3() {
		int [] aNum = {1,3,3,3,2,2,2,1,1,2};
		int [] arr = new int[3];

		System.out.println("Ha seleccionado la opción: C");

		for(int i = 0; i < aNum.length; i++) {
			if (aNum[i]==1) {
				arr[0]+=1;
			}
			else if(aNum[i]==2){
				arr[1]+=1;
			}
			else if(aNum[i]==3){
				arr[2]+=1;
			}
		}
		System.out.println("Array: " + Arrays.toString(arr)+"\r\n");
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/
	public static double metodo4(double precio, int IVA) {
		double total = 0;

		System.out.println("Ha seleccionado la opción: D");
		total = precio + (precio * IVA)/100;

		return total;
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/
	public static void metodo5() {
		String nombre = "";
		String password = "";

		System.out.println("Ha seleccionado la opción: F");
		System.out.println("Introduce nombre:");
		nombre= sc.next();
		System.out.println("Introduce contraseña:");
		password= sc.next();

		if (nombre.equalsIgnoreCase("admin")&&password.equals("admin")) {
			System.out.println("Bienvenido!");
		}
		else {
			System.out.println("usuario desconocido");
		}
		System.out.println("");
	}
	/*-------------------------------------------------------------------------------------------------------------------------------------*/
	public static void metodo6() {

		System.out.println("Ha seleccionado la opción: G");
		//Triangulo normal

		int x=5;
		for (int i = 0; i < x; i++) {
			for(int j= x-1-i; j>=0; j--) {

				System.out.print(" ");
			}
			for(int j =0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------------*/
		//Triangulo alreves
		System.out.println("\r\n"
				+ "-------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < x; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print(" ");
			}
			for(int j= x-1-i; j>=0; j--){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
