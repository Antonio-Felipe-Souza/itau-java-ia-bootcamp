package t1_fundamentos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Pessoa 1:" );
        System.out.println("Qual seu nome?");
        var nome1 = scanner.next();
        System.out.println("Qual sua idade?");
        var idade1 = scanner.nextInt();

        System.out.println("Pessoa 2:");
        System.out.println("Qual seu nome?");
        var nome2 = scanner.next();
        System.out.println("Qual sua idade?");
        var idade2 = scanner.nextInt();

        System.out.printf("A diferença entre as idades do(a) %s e %s é de %s ano(s).", nome1, nome2, Math.abs(idade1 - idade2));
    }
}
