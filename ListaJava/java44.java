import java.util.Scanner;

public class java44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vezes.");
    }
}
