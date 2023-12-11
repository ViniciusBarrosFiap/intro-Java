import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine(); //leitura nome do filme

        System.out.println("Qual ano de lançamento");
        int anoDeLancamento = leitura.nextInt(); //leitura ano do lançamento

        System.out.println("Digite sua avaliação pro filme de 0 a 10:");
        double avaliacao = leitura.nextDouble(); //leitura da avaliação

        //Mostrando informações digitadas
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);


    }
}
