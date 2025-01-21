package obi;
import java.util.Scanner;

public class IdadededoMeio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe a 1ª idade:");
		int idade1 =ler.nextInt();
		System.out.println("informe a 2ª idade:");
		int idade2 = ler.nextInt();
		System.out.println("informe a 3ª idade:");
		int idade3 = ler.nextInt();
		
		
		 int idadeCamila;
		 
	        if (idade1 <= idade2 && idade2 <= idade3) {
	            idadeCamila = idade2;
	        } else if (idade1 <= idade3 && idade3 <= idade2) {
	            idadeCamila = idade3;
	        } else {
	            idadeCamila = idade1;
	        }

	        System.out.println("A idade de Camila é: " + idadeCamila);
	        
	        ler.close();
	    }
	
	}
	
	




