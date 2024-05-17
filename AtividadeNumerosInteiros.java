import java.util.Scanner;

public class AtividadeNumerosInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe dois valores inteiros.");
        System.out.println("Informe o primeiro valor inteiro:");
        int a = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro:");
        int b = entrada.nextInt();

        if (a == b) {
            System.out.println("Os valores informardos são IGUAIS.");
        } else {
            if (a > b) {
                System.out.println("Os valores " + a + " e " + b + " são diferentes e " + a + " é MAIOR que " + b + ".");
            } else {
                System.out.println("Os valores " + a + " e " + b + " são diferentes e " + a + " é MENOR que " + b + ".");
            }
        }
    }
}
