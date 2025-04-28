import java.util.Scanner;
public class ativ5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do item que você comprou?: ");
        float valor = scanner.nextFloat();

        float prestacao = valor / 5;
        System.out.printf("O valor do seu produto com as 5 prestações sem juros fica de: R$ " + prestacao + " por mês!");


    }
}
