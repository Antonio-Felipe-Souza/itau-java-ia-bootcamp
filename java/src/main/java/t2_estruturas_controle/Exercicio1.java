package t2_estruturas_controle;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        var numero = scanner.nextInt();

        System.out.printf("Tábuada do %s: \n", numero);

        for (var i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s \n", numero, i, (numero * i));
        }

        System.out.println("Encerrado");
    }
}
