package screen_match;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // Leitura de dados com a classe Scanner
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // vai ler o que foi digitado no terminal e vai armazenar na variável filme.
        System.out.println("Digite o ano de lançamento");
        int anoLancamento = leitura.nextInt(); // vai ler um valor inteiro
        System.out.println("Digite sua avaliação para po filme");
        double avaliacaoFilme = leitura.nextDouble(); // vai ler um valor decimal

        System.out.println(String.format("Filme favorito: " + filme));
        System.out.println(String.format("Ano de Lançamento: " + anoLancamento));
        System.out.println(String.format("Nota de Avaliação: " + avaliacaoFilme));
    }
}
