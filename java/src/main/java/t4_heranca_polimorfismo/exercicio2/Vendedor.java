package t4_heranca_polimorfismo.exercicio2;

public class Vendedor extends Funcionario{

    protected Integer qtdVendas;

    public Vendedor(){
        this.setAdm(false);
    }

    public void realizarVendas(){
        System.out.println("Nova venda realizada!");
        qtdVendas++;
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas: " + qtdVendas);
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}