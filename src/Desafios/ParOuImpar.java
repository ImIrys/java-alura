/*
Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */


package Desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite um número.");
        int numeroDigitado = numeros.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("O número escolhido é PAR.");
        } else {
            System.out.println("O número escolhido é ÍMPAR.");
        }
    }
}
