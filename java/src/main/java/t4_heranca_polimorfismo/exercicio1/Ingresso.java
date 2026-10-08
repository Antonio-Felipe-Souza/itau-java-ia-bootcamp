package t4_heranca_polimorfismo.exercicio1;

public class Ingresso {
    private Double valor;
    private String filme;
    private Idioma idioma;

    public enum Idioma {
        DUBLADO,
        LEGENDADO
    }

    public Double getValorReal() {
        return valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
}
