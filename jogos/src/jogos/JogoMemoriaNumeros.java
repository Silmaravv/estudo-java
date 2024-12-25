package jogos;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JogoMemoriaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nivel = 1;  // Nível de dificuldade
        boolean continuarJogando = true;

        System.out.println("Bem-vindo ao Jogo de Memória com Números!");
        System.out.println("Tente memorizar a sequência de números que aparecerá e repita corretamente.");

        // Ciclo do jogo que aumenta o nível a cada rodada
        while (continuarJogando) {
            System.out.println("\nNível " + nivel);
            
            // Gera uma sequência de números com base no nível
            int[] sequencia = new int[nivel];
            for (int i = 0; i < nivel; i++) {
                sequencia[i] = random.nextInt(9);  // Números entre 0 e 9
            }

            // Mostra a sequência por um curto período de tempo
            System.out.print("Memorize a sequência: ");
            for (int num : sequencia) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Espera alguns segundos antes de limpar a tela (simulando um tempo de memorização)
            esperar(3); // Espera 3 segundos para o jogador memorizar
            limparTela(); // Limpa a tela

            // O jogador deve repetir a sequência
            System.out.println("Agora, insira a sequência de números:");
            int[] tentativa = new int[nivel];
            for (int i = 0; i < nivel; i++) {
                tentativa[i] = scanner.nextInt();
            }

            // Verifica se o jogador acertou a sequência
            boolean acertou = true;
            for (int i = 0; i < nivel; i++) {
                if (tentativa[i] != sequencia[i]) {
                    acertou = false;
                    break;
                }
            }

            if (acertou) {
                System.out.println("Parabéns! Você acertou a sequência.");
                nivel++; // Aumenta o nível se o jogador acertar
            } else {
                System.out.println("Você errou a sequência.");
                System.out.println("A sequência correta era: ");
                for (int num : sequencia) {
                    System.out.print(num + " ");
                }
                System.out.println("\nFim de jogo. Você chegou ao nível " + nivel + ".");
                continuarJogando = false;
            }
        }

        scanner.close();
    }

    // Função para esperar por alguns segundos
    public static void esperar(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar.");
        }
    }

    // Função para "limpar" a tela no terminal
    public static void limparTela() {
        for (int i = 0; i < 50; i++) {  // Simula a limpeza da tela com novas linhas
            System.out.println();
        }
    }
}
