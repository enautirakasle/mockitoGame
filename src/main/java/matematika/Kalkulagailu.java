package matematika;

import java.util.Scanner;

public class Kalkulagailu {

	private Scanner scanner = new Scanner(System.in);
	
	public void batu() {
		int n1 = Integer.parseInt(scanner.nextLine());
		int n2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println(n1+n2);
		
	}
	
	public void kateatu() {
		String kat1 = scanner.nextLine();
		String kat2 = scanner.nextLine();
		
		System.out.print(kat1+kat2);
	}
}
