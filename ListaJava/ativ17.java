
import java.util.Scanner;
import java.time.LocalDate;
public class ativ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade);
    }
}
