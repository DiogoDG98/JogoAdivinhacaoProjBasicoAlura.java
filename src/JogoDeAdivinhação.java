import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101); // gera número aleatório entra 0 - 100
        int maxTentativas = 5;

        System.out.println("bem vindo ao jogo de Adivinhação! ");
        System.out.println("Tente adivinhar o número entre 0 e 100. ");

        for (int tentativa = 1; tentativa <= maxTentativas; tentativa++) {
            System.out.println("Tentativa" + tentativa + ": Digite um número: ");
            int numeroAdivinhado = scanner.nextInt();

            if (numeroAdivinhado == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (numeroAdivinhado < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            if (tentativa == maxTentativas) {
                System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}



