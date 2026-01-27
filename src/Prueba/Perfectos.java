package Prueba;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.Buffer;

public class Perfectos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		boolean primo=true;
		int numero;
		String nombre;
		
		System.out.print("\n\n¿Como te llamas: ?");
		nombre= sc.nextLine();
		
		System.out.print("\n\nIntroduce un numero: ");
		numero= Integer.parseInt(sc.readLine());
		
		System.out.print("\n\n¿Cuanto ganas?: ");
		double sueldo = Double.parseDouble(sc.nextLine());
		
		System.out.print("\n\n¿Tienes hijos (si/no)?: ");
		String hijos = sc.nextLine();
		
		boolean hijosBolean=true;
		
		if (hijos.equalsIgnoreCase("si")) hijosBolean=true;
		else if (hijos.equalsIgnoreCase("no"))hijosBolean=false;
		else System.out.println("Error al indicar si hijos o no");
		
		System.out.println(hijosBolean);
		
		System.out.println("Te llamas: " + nombre + " y el numero introducido es: " + numero);
		System.out.println("Ganas: " + sueldo + " y el numero introducido es: " + numero);
	}


}
