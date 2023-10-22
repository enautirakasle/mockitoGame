package secuencia;
/*
  Saludo Simple: 
  Escribe un programa que imprima "¡Hola, mundo!" en la pantalla.
 */

import java.util.Scanner;

public class Ejercicio01 {

	private Scanner input = new Scanner(System.in);

	public void run() {
		String aukera = input.nextLine();
		if(aukera.equals("ona")) {			
			System.out.println("Hola Mundo!");
		}else {
			System.out.println();
		}
	}

}
