package t4_heranca_polimorfismo.exercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------Ingresso Comum--------");
        Ingresso ingresso = new Ingresso();
        ingresso.setFilme("Avatar");
        ingresso.setValor(50.0);
        ingresso.setIdioma(Ingresso.Idioma.DUBLADO);

        System.out.println(ingresso.getFilme());
        System.out.println(ingresso.getValorReal());
        System.out.println(ingresso.getIdioma());


        System.out.println("--------Ingresso Familia--------");
        Familia ingressoFamilia = new Familia();

        ingressoFamilia.setFilme("Harry Potter");
        ingressoFamilia.setQtdPessoas(10);
        ingressoFamilia.setValor(30.0);
        ingressoFamilia.setIdioma(Ingresso.Idioma.DUBLADO);

        Ingresso ingressoFamilia2 = ingressoFamilia;

        System.out.println(ingressoFamilia2.getFilme());
        System.out.println(ingressoFamilia2.getValorReal());
        System.out.println(ingressoFamilia2.getIdioma());


        System.out.println("--------Ingresso Meia entrada--------");
        Ingresso ingressoMeia = new MeiaEntrada();

        ingressoMeia.setFilme("Duna 3");
        ingressoMeia.setValor(90.0);
        ingressoMeia.setIdioma(Ingresso.Idioma.LEGENDADO);

        System.out.println(ingressoMeia.getFilme());
        System.out.println(ingressoMeia.getValorReal());
        System.out.println(ingressoMeia.getIdioma());
    }
}