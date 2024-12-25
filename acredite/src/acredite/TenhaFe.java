package acredite;

public class TenhaFe {

	public static void main(String[] args) {
		
		
		//amor ve pra mim isso aqui "tem 30" (lembre-se que vc tem q saber o valor real)
		int []lista = {13,36,19}; //declare antes da ivocação do metodo
		int valor = 36;
		boolean resposta = verifiqueValor(lista,valor);
		System.out.println(resposta);
	}

	//lembre-se que você tem q trabalhar com valores genericos para ter varias possibilidades
	public static boolean verifiqueValor (int[]lista, int valor){
		for( int i =0; i< lista.length; i++){ 
			if(lista[i]==valor){
				return true;
			}
		}
		return false;

	}
	
}
