public class Atividade8 {
    public static void main(String[] args) {

        System.out.println("Números primos entre os 100 primeiros números naturais não nulos:");

        for (int numero = 2; numero <= 100; numero++) {
            boolean ehPrimo = true;
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}
