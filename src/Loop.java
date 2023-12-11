import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação pro filme de 0 a 10:");
            nota = leitura.nextDouble(); //leitura da avaliação
            mediaAvaliacao += nota;
        }

        System.out.printf("Média de avaliação: %.2f", mediaAvaliacao/3 );

    }
}
