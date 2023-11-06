import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int totalIdadeMasculina = 0;
        int totalIdadeFeminina = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        int idade;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o sexo (M/F): ");
            char sexo = entry.next().charAt(0);
            System.out.print("Digite a idade: ");
            idade = entry.nextInt();

            if (sexo == 'M' || sexo == 'm') {
                totalIdadeMasculina += idade;
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                totalIdadeFeminina += idade;
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Use M ou F.");
                i--;
            }
        }

        double mediaIdadeMasculina = (double) totalIdadeMasculina / totalHomens;
        double mediaIdadeFeminina = (double) totalIdadeFeminina / totalMulheres;

        System.out.println("Média de idade da população masculina: " + mediaIdadeMasculina);
        System.out.println("Média de idade da população feminina: " + mediaIdadeFeminina);

    }
}
