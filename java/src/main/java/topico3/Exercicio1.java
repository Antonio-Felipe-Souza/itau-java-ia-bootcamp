package topico3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var conta = new Conta();
//        conta.criarConta("Felipe", 18);
        var scanner = new Scanner(System.in);
        System.out.println("CRIAÇÃO DE CONTA");
        System.out.println("Insira seu nome:");
        var nome = scanner.next();
        System.out.println("Digite o valor inicial a ser depositado:");
        Double primeiroDeposito = scanner.nextDouble();

        conta.criarConta(nome,primeiroDeposito);

        System.out.println("==============================================================");
        System.out.println("Olá, " + conta.getNome() + "seja bem vindo!");

        var verificacao = true;

        while (verificacao) {
            System.out.println("==============================================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinheiro;");
            System.out.println("3 - consultar cheque especial");
            System.out.println("4 - Sacar dinheiro;");
            System.out.println("5 - Pagar um boleto.");
            System.out.println("6 - Verificar se a conta está usando cheque especial.");
            System.out.println("0 - Encerrar.");
            System.out.println("==============================================================");

            var resposta = scanner.nextInt();

            switch (resposta) {
                case 0 -> {
                    System.out.println("Programa encerrado!");
                    System.out.println("==================================");
                    verificacao = false;
                }
                case 1 -> {
                    System.out.println("Opção 1 - Consultar saldo");
                    System.out.println(conta.consultarSaldo());
                }
                case 2 -> {
                    System.out.println("2 - Depositar dinheiro;");

                    var scanner1 = new Scanner(System.in);
                    System.out.println("Insira o valor a ser depositado:");
                    Double deposito = scanner1.nextDouble();

                    if (deposito == null || deposito <= 0) {
                        System.out.println("Valor inválido!");
                        break;
                    };

                    conta.depositar(deposito);
                }
                case 3 -> {
                    System.out.println("3 - consultar cheque especial");
                    System.out.println(conta.getChequeEspecial());
                }
                case 4 -> {
                    System.out.println("4 - Sacar dinheiro;");
                    var scanner1 = new Scanner(System.in);
                    System.out.println("Insira o valor a ser sacado:");
                    Double saque = scanner1.nextDouble();

//                    if (saque <= 0){
//                        System.out.println("Valor inválido!");
//                        break;
//                    } else if (saque > conta.getSaldo()){
//                        System.out.println("O saldo não permite a realização da operação.");
//                        break;
//                    }

                    try {
                        conta.sacar(saque);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Operação realizada. Novo saldo: " + conta.getSaldo());
                }
                case 5 -> {
                    System.out.println("5 - Pagar um boleto.");

                    var scanner1 = new Scanner(System.in);
                    System.out.println("Insira o valor do boleto:");
                    Double saque = scanner1.nextDouble();

                    if (saque <= 0){
                        System.out.println("Valor inválido!");
                        break;
                    } else if (saque > conta.getSaldo()){
                        System.out.println("O saldo não permite a realização da operação.");
                        break;
                    }

                    conta.sacar(saque);
                    System.out.println("Boleto pago. Novo saldo: " + conta.getSaldo());
                }
            }
        }
    }
}
