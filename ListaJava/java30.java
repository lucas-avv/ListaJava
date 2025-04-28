import java.util.Scanner;

public class java30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        float largura = scanner.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        float altura = scanner.nextFloat();

        float area = largura * altura;

        System.out.println("A área do retângulo é: " + area);
    }
}
