import java.util.Scanner;

public class Ex_3inicioefim {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um número início");
		int n1 = ler.nextInt();
		System.out.println("Informe um número fim");
		int n2 = ler.nextInt();
		int contador= n1;
		
		while(contador <= n2){
			System.out.println(contador);
			contador++;
		}
		
		
		
		

	}

}
