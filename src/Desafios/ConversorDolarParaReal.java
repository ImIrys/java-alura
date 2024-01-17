package desafios;

/*
Declare uma variável do tipo double valorEmDolares.
Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */

public class ConversorDolarParaReal {
    public static void main(String[] args) {
        double valorEmDolares = 580;
        double valorEmReal = 4.94;
        double conversaoDolarparaReal = valorEmReal * valorEmDolares;
        String mensagem = String.format("US$ %.2f, com cotação de R$ %.2f, equivale a R$ %.2f", valorEmDolares, valorEmReal, conversaoDolarparaReal);
        System.out.println(mensagem);
    }
}
