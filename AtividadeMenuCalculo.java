import java.util.Scanner;

public class AtividadeMenuCalculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n1 - Para calcular a área do quadrado.\n2 - Para calcular a área do círculo.");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Calcular a área do QUADRADO.");
                System.out.println("Informe o valor da base:");
                double base = entrada.nextDouble();
                System.out.println("Agora informe o valor da altura:");
                double altura = entrada.nextDouble();
                double areaQuadrado = base * altura;
                System.out.println(String.format("O área do quadrado é igual a %,.2f.", areaQuadrado));
                break;
            case 2:
                System.out.println("Calcular a área do CÍRCULO.");
                System.out.println("Informe o valor do raio:");
                double raio = entrada.nextDouble();
                double areaCirculo = Math.PI * (raio * raio);
                System.out.println(String.format("O área do Cículo é igual a %,.2f.", areaCirculo));
                break;
            default:
                System.out.println("Opção incorreta informe novamente.");
                opcao = entrada.nextInt();
        }
    }
}
