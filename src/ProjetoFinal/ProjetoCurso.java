package ProjetoFinal;

import java.util.Scanner;

public class ProjetoCurso {
    public static void main(String[] args) {

        String nomeCliente = "Ellora Duarte";
        String tipoConta = "Corrente";
        double saldo = 4500.99;
        int opcao = 0;

        System.out.println("=========================");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n=========================");


        String menu = """
                
                ** DIGITE A OPÇÃO DESEJADA **
                
                1 - Consultar Saldo;
                2 - Transferir Valor;
                3 - Receber Valor;
                4 - Sair do menu.                
                
                """;

        Scanner leituraOpcao = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leituraOpcao.nextInt();

            if (opcao == 1) {
                System.out.println("O Saldo Atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido?");
                double valorTranferir = leituraOpcao.nextDouble();
                if (valorTranferir > saldo) {
                    System.out.println("Que pena! Não há saldo suficiente para realizar essa transferência.");
                } else {
                    saldo -= valorTranferir; //O mesmo que dizer saldo = saldo - valorTranferir;
                    System.out.println("Novo Saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor Recebido: ");
                double valor = leituraOpcao.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
