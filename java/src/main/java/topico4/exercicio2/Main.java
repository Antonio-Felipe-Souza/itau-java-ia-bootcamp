package topico4.exercicio2;

public class Main {
    public static void main(String[] args) {
        /*----------Gerente----------*/
        Gerente gerente = new Gerente();
        gerente.setNome("Felipe");
        gerente.setEmail("felipe@email.com");
        gerente.setSenha("coxinha123");

        System.out.println("\n--------Gerente--------");
        System.out.println(gerente.getNome());
        System.out.println(gerente.getEmail());
        System.out.println("Adm? " + gerente.isAdm());
        gerente.realizarLogin();
        gerente.realizarLogoff();
        gerente.alterarDados();
        gerente.alterarSenha();

        /*----------Vendedor----------*/
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Caio");
        vendedor.setEmail("caio@email.com");
        vendedor.setSenha("caio123");
        vendedor.setQtdVendas(99);

        System.out.println("\n--------Vendedor--------");
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getEmail());
        System.out.println("Adm? " + vendedor.isAdm());
        vendedor.consultarVendas();
        vendedor.realizarLogin();
        vendedor.realizarLogoff();
        vendedor.alterarDados();
        vendedor.alterarSenha();
        vendedor.realizarVendas();
        vendedor.consultarVendas();

        /*----------Atendente----------*/
        Atendente atendente = new Atendente();
        atendente.setNome("Matheus");
        atendente.setEmail("matheus@email.com");
        atendente.setSenha("matheus123");
        atendente.setValorEmCaixa(5000.00);

        System.out.println("\n--------Atendente--------");
        System.out.println(atendente.getNome());
        System.out.println(atendente.getEmail());
        System.out.println("Adm? " + atendente.isAdm());
        System.out.println("Valor atual em caixa: R$" + atendente.getValorEmCaixa());
        atendente.realizarLogin();
        atendente.realizarLogoff();
        atendente.alterarDados();
        atendente.alterarSenha();
        atendente.receberPagamentos(1000.00);
        atendente.fecharCaixa();
    }
}