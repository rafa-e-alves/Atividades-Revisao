public class Atividade3 {
    public static void main(String[] args) {

        System.out.println("Exemplo com loop while:\n");

        int contadorw = 0;

        while (contadorw < 5) {
            System.out.println("Loop executado " + contadorw + " vezes");
            contadorw++;
        }

        System.out.println("\nExemplo com loop do-while:\n");

        int contadordw = 0;

        do {
            System.out.println("Loop executado " + contadordw + " vezes");
            contadordw++;
        } while (contadordw < 5);

        System.out.println("\nExemplo com loop for:\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop executado " + i + " vezes");
        }

    }
}
