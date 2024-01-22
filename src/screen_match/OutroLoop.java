package screen_match;

import java.util.Scanner;

//While: Com condição de parada
public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacaoFilme = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar.");
            notaFilme = leitura.nextDouble();

            if (notaFilme != -1) {
                mediaAvaliacaoFilme += notaFilme;
                totalDeNotas++; // igual a totalDeNotas = totalDeNotas +1;
            }
        }
        System.out.println("A média das avaliações é: " + mediaAvaliacaoFilme / totalDeNotas);
    }
}
