import java.util.Scanner;

public class AtividadeTabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor para calcular a tabuada: ");
        int numero = entrada.nextInt();
        System.out.println("A tabuada de " + numero);
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
