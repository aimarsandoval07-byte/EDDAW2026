package Prueba;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.Buffer;

public class Primos {

	public static void main(String[] args) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		boolean primo=true;
		int div=2, numero;
		
		System.out.print("\n\nIntroduce un numero: ");
		numero= Integer.parseInt(teclado.readLine());
		
		while (primo && div<=numero/2) {
			if(numero%div==0) primo=false
			div++;
		}
		if (primo)System.out.println("El numero"+ numero + " es Primo");
		else System.out.println("El numero"+ numero + " no es Primo");
	}

}
