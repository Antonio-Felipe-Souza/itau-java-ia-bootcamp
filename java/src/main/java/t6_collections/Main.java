package t6_collections;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("Escolha uma das opções abaixo pelo número:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        Integer escolha = scanner.nextInt();

        var enumSelecionado = OperacoesEnum.values()[escolha - 1];

        System.out.printf("Informe os números a serem %s e separe-os com vírgula:\n", (enumSelecionado.name().equals("SOMA") ? "SOMADOS" : "SUBTRAÍDOS"));

        var numeros = scanner.next();

        String[]arrayNum = numeros.split(",");

        Integer a = Integer.parseInt(arrayNum[0].trim());
        Integer b = Integer.parseInt(arrayNum[1].trim());

        var resultado = enumSelecionado.getCalcular().apply(a, b);

        System.out.printf("Resultado: %s", resultado);
    }
}