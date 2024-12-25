package estudo1;

import java.util.Scanner;

public class Ex8_Triangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado os 3 lados do triângulo:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		
		
		if (x==y && x==z) {
			
			System.out.println("o triângo é do tipo \u001B[34mequilátero");	
		}
		
		else if (x+y < z || x+z < y || y+z < x) {
			System.err.println("Os valores não correspondem a um triângulo");
			System.exit(0);
		}
		
		else if (x!=y && z!=x && z!=y) {
		
			System.out.println("o triângulo é do tipo \u001B[36mescaleno");
		}
		
		else{
			System.out.println("o triangulo é do tipo \u001B[35misósceles");
			
		}
	}

}
