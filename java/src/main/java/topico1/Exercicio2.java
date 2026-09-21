package topico1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Indique o tamanho do lado do quadrado:");
        var ladoQuadrado = scanner.nextDouble();

        System.out.printf("A área do quadrado é %s m².", (ladoQuadrado * ladoQuadrado));
    }
}
