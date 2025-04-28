import java.util.Scanner;

public class ativ22 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o peso (em kg): ");
            float peso = scanner.nextFloat();

            System.out.println("Digite a altura (em metros): ");
            float altura = scanner.nextFloat();

            float imc = peso / (altura * altura);

            System.out.println("Seu IMC é: " + imc);
        }
    }
}