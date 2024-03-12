package probak;

import java.util.Scanner;

public class Proba {
	Scanner scan = new Scanner(System.in);

	public void run() {
		
		System.out.println("idatzi");
		String mezua = scan.nextLine();
		
		System.out.println(mezua + "a");
	}
	
	
	
	public int add(int a, int b) {
        return a + b;
    }
	
	public void batuBi() {
		System.out.println("bi zenbaki");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.println("bi zenbaki");
		int n2 = Integer.parseInt(scan.nextLine());
		
		System.out.print(n1 + n2);
	}
}
