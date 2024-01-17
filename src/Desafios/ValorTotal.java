package desafios;

/*
Declare uma variável do tipo double precoProduto
e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto
pela quantidade e apresente o resultado em uma mensagem.
*/
public class ValorTotal {
    public static void main(String[] args) {
        double precoProduto = 10.25;
        int quantidade = 5;
        double valorTotal;
        valorTotal = (precoProduto * quantidade);
        System.out.println("O valor total é de: " + valorTotal);
    }
}
