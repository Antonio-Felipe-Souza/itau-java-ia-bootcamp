package topico3;

public class Conta {
    private Double saldo = 0.0;
    private Double chequeEspecial = 0.0; // limite fixo, definido na criação
    private String nome;

    public void criarConta(String nome, Double primeiroDeposito) {
        this.nome = nome;
        this.saldo = primeiroDeposito;

        if (primeiroDeposito <= 500) chequeEspecial = 50.00;
        else chequeEspecial = primeiroDeposito / 2;
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        // se estava usando cheque especial, cobra 20% do valor usado
        if (saldo < 0) {
            Double taxa = getChequeUsado() * 0.20;
            saldo -= taxa;
            System.out.println("Taxa de 20% do cheque especial cobrada: R$ " + String.format("%.2f", taxa));
        }

        saldo += valor;
        System.out.println("Depósito realizado!");
    }

    public boolean sacar(Double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        }

        if (valor > getLimite()) {
            System.out.println("Valor ultrapassa o saldo e cheque especial disponível.");
            return false;
        }

        saldo -= valor;

        if (saldo < 0) {
            System.out.println("Você está usando o cheque especial.");
        }
        return true;
    }

    public boolean pagarBoleto(Double valor) {
        // boleto funciona como um saque: mesmas regras de saldo + cheque especial
        return sacar(valor);
    }

    public boolean usandoChequeEspecial() {
        return saldo < 0;
    }

    public String consultarSaldo() {
        return "Saldo: R$ " + String.format("%.2f", saldo);
    }

    public Double getChequeUsado() {
        return saldo < 0 ? -saldo : 0.0;
    }

    public Double getChequeDisponivel() {
        return chequeEspecial - getChequeUsado();
    }

    // saldo + cheque especial = quanto ainda pode ser gasto
    public Double getLimite() {
        return saldo + chequeEspecial;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}