package topico4.exercicio3;

import java.util.Scanner;

public class Boleto extends Pagamento {

    private String codigoBarras;

    @Override
    public void realizarPagamento(){
        System.out.println("\nRealizando pagamento com Boleto");
        System.out.println("Insira o código de barras:");

        Scanner scanner = new Scanner(System.in);
        codigoBarras = scanner.next();

        System.out.println("\nCódigo de barras digitado: " + codigoBarras);
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
