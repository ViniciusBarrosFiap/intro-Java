import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeDeNotas = 0;
        while (nota != -1) {
            System.out.println("Digite sua avaliação pro filme de 0 a 10:");
            nota = leitura.nextDouble(); //leitura da avaliação
            if (nota != -1){
                mediaAvaliacao += nota;
                quantidadeDeNotas++;
            }
        }

        System.out.printf("Média de avaliação: %.2f", mediaAvaliacao / quantidadeDeNotas );

    }
}
