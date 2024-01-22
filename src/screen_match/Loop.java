package screen_match;

import java.util.Scanner;

//For - Deixamos fixo a entrada
public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacaoFilme = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) { // i++ tbm pode ser i = i + 1;
            System.out.println("Digite sua avaliação para o filme");
            notaFilme = leitura.nextDouble();
            /*
            mediaAvaliacaoFilme = mediaAvaliacaoFilme + notaFilme;
            é o mesmo que dizer:
            += recebe o que ja tinha acrescido do que está atribuindo agora.
             */
            mediaAvaliacaoFilme += notaFilme;
        }
        System.out.println("A média das avaliações é: " + mediaAvaliacaoFilme/3);
    }
}
