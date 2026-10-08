package t2_estruturas_controle;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu peso (Kg):");
        var peso = scanner.nextDouble();
        System.out.println("Informe sua altura (m):");
        var altura = scanner.nextDouble();

        var imc = peso/(altura * altura);
        var message = "";

        if (imc <= 18.5) message = "Abaixo do peso";
        else if (imc <= 24.9) message = "Peso ideal";
        else if (imc <= 29.9) message = "Levemente acima do peso";
        else if (imc <= 34.9) message = "Obesidade Grau |";
        else if (imc <= 39.9) message = "Obesidade Grau || (Severa)";
        else if (imc >= 40) message = "Obesidade Grau ||| (Mórbida)";
        else message = "Valor inválido";

        System.out.printf("IMC = %s - %s", imc, message);
    }
}
