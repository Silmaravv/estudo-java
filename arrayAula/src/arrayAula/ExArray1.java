package arrayAula;

public class ExArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] valores = new int [3];
			valores [0] = 10;
			valores [0] = 15;
			valores [0] = 20;
			int [] numeros = valores;
			
			preencherArray (numeros,50);
			System.out.println(valores[0]);
			System.out.println(numeros [0]);
			
			
	}
	
	public static void preencherArray(int[] array, int valor) {
		for(int i = 0; i < array.length; i++) {
			array [i] = valor;
		}
	}

}
