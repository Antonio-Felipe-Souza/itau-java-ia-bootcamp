package t4_heranca_polimorfismo.exercicio2;

public class Gerente extends Funcionario{

    public Gerente(){
        this.setAdm(true);
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas...");
    }
}