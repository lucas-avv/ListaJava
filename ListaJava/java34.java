import java.util.Scanner;

public class java34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int quadrado = (int) Math.pow(numero, 2);
        int cubo = (int) Math.pow(numero, 3);

        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        System.out.println("O cubo de " + numero + " é: " + cubo);
    }
}
