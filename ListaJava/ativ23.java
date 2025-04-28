import java.util.Scanner;
public class ativ23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float precoProduto = scanner.nextFloat();

        System.out.println("Digite o percentual de desconto: ");
        float descontoPercentual = scanner.nextFloat();

        float valorDesconto = precoProduto * (descontoPercentual / 100);
        float precoFinal = precoProduto - valorDesconto;

        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O preço final é: " + precoFinal);
    }
}
