package t5_interfaces_lambda.exercicio2;

public record SaudeBemEstar(String nome, Double preco) implements Produto {
    @Override
    public Double calcularImposto(){
        return preco * 0.015;
    }
}
