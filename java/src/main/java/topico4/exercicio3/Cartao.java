package topico4.exercicio3;

import java.util.Scanner;

public class Cartao extends Pagamento{

    private Integer numeroCartao;

    @Override
    public void realizarPagamento(){
        System.out.println("\nRealizando pagamento com Cartão");
        System.out.println("Insira o número do cartão:");

        Scanner scanner = new Scanner(System.in);
        numeroCartao = scanner.nextInt();

        System.out.println("\nNúmero do cartão digitado: " + numeroCartao);
    }

    public Integer getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Integer numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
