package Desafios;

/*
Crie um programa que realize a média de duas notas decimais
e exiba o resultado.
 */
public class MediaDecimais {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        int media = (n1 + n2)/2;
        /* Formatação de texto 1:
        System.out.println(String.format("A média entre %d e %d é: %d",  n1, n2, media));
        */

        // Formatação de texto 2:
        String mensagem = """
                A média entre %d e %d é: %d
                """.formatted(n1, n2, media);
        System.out.println(mensagem);
    }

}
