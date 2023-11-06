import java.util.Scanner;

public class Atividade4e5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int altura;
        boolean continuar = true;
        String resposta;

        while (continuar) {

            System.out.print("Digite a altura da figura, (utilize 1 a 20 de altura): ");
            altura = entry.nextInt();

            if (altura >= 1 && altura <= 20) {
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("∗ ");
                    }
                    System.out.println();
                }

                System.out.print("Deseja continuar? (Digite Sim ou Não): ");
                resposta = entry.next().toLowerCase();
                continuar = resposta.equals("sim") || resposta.equals("s") || resposta.equals("si");
            } else {
                System.out.println("Altura indevida (utilize entre 1 e 20 de altura)!");
                System.out.print("Deseja tentar novamente? (Digite Sim ou Não): ");
                resposta = entry.next().toLowerCase();
                continuar = resposta.equals("sim") || resposta.equals("s") || resposta.equals("si");
            }
        }
        System.out.println("Programa finalizado.");
    }
}
