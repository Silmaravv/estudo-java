package jogos;

import java.util.Scanner;

public class JogoCruzadinha {

    // Tabela da cruzadinha (matriz 5x5)
    static char[][] cruzadinha = {
        {'c', 'a', 's', 'a', '_'},
        {'_', '_', '_', '_', '_'},
        {'p', 'a', 't', 'o', '_'},
        {'_', '_', '_', '_', '_'},
        {'g', 'a', 't', 'o', '_'}
    };

    // Dicas para o jogador
    static String[] dicas = {
        "1. Vertical, uma habitação",
        "2. Horizontal, um animal que voa e anda",
        "3. Vertical, um animal doméstico"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;
        String[] palavrasCorretas = {"casa", "pato", "gato"};
        boolean[] palavrasAcertadas = {false, false, false};
        int tentativasRestantes = 6;  // O jogador tem 6 tentativas para completar todas as palavras

        System.out.println("Bem-vindo ao Jogo de Cruzadinha!");
        System.out.println("Tens 6 tentativas para resolver a cruzadinha.\n");

        // Ciclo principal do jogo
        while (jogoAtivo && tentativasRestantes > 0) {
            // Exibe a cruzadinha e as dicas
            mostrarCruzadinha();
            mostrarDicas();

            // Pergunta ao jogador qual palavra deseja resolver (1, 2 ou 3)
            System.out.print("\nEscolha uma palavra para tentar resolver (1, 2 ou 3): ");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            if (escolha < 1 || escolha > 3 || palavrasAcertadas[escolha - 1]) {
                System.out.println("Escolha inválida ou palavra já resolvida! Tente outra.");
                continue;
            }

            // Solicita ao jogador para digitar a palavra
            System.out.print("Digite a palavra: ");
            String tentativa = scanner.nextLine().toLowerCase();

            // Verifica se a palavra está correta
            if (tentativa.equals(palavrasCorretas[escolha - 1])) {
                palavrasAcertadas[escolha - 1] = true;
                System.out.println("Parabéns! Acertaste a palavra " + escolha + "!\n");
            } else {
                tentativasRestantes--;
                System.out.println("Palavra incorreta! Tentativas restantes: " + tentativasRestantes + "\n");
            }

            // Verifica se todas as palavras foram resolvidas
            if (palavrasAcertadas[0] && palavrasAcertadas[1] && palavrasAcertadas[2]) {
                System.out.println("Parabéns! Resolvestes a cruzadinha completa!");
                jogoAtivo = false;
            }
        }

        // Caso o jogador fique sem tentativas
        if (tentativasRestantes == 0) {
            System.out.println("Acabaram-se as tentativas! A cruzadinha não foi resolvida.");
        }

        scanner.close();
    }

    // Função para exibir a tabela da cruzadinha
    public static void mostrarCruzadinha() {
        System.out.println("Cruzadinha:");
        for (int i = 0; i < cruzadinha.length; i++) {
            for (int j = 0; j < cruzadinha[i].length; j++) {
                System.out.print(cruzadinha[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Função para exibir as dicas
    public static void mostrarDicas() {
        System.out.println("\nDicas:");
        for (String dica : dicas) {
            System.out.println(dica);
        }
    }
}
