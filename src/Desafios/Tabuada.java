package Desafios;

import java.util.Scanner;

public class Tabuada {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("------Tabuada-----");
                    System.out.print("Digite um número desejado: ");
                    int numero = scanner.nextInt();

                    System.out.println("Tabuada do número " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
        }
}