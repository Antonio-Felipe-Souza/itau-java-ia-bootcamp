package topico4.exercicio3;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new Pix();
        Pagamento pagamentoCartao = new Cartao();
        Pagamento pagamentoBoleto = new Boleto();

        pagamentoPix.realizarPagamento();
        pagamentoCartao.realizarPagamento();
        pagamentoBoleto.realizarPagamento();
    }
}