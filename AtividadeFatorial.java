import java.util.Scanner;

public class AtividadeFatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int numero = entrada.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
