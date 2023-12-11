import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String[] args) {
        String nomeCliente = "Vinicius Barros";
        String tipoDeConta = "corrente";
        double saldo = 1456.65;
        int escolhaUsuario = 0;
        Scanner leitura = new Scanner(System.in);
        double valoresDigitados;
        String menu = """
                *********************************
                Digite sua opção:
                
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                """;

        System.out.println("*********************************");
        System.out.println("Nome:\t\t\t" + nomeCliente);
        System.out.println("Ti po de conta:\t" + tipoDeConta);
        System.out.println("Saldo:\t\t\tR$" + saldo);
        System.out.println("*********************************");

        while(escolhaUsuario != 4){
            System.out.println(menu);
            escolhaUsuario = leitura.nextInt();
            //Switch case para lidar com as escolhas do usuário
            //Switch case for handle choices of user
            switch (escolhaUsuario) {
                //Condicional para consultar o saldo
                //Conditional to view the balance
                case 1 -> System.out.println("Saldo atualizado: R$" + saldo);

                //Condicional para depositar um valor
                //Conditional to depositing money
                case 2 -> {
                    System.out.println("Qual valor você deseja depositar ?");
                    valoresDigitados = leitura.nextDouble();
                    saldo += valoresDigitados;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
                //Condicional para transferir um valor
                //Conditional to transfer money
                case 3 -> {
                    System.out.println("Qual valor você deseja transferir ?");
                    valoresDigitados = leitura.nextDouble();
                    if (valoresDigitados <= saldo){
                        saldo -= valoresDigitados;
                        System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);

                    }else{
                        System.out.println("O valor digitado é maior que o saldo disponivel para transferencia");
                    }
                }
                //Condicional para sair do banco
                //Conditional to leave the bank
                case 4 -> System.out.println("Volte sempre");
            }
        }
    }
}
