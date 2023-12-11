import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100); //faz o sorteio de um número aleatorio entre 0 a 100
//        System.out.println(numeroSorteado);
        Scanner leitura = new Scanner(System.in);
        int chuteJogador = 0;

        while (chuteJogador != numeroSorteado){
            System.out.println("Faça um chute do número sorteado:");
            chuteJogador = leitura.nextInt();
            if (chuteJogador == numeroSorteado){
                System.out.println("Você acertou o número sorteado");
                break;
            } else if (chuteJogador > numeroSorteado) {
                System.out.println("O número sorteado é menor que " + chuteJogador);
            }else if (chuteJogador < numeroSorteado) {
                System.out.println("O número sorteado é maior que " + chuteJogador);
            }
        }
    }
}
