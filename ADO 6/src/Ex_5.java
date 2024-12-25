import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int n1 = ler.nextInt();
		System.out.println("Informe o segundo numero");
		int n2 = ler.nextInt();
		
		int contador=n1;
		
		if(n1%2 !=0) {
			System.out.println(contador);
			n1++;
		}
		
		while (n1 <=n2) {
			System.out.println(n1);
			n1+=2;
			}
		
		

	}

}
