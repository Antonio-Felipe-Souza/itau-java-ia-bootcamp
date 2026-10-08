package topico4.exercicio3;

public abstract class Pagamento {

    private Double valor;

    public abstract void realizarPagamento();

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
