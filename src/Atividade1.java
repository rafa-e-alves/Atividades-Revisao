public class Atividade1 {
    public static void main(String[] args) {

        int contador = 0;
        int numero = 2;

        System.out.println("100 primeiros números pares:\n");

        while (contador < 100) {
            System.out.println(numero);
            numero += 2;
            contador++;
        }
    }
}
