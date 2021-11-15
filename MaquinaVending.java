package RETO_1;
import java.util.Arrays;
import java.util.Scanner;

public class MaquinaVending {
	static Scanner sc = new Scanner(System.in);
	static int codPro;	
	static String listado;
	static double preciofinal=0;
	static String []productos= {"Botellín de agua", "Botellín de cola", "Botellín de naranja", "Botellín de limón", "Nestea", "Kit-Kat", "Toblerone", "Frutos secos"};
	static boolean resultado;
	static int [] carrito	= new int [0];
	static int bucleSwitch;
	static double []precios= {1.50, 2, 2, 2, 1.80, 1.50, 2, 1 };
	static int bucleMenu;

	public static void main(String[] args) {


		do {
			do {

				menu();//llama a la funcion para que nos muestre el menu

				comprobarNumerico();

				if (resultado ==false) {

					System.out.println("Mete un numero valido ");
					bucleSwitch=1;//para que siga en el bucle

				}
				else if (resultado==true){
					comprobarRango();     

					if (bucleSwitch!=1) {//Por si comprobarRango no se cumple no entre al switch

						switch (codPro) {

						case 0:
							System.out.print("Apagado");
							bucleSwitch=0;
							bucleMenu=0;
							break;

						case 9:
							bucleSwitch=0;
							pagar();
							break;

						default :
							añadir();
							bucleSwitch=seguirComprando();
							break;
						}
					}
				}  


			}while(bucleSwitch!=0);

			if(codPro!=0 && preciofinal!=0){
				pagar();
			}


		}while(bucleMenu!=0);//este bucle sirve para que la maquina se apague solo cuando le das a la opcion 0
		sc.close();
	}
	public static void menu() {
		//funcion para mostrar el menu

		System.out.println("0-Salir	\t(Apagar máquina)\r\n"
				+ "1-Botellín de agua :\t 1.5€\r\n"
				+ "2-Botellín de cola :\t 2€\r\n"
				+ "3-Botellín de naranja:\t 2€\r\n"
				+ "4-Botellín de limón:\t 2€\r\n"
				+ "5-Nestea:	\t 1.80€\r\n"
				+ "6-Kit-Kat:	\t 1.50€\r\n"
				+ "7-Toblerone:	\t 2€\r\n"
				+ "8-Frutos Secos:	\t 1€\r\n"
				+ "9-Pagar");


	}
	public static  boolean comprobarNumerico() {
		//función para comprobar si el carácter introducido es numérico
		try
		{
			codPro=sc.nextInt();

			resultado= true;
		}
		catch (Exception e)
		{
			resultado =false;  
			sc.nextLine();
		}
		return resultado;
	}
	public static int comprobarRango() {
		//función para comprobar si el número introducido concuerda con el rango

		if (codPro<0||codPro > 9) {
			System.out.println("Producto inexistente");
			bucleSwitch=1;

		}
		else {
			bucleSwitch=0;
		}
		return bucleSwitch;
	}
	public static void añadir() {
		//función para añadir productos
		codPro=codPro-1;//Para decir la posición del array, usamos codPro debido a que es la misma mas uno, lo mismo con el array de precios

		System.out.println("Producto seleccionado: "+productos[codPro]);
		System.out.println("Precio sin IVA: \t" + precios[codPro]+"€");
		System.out.printf("Precio con IVA: \t%.2f€\n" , (precios[codPro]*1.21));
		preciofinal=preciofinal+(precios[codPro]*1.21);

		System.out.println("Sus productos son:");

		anyadirProductoAlCarritoOrdenado(codPro);

		printearProductos();
		System.out.printf("Precio de carrito: \t%.2f€\n\n",preciofinal );
		codPro=codPro+1;
	}
	private static void printearProductos() {
		//Esta función recorre el array carrito y printea las  unidades de cada producto y precio.

		int cantidad = 1;

		for(int i = 0; i < carrito.length; i++) {

			int productoSeleccionado = carrito[i];
			boolean noEsElUltimoElemento = i != carrito.length -1;

			if (noEsElUltimoElemento && carrito[i+1] == productoSeleccionado) {
				cantidad++;
				continue;
			}

			String message = "" + cantidad + " x " +  productos[productoSeleccionado] + " " +  cantidad * precios[productoSeleccionado];

			System.out.println(message);
			cantidad = 1;

		}
	}
	private static void anyadirProductoAlCarritoOrdenado(int codPro) {
		//Esta función añade los prodcutos seleccionados al carrito (array ordenado)
		int [] arrayNuevo = new int [carrito.length + 1];

		boolean estaElNuevoNumeroMetido = false;
		for(int i = 0; i< carrito.length; i ++ ) {
			if(carrito[i] > codPro && !estaElNuevoNumeroMetido) {
				arrayNuevo[i] = codPro;
				estaElNuevoNumeroMetido = true;
			} 
			int posicion = i;
			if(estaElNuevoNumeroMetido) {
				posicion = i + 1;
			}
			arrayNuevo[posicion] = carrito[i];

		}

		if (!estaElNuevoNumeroMetido) {
			arrayNuevo[arrayNuevo.length - 1] = codPro;
		}
		carrito = arrayNuevo;
	}
	public static int seguirComprando() {
		//funcion que nos pregunta si deseamos 
		int a=0;
		int opcion;



		do {

			try {

				System.out.println("Desea seguir comprando?\n"+"Si: 1\n"+"No: 2");
				opcion=sc.nextInt();

				if(opcion==1) {
					bucleSwitch=-1;//para que continue en el bucle
					a=1;//si a es 1 saldra del bucle
				}
				else if(opcion==2) {
					System.out.printf("Precio a pagar: %.2f€\n",preciofinal);
					bucleSwitch=0;//para que salga del bucle de arriba
					a=1;
				}
				else {
					System.out.println("Debes meter el numero 1, para afirmar o el 2 para denegar");
					a=0;//en este caso a es 0 para que continue en el bucle
				}
			}

			catch(Exception e) {
				System.out.println("Mete una opcion valida. Debe ser el numero 1 o el 2");
				sc.nextLine();
			} }
		while(a==0);

		return bucleSwitch;
	}
	public static double pagar() {

		double pago=0;
		double diferencia=0;
		int opccancelar = 0;
		double bolsa=0;
		double falta;
		int cancelar;

		if(codPro==9 && preciofinal==0) {//para cuando le de a la opcion 9 al principio
			System.out.println("Vuelva cuando quiera.");
			bucleSwitch=0;
			bucleMenu=1;
		}
		else{

			//try catch para cancelar operacion 
			do {
				try {
					System.out.println("¿Desea cancelar toda la operación?\n" + "Si: 1\n" + "No: 2");
					opccancelar= sc.nextInt();}
				catch(Exception e) {
					System.out.println("Mete una opcion valida");
					sc.nextLine();

				}}while(opccancelar!=1 && opccancelar!=2);



			if (opccancelar==2) {
				do {

					try {
						System.out.println("Introduzca el importe necesario por favor: ");
						pago=sc.nextDouble();
						bolsa=bolsa+pago;

						if (bolsa<preciofinal){

							falta=preciofinal-bolsa;
							System.out.printf("Te faltan: %.2f€\n", falta  );

							System.out.println("Pulse 1 si quieres cancelar el pago\n"+"Pulse 2 para continuar");
							cancelar=sc.nextInt();
							if(cancelar==1) {
								diferencia=bolsa;
								devolucion(diferencia);
							}
						}
						else {

							diferencia=bolsa-preciofinal;						
							devolucion(diferencia);
						}
					}
					catch(Exception e){//otro catch con el error de la coma
						System.out.println("Mete un precio valido");
						sc.nextLine();
					}
				}while(preciofinal>pago);
			}


		}

		if(opccancelar==1) {

			System.out.println("Vuelva cuando desee.");
			//borrar listado
			carrito = new int [0];
			preciofinal=0;
			bucleMenu=1;
		}


		return bucleMenu;
	}
	public static int devolucion(double diferencia){


		double [] monedas={200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
		double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<monedas.length;i++){
			if(diferencia>=monedas[i]){
				devolver[i]=Math.floor(diferencia/monedas[i]);
				diferencia=(diferencia-(devolver[i]*monedas[i]));
			}
		}
		for(int i=0;i<monedas.length;i++){
			if(devolver[i]>0){
				if(monedas[i]>2){
					System.out.println("Se devuelven "+devolver[i]+" billetes de: "+monedas[i]+" Euros");
				}else{
					System.out.println("Se devuelven "+devolver[i]+" monedas de: "+monedas[i]+" Euros");
				}}}
		carrito = new int [0];
		preciofinal=0;
		return bucleMenu=1;

	}
}
