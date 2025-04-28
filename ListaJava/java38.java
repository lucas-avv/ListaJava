import java.util.Scanner;

public class java38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        float imposto = salario * 0.15f;
        float salarioComImposto = salario - imposto;

        System.out.println("O imposto de renda será: " + imposto);
        System.out.println("O salário após o imposto será: " + salarioComImposto);
    }
}
