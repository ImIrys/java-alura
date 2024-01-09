public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick") ;

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas notas ficticias
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(String.format("Média: %.2f ", media));
        String sinopseFilme;

        sinopseFilme = "Filme de aventura com galã dos anos 80.";
        System.out.println("Sinopse: " + sinopseFilme);

        /* UTILIZANDO O RECURSO TEXT BLOCKS
        sinopseFilme = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Filme Top!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopseFilme);
        */
        // Casting - Conversão: Explicito e Implicito
        // Casting Explicito
        int classificacaoFilme = (int) (media /2);
        System.out.println("Classificação: " + classificacaoFilme);
    }
}