package estudo;

import java.util.Scanner;

public class IdentificaCha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int T = ler.nextInt();
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		int D = ler.nextInt();
		int E = ler.nextInt();
		
		int soma = 0;
		if(T == A) {
			soma++;
		} 
		
		if(T == B) {
			soma++;
		}
		
		if(T == C) {
			soma++;
		}
		if(T == D) {
			soma++;
		}
		if(T == E) {
			soma++;
		}
		System.out.println(soma);
		
		ler.close();
	}

}
