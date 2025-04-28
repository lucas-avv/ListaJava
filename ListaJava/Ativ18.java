import java.util.Scanner;

public class Ativ18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        float salarioMinimo = scanner.nextFloat();

        System.out.println("Digite o valor do salário do trabalhador: ");
        float salarioTrabalhador = scanner.nextFloat();

        float quantidadeSalarios = salarioTrabalhador / salarioMinimo;

        System.out.println("O trabalhador ganha " + quantidadeSalarios + " salários mínimos.");
    }
}
