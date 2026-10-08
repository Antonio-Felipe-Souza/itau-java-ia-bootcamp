package t5_interfaces_lambda.exercicio1;

public record Mensagem(String titulo, String conteudo) {

    public Mensagem {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título não pode ser vazio");
        }
        if (conteudo == null || conteudo.isBlank()) {
            System.out.println("Conteúdo não pode ser vazio");
        }
    }
}
