
import java.util.Scanner;
public class ativ24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        float aumento = salario * 0.15f;
        float novoSalario = salario + aumento;

        System.out.println("O aumento foi: " + aumento);
        System.out.println("O novo salário é: " + novoSalario);
    }
}
