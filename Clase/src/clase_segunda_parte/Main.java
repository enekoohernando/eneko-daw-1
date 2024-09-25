package clase_segunda_parte;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el importe de la compra");
		double numero = entrada.nextDouble();
		double importe = numero;

		System.out.println("¿Que tipo de afiliacion tiene?");
		String tipo = entrada.next();

		switch (tipo) {
		case "normal":
			System.out.println("Al ser un cliente normal y corriente no dispondras de ningun descuento, el precio final es: "+ numero);
			break;
		case "socio":
			double descuentoCinco = importe * 0.05;
			double descuentoResultado = importe - descuentoCinco;
			System.out.println("Al ser un socio dispondras de un descuento del 5%  "+ descuentoResultado);
			break;
		case "VIP":
			double descuentoVeinte = importe * 0.20;
			double descuentoResultado2 = importe - descuentoVeinte;
			System.out.println("Al ser VIP se te pondra un descuento del 20% " + descuentoResultado2);
			break;
		default:
			System.out.println("Esta opcion no es valida");
		}

		entrada.close(); {
		
		
}
}}