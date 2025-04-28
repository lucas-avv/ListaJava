import java.util.Scanner;

public class java40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int idadeAnos = scanner.nextInt();

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;

        System.out.println("Você tem " + idadeMeses + " meses ou " + idadeDias + " dias de vida.");
    }
}
