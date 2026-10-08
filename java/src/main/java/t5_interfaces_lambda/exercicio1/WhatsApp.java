package t5_interfaces_lambda.exercicio1;

public class WhatsApp implements ServicoMensagem{

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("[WhatsApp] " + mensagem.titulo() + ": " + mensagem.conteudo());
    }
}