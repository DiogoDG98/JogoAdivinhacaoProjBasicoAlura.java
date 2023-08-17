import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.printf("Qual o ano de lançamento ");
        int anoDeLançamento = leitura.nextInt();
        System.out.printf("Diga a sua avaliação para o filme:  ");
        double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliação);

    }
}
