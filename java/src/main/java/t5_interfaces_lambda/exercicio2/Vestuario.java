package t5_interfaces_lambda.exercicio2;

public record Vestuario(String nome, Double preco) implements Produto {
    @Override
    public Double calcularImposto(){
        return preco * 0.025;
    }
}
