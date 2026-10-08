package t5_interfaces_lambda.exercicio1;

public class Emaill implements ServicoMensagem{

    @Override
    public void enviar(Mensagem mensagem){
        System.out.println("[Email] Assunto: " + mensagem.titulo());
        System.out.println(mensagem.conteudo());
    }
}