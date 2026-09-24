package topico3;

public class Conta {
    private Double saldo = 0.0;
    private Double chequeEspecial = 0.0;
    private Double limite = 0.0;
    private String nome;


    public void criarConta(String nome, Double primeiroDeposito){
        this.nome = nome;
        this.saldo = primeiroDeposito;
        if (primeiroDeposito <= 500) setChequeEspecial(50.00);
        else setChequeEspecial(primeiroDeposito/2);
    }

    public void depositar(Double valor){
        setSaldo(valor);
    }

    public String consultarSaldo() {
        Double saldo = getSaldo() == 0 ? 00.0 : getSaldo();
        return "Saldo: R$" + saldo;
    }

    public void sacar(Double valor){
        if (valor > getSaldo()){
            Double usarDoCheque = valor - getSaldo();
            if (usarDoCheque > getChequeEspecial()){
                throw new IllegalArgumentException("Valor não disponivel");
            }

            setSaldo(0.0);
            setChequeEspecial(getSaldo() - usarDoCheque);
        }
        setSaldo(-valor);
    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo += saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite() {
        this.limite = getSaldo() + getChequeEspecial();
    }
}
