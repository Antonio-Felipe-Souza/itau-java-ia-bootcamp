package t5_interfaces_lambda.exercicio1;

public class RedesSociais implements ServicoMensagem{

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("[Redes Sociais] Post: " + mensagem.titulo() + " - " + mensagem.conteudo());
    }
}