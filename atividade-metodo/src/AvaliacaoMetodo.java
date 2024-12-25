import java.util.Scanner;

public class AvaliacaoMetodo
{

	/* 1Crie um algoritmo com a função de exibir todos os números que são divisíveis
	por 3 entre 50 e 9500.*/
	

	
	public static void main(String[] args)
	{

		listaNumero();
		/*multiploDez();
		somar ();
		usuarioPedesoma();
		somarQuinzePrimeiros();
		conteEmcincoPrimeiroeUltimo();
		aumentoSalario();
		salarioCarlosComparacao ();
		leituraNumeros ();
		situacaoAlunos();
		menuSalario();
		determineSerie ();
		futebol();
		maiorMenor();
		avaliarNumeros();
		opcaoMatriz();*/
			
		

	}
	
	public static void listaNumero ()
	{	
		for (int numero = 50; numero <= 9500; numero ++)
		{
			int resto = numero % 3;
			if (resto == 0)
			{
				System.out.println(numero);
			} 
		}
		
	}
	
	/**
	 * 2Crie um algoritmo que exiba os valores de 1 a 250 e em cada múltiplo de 10 exiba a mensagem:
	 *  “Múltiplo de 10”.
	 */
	public static void multiploDez() 
	{
		//for(variavel de controle;condição de continuação;incremento(algo q será rodado no final de cada looping))
		for (int numero = 1; numero <=250; numero ++) 
		{
			int mDez = numero % 10;
			if (mDez == 0)
			{ 
				System.out.println( numero + " Múltiplo de 10");
				
			}
			
		}
			
	}
	
	/**
	 * 3Crie um algoritmo que apresente a soma dos termos da sequência
	 *  (1 + 2 + 3 + 4 + 5 + 6... + 99 + 100).
	 */
	
	public static void somar () {
		// quando vc fala tipo e nome vc está declarando uma variavel para conseguir pegar o resultado põe fora da chaves for
		int soma = 0;
	
		//for(variavel de controle;condição de continuação;incremento(algo q será rodado no final de cada looping))
		for (int numero =1; numero <= 100; numero++ ) {
			
			soma = numero + soma;
		}
		// print fora dolloping para ñ ficar imprimindo tudo
		System.out.println(soma);
	}
	
	/**4. Complemente o algoritmo criado no exercício 3, solicitando ao usuário até 
	 * qual termo deverá ser exibida a soma.
	 */
	
	public static void usuarioPedesoma () {
		// quando vc fala tipo e nome vc declara variavel para conseguir pegar o resultado fora da chaves
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o número");
		int ultimoTermo = ler.nextInt();
		int soma = 0;
	
		//for(variavel de controle;condição de continuação;incremento(algo q será rodado no final de cada looping))
		for (int numero =1; numero<= ultimoTermo; numero++ ) {
			
			soma = numero + soma;
		}
		// print fora dolloping para ñ ficar imprimindo tudo
		System.out.println(soma);
	}
	
	// 5. Crie um algoritmo que tenha a função de efetuar a soma dos 15 primeiros termos da sequência. (5,10,15,20...).
	
	public static void somarQuinzePrimeiros () {
		
		//for(variavel de controle;condição de continuação;incremento q é algo q será rodado no final de cada looping {se estiver dentro da contição executa o que está na chave}
		
	
		int soma = 0;
		
		for (int numero =1; numero<=15; numero ++){
			soma = (numero*5) + soma ;
			System.out.println(soma);
		}
		
		
	}
	
	//6.Complemente o algoritmo do exercício 5, solicitando o primeiro e o último termo da sequência desejada.
	
	public static void conteEmcincoPrimeiroeUltimo() {
		Scanner ler = new Scanner (System.in);
		int soma = 0;
		System.out.println("Informe o primeiro numero");
		int n1 = ler.nextInt();
		System.out.println("Informe o último numero");
		int n2 = ler.nextInt();
		
		for (int i = n1; i <= n2; i++){
		
			soma = (i*5) + soma ;
			System.out.println(soma);
		}
	}
	
/* 7 Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
•
Esse funcionário foi contratado em 2010, com salário inicial de R$ 1.000,00;
•
Em 2011, ele recebeu aumento de 1,5% sobre seu salário inicial;
•
A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Crie um algoritmo que determine o salário atual desse funcionário.*/
	
	
	public static void aumentoSalario () {
		
		double salarioInicial = 1000;
		double aumento = 1.5 / 100;
		double valorAumento = salarioInicial * aumento;
		double salarioMaisAumento = valorAumento + salarioInicial;
		
		//for(variavel de controle;condição de continuação;incremento(algo q será rodado no final de cada looping))
		
			for(int i=2012; i <=2024; i++) {
				aumento = aumento*2;
				salarioMaisAumento = salarioMaisAumento +(salarioMaisAumento*aumento);
			}
		
			System.out.println(salarioMaisAumento);
		}
	
	/**
	 * 8 Crie um algoritmo que receba o salário de um funcionário chamado Carlos. 
	 * Sabe se que outro funcionário, João, tem salário equivalente a 1/3 do salário de Carlos.
	 * Carlos aplicará seu salário integralmente em uma aplicação
	 *  que está rendendo 2% ao mês e João aplicará seu salário integralmente em um
fundo de renda fixa rendendo 5% ao mês. O algoritmo deverá calcular e
mostrar a quantidade de meses necessários para que o valor pertencente a
 João iguale ou ultrapasse o valor pertencente a Carlos.
	 */
	
	
	public static void salarioCarlosComparacao () { 
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o salário:");
		double salarioBase = ler.nextDouble();
		double salarioJoao = salarioBase / 3;
		
		double taxaBase = 0.02;
		double taxaJoao = 0.05;
		
		
		
		int meses = 0;
		
		double salarioMaisTaxaBase = salarioBase;
		double salarioMaisTaxaJoao = salarioJoao;
		
		while (salarioMaisTaxaJoao < salarioMaisTaxaBase ) {
			
			salarioMaisTaxaBase += salarioMaisTaxaBase * taxaBase;
            salarioMaisTaxaJoao += salarioMaisTaxaJoao * taxaJoao;
			
			meses++;
		}
		
		System.out.println("meses necessários para atingir o salário de Carlos " + meses);	
	}
	
	/*9 Crie um algoritmo que leia valores inteiros diferentes de 0 e exiba as informações
	 *  abaixo ao ser informado o número 0.
	a) A soma dos números positivos; b) A quantidade de números negativos.*/	
	
	public static void leituraNumeros ()

	{ 
		Scanner ler = new Scanner (System.in);
		int nPositivo = 0;
		int qtdeNegativo = 0;
		int numero = 0;
		
		System.out.println("digite um número");
		numero =  ler.nextInt();
		
		while (numero!= 0)
		{
			if (numero > 0) 
			{ 
				nPositivo += numero;
			} 
			else if (numero < 0) 
			{
				qtdeNegativo++;
			}
			 System.out.println("Digite outro número e quando quiser sair digite 0: ");
	            numero = ler.nextInt();
		}
		
		resultado(nPositivo, qtdeNegativo);
		ler.close();
		
	
	}

	private static void resultado(int nPositivo, int qtdeNegativo) {
		
		System.out.println("soma de numeros positivos é " + nPositivo);
		System.out.println("Quantidade de números negativos é de" + qtdeNegativo);
	}
	
	/*10.
Escreva um algoritmo que receba a nota de um aluno entre 0 e 10 e informe se ele está aprovado (maior ou igual a 6), 
de recuperação (maior ou igual a 5 e menor que 6) ou reprovado (abaixo de 5). 
Caso o valor informado não esteja entre 0 e 10,
 o algoritmo deverá solicitar novamente o valor até que esteja no intervalo desejado.*/
	
	public static void situacaoAlunos() 
	{
		Scanner ler = new Scanner (System.in);
		double n1 = -1;
		
		while (n1 < 0 || n1 > 10)
			{
				System.out.println("Informe nota do aluno de 0 a 10:");
				n1 = ler.nextDouble();
		
				if (n1 < 0 || n1 >10 ) 
				{
					System.out.println("Favor digite um valor válido entre 0 à 10");
					n1 = ler.nextDouble();
				}
			}
		
		if (n1 >= 6) 
			{
				System.out.println("\u001B[32mAprovada");
			}
		else if (n1 >=5 && n1 < 6) 
			{
				System.out.println("\u001B[33mRecuperação");
			}
		else 
			{ 
				System.out.println("\u001B[31mReprovado");
			}
		
		ler.close();
	}

	
	public static void menuSalario() {
		
		Scanner ler = new Scanner (System.in);
		int opcao = 0;
		double salario;
		
		while (opcao != 4) {
            // Exibição do menu de opções
            System.out.println("----- Menu de opções -----");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = ler.nextInt();

  
            if (opcao == 1) {
                System.out.print("Digite o salário do funcionário: ");
                salario = ler.nextDouble();
                double imposto = calcularImposto(salario);
                System.out.println("O valor do imposto é: R$ " + imposto);
            } 
            else if (opcao == 2) {
                System.out.print("Digite o salário do funcionário: ");
                salario = ler.nextDouble();
                double novoSalario = calcularNovoSalario(salario);
                System.out.println("O novo salário é: R$ " + novoSalario);
            } 
            else if (opcao == 3) {
                System.out.print("Digite o salário do funcionário: ");
                salario = ler.nextDouble();
                String classificacao = classificarSalario(salario);
                System.out.println("A classificação do salário é: " + classificacao);
            } 
            else if (opcao == 4) {
                System.out.println("Finalizando o programa...");
            } 
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

	}
	
	public static double calcularImposto(double salario) {
        if (salario <= 1500.00) {
            return salario * 0.05;
        } else if (salario <= 3000.00) {
            return salario * 0.10;
        } else {
            return salario * 0.15;
        }
    }
	
	public static double calcularNovoSalario(double salario) {
        if (salario > 4500.00) {
            return salario + 250.00;
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            return salario + 200.00;
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            return salario + 150.00;
        } else {
            return salario + 130.00;
        }
    }
	
	 public static String classificarSalario(double salario) {
	        if (salario > 3000.00) {
	            return "Bem remunerado";
	        } else {
	            return "Mal remunerado";
	        }
	    }
	 
	 /*12.
Crie um algoritmo que leia o número de termos, determine e mostre os valores de acordo com a série a seguir:
Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567...*/
	 
	 public static void determineSerie ()
 {
		 
		 Scanner ler = new Scanner (System.in);
		 
		System.out.println("Digite o número da série: ");
		int n = ler.nextInt();
		
		int t1 = 2; 
        int t2 = 7; 
        int t3 = 3;
		
		System.out.println(t1 + ", " + t2 + ", " + t3);
		
		int i = 3;
		
		while (i < n)
		{
      
            t1 *= 2;
            t2 *= 3;
            t3 *= 4;

           
            if (i < n) {
                System.out.print(", " + t1);
                i++;
            }
            if (i < n) {
                System.out.print(", " + t2);
                i++;
            }
            if (i < n) {
                System.out.print(", " + t3);
                i++;
            }
        }
        ler.close();
  }
	 
	 /*13.Em um campeonato de futebol existem cinco times e cada um possui quinze jogadores. Faça um algoritmo que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
•
A quantidade de jogadores com idade inferior a 18 anos;
•
A média das idades dos jogadores de cada time;
•
A média das alturas de todos os jogadores do campeonato;
•
O percentual de jogadores com mais de 80 Kg entre todos os jogadores do campeonato.*/
	 
	 public static void futebol() {
		 Scanner ler = new Scanner(System.in);
	        
	        int totalTimes = 5; 
	        int jogadoresPorTime = 15; // 
	        int totalJogadores = totalTimes * jogadoresPorTime;
	        
	        int jogadoresMenoresDe18 = 0;
	        double somaAlturas = 0;
	        int jogadoresAcimaDe80kg = 0;
	        
	       
	        for (int time = 1; time <= totalTimes; time++) {
	            System.out.println("**** Time " + time + " ****");
	            
	            int somaIdadesPorTime = 0;
	            
	            for (int jogador = 1; jogador <= jogadoresPorTime; jogador++) {
	                System.out.println("Jogador " + jogador + " do time " + time);
	                
	           
	                System.out.print("Digite a idade: ");
	                int idade = ler.nextInt();
	                
	                System.out.print("Digite o peso (em kg): ");
	                double peso = ler.nextDouble();
	                
	                System.out.print("Digite a altura (em metros): ");
	                double altura = ler.nextDouble();
	                
	              
	                somaIdadesPorTime += idade;
	                
	               
	                if (idade < 18) {
	                    jogadoresMenoresDe18++;
	                }
	                
	              
	                somaAlturas += altura;
	                
	           
	                if (peso > 80) {
	                    jogadoresAcimaDe80kg++;
	                }
	            }
	            
	     
	            double mediaIdadePorTime = somaIdadesPorTime / (double) jogadoresPorTime;
	            System.out.println("Média de idade dos jogadores do time " + time + ": " + mediaIdadePorTime);
	        }
	        
	     
	        double mediaAlturaCampeonato = somaAlturas / totalJogadores;
	        System.out.println("Média de altura de todos os jogadores do campeonato: " + mediaAlturaCampeonato);
	        
	  
	        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenoresDe18);
	        
	    
	        double percentualAcimaDe80Kg = (jogadoresAcimaDe80kg / (double) totalJogadores) * 100;
	        System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentualAcimaDe80Kg + "%");
	        
	        ler.close();
	    
	 }
	 
	 /*14.
Elaborar um algoritmo que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado.
 Ao final devem ser apresentados o maior e o menor valor informados pelo usuário.*/
	 public static void maiorMenor() {
		 
		  Scanner ler = new Scanner(System.in);

	        int valor;
	        boolean primeiroValor = true;
	        int maiorValor = 0;
	        int menorValor = 0;

	        while (true)
	        {
	            System.out.print("Digite um valor positivo, caso queira que encerre digite um número negativo: ");
	            valor = ler.nextInt();
	            if (valor < 0) 
	            	{
	            		break;
	            	}
	            if (primeiroValor)
	            	{
	            		maiorValor = valor;
	            		menorValor = valor;
	            		primeiroValor = false;
	            	} 
	            else 
	            	{
	                	if (valor > maiorValor)
	                		{
	                			maiorValor = valor;
	                		}
	                	if (valor < menorValor)
	                		{
	                			menorValor = valor;
	                		}
	            	}
	        }
	        
	        if (!primeiroValor) 
	        	{
	            	System.out.println("Maior valor informado: " + maiorValor);
	            	System.out.println("Menor valor informado: " + menorValor);
	        	} 
	        else
	        	{
	        		System.out.println("Nenhum valor positivo foi informado.");
	        	}

	        ler.close();
	    }
	 
	 /*15.
Elabore um algoritmo que leia 15 valores informados via teclado, e apresente na tela:
a)O menor número digitado
b)O maior número digitado
c)A média dos números digitados
d)Quantidade de números pares
e)Quantidade de números divisíveis por 5*/
	 
	 
	 public static void avaliarNumeros() {
		 Scanner ler = new Scanner(System.in);

	        int menor = 0;
	        int maior = 0;
	        int soma = 0;
	        int pares = 0;
	        int dividePor5 = 0;
	 

	       
	        System.out.print("Digite o 1º valor: ");
	        int valor = ler.nextInt();

	        
	        menor = valor;
	        maior = valor;
	        soma += valor;

	      
	        if (valor % 2 == 0) {
	            pares++;
	        }
	        if (valor % 5 == 0) {
	            dividePor5++;
	        }

	    
	        for (int i = 2; i <= 15; i++) {
	            System.out.print("Digite o " + i + "º valor: ");
	            valor = ler.nextInt();

	     
	            soma += valor;

	       
	            if (valor > maior) {
	                maior = valor;
	            }
	            if (valor < menor) {
	                menor = valor;
	            }

	
	            if (valor % 2 == 0) {
	                pares++;
	            }

	   
	            if (valor % 5 == 0) {
	                dividePor5++;
	            }
	        }

	        double media = (double) soma / 15;

	        // Exibir os resultados
	        System.out.println("\nMenor número digitado: " + menor);
	        System.out.println("Maior número digitado: " + maior);
	        System.out.println("Média dos números digitados: " + media);
	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números divisíveis por 5: " + dividePor5);

	        ler.close();
	    }	 
	 
	 /*16*/
	 
	 public static void opcaoMatriz()
	 {
		 imprimirMatriz(4, 6, true);
		 System.out.println();
		 imprimirMatriz(4, 6, false);
	 }

 public static void imprimirMatriz(int linhas, int colunas, boolean suprimirPares) 
 {
     int numero = 0;
 
     for (int i = 0; i < linhas; i++) 
     {
         for (int j = 0; j < colunas; j++) 
         {
             if (suprimirPares && numero % 2 == 0)
             	{
                 System.out.print("xx ");
             	} 
             else if (!suprimirPares && numero % 2 != 0)
             	{
                 System.out.print("xx ");
             	} 
             else
             	{
                 System.out.printf("%02d ", numero);
             	}
             numero++;
         }
         System.out.println();
     }
 }
}
	

