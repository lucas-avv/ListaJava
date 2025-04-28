import java.util.Scanner;

public class java43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra tem " + palavra.length() + " caracteres.");
    }
}
