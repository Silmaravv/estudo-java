package estudo;

public class whileFor {

	public static void main(String[] args) {
		
		int contador = 0;
		while(contador < 3) {
			System.out.println("parabéns");
			contador++;
		}
		System.out.println("fase 2");
		while(contador >= 1) {
			System.out.println("parabéns");
			contador--;
		}
		
		System.out.println("fase 3");
		contador = 3;
		while(contador > 0) {
			System.out.println("parabéns");
			contador--;
		}
		
		for(int i = 5; i >=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Fase 4");
		
		while(contador <=8) {
			System.out.println(contador);
			contador+=2;
		}
	}

}
