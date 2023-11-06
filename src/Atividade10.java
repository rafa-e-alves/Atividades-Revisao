import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int quantidade;
        int primeiro = 0;
        int segundo = 1;
        int proximo;

        System.out.print("Quantidade de números da sequência de Fibonacci que você deseja exibir: ");
        quantidade = entry.nextInt();

        System.out.println("Os primeiros " + quantidade + " números da sequência de Fibonacci são:");
        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 2; i < quantidade; i++) {
            proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
