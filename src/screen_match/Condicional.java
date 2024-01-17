package screen_match;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos mais vistos");
        } else {
            System.out.println("Filmes antigos que valem a pena assistir");
        }
        /* Operador OU ||

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("É necessário que você faça o upgrade no seu plano para liberar essa seção.");
        }
         */

        //Operador E &&
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("É necessário que você faça o upgrade no seu plano para liberar essa seção.");
        }
    }
}
