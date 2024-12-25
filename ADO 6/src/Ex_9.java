import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um número para gerar a tabuada");
		int numero = ler.nextInt();
		int contador = 1;
		
		while (contador<=10){
			int resultado = numero * contador;
			
			System.out.println(numero + "x"+contador+ "=" + resultado);
			contador++;
		}
	
		
		
 }
}