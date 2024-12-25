package jogos;

import java.util.Random;
import java.util.Scanner;

public class JogoTiro {

    // Dimensões do campo de jogo (5x5)
    static final int LARGURA = 5;
    static final int ALTURA = 5;
    static char[][] campo = new char[ALTURA][LARGURA];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int tentativasRestantes = 10; // O jogador tem 10 tiros
        int alvosAcertados = 0;

        System.out.println("Bem-vindo ao Jogo de Tiro!");
        System.out.println("Tens 10 tiros para acertar o maior número de alvos.");
        
        // Preenche o campo com ' '
        inicializarCampo();

        while (tentativasRestantes > 0) {
            // Gera um alvo aleatório no campo
            int alvoX = random.nextInt(LARGURA);
            int alvoY = random.nextInt(ALTURA);
            campo[alvoY][alvoX] = 'A'; // 'A' representa o alvo

            // Exibe o campo de jogo
            mostrarCampo();

            // Jogador escolhe onde atirar
            System.out.print("Digite a coordenada X (0 a " + (LARGURA - 1) + "): ");
            int tiroX = scanner.nextInt();
            System.out.print("Digite a coordenada Y (0 a " + (ALTURA - 1) + "): ");
            int tiroY = scanner.nextInt();

            // Verifica se o jogador acertou o alvo
            if (tiroX == alvoX && tiroY == alvoY) {
                System.out.println("Você acertou o alvo!\n");
                alvosAcertados++;
            } else {
                System.out.println("Você errou o alvo!\n");
            }

            tentativasRestantes--;
            System.out.println("Tentativas restantes: " + tentativasRestantes + "\n");

            // Remove o alvo atual após o tiro
            campo[alvoY][alvoX] = ' ';
        }

        // Exibe o resultado final
        System.out.println("Fim do jogo! Alvos acertados: " + alvosAcertados + " de 10.");
        scanner.close();
    }

    // Inicializa o campo de jogo com espaços vazios
    public static void inicializarCampo() {
        for (int i = 0; i < ALTURA; i++) {
            for (int j = 0; j < LARGURA; j++) {
                campo[i][j] = ' ';
            }
        }
    }

    // Exibe o campo de jogo no terminal
    public static void mostrarCampo() {
        System.out.println("Campo de Jogo:");
        for (int i = 0; i < ALTURA; i++) {
            for (int j = 0; j < LARGURA; j++) {
                System.out.print(campo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}