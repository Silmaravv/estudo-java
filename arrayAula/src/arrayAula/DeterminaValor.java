package arrayAula;

public class DeterminaValor {

	public static void main(String[] args) {
		
		
		int valor = 30;
		int[] lista = {3,2,1};
		

	System.out.println(verifique(lista,valor));
	}
	
	public static boolean verifique (int[]lista, int valor){
		for (int i = 0; i<lista.length; i++){
			if (lista[i] == valor) {
				return true;
			}
		}
		
		return false;
	}


}
