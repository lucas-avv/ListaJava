import java.util.Scanner;

public class java36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de dias: ");
        int dias = scanner.nextInt();

        System.out.println("Digite o número de horas: ");
        int horas = scanner.nextInt();

        System.out.println("Digite o número de minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Digite o número de segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = (dias * 86400) + (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("O total de segundos é: " + totalSegundos);
    }
}
