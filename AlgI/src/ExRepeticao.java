import java.util.Scanner;

public class ExRepeticao {

	public static void main(String[] args) {

		/* for (<variável de controle>, <análise de variável de controle>,<incremento de variável de controle>)
		{ Código a ser executado}
		*/
		
		/* crie um metodo que receba o numero de linhas e numero de colunas  e reproduza o desenho abaixo*/
		
		
			
		        int linhas = 5; 
		        int colunas = 5; 
		        desenharMatriz(linhas, colunas);
		    }

		    public static void desenharMatriz(int linhas, int colunas) {
		    	int num = 0;
		    	//for das linhas
		    	for(int i = 0; i < linhas; i++) {
		    		
		    	//for das colunas 
		    		
		    		for(int j = 0; j < colunas; j++) {
		    			System.out.printf("%02d", num++);
		    		
		    		}
		    		
		    		//quebra de linhas 
		    		System.out.println();
		    		
		    	}
		    	
		    	
		        }
		    }
		
		
	




