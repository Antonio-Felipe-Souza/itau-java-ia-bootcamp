package topico4;

public class Familia extends Ingresso{

    private Integer qtdPessoas;

    @Override
    public Double getValorReal(){
        if (qtdPessoas > 3) return getValor() * qtdPessoas * 0.95;

        return getValor() * qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }
}
