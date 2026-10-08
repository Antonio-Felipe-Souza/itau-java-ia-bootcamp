package t4_heranca_polimorfismo.exercicio1;

public class MeiaEntrada extends Ingresso{

    @Override
    public Double getValorReal() {
        return getValor() * 0.5;
    }

}
