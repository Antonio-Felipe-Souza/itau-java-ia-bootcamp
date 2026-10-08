package topico4.exercicio3;

import java.util.Scanner;

public class Pix extends Pagamento{

    private String chavePix;

    @Override
    public void realizarPagamento(){
        System.out.println("\nRealizando pagamento com Pix");
        System.out.println("Insira sua chave Pix:");

        Scanner scanner = new Scanner(System.in);
        chavePix = scanner.next();

        System.out.println("\nChave pix digitada: " + chavePix);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}