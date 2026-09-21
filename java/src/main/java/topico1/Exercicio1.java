package topico1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var anoBase = OffsetDateTime.now().getYear();

        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var nome = scanner.next();

        System.out.println("Qual seu ano de nascimento?");
        var anoNascimento = scanner.nextInt();

        System.out.printf("Olá %s, você tem %s anos.", nome, (anoBase - anoNascimento));
    }
}
