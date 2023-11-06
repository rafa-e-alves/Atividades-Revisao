import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.print("Informe um número para saber sua tabuada de multiplicação do 1 ao 10: ");
        numero = entry.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
