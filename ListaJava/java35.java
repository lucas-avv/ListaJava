import java.util.Scanner;

public class java35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float precoProduto = scanner.nextFloat();

        float precoComDesconto = precoProduto * 0.95f;

        System.out.println("O valor do produto com desconto de 5% é: " + precoComDesconto);
    }
}
