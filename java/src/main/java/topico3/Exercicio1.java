package topico3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var conta = new Conta();
        var scanner = new Scanner(System.in);

        System.out.println("CRIAÇÃO DE CONTA");
        System.out.println("Insira seu nome:");
        var nome = scanner.next();
        System.out.println("Digite o valor inicial a ser depositado:");
        Double primeiroDeposito = scanner.nextDouble();

        conta.criarConta(nome, primeiroDeposito);

        System.out.println("==============================================================");
        System.out.println("Olá, " + conta.getNome() + " seja bem vindo!");

        var verificacao = true;

        while (verificacao) {
            System.out.println("==============================================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Consultar cheque especial");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Encerrar");
            System.out.println("==============================================================");

            var resposta = scanner.nextInt();

            switch (resposta) {
                case 0 -> {
                    System.out.println("Programa encerrado!");
                    System.out.println("==================================");
                    verificacao = false;
                }
                case 1 -> {
                    System.out.println("1 - Consultar saldo");
                    System.out.println(conta.consultarSaldo());
                }
                case 2 -> {
                    System.out.println("2 - Depositar dinheiro");
                    System.out.println("Insira o valor a ser depositado:");
                    Double deposito = scanner.nextDouble();

                    conta.depositar(deposito);
                }
                case 3 -> {
                    System.out.println("3 - Consultar cheque especial");
                    System.out.println("Limite do cheque especial: R$ " + String.format("%.2f", conta.getChequeEspecial()));
                    System.out.println("Cheque especial usado: R$ " + String.format("%.2f", conta.getChequeUsado()));
                    System.out.println("Cheque especial disponível: R$ " + String.format("%.2f", conta.getChequeDisponivel()));
                }
                case 4 -> {
                    System.out.println("4 - Sacar dinheiro");
                    System.out.println("Insira o valor a ser sacado:");
                    Double saque = scanner.nextDouble();

                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado. Disponível para uso (saldo + cheque): R$ "
                                + String.format("%.2f", conta.getLimite()));
                    }
                }
                case 5 -> {
                    System.out.println("5 - Pagar um boleto");
                    System.out.println("Insira o valor do boleto:");
                    Double boleto = scanner.nextDouble();

                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    }
                }
                case 6 -> {
                    System.out.println("6 - Verificar uso do cheque especial");
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("Sim, você está usando o cheque especial: R$ "
                                + String.format("%.2f", conta.getChequeUsado()));
                    } else {
                        System.out.println("Não, sua conta não está usando o cheque especial.");
                    }
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}