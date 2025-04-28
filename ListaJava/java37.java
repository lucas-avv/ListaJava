import java.util.Scanner;

public class java37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância da viagem em km: ");
        float distancia = scanner.nextFloat();

        System.out.println("Digite o preço do litro da gasolina: ");
        float precoGasolina = scanner.nextFloat();

        float litrosNecessarios = distancia / 12;
        float custoViagem = litrosNecessarios * precoGasolina;

        System.out.println("O custo da viagem será de: " + custoViagem);
    }
}
