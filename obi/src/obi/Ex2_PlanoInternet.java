package obi;

import java.util.Scanner;

public class Ex2_PlanoInternet {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da quota mensal:");
        int quotaMensal = ler.nextInt();
        System.out.println("Informe o número de meses:");
        int nMeses = ler.nextInt();
 
        int quotaAcumulada = quotaMensal;
  
        for (int i = 0; i < nMeses; i++) {
            System.out.println("Digite o consumo de megabytes do mês " + (i + 1) + ":");
            int consumoMensal = ler.nextInt();
            
        
            quotaAcumulada = quotaAcumulada - consumoMensal + quotaMensal;
        }
        

        System.out.println("Quantidade de megabytes disponíveis no mês " +(nMeses+1) + ":");
        System.out.println(quotaAcumulada);
        
        ler.close();
    }
}