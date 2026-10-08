package t4_heranca_polimorfismo.exercicio3;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new Pix();
        Pagamento pagamentoCartao = new Cartao();
        Pagamento pagamentoBoleto = new Boleto();

        pagamentoPix.setValor(25.0);

        pagamentoPix.realizarPagamento();
        pagamentoCartao.realizarPagamento();
        pagamentoBoleto.realizarPagamento();
    }
}