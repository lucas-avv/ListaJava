import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        float raio = scanner.nextFloat();

        float area = (float) (Math.PI * Math.pow(raio, 2));

        System.out.println("A área do círculo é: " + area);
    }
}
