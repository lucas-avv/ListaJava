
import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float precoProduto = scanner.nextFloat();

        float precoComAcrescimo = precoProduto * 1.10f;

        System.out.println("O valor do produto com acréscimo de 10% é: " + precoComAcrescimo);
    }
}
