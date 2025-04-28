import java.util.Scanner;
public class ativ12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        float custoFabrica = scanner.nextFloat();

        float impostos = custoFabrica * 0.45f; // 45% de impostos
        float custoComImpostos = custoFabrica + impostos;
        float distribuidor = custoComImpostos * 0.28f; // 28% do distribuidor
        float custoConsumidor = custoComImpostos + distribuidor;

        System.out.printf("O custo ao consumidor é: R$ %.2f", custoConsumidor);
    }
}
