package topico4;

public class MeiaEntrada extends Ingresso{

    @Override
    public Double getValorReal() {
        return getValor() * 0.5;
    }

}
