package topico1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Indique o tamanho da base do retângulo:");
        var baseRet = scanner.nextDouble();

        System.out.println("Indique o tamanho da altura do retângulo:");
        var alturaRet = scanner.nextDouble();

        System.out.printf("A área do retângulo é: %s m².", (baseRet * alturaRet));
    }
}
