package desafios;

/*
Declare uma variável do tipo double precoOriginal.
Atribua um valor em reais a essa variável,
representando o preço original de um produto.
Em seguida, declare uma variável do tipo double percentualDesconto
e atribua um valor percentual de
desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original
e imprima o novo preço com desconto.
 */
public class DescontoProduto {
    public static void main (String[] args){
        double precoOriginalEmReais = 240;
        double percentualDesconto = 20;

        percentualDesconto = (100 - percentualDesconto)/100;

        double precoDescontoEmReais = precoOriginalEmReais * percentualDesconto;

        String mensagem = String.format("O novo preço com desconto é de: R$ " + precoDescontoEmReais);

        System.out.println(mensagem);
    }
}
