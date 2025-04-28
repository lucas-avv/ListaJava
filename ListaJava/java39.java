import java.util.Scanner;

public class java39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado: ");
        float lado1 = scanner.nextFloat();

        System.out.println("Digite o comprimento do segundo lado: ");
        float lado2 = scanner.nextFloat();

        System.out.println("Digite o comprimento do terceiro lado: ");
        float lado3 = scanner.nextFloat();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
