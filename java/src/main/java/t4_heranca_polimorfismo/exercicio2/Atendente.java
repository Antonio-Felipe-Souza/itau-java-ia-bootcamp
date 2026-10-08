package t4_heranca_polimorfismo.exercicio2;

public class Atendente extends Funcionario {

    protected Double valorEmCaixa;

    public Atendente(){
        this.setAdm(false);
    }

    public void receberPagamentos(Double valor){
        System.out.println("Novo pagamento no valor de R$" + valor);
        valorEmCaixa += valor;
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado: R$" + valorEmCaixa);
    }

    //getters e setters
    public Double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(Double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
