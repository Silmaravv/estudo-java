
public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "bora codar";
		int posicao = 0;
		int i =1;
		
		
		while (posicao <= 9) {
			
			char letra = msg.charAt(posicao);
			
			if(letra == ' ') {
				System.out.println("espaço");
			} else {
				System.out.println("letra" + i +"="+ letra);
				i++;
				}
			
			posicao++;
		}

	}

}
