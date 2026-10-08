package t4_heranca_polimorfismo.exercicio3;

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
