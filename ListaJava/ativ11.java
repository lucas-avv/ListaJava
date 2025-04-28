import java.util.Scanner;
public class ativ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo: ");
        float precoCusto = scanner.nextFloat();

        System.out.print("Digite o percentual de acréscimo: ");
        float percentual = scanner.nextFloat();

        float valorVenda = precoCusto + (precoCusto * percentual / 100);
        System.out.printf("O valor de venda é: R$ %.2f", valorVenda);
    }

}
