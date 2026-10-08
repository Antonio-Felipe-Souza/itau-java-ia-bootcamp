package t5_interfaces_lambda.exercicio2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Alimentacao("Arroz", 25.50),
                new SaudeBemEstar("Parque", 10.0),
                new Vestuario("Blazer", 500.00),
                new Cultura("Cinema", 50.0)
        );

        produtos.forEach(produto -> System.out.println("Imposto - " + produto.nome() + ": R$" + produto.calcularImposto())
        );

        Double totalImpostos = produtos.stream().mapToDouble(produto -> produto.calcularImposto()).sum();

        System.out.printf("\nTotal de impostos: R$ %f", totalImpostos);
    }
}