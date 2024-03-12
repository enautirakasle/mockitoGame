package probak;

import java.util.Scanner;

public class EjercicioProba2 {

	static Scanner sc1 = new Scanner(System.in);
	
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		System.out.println("bi zenbaki");
		int n1 = Integer.parseInt(sc1.nextLine());
		System.out.println("bi zenbaki");
		int n2 = Integer.parseInt(sc1.nextLine());
		
		System.out.print(n1 + n2);
	}

}
