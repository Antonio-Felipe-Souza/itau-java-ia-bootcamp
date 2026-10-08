package t5_interfaces_lambda.exercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mensagem promocao = new Mensagem("Black Friday", "Todos os produtos com um desconto absurdo, o dobro pela metade!");

        List<ServicoMensagem> servicos = List.of(
                new Sms(),
                new Emaill(),
                new RedesSociais(),
                new WhatsApp()
        );

        servicos.forEach(servicoMensagem -> servicoMensagem.enviar(promocao));
    }
}