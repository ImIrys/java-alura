/*
Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se
são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */

package Desafios;

import java.util.Scanner;

public class ComparandoNumerosInteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int primeiroNumero = leitura.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}