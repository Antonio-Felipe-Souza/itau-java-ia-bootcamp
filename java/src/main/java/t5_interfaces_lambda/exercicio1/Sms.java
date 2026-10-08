package t5_interfaces_lambda.exercicio1;

public class Sms implements ServicoMensagem{

    @Override
    public void enviar(Mensagem mensagem){
        System.out.println("[SMS] " + mensagem.titulo() + ": " + mensagem.conteudo());
    }
}