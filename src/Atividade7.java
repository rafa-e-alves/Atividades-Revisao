import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Digite o peso da pessoa em kg: ");
        peso = entry.nextDouble();

        System.out.print("Digite a altura da pessoa em metros: ");
        altura = entry.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 16) {
            System.out.println("Classificação: Magreza grave");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Classificação: Magreza moderada");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Classificação: Magreza leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Saudável");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

    }
}
