import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número para calcular seu fatorial: ");
        numero = entry.nextInt();

        if (numero < 0) {
            System.err.println("Você não pode utilizar números negativos, decimais ou frações.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }
    }
}
