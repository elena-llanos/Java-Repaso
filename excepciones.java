package eva1.tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class excepciones {

	public static void main(String[] args) {
		excepcionDiv0(5,0);
		esNum("a");
		excepcionNum("a");
		excepcionTipos();
		
	}
	public static boolean esNum(String codigo) {
		boolean esNumero = true;
		if (!(codigo == null || codigo.isEmpty() || codigo.length() == 0)) {
			esNumero = false;
		}else {
			for(int i= 0; i < codigo.length(); i++) {
				if (!(Character.isDigit(codigo.charAt(i)))){
					esNumero = false;
				}
			}
		}
		return esNumero;
	}
	public static boolean excepcionNum(String codigo) {
		boolean esNumero;
		try {
			Integer.parseInt(codigo);
			esNumero = true;
		} catch (NumberFormatException e){
			esNumero = false;
		}
		return esNumero;
	}
	public static double excepcionDiv0(int num1, int num2) {
		int result = -1;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("El divisor no puede ser 0");
		}
		return result;
	}

	public static void excepcionTipos() {
		int num = -1;
		int intento = 0;
		String linea;

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); 

		do{
			try{
				System.out.print("Introduce un numero (0-100):"); 

				//Si hubiese error seria excepcion de tipo IOException 
				linea = sc.readLine();  

				//Si hubiese error seria excepcion de tipo NumberFormatException
				num = Integer.parseInt(linea); 

			}catch(IOException e){ //IOException, es una subclase de la superclase Exception
				System.out.println("Error en la lectura por teclado.");
			}catch(NumberFormatException e){ //NumberFormatException, es una subclase de la superclase Exception 
				System.out.println("Debes introducir un número (0-100)");
			}catch(Exception e){ //El orden es importante
				System.out.println("Error general.");
			}
			finally{ //siempre se ejecuta al final
				intento++; 
			}
		}while (num < 0 || num > 100);

		System.out.println("Numero introducido: " + num);
		System.out.println("Intentos: " + intento); 

	}
	

}
