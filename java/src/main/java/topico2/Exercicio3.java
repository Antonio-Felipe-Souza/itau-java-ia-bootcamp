package topico2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número inteiro:");
        var primeiroNum = scanner.nextInt();
        System.out.println("Insira o segundo número inteiro maior que o primeiro:");
        var segundoNum = scanner.nextInt();
        System.out.println("Escolha se deseja 'par' ou 'impar':");
        var escolha = scanner.next();

        var impar = escolha.equalsIgnoreCase("impar");


        if (impar){
            System.out.printf("Seguem os impares pares entre %s e %s \n", segundoNum, primeiroNum);
            for (var i = segundoNum; i >= primeiroNum; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.printf("Seguem os números pares entre %s e %s \n", segundoNum, primeiroNum);
            for (var i = segundoNum; i >= primeiroNum; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
