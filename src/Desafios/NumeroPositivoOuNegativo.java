package Desafios;
/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo",
caso contrário, exiba "Número negativo".
 */

import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}
