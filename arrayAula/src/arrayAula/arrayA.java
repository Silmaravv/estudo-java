package arrayAula;

public class arrayA {

	public static void main(String[] args) {
		String[] nomes = new String[5];
		
		nomes[0] = "fluff";
		nomes[1] = "sil";
		nomes[2] = "cha";
		nomes[3] = "Lu";
		nomes[4] = "VIT";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[4]);
		
		for (int posicaoVetor = 0; posicaoVetor <5; posicaoVetor++) {
			System.out.println(nomes[posicaoVetor] + " ");
		}
		
				
	

	}

}
