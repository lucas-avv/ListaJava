import java.util.Scanner;

public class ativ20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Os números são múltiplos entre si.");
        } else {
            System.out.println("Os números não são múltiplos entre si.");
        }
    }
}
