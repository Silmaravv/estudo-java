import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero que será a altura do triangulo*:");
		int altura = ler.nextInt();
		int contador = 0;
		
		int estrelinhas =1;
		
		while(contador < altura) {
			int espacos = altura - estrelinhas;
			System.out.println();
			int coluna = 0;
			int contadorEspacos = 0;
			while (contadorEspacos < espacos) {
				System.out.print(" ");
				contadorEspacos++;
				
			}
			
			while(coluna<estrelinhas) {
				System.out.print("*");
				coluna++;
				
			}
			
			estrelinhas++;
			contador++;
		} 
		

	}

}
