public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);


        double nota = 8.1;
        System.out.println("Nota do filme:" + nota);

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Tom Cruise
                Muito bom!!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);

        double temperatura = 23; //em graus celsius
        double fahrenheit = (temperatura * 1.8) + 32;
        String mensagem = String.format("A temperatura de %.2f Celcius é convertida em %.2f Fahrenheit", temperatura, fahrenheit);
        System.out.println(mensagem);
    }
}