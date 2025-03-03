package estudo;
import java.util.Scanner;

public class ColunaMatriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        char T = scanner.next().charAt(0);

        double[][] M = new double[12][12];

        // Leitura da matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        double soma = 0;
        int contador = 0;

        // Cálculo da soma ou média
        for (int i = 0; i < 12; i++) {
            soma += M[i][C];
            contador++;
        }

        double resultado;
        if (T == 'S') {
            resultado = soma;
        } else {
            resultado = soma / contador;
        }

        System.out.printf("%.1f%n", resultado);

        scanner.close();
    }
}