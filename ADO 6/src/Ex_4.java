import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		System.out.println("informe um número par inicial");
		Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        System.out.println("Informe o número final");
        int n2 = ler.nextInt();
        int contador = n1;
        
        while(contador >= n2) { 
        	System.out.println(contador);
        	contador = contador-1;
        }
        
        
	}

}
