import java.util.Scanner;

public class AtividadeNegativoPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double numero = entrada.nextDouble();

        if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");
        } else if ( numero >= 0) {
            System.out.println("O número " + numero + " é POSITIVO.");
        }

    }
}
