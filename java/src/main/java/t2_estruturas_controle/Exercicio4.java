package t2_estruturas_controle;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro inicial:");
        var numInicial = scanner.nextInt();

        while (true) {
            System.out.println("Insira outro número");
            var numero = scanner.nextInt();

            if (numero < numInicial) continue;

            double divisao = numero/numInicial;
            var sobra = numero % numInicial;

            if (sobra == 0){
                System.out.println("Valor da sobra é 0, programa encerrado!");
                System.out.printf("%s / %s = %s - Sobra = %s \n", numero, numInicial, divisao, sobra);
                break;
            };

            System.out.printf("%s / %s = %s - Sobra = %s \n", numero, numInicial, divisao, sobra);
        }
    }
}